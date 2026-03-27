package fr.amazonia.destriummod.datagen;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.worldgen.ModBiomeModifiers;
import fr.amazonia.destriummod.worldgen.ModConfiguredFeatures;
import fr.amazonia.destriummod.worldgen.ModPlacedFeatures;
import fr.amazonia.destriummod.worldgen.biome.ModBiomes;
import fr.amazonia.destriummod.worldgen.dimension.ModDimensions;
import fr.amazonia.destriummod.worldgen.dimension.ModNoiseSettings;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.DIMENSION_TYPE, ModDimensions::bootstrapType)
            .add(Registries.NOISE_SETTINGS, ModNoiseSettings::bootstrapNoiseSettings)
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap)
            .add(Registries.BIOME, ModBiomes::boostrap)
            .add(Registries.LEVEL_STEM, ModDimensions::bootstrapStem);

    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(DestriumMod.MODID));
    }
}