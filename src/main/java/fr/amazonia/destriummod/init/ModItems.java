package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.item.ingot.*;
import fr.amazonia.destriummod.item.stick.AmazoniteStick;
import fr.amazonia.destriummod.item.stick.ArgonideStick;
import fr.amazonia.destriummod.item.stick.DestriumStick;
import fr.amazonia.destriummod.item.tools.ModAxeItem;
import fr.amazonia.destriummod.item.tools.ModPickaxeItem;
import fr.amazonia.destriummod.utils.toolmaterials.DestriumModToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final ModItems INSTANCE = new ModItems();

    //Foods
    //AMAZONITEAPPLE
    //DESTRIUMAPPLE

    //DESTRIUM_APPLE
    //AMAZONITE_APPLE


    //Armors and Tools
    public static final Item AMAZONITE_SWORD = new SwordItem(DestriumModToolMaterials.AMAZONITE, 2, -0.8f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof());
    public static final Item AMAZONITE_PICKAXE = new ModPickaxeItem(DestriumModToolMaterials.AMAZONITE, -1, -2.8f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof());
    public static final Item AMAZONITE_AXE = new ModAxeItem(DestriumModToolMaterials.AMAZONITE, 2, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof());
    public static final Item AMAZONITE_SHOVEL = new SwordItem(DestriumModToolMaterials.AMAZONITE, -2, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof());
    //AMAZONITE_HOES

    public static final Item DESTRIUM_SWORD = new SwordItem(DestriumModToolMaterials.DESTRIUM, 1, -1.4f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof());
    public static final Item DESTRIUM_PICKAXE = new ModPickaxeItem(DestriumModToolMaterials.DESTRIUM, 0, -2.8f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof());
    public static final Item DESTRIUM_AXE = new ModAxeItem(DestriumModToolMaterials.DESTRIUM, 3, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof());
    public static final Item DESTRIUM_SHOVEL = new SwordItem(DestriumModToolMaterials.DESTRIUM, 0, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof());
    //DESTRIUM_HOES

    public static final Item ARGONIDE_SWORD = new SwordItem(DestriumModToolMaterials.ARGONIDE, 2, -1.9f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof());
    public static final Item ARGONIDE_PICKAXE = new ModPickaxeItem(DestriumModToolMaterials.ARGONIDE, 0, -2.8f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof());
    public static final Item ARGONIDE_AXE = new ModAxeItem(DestriumModToolMaterials.ARGONIDE, 4, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof());
    public static final Item ARGONIDE_SHOVEL = new SwordItem(DestriumModToolMaterials.ARGONIDE, 1, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof());
    //ARGONIDE_HOES

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
    public static final Item AMAZONITE_CRUMB = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());
    public static final Item AMAZONITE_DUST = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());
    public static final Item AMAZONITE_FRAGMENT = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());
    public static final Item AMAZONITE_NUGGETS = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());
    public static final Item AMAZONITE_INGOT = new AmazoniteIngot(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());
    public static final Item DESTRIUM_NUGGETS = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());
    public static final Item DESTRIUM_INGOT = new DestriumIngot(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());
    public static final Item ARGONIDE_NUGGETS = new ArgonideNuggets(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());
    public static final Item ARGONIDE_INGOT = new ArgonideIngot(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());
    public static final Item REPAIR_FRAGMENT = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());
    public static final Item REPAIR_GEM = new RepairItems(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());

    public static final Item EMERALD_NUGGETS = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB));
    public static final Item DIAMOND_NUGGETS = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB));
    public static final Item NETHERITE_NUGGETS = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB));


    public static final Item AMAZONITE_STICK = new AmazoniteStick(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());
    public static final Item DESTRIUM_STICK = new DestriumStick(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());
    public static final Item ARGONIDE_STICK = new ArgonideStick(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());


    public static final Item GOLDEN_CORE = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB));
    public static final Item COMPRESSED_GOLDEN = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB));


    public static final Item IRON_PLATE = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB));
    public static final Item GOLD_PLATE = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB));
    public static final Item DIAMOND_PLATE = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB));
    public static final Item NETHERITE_PLATE = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB));
    public static final Item ARGONIDE_PLATE = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB));
    public static final Item DESTRIUM_PLATE = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB));
    public static final Item AMAZONITE_PLATE = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB));


    //Fluid
    //POISON_WATER_BUCKET
    public static final Item POISON_STAR = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB));

    //RESISTANCE_LAVA_BUCKET
    public static final Item RESISTANCE_STAR = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB));

    //INFINITY_WATER_BUCKET


    //Seeds
    //DESTRIUM_SEEDS
    //AMAZONITE_SEEDS
    //XP_SEEDS

    public void registerItems() {
        //Armors and Tools
        registerItem(AMAZONITE_SWORD, "amazonite_sword");
        registerItem(AMAZONITE_PICKAXE, "amazonite_pickaxe");
        registerItem(AMAZONITE_AXE, "amazonite_axe");
        registerItem(AMAZONITE_SHOVEL, "amazonite_shovel");

        registerItem(DESTRIUM_SWORD, "destrium_sword");
        registerItem(DESTRIUM_PICKAXE, "destrium_pickaxe");
        registerItem(DESTRIUM_AXE, "destrium_axe");
        registerItem(DESTRIUM_SHOVEL, "destrium_shovel");

        registerItem(ARGONIDE_SWORD, "argonide_sword");
        registerItem(ARGONIDE_PICKAXE, "argonide_pickaxe");
        registerItem(ARGONIDE_AXE, "argonide_axe");
        registerItem(ARGONIDE_SHOVEL, "argonide_shovel");


        //Items (Mineral)
        registerItem(AMAZONITE_CRUMB, "amazonite_crumb");
        registerItem(AMAZONITE_DUST, "amazonite_dust");
        registerItem(AMAZONITE_FRAGMENT, "amazonite_fragment");
        registerItem(AMAZONITE_NUGGETS, "amazonite_nuggets");
        registerItem(AMAZONITE_INGOT, "amazonite_ingot");
        registerItem(DESTRIUM_NUGGETS, "destrium_nuggets");
        registerItem(DESTRIUM_INGOT, "destrium_ingot");
        registerItem(ARGONIDE_NUGGETS, "argonide_nuggets");
        registerItem(ARGONIDE_INGOT, "argonide_ingot");
        registerItem(REPAIR_FRAGMENT, "repair_fragment");
        registerItem(REPAIR_GEM, "repair_gem");

        registerItem(EMERALD_NUGGETS, "emerald_nuggets");
        registerItem(DIAMOND_NUGGETS, "diamond_nuggets");
        registerItem(NETHERITE_NUGGETS, "netherite_nuggets");


        registerItem(AMAZONITE_STICK, "amazonite_stick");
        registerItem(DESTRIUM_STICK, "destrium_stick");
        registerItem(ARGONIDE_STICK, "argonide_stick");


        registerItem(GOLDEN_CORE, "golden_core");
        registerItem(COMPRESSED_GOLDEN, "compressed_golden");


        registerItem(IRON_PLATE, "iron_plate");
        registerItem(GOLD_PLATE, "gold_plate");
        registerItem(DIAMOND_PLATE, "diamond_plate");
        registerItem(NETHERITE_PLATE, "netherite_plate");
        registerItem(ARGONIDE_PLATE, "argonide_plate");
        registerItem(DESTRIUM_PLATE, "destrium_plate");
        registerItem(AMAZONITE_PLATE, "amazonite_plate");

        registerItem(POISON_STAR, "poison_star");

        registerItem(RESISTANCE_STAR, "resistance_star");
    }

    public void registerItem(Item item, String name) {
    Registry.register(Registry.ITEM, new Identifier(DestriumMod.MODID, name), item);
    }
}
