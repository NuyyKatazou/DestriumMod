package fr.amazonia.destriummod.world.feature;

import fr.amazonia.destriummod.DestriumMod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> CLOVER_PLACED = createKey("clover_placed");
    public static final ResourceKey<PlacedFeature> CLOVER_TWO_PLACED = createKey("clover_two_placed");

    public static final ResourceKey<PlacedFeature> REPAIR_ORE_PLACED = createKey("repair_ore_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, CLOVER_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CLOVER_CONFIG_KEY), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, CLOVER_TWO_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CLOVER_TWO_CONFIG_KEY), RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        register(context, REPAIR_ORE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.REPAIR_ORE_KEY), ModOrePlacement.commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-0), VerticalAnchor.absolute(100))));
    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}