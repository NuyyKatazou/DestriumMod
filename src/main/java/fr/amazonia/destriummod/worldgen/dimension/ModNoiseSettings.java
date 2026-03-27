package fr.amazonia.destriummod.worldgen.dimension;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class ModNoiseSettings {

    public static final ResourceKey<NoiseGeneratorSettings> PARADIS_NOISE_SETTINGS = ResourceKey.create(
            Registries.NOISE_SETTINGS,
            ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "paradis_noise_settings"));

    public static void bootstrapNoiseSettings(BootstrapContext<NoiseGeneratorSettings> context) {
        NoiseGeneratorSettings paradisSettings = NoiseGeneratorSettings.floatingIslands(context);
        SurfaceRules.RuleSource paradisSurface = SurfaceRules.sequence(

                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                        SurfaceRules.state(ModBlocks.CLOUD.get().defaultBlockState())),
                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR,
                        SurfaceRules.state(ModBlocks.CLOUD.get().defaultBlockState())),
                SurfaceRules.ifTrue(SurfaceRules.ON_CEILING,
                        SurfaceRules.state(ModBlocks.CLOUD.get().defaultBlockState())),
                SurfaceRules.ifTrue(SurfaceRules.UNDER_CEILING,
                        SurfaceRules.state(ModBlocks.CLOUD.get().defaultBlockState())),
                SurfaceRules.ifTrue(SurfaceRules.DEEP_UNDER_FLOOR,
                        SurfaceRules.state(ModBlocks.CRACKED_CLOUD.get().defaultBlockState()))

        );

        context.register(PARADIS_NOISE_SETTINGS, new NoiseGeneratorSettings(
                paradisSettings.noiseSettings(),
                ModBlocks.CLOUD.get().defaultBlockState(),
                paradisSettings.defaultFluid(),
                paradisSettings.noiseRouter(),
                paradisSurface,
                paradisSettings.spawnTarget(),
                paradisSettings.seaLevel(),
                paradisSettings.disableMobGeneration(),
                paradisSettings.aquifersEnabled(),
                paradisSettings.oreVeinsEnabled(),
                paradisSettings.useLegacyRandomSource()));
    }
}