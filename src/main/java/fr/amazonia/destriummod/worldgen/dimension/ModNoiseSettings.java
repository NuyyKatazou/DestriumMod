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

    public static final ResourceKey<NoiseGeneratorSettings> PARADIS_NOISE_SETTINGS = ResourceKey.create(Registries.NOISE_SETTINGS, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "paradis_noise_settings"));

    public static void bootstrapNoiseSettings(BootstrapContext<NoiseGeneratorSettings> context) {
        NoiseGeneratorSettings netherSettings = NoiseGeneratorSettings.floatingIslands(context);
        SurfaceRules.RuleSource bedrockSurface = SurfaceRules.state(ModBlocks.CLOUD.get().defaultBlockState());

        context.register(PARADIS_NOISE_SETTINGS, new NoiseGeneratorSettings(
                netherSettings.noiseSettings(),
                ModBlocks.CLOUD.get().defaultBlockState(),
                netherSettings.defaultFluid(),
                netherSettings.noiseRouter(),
                bedrockSurface,
                netherSettings.spawnTarget(),
                netherSettings.seaLevel(),
                netherSettings.disableMobGeneration(),
                netherSettings.aquifersEnabled(),
                netherSettings.oreVeinsEnabled(),
                netherSettings.useLegacyRandomSource()
        ));
    }
}