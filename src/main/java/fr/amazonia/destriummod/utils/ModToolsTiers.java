package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolsTiers {
    public static Tier ARGONIDE;
    public static Tier DESTRIUM;
    public static Tier AMAZONITE;

    static {
        ARGONIDE = TierSortingRegistry.registerTier(
                new ForgeTier(4, 4048, 13f, 5.5f, 18,
                        ModTags.Blocks.NEEDS_ARGONIDE_TOOL, () -> Ingredient.of(ModItems.ARGONIDE_INGOT.get())),
                new ResourceLocation(DestriumMod.MODID, "argonide"), List.of(ModTiers.ARGONIDE), List.of());
        DESTRIUM = TierSortingRegistry.registerTier(
                new ForgeTier(5, 8074, 18f, 7f, 20,
                        ModTags.Blocks.NEEDS_DESTRIUM_TOOL, () -> Ingredient.of(ModItems.DESTRIUM_INGOT.get())),
                new ResourceLocation(DestriumMod.MODID, "destrium"), List.of(ModTiers.DESTRIUM), List.of());
        AMAZONITE = TierSortingRegistry.registerTier(
                new ForgeTier(6, 45051, 20f, 10f, 25,
                        ModTags.Blocks.NEEDS_AMAZONITE_TOOL, () -> Ingredient.of(ModItems.AMAZONITE_FRAGMENT.get())),
                new ResourceLocation(DestriumMod.MODID, "amazonite"), List.of(ModTiers.AMAZONITE), List.of());

    }
}
