package fr.amazonia.destriummod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> CLOVER_PLACED = PlacementUtils.register("clover_placed", ModConfiguredFeatures.CLOVER_CONFIG, RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> CLOVER_TWO_PLACED = PlacementUtils.register("clover_two_placed", ModConfiguredFeatures.CLOVER_TWO_CONFIG, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
}
