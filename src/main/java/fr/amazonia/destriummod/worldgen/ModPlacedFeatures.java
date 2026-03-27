package fr.amazonia.destriummod.worldgen;

import fr.amazonia.destriummod.DestriumMod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> CLOVER_PLACED = registerKey("clover_placed");
    public static final ResourceKey<PlacedFeature> CLOVER_TWO_PLACED = registerKey("clover_two_placed");

    public static final ResourceKey<PlacedFeature> REPAIR_ORE_PLACED = registerKey("repair_ore_placed");

    public static final ResourceKey<PlacedFeature> PARADIS_DESTRIUM_ORE_PLACED = registerKey("paradis_destrium_ore_placed");
    public static final ResourceKey<PlacedFeature> PARADIS_AMAZONITE_ORE_PLACED = registerKey("paradis_amazonite_ore_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, CLOVER_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CLOVER_CONFIG_KEY), List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CLOVER_TWO_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CLOVER_TWO_CONFIG_KEY), List.of(RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, REPAIR_ORE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.REPAIR_ORE_KEY), ModOrePlacement.normalOrePlacement(1, UniformInt.of(3, 5), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-0), VerticalAnchor.absolute(100))));

        register(context, PARADIS_DESTRIUM_ORE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PARADIS_DESTRIUM_ORE_KEY), ModOrePlacement.normalOrePlacement(2, UniformInt.of(2, 5), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(160))));
        register(context, PARADIS_AMAZONITE_ORE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PARADIS_AMAZONITE_ORE_KEY), ModOrePlacement.normalOrePlacement(4, UniformInt.of(1, 3), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(160))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}