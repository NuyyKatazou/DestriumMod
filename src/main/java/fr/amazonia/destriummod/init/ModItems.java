package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.item.ingot.*;
import fr.amazonia.destriummod.item.stick.AmazoniteStick;
import fr.amazonia.destriummod.item.stick.ArgonideStick;
import fr.amazonia.destriummod.item.stick.DestriumStick;
import fr.amazonia.destriummod.item.tools.ModAxeItem;
import fr.amazonia.destriummod.item.tools.ModHoeItem;
import fr.amazonia.destriummod.item.tools.ModPickaxeItem;
import fr.amazonia.destriummod.utils.toolmaterials.DestriumModToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static void initialize(){}


    //Foods
    //AMAZONITEAPPLE
    //DESTRIUMAPPLE

    //DESTRIUM_APPLE
    //AMAZONITE_APPLE


    //Armors and Tools
    public static final Item AMAZONITE_SWORD = ModItems.register("amazonite_sword", new SwordItem(DestriumModToolMaterials.AMAZONITE, 2, -0.8f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item AMAZONITE_PICKAXE = ModItems.register("amazonite_pickaxe", new ModPickaxeItem(DestriumModToolMaterials.AMAZONITE, -1, -2.8f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item AMAZONITE_AXE = ModItems.register("amazonite_axe", new ModAxeItem(DestriumModToolMaterials.AMAZONITE, 2, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item AMAZONITE_SHOVEL = ModItems.register("amazonite_shovel", new ShovelItem(DestriumModToolMaterials.AMAZONITE, -2, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item AMAZONITE_HOE = ModItems.register("amazonite_hoes", new ModHoeItem(DestriumModToolMaterials.AMAZONITE, -7, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));

    public static final Item DESTRIUM_SWORD = ModItems.register("destrium_sword", new SwordItem(DestriumModToolMaterials.DESTRIUM, 1, -1.4f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item DESTRIUM_PICKAXE = ModItems.register("destrium_pickaxe", new ModPickaxeItem(DestriumModToolMaterials.DESTRIUM, 0, -2.8f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item DESTRIUM_AXE = ModItems.register("destrium_axe", new ModAxeItem(DestriumModToolMaterials.DESTRIUM, 3, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item DESTRIUM_SHOVEL = ModItems.register("destrium_shovel", new ShovelItem(DestriumModToolMaterials.DESTRIUM, 0, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item DESTRIUM_HOE = ModItems.register("destrium_hoes", new ModHoeItem(DestriumModToolMaterials.DESTRIUM, -6, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));

    public static final Item ARGONIDE_SWORD = ModItems.register("argonide_sword", new SwordItem(DestriumModToolMaterials.ARGONIDE, 2, -1.9f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item ARGONIDE_PICKAXE = ModItems.register("argonide_pickaxe", new ModPickaxeItem(DestriumModToolMaterials.ARGONIDE, 0, -2.8f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item ARGONIDE_AXE = ModItems.register("argonide_axe", new ModAxeItem(DestriumModToolMaterials.ARGONIDE, 4, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item ARGONIDE_SHOVEL = ModItems.register("argonide_shovel", new ShovelItem(DestriumModToolMaterials.ARGONIDE, 1, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item ARGONIDE_HOE = ModItems.register("argonide_hoes", new ModHoeItem(DestriumModToolMaterials.ARGONIDE, -5, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));

    //SPAWNERS_PICKAXE


    //AMAZONITE_HELMET
    //AMAZONITE_CHESTPLATE
    //AMAZONITE_LEGGINGS
    //AMAZONITE_BOOTS

    //DESTRIUM_HELMET
    //DESTRIUM_CHESTPLATE
    //DESTRIUM_LEGGINGS
    //DESTRIUM_BOOTS

    //ARGONIDE_HELMET
    //ARGONIDE_CHESTPLATE
    //ARGONIDE_LEGGINGS
    //ARGONIDE_BOOTS

    //SPEED_BOOTS
    //FEATHER_BOOTS
    //JUMP_BOOTS
    //ADVENTURER_BOOTS
    //REINFORCED_ADVENTURER_BOOTS

    //NECKLACE
    //LUCKY_NECKLACE


    //Items (Mineral)
    public static final Item AMAZONITE_CRUMB = ModItems.register("amazonite_crumb", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item AMAZONITE_DUST = ModItems.register("amazonite_dust", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item AMAZONITE_FRAGMENT = ModItems.register("amazonite_fragment", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item AMAZONITE_NUGGETS = ModItems.register("amazonite_nuggets", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item AMAZONITE_INGOT = ModItems.register("amazonite_ingot", new AmazoniteIngot(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item DESTRIUM_NUGGETS = ModItems.register("destrium_nuggets", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item DESTRIUM_INGOT = ModItems.register("destrium_ingot", new DestriumIngot(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item ARGONIDE_NUGGETS = ModItems.register("argonide_nuggets", new ArgonideNuggets(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item ARGONIDE_INGOT = ModItems.register("argonide_ingot", new ArgonideIngot(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item REPAIR_FRAGMENT = ModItems.register("repair_fragment", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item REPAIR_GEM = ModItems.register("repair_gem", new RepairItems(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));

    public static final Item EMERALD_NUGGETS = ModItems.register("emerald_nuggets", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));
    public static final Item DIAMOND_NUGGETS = ModItems.register("diamond_nuggets", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));
    public static final Item NETHERITE_NUGGETS = ModItems.register("netherite_nuggets", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));


    public static final Item AMAZONITE_STICK = ModItems.register("amazonite_stick", new AmazoniteStick(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item DESTRIUM_STICK = ModItems.register("destrium_stick", new DestriumStick(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item ARGONIDE_STICK = ModItems.register("argonide_stick", new ArgonideStick(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));


    public static final Item GOLDEN_CORE = ModItems.register("golden_core", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));
    public static final Item COMPRESSED_GOLDEN = ModItems.register("compressed_golden", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));


    public static final Item IRON_PLATE = ModItems.register("iron_plate", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));
    public static final Item GOLD_PLATE = ModItems.register("gold_plate", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));
    public static final Item DIAMOND_PLATE = ModItems.register("diamond_plate", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));
    public static final Item NETHERITE_PLATE = ModItems.register("netherite_plate", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));
    public static final Item ARGONIDE_PLATE = ModItems.register("argonide_plate", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));
    public static final Item DESTRIUM_PLATE = ModItems.register("destrium_plate", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));
    public static final Item AMAZONITE_PLATE = ModItems.register("amazonite_plate", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));


    //Fluid
    //POISON_WATER_BUCKET
    public static final Item POISON_STAR = ModItems.register("poison_star", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));

    //RESISTANCE_LAVA_BUCKET
    public static final Item RESISTANCE_STAR = ModItems.register("resistance_star", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));

    //INFINITY_WATER_BUCKET


    //Seeds
    //DESTRIUM_SEEDS
    //AMAZONITE_SEEDS
    //XP_SEEDS

    public static <T extends Item> T register(String name, T item){
        Identifier itemID = new Identifier(DestriumMod.MODID, name);

        T registedItem = Registry.register(Registry.ITEM, itemID, item);

        return registedItem;
    }
}
