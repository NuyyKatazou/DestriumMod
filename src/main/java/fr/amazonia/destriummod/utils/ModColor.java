package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.init.ModBlocks;
import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.Item;

import java.util.HashMap;
import java.util.Map;

public class ModColor {

    public static final Map<Item, TextColor> ITEM_COLORS = new HashMap<>();

    public static void initColors() {
        //Blocks
        ITEM_COLORS.put(ModBlocks.BLUE_CLOUD.get().asItem(), TextColor.fromRgb(0x0066FF));
        ITEM_COLORS.put(ModBlocks.BLACK_CLOUD.get().asItem(), TextColor.fromRgb(0x242424));
        ITEM_COLORS.put(ModBlocks.BROWN_CLOUD.get().asItem(), TextColor.fromRgb(0x422826));
        ITEM_COLORS.put(ModBlocks.CYAN_CLOUD.get().asItem(), TextColor.fromRgb(0x256AC4));
        ITEM_COLORS.put(ModBlocks.DARK_BLUE_CLOUD.get().asItem(), TextColor.fromRgb(0x004CFF));
        ITEM_COLORS.put(ModBlocks.DARK_GRAY_CLOUD.get().asItem(), TextColor.fromRgb(0x474747));
        ITEM_COLORS.put(ModBlocks.DARK_GREEN_CLOUD.get().asItem(), TextColor.fromRgb(0x125706));
        ITEM_COLORS.put(ModBlocks.DARK_PURPLE_CLOUD.get().asItem(), TextColor.fromRgb(0x650782));
        ITEM_COLORS.put(ModBlocks.DARK_RED_CLOUD.get().asItem(), TextColor.fromRgb(0x520000));
        ITEM_COLORS.put(ModBlocks.GRAY_CLOUD.get().asItem(), TextColor.fromRgb(0x707070));
        ITEM_COLORS.put(ModBlocks.GREEN_CLOUD.get().asItem(), TextColor.fromRgb(0x1BB500));
        ITEM_COLORS.put(ModBlocks.LIGHT_BLUE_CLOUD.get().asItem(), TextColor.fromRgb(0x00E1FF));
        ITEM_COLORS.put(ModBlocks.LIGHT_GRAY_CLOUD.get().asItem(), TextColor.fromRgb(0xA6A6A6));
        ITEM_COLORS.put(ModBlocks.LIGHT_RED_CLOUD.get().asItem(), TextColor.fromRgb(0xFC5151));
        ITEM_COLORS.put(ModBlocks.LIME_CLOUD.get().asItem(), TextColor.fromRgb(0x00FF11));
        ITEM_COLORS.put(ModBlocks.MAGENTA_CLOUD.get().asItem(), TextColor.fromRgb(0xFF00EA));
        ITEM_COLORS.put(ModBlocks.ORANGE_CLOUD.get().asItem(), TextColor.fromRgb(0xFF8800));
        ITEM_COLORS.put(ModBlocks.PINK_CLOUD.get().asItem(), TextColor.fromRgb(0xFF80CA));
        ITEM_COLORS.put(ModBlocks.PURPLE_CLOUD.get().asItem(), TextColor.fromRgb(0x960AC7));
        ITEM_COLORS.put(ModBlocks.RED_CLOUD.get().asItem(), TextColor.fromRgb(0xFC0000));
        ITEM_COLORS.put(ModBlocks.ULTRA_DARK_BLUE_CLOUD.get().asItem(), TextColor.fromRgb(0x070CAD));
        ITEM_COLORS.put(ModBlocks.YELLOW_CLOUD.get().asItem(), TextColor.fromRgb(0xDEC800));
        ITEM_COLORS.put(ModBlocks.CRACKED_CLOUD.get().asItem(), TextColor.fromRgb(0xD1D1D1));

        ITEM_COLORS.put(ModBlocks.RANDOM_ORE.get().asItem(), TextColor.fromRgb(0x828282));
        ITEM_COLORS.put(ModBlocks.CRACKED_ARGONIDE_ORE.get().asItem(), TextColor.fromRgb(0xFFB000));
        ITEM_COLORS.put(ModBlocks.PARADIS_ARGONIDE_ORE.get().asItem(), TextColor.fromRgb(0xD69300));
        ITEM_COLORS.put(ModBlocks.PARADIS_DESTRIUM_ORE.get().asItem(), TextColor.fromRgb(0x05D600));
        ITEM_COLORS.put(ModBlocks.PARADIS_AMAZONITE_ORE.get().asItem(), TextColor.fromRgb(0x0055FF));
        ITEM_COLORS.put(ModBlocks.REPAIR_ORE.get().asItem(), TextColor.fromRgb(0xBF00FF));

        ITEM_COLORS.put(ModBlocks.ARGONIDE_BLOCK.get().asItem(), TextColor.fromRgb(0xFF7300));
        ITEM_COLORS.put(ModBlocks.DESTRIUM_BLOCK.get().asItem(), TextColor.fromRgb(0x29F500));
        ITEM_COLORS.put(ModBlocks.AMAZONITE_BLOCK.get().asItem(), TextColor.fromRgb(0x0066FF));
        ITEM_COLORS.put(ModBlocks.FAKE_AMAZONITE_BLOCK.get().asItem(), TextColor.fromRgb(0x0066FF));
        ITEM_COLORS.put(ModBlocks.REPAIR_BLOCK.get().asItem(), TextColor.fromRgb(0xBF00FF));

        ITEM_COLORS.put(ModBlocks.COBBLESTONE_COMPRESSED1.get().asItem(), TextColor.fromRgb(0x808080));
        ITEM_COLORS.put(ModBlocks.COBBLESTONE_COMPRESSED2.get().asItem(), TextColor.fromRgb(0x787777));
        ITEM_COLORS.put(ModBlocks.COBBLESTONE_COMPRESSED3.get().asItem(), TextColor.fromRgb(0x707070));
        ITEM_COLORS.put(ModBlocks.COBBLESTONE_COMPRESSED4.get().asItem(), TextColor.fromRgb(0x6B6B6B));
        ITEM_COLORS.put(ModBlocks.COBBLESTONE_COMPRESSED5.get().asItem(), TextColor.fromRgb(0x636363));
        ITEM_COLORS.put(ModBlocks.COBBLESTONE_COMPRESSED6.get().asItem(), TextColor.fromRgb(0x5E5E5E));
        ITEM_COLORS.put(ModBlocks.COBBLESTONE_COMPRESSED7.get().asItem(), TextColor.fromRgb(0x595959));
        ITEM_COLORS.put(ModBlocks.COBBLESTONE_COMPRESSED8.get().asItem(), TextColor.fromRgb(0x4F4F4F));

        ITEM_COLORS.put(ModBlocks.DIRT_COMPRESSED1.get().asItem(), TextColor.fromRgb(0x87614E));
        ITEM_COLORS.put(ModBlocks.DIRT_COMPRESSED2.get().asItem(), TextColor.fromRgb(0x805947));
        ITEM_COLORS.put(ModBlocks.DIRT_COMPRESSED3.get().asItem(), TextColor.fromRgb(0x785140));
        ITEM_COLORS.put(ModBlocks.DIRT_COMPRESSED4.get().asItem(), TextColor.fromRgb(0x704838));
        ITEM_COLORS.put(ModBlocks.DIRT_COMPRESSED5.get().asItem(), TextColor.fromRgb(0x664031));

        ITEM_COLORS.put(ModBlocks.AMAZONITE_RELIC.get().asItem(), TextColor.fromRgb(0x0066FF));

        ITEM_COLORS.put(ModBlocks.CLOVER.get().asItem(), TextColor.fromRgb(0x07FF00));
        ITEM_COLORS.put(ModBlocks.CLOVER_TWO.get().asItem(), TextColor.fromRgb(0x07FF00));


        //Items
        ITEM_COLORS.put(ModItems.DESTRIUM_APPLE.get(), TextColor.fromRgb(0x29F500));
        ITEM_COLORS.put(ModItems.AMAZONITE_APPLE.get(), TextColor.fromRgb(0x0066FF));

        ITEM_COLORS.put(ModItems.ARGONIDE_NUGGET.get(), TextColor.fromRgb(0xFF7300));
        ITEM_COLORS.put(ModItems.ARGONIDE_INGOT.get(), TextColor.fromRgb(0xFF7300));
        ITEM_COLORS.put(ModItems.DESTRIUM_NUGGET.get(), TextColor.fromRgb(0x29F500));
        ITEM_COLORS.put(ModItems.DESTRIUM_INGOT.get(), TextColor.fromRgb(0x29F500));
        ITEM_COLORS.put(ModItems.AMAZONITE_CRUMB.get(), TextColor.fromRgb(0x0066FF));
        ITEM_COLORS.put(ModItems.AMAZONITE_DUST.get(), TextColor.fromRgb(0x0066FF));
        ITEM_COLORS.put(ModItems.AMAZONITE_FRAGMENT.get(), TextColor.fromRgb(0x0066FF));
        ITEM_COLORS.put(ModItems.AMAZONITE_NUGGET.get(), TextColor.fromRgb(0x0066FF));
        ITEM_COLORS.put(ModItems.AMAZONITE_INGOT.get(), TextColor.fromRgb(0x0066FF));
        ITEM_COLORS.put(ModItems.REPAIR_FRAGMENT.get(), TextColor.fromRgb(0xBF00FF));
        ITEM_COLORS.put(ModItems.REPAIR_GEM.get(), TextColor.fromRgb(0xBF00FF));

        ITEM_COLORS.put(ModItems.EMERALD_NUGGET.get(), TextColor.fromRgb(0x44FF00));
        ITEM_COLORS.put(ModItems.DIAMOND_NUGGET.get(), TextColor.fromRgb(0x00F4F7));
        ITEM_COLORS.put(ModItems.NETHERITE_NUGGET.get(), TextColor.fromRgb(0x423C3C));

        ITEM_COLORS.put(ModItems.ARGONIDE_STICK.get(), TextColor.fromRgb(0xFF7300));
        ITEM_COLORS.put(ModItems.DESTRIUM_STICK.get(), TextColor.fromRgb(0x29F500));
        ITEM_COLORS.put(ModItems.AMAZONITE_STICK.get(), TextColor.fromRgb(0x0066FF));

        ITEM_COLORS.put(ModItems.COMPRESSED_GOLDEN.get(), TextColor.fromRgb(0xF7F123));
        ITEM_COLORS.put(ModItems.GOLDEN_CORE.get(), TextColor.fromRgb(0xF7F123));

        ITEM_COLORS.put(ModItems.GOLD_PLATE.get(), TextColor.fromRgb(0xF7F123));
        ITEM_COLORS.put(ModItems.DIAMOND_PLATE.get(), TextColor.fromRgb(0x00F4F7));
        ITEM_COLORS.put(ModItems.NETHERITE_PLATE.get(), TextColor.fromRgb(0x423C3C));
        ITEM_COLORS.put(ModItems.ARGONIDE_PLATE.get(), TextColor.fromRgb(0xFF7300));
        ITEM_COLORS.put(ModItems.DESTRIUM_PLATE.get(), TextColor.fromRgb(0x29F500));
        ITEM_COLORS.put(ModItems.AMAZONITE_PLATE.get(), TextColor.fromRgb(0x0066FF));

        ITEM_COLORS.put(ModItems.POISON_STAR.get(), TextColor.fromRgb(0xC22323));
        ITEM_COLORS.put(ModItems.POISON_WATER_BUCKET.get(), TextColor.fromRgb(0x0066FF));

        ITEM_COLORS.put(ModItems.RESISTANCE_STAR.get(), TextColor.fromRgb(0xF7F123));
        ITEM_COLORS.put(ModItems.RESISTANCE_LAVA_BUCKET.get(), TextColor.fromRgb(0xFF7300));

        ITEM_COLORS.put(ModItems.INFINITY_WATER_BUCKET.get(), TextColor.fromRgb(0x29F500));

        ITEM_COLORS.put(ModItems.EXPERIENCE_SEEDS.get(), TextColor.fromRgb(0xBF00FF));
        ITEM_COLORS.put(ModItems.DESTRIUM_SEEDS.get(), TextColor.fromRgb(0x29F500));
        ITEM_COLORS.put(ModItems.AMAZONITE_SEEDS.get(), TextColor.fromRgb(0x0066FF));

        ITEM_COLORS.put(ModItems.ARGONIDE_SWORD.get(), TextColor.fromRgb(0xFF7300));
        ITEM_COLORS.put(ModItems.ARGONIDE_PICKAXE.get(), TextColor.fromRgb(0xFF7300));
        ITEM_COLORS.put(ModItems.ARGONIDE_AXE.get(), TextColor.fromRgb(0xFF7300));
        ITEM_COLORS.put(ModItems.ARGONIDE_SHOVEL.get(), TextColor.fromRgb(0xFF7300));
        ITEM_COLORS.put(ModItems.ARGONIDE_HOE.get(), TextColor.fromRgb(0xFF7300));

        ITEM_COLORS.put(ModItems.DESTRIUM_SWORD.get(), TextColor.fromRgb(0x29F500));
        ITEM_COLORS.put(ModItems.DESTRIUM_PICKAXE.get(), TextColor.fromRgb(0x29F500));
        ITEM_COLORS.put(ModItems.DESTRIUM_AXE.get(), TextColor.fromRgb(0x29F500));
        ITEM_COLORS.put(ModItems.DESTRIUM_SHOVEL.get(), TextColor.fromRgb(0x29F500));
        ITEM_COLORS.put(ModItems.DESTRIUM_HOE.get(), TextColor.fromRgb(0x29F500));

        ITEM_COLORS.put(ModItems.AMAZONITE_SWORD.get(), TextColor.fromRgb(0x0066FF));
        ITEM_COLORS.put(ModItems.AMAZONITE_PICKAXE.get(), TextColor.fromRgb(0x0066FF));
        ITEM_COLORS.put(ModItems.AMAZONITE_AXE.get(), TextColor.fromRgb(0x0066FF));
        ITEM_COLORS.put(ModItems.AMAZONITE_SHOVEL.get(), TextColor.fromRgb(0x0066FF));
        ITEM_COLORS.put(ModItems.AMAZONITE_HOE.get(), TextColor.fromRgb(0x0066FF));

        ITEM_COLORS.put(ModItems.SPAWNERS_PICKAXE.get(), TextColor.fromRgb(0xC22323));

        ITEM_COLORS.put(ModItems.ARGONIDE_HELMET.get(), TextColor.fromRgb(0xFF7300));
        ITEM_COLORS.put(ModItems.ARGONIDE_CHESTPLATE.get(), TextColor.fromRgb(0xFF7300));
        ITEM_COLORS.put(ModItems.ARGONIDE_LEGGINGS.get(), TextColor.fromRgb(0xFF7300));
        ITEM_COLORS.put(ModItems.ARGONIDE_BOOTS.get(), TextColor.fromRgb(0xFF7300));

        ITEM_COLORS.put(ModItems.DESTRIUM_HELMET.get(), TextColor.fromRgb(0x29F500));
        ITEM_COLORS.put(ModItems.DESTRIUM_CHESTPLATE.get(), TextColor.fromRgb(0x29F500));
        ITEM_COLORS.put(ModItems.DESTRIUM_LEGGINGS.get(), TextColor.fromRgb(0x29F500));
        ITEM_COLORS.put(ModItems.DESTRIUM_BOOTS.get(), TextColor.fromRgb(0x29F500));

        ITEM_COLORS.put(ModItems.AMAZONITE_HELMET.get(), TextColor.fromRgb(0x0066FF));
        ITEM_COLORS.put(ModItems.AMAZONITE_CHESTPLATE.get(), TextColor.fromRgb(0x0066FF));
        ITEM_COLORS.put(ModItems.AMAZONITE_LEGGINGS.get(), TextColor.fromRgb(0x0066FF));
        ITEM_COLORS.put(ModItems.AMAZONITE_BOOTS.get(), TextColor.fromRgb(0x0066FF));

        ITEM_COLORS.put(ModItems.JUMP_BOOTS.get(), TextColor.fromRgb(0x29F500));
        ITEM_COLORS.put(ModItems.SPEED_BOOTS.get(), TextColor.fromRgb(0x29F500));
        ITEM_COLORS.put(ModItems.FEATHER_BOOTS.get(), TextColor.fromRgb(0x29F500));
        ITEM_COLORS.put(ModItems.ADVENTURER_BOOTS.get(), TextColor.fromRgb(0x29F500));
        ITEM_COLORS.put(ModItems.REINFORCED_ADVENTURER_BOOTS.get(), TextColor.fromRgb(0x0066FF));

        ITEM_COLORS.put(ModItems.NECKLACE.get(), TextColor.fromRgb(0xAAAAAA));
        ITEM_COLORS.put(ModItems.LUCKY_NECKLACE.get(), TextColor.fromRgb(0x29F500));
    }
}