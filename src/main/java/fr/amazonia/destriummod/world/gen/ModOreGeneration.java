package fr.amazonia.destriummod.world.gen;

import java.util.ArrayList;

import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.gen.GenerationStage;

@Mod.EventBusSubscriber
public class ModOreGeneration {
	
    private static final ArrayList<ConfiguredFeature<?, ?>> REPAIR_ORE_CONFIG = new ArrayList<ConfiguredFeature<?, ?>>();
 
    public static void registerOres(){

    	REPAIR_ORE_CONFIG.add(register("repair_ore", Feature.ORE.configured(new OreFeatureConfig(
                new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.REPAIR_ORE.get().defaultBlockState(), 4)).range(128).squared().count(1).chance(35)));
    }
 
    public static void generateEndOre(BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        if(event.getCategory().equals(Biome.Category.THEEND)){
            for(ConfiguredFeature<?, ?> ore : REPAIR_ORE_CONFIG){
                if (ore != null) generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
            }
        }
    }
 
    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "destriummod" + ":" + name, configuredFeature);
    }
}
