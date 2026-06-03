package fr.amazonia.destriummod.worldgen;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> CLOVER_CONFIG_KEY = registerKey("clover");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CLOVER_TWO_CONFIG_KEY = registerKey("clover_two");

    public static final ResourceKey<ConfiguredFeature<?, ?>> REPAIR_ORE_KEY = registerKey("repair_ore");


    public static final ResourceKey<ConfiguredFeature<?, ?>> PARADIS_DESTRIUM_ORE_KEY = registerKey("paradis_destrium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PARADIS_AMAZONITE_ORE_KEY = registerKey("paradis_amazonite_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);
        RuleTest cloudReplaceables = new BlockMatchTest(ModBlocks.CLOUD.get());


        register(context, CLOVER_CONFIG_KEY, Feature.FLOWER, new RandomPatchConfiguration(1, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CLOVER.get())))));
        register(context, CLOVER_TWO_CONFIG_KEY, Feature.FLOWER, new RandomPatchConfiguration(1, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CLOVER_TWO.get())))));

        register(context, REPAIR_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.REPAIR_ORE.get().defaultBlockState(), 4));

        register(context, PARADIS_DESTRIUM_ORE_KEY, Feature.ORE, new OreConfiguration(cloudReplaceables, ModBlocks.PARADIS_DESTRIUM_ORE.get().defaultBlockState(), 4, 0f));
        register(context, PARADIS_AMAZONITE_ORE_KEY, Feature.ORE, new OreConfiguration(cloudReplaceables, ModBlocks.PARADIS_AMAZONITE_ORE.get().defaultBlockState(), 4, 0f));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}