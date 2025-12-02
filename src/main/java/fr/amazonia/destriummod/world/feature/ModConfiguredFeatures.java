package fr.amazonia.destriummod.world.feature;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> CLOVER_CONFIG_KEY = registerKey("clover");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CLOVER_TWO_CONFIG_KEY = registerKey("clover_two");

    public static final ResourceKey<ConfiguredFeature<?, ?>> REPAIR_ORE_KEY = registerKey("repair_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        //TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        //TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        //BlockMatchTest(Blocks.NETHERRACK);
        //BlockMatchTest(Blocks.END_STONE);
        List<OreConfiguration.TargetBlockState> REPAIR_ORES = List.of(OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.REPAIR_ORE.get().defaultBlockState()));


        register(context, CLOVER_CONFIG_KEY, Feature.FLOWER, new RandomPatchConfiguration(1, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CLOVER.get())))));
        register(context, CLOVER_TWO_CONFIG_KEY, Feature.FLOWER, new RandomPatchConfiguration(1, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CLOVER_TWO.get())))));

        register(context, REPAIR_ORE_KEY, Feature.ORE, new OreConfiguration(REPAIR_ORES, 4));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(DestriumMod.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}