package fr.amazonia.destriummod.worldgen.biome;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.worldgen.ModPlacedFeatures;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.Musics;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import org.jetbrains.annotations.UnknownNullability;

public class ModBiomes {

    public static final ResourceKey<Biome> VOIDIFIED_BIOME = ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "voidified_biome"));
    public static final ResourceKey<Biome> ENRICHMENT_BIOME = ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "enrichment_biome"));
    public static final ResourceKey<Biome> MINERAL_BIOME = ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "mineral_biome"));

    public static void boostrap(BootstapContext<Biome> context) {
        context.register(VOIDIFIED_BIOME, voidifiedBiome(context));
        context.register(ENRICHMENT_BIOME, enrichmentBiome(context));
        context.register(MINERAL_BIOME, mineralBiome(context));
    }

    public static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder) {
        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
        BiomeDefaultFeatures.addDefaultSprings(builder);
        BiomeDefaultFeatures.addSurfaceFreezing(builder);
    }

    public static Biome voidifiedBiome(@UnknownNullability BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_WATER);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0.1f)
                .temperature(0.95f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(16777215)
                        .waterFogColor(16777215)
                        .skyColor(16777215)
                        .grassColorOverride(16777215)
                        .foliageColorOverride(16777215)
                        .fogColor(16777215)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.AMBIENT_BASALT_DELTAS_LOOP)).build())
                .build();
    }

    public static Biome mineralBiome(@UnknownNullability BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_WATER);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.PARADIS_DESTRIUM_ORE_PLACED);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0.1f)
                .temperature(0.95f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(16777215)
                        .waterFogColor(16777215)
                        .skyColor(16777215)
                        .grassColorOverride(16777215)
                        .foliageColorOverride(16777215)
                        .fogColor(16777215)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.AMBIENT_BASALT_DELTAS_LOOP)).build())
                .build();
    }

    public static Biome enrichmentBiome(@UnknownNullability BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_WATER);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.PARADIS_DESTRIUM_ORE_PLACED);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.PARADIS_AMAZONITE_ORE_PLACED);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0.1f)
                .temperature(0.95f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(16777215)
                        .waterFogColor(16777215)
                        .skyColor(16777215)
                        .grassColorOverride(16777215)
                        .foliageColorOverride(16777215)
                        .fogColor(16777215)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.AMBIENT_BASALT_DELTAS_LOOP)).build())
                .build();
    }
}