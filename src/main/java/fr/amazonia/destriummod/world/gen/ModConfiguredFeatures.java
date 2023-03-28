package fr.amazonia.destriummod.world.gen;

import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;


public class ModConfiguredFeatures {

	public static final ConfiguredFeature<?, ?> CLOVER_CONFIG = Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.CLOVER.get().defaultBlockState()), SimpleBlockPlacer.INSTANCE)).tries(1).build()).decorated(Features.Placements.HEIGHTMAP_WORLD_SURFACE).count(1).chance(35).squared();
	public static final ConfiguredFeature<?, ?> CLOVER_TWO_CONFIG = Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.CLOVER_TWO.get().defaultBlockState()), SimpleBlockPlacer.INSTANCE)).tries(1).build()).decorated(Features.Placements.HEIGHTMAP_WORLD_SURFACE).count(1).chance(75).squared();
	
	
}
