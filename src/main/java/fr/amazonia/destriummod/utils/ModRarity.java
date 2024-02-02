package fr.amazonia.destriummod.utils;

import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;

public enum ModRarity {
    DESTRIUM(Formatting.DARK_GREEN),
    AMAZONITE(Formatting.DARK_BLUE),
    ARGONIDE(Formatting.GOLD),
    REPAIR(Formatting.LIGHT_PURPLE),
    EMERALD(Formatting.GREEN),
    NETHERITE(Formatting.DARK_GRAY),
    DIAMOND(Formatting.AQUA),
    RED(Formatting.RED),
    YELLOW(Formatting.YELLOW),
    SPECIAL(Formatting.DARK_RED),
    BASIC(Formatting.GRAY),
    EXPERIENCE(Formatting.DARK_PURPLE);

    public final Formatting formatting;

    private ModRarity(Formatting formatting) {
        this.formatting = formatting;
    }
}
