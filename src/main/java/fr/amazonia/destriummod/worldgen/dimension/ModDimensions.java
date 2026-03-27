package fr.amazonia.destriummod.worldgen.dimension;

import com.mojang.datafixers.util.Pair;
import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.worldgen.biome.ModBiomes;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.FixedBiomeSource;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;

import java.util.List;
import java.util.OptionalLong;

public class ModDimensions {

    public static final ResourceKey<LevelStem> PARADIS_DIMENSION_KEY = ResourceKey.create(Registries.LEVEL_STEM,
            ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "paradis"));

    public static final ResourceKey<Level> PARADIS_DIMENSION_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION,
            ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "paradis"));

    public static final ResourceKey<DimensionType> PARADIS_DIMENSION_TYPE = ResourceKey.create(
            Registries.DIMENSION_TYPE,
            ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "paradis_type"));

    public static void bootstrapType(BootstrapContext<DimensionType> context) {
        context.register(PARADIS_DIMENSION_TYPE, new DimensionType(
                OptionalLong.of(800),
                true,
                false,
                false,
                true,
                0.01,
                true,
                true,
                0,
                256,
                256,
                BlockTags.INFINIBURN_END,
                BuiltinDimensionTypes.OVERWORLD_EFFECTS,
                1.0f,
                new DimensionType.MonsterSettings(true, false, ConstantInt.of(7), 15)));
    }

    public static void bootstrapStem(BootstrapContext<LevelStem> context) {
        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
        HolderGetter<DimensionType> dimTypes = context.lookup(Registries.DIMENSION_TYPE);
        HolderGetter<NoiseGeneratorSettings> noiseGenSettings = context.lookup(Registries.NOISE_SETTINGS);

        NoiseBasedChunkGenerator wrappedChunkGenerator = new NoiseBasedChunkGenerator(
                new FixedBiomeSource(biomeRegistry.getOrThrow(ModBiomes.VOIDIFIED_BIOME)),
                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.AMPLIFIED));

        NoiseBasedChunkGenerator noiseBasedChunkGenerator = new NoiseBasedChunkGenerator(
                MultiNoiseBiomeSource.createFromList(
                        new Climate.ParameterList<>(List.of(Pair.of(
                                Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                                        0.0F),
                                biomeRegistry.getOrThrow(ModBiomes.VOIDIFIED_BIOME))

                        ))),
                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.AMPLIFIED));

        NoiseBasedChunkGenerator paradisChunkGenerator = new NoiseBasedChunkGenerator(
                MultiNoiseBiomeSource.createFromList(
                        new Climate.ParameterList<>(List.of(
                                Pair.of(
                                        Climate.parameters(-0.55F, 0.0F, 0.0F,
                                                0.0F, 0.0F, 0.0F, 0.0F),
                                        biomeRegistry.getOrThrow(
                                                ModBiomes.VOIDIFIED_BIOME)),
                                Pair.of(
                                        Climate.parameters(0.0F, 0.0F, 0.0F,
                                                0.0F, 0.0F, 0.0F, 0.0F),
                                        biomeRegistry.getOrThrow(
                                                ModBiomes.MINERAL_BIOME)),
                                Pair.of(
                                        Climate.parameters(0.55F, 0.0F, 0.0F,
                                                0.0F, 0.0F, 0.0F, 0.0F),
                                        biomeRegistry.getOrThrow(
                                                ModBiomes.ENRICHMENT_BIOME))))),
                noiseGenSettings.getOrThrow(ModNoiseSettings.PARADIS_NOISE_SETTINGS));

        LevelStem stem = new LevelStem(dimTypes.getOrThrow(ModDimensions.PARADIS_DIMENSION_TYPE),
                paradisChunkGenerator);

        context.register(PARADIS_DIMENSION_KEY, stem);
    }
}