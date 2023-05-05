package fr.amazonia.destriummod.world.feature;

import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class ModConfiguredFeatures {

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CLOVER_CONFIG = FeatureUtils.register("flower_clover", Feature.FLOWER, new RandomPatchConfiguration(1, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CLOVER.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CLOVER_TWO_CONFIG = FeatureUtils.register("flower_two_clover", Feature.FLOWER, new RandomPatchConfiguration(1, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CLOVER_TWO.get())))));

}
