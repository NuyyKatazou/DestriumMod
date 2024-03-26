package fr.amazonia.destriummod.world.gen;

import java.util.ArrayList;

import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;

public class ModConfiguredFeatures {
	
	public static final ConfiguredFeature<?, ?> CLOVER_CONFIG = Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.CLOVER.get().defaultBlockState()), SimpleBlockPlacer.INSTANCE)).tries(1).build()).decorated(Features.Placements.HEIGHTMAP_WORLD_SURFACE).count(1).chance(35).squared();
	public static final ConfiguredFeature<?, ?> CLOVER_TWO_CONFIG = Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.CLOVER_TWO.get().defaultBlockState()), SimpleBlockPlacer.INSTANCE)).tries(1).build()).decorated(Features.Placements.HEIGHTMAP_WORLD_SURFACE).count(1).chance(75).squared();

	public static final ArrayList<ConfiguredFeature<?, ?>> REPAIR_ORE_CONFIG = new ArrayList<ConfiguredFeature<?, ?>>();


	public static void registerOres(){

    	REPAIR_ORE_CONFIG.add(register("repair_ore", Feature.ORE.configured(new OreFeatureConfig(
         	new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.REPAIR_ORE.get().defaultBlockState(), 4)).range(128).squared().count(1).chance(45)));
    }
	
	private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "destriummod" + ":" + name, configuredFeature);
    }
}