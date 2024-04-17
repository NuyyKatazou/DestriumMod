package fr.amazonia.destriummod.world.feature;

import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CLOVER_CONFIG = FeatureUtils.register("flower_clover", Feature.FLOWER, new RandomPatchConfiguration(1, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CLOVER.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CLOVER_TWO_CONFIG = FeatureUtils.register("flower_two_clover", Feature.FLOWER, new RandomPatchConfiguration(1, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CLOVER_TWO.get())))));

    public static final List<OreConfiguration.TargetBlockState> REPAIR_ORES = List.of(OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.REPAIR_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> REPAIR_ORE = FeatureUtils.register("repair_ore", Feature.ORE, new OreConfiguration(REPAIR_ORES, 4));
}