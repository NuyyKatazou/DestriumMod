package fr.amazonia.destriummod.world.gen;
/*
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.BiomeDictionary;
*/
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraft.world.gen.GenerationStage;

public class ModOreGeneration {
	

 
    public static void generateOre(BiomeLoadingEvent event) {
    	//Basic Gen
    	/*
    	RegistryKey<Biome> key = RegistryKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);
        */
        //In Overworld
        /*
        if(types.contains(BiomeDictionary.Type.OVERWORLD)) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> ModConfiguredFeatures.);
            }
            */
        //In Nether
        /*
        if(types.contains(BiomeDictionary.Type.NETHER)) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> ModConfiguredFeatures.);
            }
            */
        
    
        //Other Gen for End
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        if(event.getCategory().equals(Biome.Category.THEEND)){
            for(ConfiguredFeature<?, ?> ore : ModConfiguredFeatures.REPAIR_ORE_CONFIG){
                if (ore != null) generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
            }
        }
    }
 

}
