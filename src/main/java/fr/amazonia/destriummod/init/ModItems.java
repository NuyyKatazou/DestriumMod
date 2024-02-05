package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.item.ingot.*;
import fr.amazonia.destriummod.item.stick.AmazoniteStick;
import fr.amazonia.destriummod.item.stick.ArgonideStick;
import fr.amazonia.destriummod.item.stick.DestriumStick;
import fr.amazonia.destriummod.item.tools.ModAxeItem;
import fr.amazonia.destriummod.item.tools.ModHoeItem;
import fr.amazonia.destriummod.item.tools.ModPickaxeItem;
import fr.amazonia.destriummod.utils.ModArmorMaterials;
import fr.amazonia.destriummod.utils.ModToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static void initialize(){}

    //Foods
    public static final Item DESTRIUM_APPLE = register("destrium_apple", new Item(new FabricItemSettings().food(new FoodComponent.Builder().alwaysEdible().hunger(10).saturationModifier(1.3F).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 5), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 400, 2), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 12000, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 6000, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 9000, 2), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 6000, 4), 1.0F).build()).group(DestriumMod.FOOD_TAB).fireproof()));
    public static final Item AMAZONITE_APPLE = register("amazonite_apple", new Item(new FabricItemSettings().food(new FoodComponent.Builder().alwaysEdible().hunger(20).saturationModifier(2.6F).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 10), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 800, 3), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 24000, 3), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 12000, 4), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3000, 4), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 12000, 9), 1.0F).build()).group(DestriumMod.FOOD_TAB).fireproof()));


    //Armors and Tools
    public static final Item AMAZONITE_SWORD = register("amazonite_sword", new SwordItem(ModToolMaterials.AMAZONITE, 2, -0.8f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item AMAZONITE_PICKAXE = register("amazonite_pickaxe", new ModPickaxeItem(ModToolMaterials.AMAZONITE, -1, -2.8f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item AMAZONITE_AXE = register("amazonite_axe", new ModAxeItem(ModToolMaterials.AMAZONITE, 2, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item AMAZONITE_SHOVEL = register("amazonite_shovel", new ShovelItem(ModToolMaterials.AMAZONITE, -2, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item AMAZONITE_HOE = register("amazonite_hoes", new ModHoeItem(ModToolMaterials.AMAZONITE, -7, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));

    public static final Item DESTRIUM_SWORD = register("destrium_sword", new SwordItem(ModToolMaterials.DESTRIUM, 1, -1.4f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item DESTRIUM_PICKAXE = register("destrium_pickaxe", new ModPickaxeItem(ModToolMaterials.DESTRIUM, 0, -2.8f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item DESTRIUM_AXE = register("destrium_axe", new ModAxeItem(ModToolMaterials.DESTRIUM, 3, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item DESTRIUM_SHOVEL = register("destrium_shovel", new ShovelItem(ModToolMaterials.DESTRIUM, 0, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item DESTRIUM_HOE = register("destrium_hoes", new ModHoeItem(ModToolMaterials.DESTRIUM, -6, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));

    public static final Item ARGONIDE_SWORD = register("argonide_sword", new SwordItem(ModToolMaterials.ARGONIDE, 2, -1.9f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item ARGONIDE_PICKAXE = register("argonide_pickaxe", new ModPickaxeItem(ModToolMaterials.ARGONIDE, 0, -2.8f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item ARGONIDE_AXE = register("argonide_axe", new ModAxeItem(ModToolMaterials.ARGONIDE, 4, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item ARGONIDE_SHOVEL = register("argonide_shovel", new ShovelItem(ModToolMaterials.ARGONIDE, 1, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item ARGONIDE_HOE = register("argonide_hoes", new ModHoeItem(ModToolMaterials.ARGONIDE, -5, -3f, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));

    //SPAWNERS_PICKAXE


    public static final Item AMAZONITE_HELMET = register("amazonite_helmet", new ArmorItem(ModArmorMaterials.AMAZONITE, EquipmentSlot.HEAD, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item AMAZONITE_CHESTPLATE = register("amazonite_chestplate", new ArmorItem(ModArmorMaterials.AMAZONITE, EquipmentSlot.CHEST, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item AMAZONITE_LEGGINGS = register("amazonite_leggings", new ArmorItem(ModArmorMaterials.AMAZONITE, EquipmentSlot.LEGS, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item AMAZONITE_BOOTS = register("amazonite_boots", new ArmorItem(ModArmorMaterials.AMAZONITE, EquipmentSlot.FEET, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));

    public static final Item DESTRIUM_HELMET = register("destrium_helmet", new ArmorItem(ModArmorMaterials.DESTRIUM, EquipmentSlot.HEAD, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item DESTRIUM_CHESTPLATE = register("destrium_chestplate", new ArmorItem(ModArmorMaterials.DESTRIUM, EquipmentSlot.CHEST, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item DESTRIUM_LEGGINGS = register("destrium_leggings", new ArmorItem(ModArmorMaterials.DESTRIUM, EquipmentSlot.LEGS, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item DESTRIUM_BOOTS = register("destrium_boots", new ArmorItem(ModArmorMaterials.DESTRIUM, EquipmentSlot.FEET, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));

    public static final Item ARGONIDE_HELMET = register("argonide_helmet", new ArmorItem(ModArmorMaterials.ARGONIDE, EquipmentSlot.HEAD, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item ARGONIDE_CHESTPLATE = register("argonide_chestplate", new ArmorItem(ModArmorMaterials.ARGONIDE, EquipmentSlot.CHEST, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item ARGONIDE_LEGGINGS = register("argonide_leggings", new ArmorItem(ModArmorMaterials.ARGONIDE, EquipmentSlot.LEGS, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item ARGONIDE_BOOTS = register("argonide_boots", new ArmorItem(ModArmorMaterials.ARGONIDE, EquipmentSlot.FEET, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));

    public static final Item SPEED_BOOTS = register("speed_boots", new ArmorItem(ModArmorMaterials.DESTRIUM, EquipmentSlot.FEET, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item FEATHER_BOOTS = register("feather_boots", new ArmorItem(ModArmorMaterials.DESTRIUM, EquipmentSlot.FEET, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item JUMP_BOOTS = register("jump_boots", new ArmorItem(ModArmorMaterials.DESTRIUM, EquipmentSlot.FEET, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item ADVENTURER_BOOTS = register("adventurer_boots", new ArmorItem(ModArmorMaterials.DESTRIUM, EquipmentSlot.FEET, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));
    public static final Item REINFORCED_ADVENTURER_BOOTS = register("reinforced_adventurer_boots", new ArmorItem(ModArmorMaterials.DESTRIUM, EquipmentSlot.FEET, new FabricItemSettings().group(DestriumMod.TOOL_TAB).fireproof()));

    //NECKLACE
    //LUCKY_NECKLACE


    //Items (Mineral)
    public static final Item AMAZONITE_CRUMB = register("amazonite_crumb", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item AMAZONITE_DUST = register("amazonite_dust", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item AMAZONITE_FRAGMENT = register("amazonite_fragment", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item AMAZONITE_NUGGETS = register("amazonite_nuggets", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item AMAZONITE_INGOT = register("amazonite_ingot", new AmazoniteIngot(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item DESTRIUM_NUGGETS = register("destrium_nuggets", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item DESTRIUM_INGOT = register("destrium_ingot", new DestriumIngot(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item ARGONIDE_NUGGETS = register("argonide_nuggets", new ArgonideNuggets(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item ARGONIDE_INGOT = register("argonide_ingot", new ArgonideIngot(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item REPAIR_FRAGMENT = register("repair_fragment", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item REPAIR_GEM = register("repair_gem", new RepairItems(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));

    public static final Item EMERALD_NUGGETS = register("emerald_nuggets", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));
    public static final Item DIAMOND_NUGGETS = register("diamond_nuggets", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));
    public static final Item NETHERITE_NUGGETS = register("netherite_nuggets", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));


    public static final Item AMAZONITE_STICK = register("amazonite_stick", new AmazoniteStick(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item DESTRIUM_STICK = register("destrium_stick", new DestriumStick(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));
    public static final Item ARGONIDE_STICK = register("argonide_stick", new ArgonideStick(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof()));


    public static final Item GOLDEN_CORE = register("golden_core", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));
    public static final Item COMPRESSED_GOLDEN = register("compressed_golden", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));


    public static final Item IRON_PLATE = register("iron_plate", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));
    public static final Item GOLD_PLATE = register("gold_plate", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));
    public static final Item DIAMOND_PLATE = register("diamond_plate", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));
    public static final Item NETHERITE_PLATE = register("netherite_plate", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));
    public static final Item ARGONIDE_PLATE = register("argonide_plate", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));
    public static final Item DESTRIUM_PLATE = register("destrium_plate", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));
    public static final Item AMAZONITE_PLATE = register("amazonite_plate", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));


    //Fluid
    //POISON_WATER_BUCKET
    public static final Item POISON_STAR = register("poison_star", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));

    //RESISTANCE_LAVA_BUCKET
    public static final Item RESISTANCE_STAR = register("resistance_star", new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB)));

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
