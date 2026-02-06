package fr.amazonia.destriummod.utils;

import net.minecraft.ChatFormatting;
import net.minecraft.world.item.Rarity;

public class ModRarity {

    public static final Rarity DESTRIUM = Rarity.create("destrium", style -> style.withColor(ChatFormatting.DARK_GREEN));
    public static final Rarity AMAZONITE = Rarity.create("amazonite", style -> style.withColor(ChatFormatting.DARK_BLUE));
    public static final Rarity ARGONIDE = Rarity.create("argonide", style -> style.withColor(ChatFormatting.GOLD));
    public static final Rarity REPAIR = Rarity.create("repair", style -> style.withColor(ChatFormatting.LIGHT_PURPLE));
    public static final Rarity EMERALD = Rarity.create("emerald", style -> style.withColor(ChatFormatting.GREEN));
    public static final Rarity NETHERITE = Rarity.create("netherite", style -> style.withColor(ChatFormatting.DARK_GRAY));
    public static final Rarity DIAMOND = Rarity.create("diamond", style -> style.withColor(ChatFormatting.AQUA));
    public static final Rarity RED = Rarity.create("red", style -> style.withColor(ChatFormatting.RED));
    public static final Rarity YELLOW = Rarity.create("yellow", style -> style.withColor(ChatFormatting.YELLOW));
    public static final Rarity SPECIAL = Rarity.create("special", style -> style.withColor(ChatFormatting.DARK_RED));
    public static final Rarity BASIC = Rarity.create("basic", style -> style.withColor(ChatFormatting.GRAY));
    public static final Rarity EXPERIENCE = Rarity.create("EXPERIENCE", style -> style.withColor(ChatFormatting.DARK_PURPLE));
}