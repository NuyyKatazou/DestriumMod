package fr.amazonia.destriummod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> CLOVER_PLACED = PlacementUtils.register("clover_placed", ModConfiguredFeatures.CLOVER_CONFIG, RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> CLOVER_TWO_PLACED = PlacementUtils.register("clover_two_placed", ModConfiguredFeatures.CLOVER_TWO_CONFIG, RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> REPAIR_ORE_PLACED = PlacementUtils.register("repair_ore_placed", ModConfiguredFeatures.REPAIR_ORE, ModOrePlacement.commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-0), VerticalAnchor.aboveBottom(100))));
}
