package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolsTiers {

    public static final Tier ARGONIDE = new ForgeTier(4048, 13f, 5.5f, 18,
                    ModTags.Blocks.NEEDS_ARGONIDE_TOOL, () -> Ingredient.of(ModItems.ARGONIDE_INGOT.get()),
                    ModTags.Blocks.INCORRECT_FOR_ARGONIDE_TOOL);

    public static final Tier DESTRIUM = new ForgeTier(8074, 18f, 7f, 20,
                    ModTags.Blocks.NEEDS_DESTRIUM_TOOL, () -> Ingredient.of(ModItems.DESTRIUM_INGOT.get()),
                    ModTags.Blocks.INCORRECT_FOR_DESTRIUM_TOOL);

    public static final Tier AMAZONITE = new ForgeTier(45051, 20f, 10f, 25,
                    ModTags.Blocks.NEEDS_AMAZONITE_TOOL, () -> Ingredient.of(ModItems.AMAZONITE_FRAGMENT.get()),
                    ModTags.Blocks.INCORRECT_FOR_AMAZONITE_TOOL);

    public static final Tier SPAWNERS = new ForgeTier(3, 8f, 4f, 55,
                    ModTags.Blocks.NEEDS_SPAWNERS_TOOL, () -> Ingredient.of(ModItems.AMAZONITE_NUGGETS.get()),
                    ModTags.Blocks.INCORRECT_FOR_SPAWNERS_TOOL);
}
