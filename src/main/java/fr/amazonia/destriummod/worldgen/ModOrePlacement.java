package fr.amazonia.destriummod.worldgen;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModOrePlacement {

    public static List<PlacementModifier> orePlacement(PlacementModifier pChancePlacement, PlacementModifier pCountPlacement, PlacementModifier pHeightRange) {
        return List.of(pChancePlacement, pCountPlacement, InSquarePlacement.spread(), pHeightRange, BiomeFilter.biome());
    }

    public static List<PlacementModifier> normalOrePlacement(int pChance, UniformInt pCount, PlacementModifier pHeightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), CountPlacement.of(pCount), pHeightRange);
    }
}