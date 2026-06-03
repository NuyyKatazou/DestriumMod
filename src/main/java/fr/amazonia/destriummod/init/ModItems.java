package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.item.InfinityWaterBucketItem;
import fr.amazonia.destriummod.item.armor.*;
import fr.amazonia.destriummod.item.food.AmazoniteApple;
import fr.amazonia.destriummod.item.food.DestriumApple;
import fr.amazonia.destriummod.item.ingot.AmazoniteIngot;
import fr.amazonia.destriummod.item.ingot.ArgonideIngot;
import fr.amazonia.destriummod.item.ingot.DestriumIngot;
import fr.amazonia.destriummod.item.stick.AmazoniteStick;
import fr.amazonia.destriummod.item.stick.ArgonideStick;
import fr.amazonia.destriummod.item.stick.DestriumStick;
import fr.amazonia.destriummod.item.tools.SpawnersPickaxe;
import fr.amazonia.destriummod.utils.ModArmorMaterials;
import fr.amazonia.destriummod.utils.ModToolsTiers;
import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.*;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DestriumMod.MODID);

    //Foods
    public static final RegistryObject<Item> AMAZONITE_APPLE = ITEMS.register("amazonite_apple", () -> new AmazoniteApple(component(new Item.Properties().fireResistant().food(ModFoods.AMAZONITE_APPLE),"amazonite_apple", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> DESTRIUM_APPLE = ITEMS.register("destrium_apple", () -> new DestriumApple(component(new Item.Properties().fireResistant().food(ModFoods.DESTRIUM_APPLE), "destrium_apple", ChatFormatting.DARK_GREEN)));


    //Armors and Tools
    public static final RegistryObject<Item> AMAZONITE_SWORD = ITEMS.register("amazonite_sword", () -> new SwordItem(ModToolsTiers.AMAZONITE, component(new Item.Properties().attributes(SwordItem.createAttributes(ModToolsTiers.AMAZONITE, 2, -0.8f)).fireResistant(), "amazonite_sword", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_PICKAXE = ITEMS.register("amazonite_pickaxe", () -> new PickaxeItem(ModToolsTiers.AMAZONITE, component(new Item.Properties().attributes(SwordItem.createAttributes(ModToolsTiers.AMAZONITE, -1, -2.8f)).fireResistant(), "amazonite_pickaxe", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_AXE = ITEMS.register("amazonite_axe", () -> new AxeItem(ModToolsTiers.AMAZONITE, component(new Item.Properties().attributes(SwordItem.createAttributes(ModToolsTiers.AMAZONITE, 2, -3f)).fireResistant(), "amazonite_axe", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_SHOVEL = ITEMS.register("amazonite_shovel", () -> new ShovelItem(ModToolsTiers.AMAZONITE, component(new Item.Properties().attributes(SwordItem.createAttributes(ModToolsTiers.AMAZONITE, -2, -3f)).fireResistant(), "amazonite_shovel", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_HOES = ITEMS.register("amazonite_hoes", () -> new HoeItem(ModToolsTiers.AMAZONITE, component(new Item.Properties().attributes(SwordItem.createAttributes(ModToolsTiers.AMAZONITE, -7, -3f)).fireResistant(), "amazonite_hoes", ChatFormatting.DARK_AQUA)));

    public static final RegistryObject<Item> DESTRIUM_SWORD = ITEMS.register("destrium_sword", () -> new SwordItem(ModToolsTiers.DESTRIUM, component(new Item.Properties().attributes(SwordItem.createAttributes(ModToolsTiers.DESTRIUM, 1, -1.4f)).fireResistant(), "destrium_sword", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> DESTRIUM_PICKAXE = ITEMS.register("destrium_pickaxe", () -> new PickaxeItem(ModToolsTiers.DESTRIUM, component(new Item.Properties().attributes(SwordItem.createAttributes(ModToolsTiers.DESTRIUM, 0, -2.8f)).fireResistant(), "destrium_pickaxe", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> DESTRIUM_AXE = ITEMS.register("destrium_axe", () -> new AxeItem(ModToolsTiers.DESTRIUM, component(new Item.Properties().attributes(SwordItem.createAttributes(ModToolsTiers.DESTRIUM, 3, -3f)).fireResistant(), "destrium_axe", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> DESTRIUM_SHOVEL = ITEMS.register("destrium_shovel", () -> new ShovelItem(ModToolsTiers.DESTRIUM, component(new Item.Properties().attributes(SwordItem.createAttributes(ModToolsTiers.DESTRIUM, 0, -3f)).fireResistant(), "destrium_shovel", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> DESTRIUM_HOES = ITEMS.register("destrium_hoes", () -> new HoeItem(ModToolsTiers.DESTRIUM, component(new Item.Properties().attributes(SwordItem.createAttributes(ModToolsTiers.DESTRIUM, -6, -3f)).fireResistant(), "destrium_hoes", ChatFormatting.DARK_GREEN)));

    public static final RegistryObject<Item> ARGONIDE_SWORD = ITEMS.register("argonide_sword", () -> new SwordItem(ModToolsTiers.ARGONIDE, component(new Item.Properties().attributes(SwordItem.createAttributes(ModToolsTiers.ARGONIDE, 2, -1.9f)).fireResistant(), "argonide_sword", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> ARGONIDE_PICKAXE = ITEMS.register("argonide_pickaxe", () -> new PickaxeItem(ModToolsTiers.ARGONIDE, component(new Item.Properties().attributes(SwordItem.createAttributes(ModToolsTiers.ARGONIDE, 0, -2.8f)).fireResistant(), "argonide_pickaxe", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> ARGONIDE_AXE = ITEMS.register("argonide_axe", () -> new AxeItem(ModToolsTiers.ARGONIDE, component(new Item.Properties().attributes(SwordItem.createAttributes(ModToolsTiers.ARGONIDE, 4, -3f)).fireResistant(), "argonide_axe", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> ARGONIDE_SHOVEL = ITEMS.register("argonide_shovel", () -> new ShovelItem(ModToolsTiers.ARGONIDE, component(new Item.Properties().attributes(SwordItem.createAttributes(ModToolsTiers.ARGONIDE, 1, -3f)).fireResistant(), "argonide_shovel", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> ARGONIDE_HOES = ITEMS.register("argonide_hoes", () -> new HoeItem(ModToolsTiers.ARGONIDE, component(new Item.Properties().attributes(SwordItem.createAttributes(ModToolsTiers.ARGONIDE, -5, -3f)).fireResistant(), "argonide_hoes", ChatFormatting.GOLD)));

    public static final RegistryObject<Item> SPAWNERS_PICKAXE = ITEMS.register("spawners_pickaxe", () -> new SpawnersPickaxe(ModToolsTiers.SPAWNERS, component(new Item.Properties().attributes(SwordItem.createAttributes(ModToolsTiers.ARGONIDE, -1, -2.8f)).fireResistant(), "spawners_pickaxe", ChatFormatting.DARK_RED)));


    public static final RegistryObject<Item> AMAZONITE_HELMET = ITEMS.register("amazonite_helmet", () -> new AmazoniteArmorHelmet(ModArmorMaterials.AMAZONITE, ArmorItem.Type.HELMET, component(new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(1256)).fireResistant(), "amazonite_helmet", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_CHESTPLATE = ITEMS.register("amazonite_chestplate", () -> new AmazoniteArmorChestPlate(ModArmorMaterials.AMAZONITE, ArmorItem.Type.CHESTPLATE, component(new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(1256)).fireResistant(), "amazonite_chestplate", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_LEGGINGS = ITEMS.register("amazonite_leggings", () -> new AmazoniteArmorLeggings(ModArmorMaterials.AMAZONITE, ArmorItem.Type.LEGGINGS, component(new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(1256)).fireResistant(), "amazonite_leggings", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_BOOTS = ITEMS.register("amazonite_boots", () -> new AmazoniteArmorBoots(ModArmorMaterials.AMAZONITE, ArmorItem.Type.BOOTS, component(new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(1256)).fireResistant(), "amazonite_boots", ChatFormatting.DARK_AQUA)));

    public static final RegistryObject<Item> DESTRIUM_HELMET = ITEMS.register("destrium_helmet", () -> new DestriumArmor(ModArmorMaterials.DESTRIUM, ArmorItem.Type.HELMET, component(new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(478)).fireResistant(), "destrium_helmet", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> DESTRIUM_CHESTPLATE = ITEMS.register("destrium_chestplate", () -> new DestriumArmor(ModArmorMaterials.DESTRIUM, ArmorItem.Type.CHESTPLATE, component(new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(478)).fireResistant(), "destrium_chestplate", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> DESTRIUM_LEGGINGS = ITEMS.register("destrium_leggings", () -> new DestriumArmor(ModArmorMaterials.DESTRIUM, ArmorItem.Type.LEGGINGS, component(new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(478)).fireResistant(), "destrium_leggings", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> DESTRIUM_BOOTS = ITEMS.register("destrium_boots", () -> new DestriumArmor(ModArmorMaterials.DESTRIUM, ArmorItem.Type.BOOTS, component(new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(478)).fireResistant(), "destrium_boots", ChatFormatting.DARK_GREEN)));

    public static final RegistryObject<Item> ARGONIDE_HELMET = ITEMS.register("argonide_helmet", () -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, ArmorItem.Type.HELMET, component(new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(74)).fireResistant(), "argonide_helmet", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> ARGONIDE_CHESTPLATE = ITEMS.register("argonide_chestplate", () -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, ArmorItem.Type.CHESTPLATE, component(new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(74)).fireResistant(), "argonide_chestplate", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> ARGONIDE_LEGGINGS = ITEMS.register("argonide_leggings", () -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, ArmorItem.Type.LEGGINGS, component(new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(74)).fireResistant(), "argonide_leggings", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> ARGONIDE_BOOTS = ITEMS.register("argonide_boots", () -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, ArmorItem.Type.BOOTS, component(new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(74)).fireResistant(), "argonide_boots", ChatFormatting.GOLD)));

    public static final RegistryObject<Item> SPEED_BOOTS = ITEMS.register("speed_boots", () -> new SpeedArmorBoots(ModArmorMaterials.DESTRIUM, ArmorItem.Type.BOOTS, component(new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(478)).fireResistant(), "speed_boots", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> FEATHER_BOOTS = ITEMS.register("feather_boots", () -> new ArmorItem(ModArmorMaterials.DESTRIUM, ArmorItem.Type.BOOTS, component(new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(478)).fireResistant(), "feather_boots", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> JUMP_BOOTS = ITEMS.register("jump_boots", () -> new JumpArmorBoots(ModArmorMaterials.DESTRIUM, ArmorItem.Type.BOOTS, component(new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(478)).fireResistant(), "jump_boots", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> ADVENTURER_BOOTS = ITEMS.register("adventurer_boots", () -> new AdventurerArmorBoots(ModArmorMaterials.DESTRIUM, ArmorItem.Type.BOOTS, component(new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(478)).fireResistant(), "adventurer_boots", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> REINFORCED_ADVENTURER_BOOTS = ITEMS.register("reinforced_adventurer_boots", () -> new ReinforcedAdventurerArmorBoots(ModArmorMaterials.AMAZONITE, ArmorItem.Type.BOOTS, component(new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(1256)).fireResistant(), "reinforced_adventurer_boots", ChatFormatting.DARK_AQUA)));

    public static final RegistryObject<Item> NECKLACE = ITEMS.register("necklace", () -> new NecklaceArmor(ModArmorMaterials.NECKLACE, ArmorItem.Type.CHESTPLATE, component(new Item.Properties().durability(-1).fireResistant(), "necklace", ChatFormatting.GRAY)));
    public static final RegistryObject<Item> LUCKY_NECKLACE = ITEMS.register("lucky_necklace", () -> new LuckyNecklaceArmor(ModArmorMaterials.NECKLACE, ArmorItem.Type.CHESTPLATE, component(new Item.Properties().durability(-1).fireResistant(), "lucky_necklace", ChatFormatting.DARK_GREEN)));


    //Minerals
    public static final RegistryObject<Item> AMAZONITE_CRUMB = ITEMS.register("amazonite_crumb", () -> new Item(component(new Item.Properties().fireResistant(), "amazonite_crumb", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_DUST = ITEMS.register("amazonite_dust", () -> new Item(component(new Item.Properties().fireResistant(), "amazonite_dust", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_FRAGMENT = ITEMS.register("amazonite_fragment", () -> new Item(component(new Item.Properties().fireResistant(), "amazonite_fragment", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_NUGGETS = ITEMS.register("amazonite_nuggets", () -> new Item(component(new Item.Properties().fireResistant(), "amazonite_nuggets", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_INGOT = ITEMS.register("amazonite_ingot", () -> new AmazoniteIngot(component(new Item.Properties().fireResistant(), "amazonite_ingot", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> DESTRIUM_NUGGETS = ITEMS.register("destrium_nuggets", () -> new Item(component(new Item.Properties().fireResistant(), "destrium_nuggets", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> DESTRIUM_INGOT = ITEMS.register("destrium_ingot", () -> new DestriumIngot(component(new Item.Properties().fireResistant(), "destrium_ingot", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> ARGONIDE_NUGGETS = ITEMS.register("argonide_nuggets", () -> new Item(component(new Item.Properties().fireResistant(), "argonide_nuggets", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> ARGONIDE_INGOT = ITEMS.register("argonide_ingot", () -> new ArgonideIngot(component(new Item.Properties().fireResistant(), "argonide_ingot", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> REPAIR_FRAGMENT = ITEMS.register("repair_fragment", () -> new Item(component(new Item.Properties().fireResistant(), "repair_fragment", ChatFormatting.LIGHT_PURPLE)));
    public static final RegistryObject<Item> REPAIR_GEM = ITEMS.register("repair_gem", () -> new Item(component(new Item.Properties().fireResistant(), "repair_gem", ChatFormatting.LIGHT_PURPLE)));

    public static final RegistryObject<Item> EMERALD_NUGGETS = ITEMS.register("emerald_nuggets", () -> new Item(component(new Item.Properties(), "emerald_nuggets", ChatFormatting.GREEN)));
    public static final RegistryObject<Item> DIAMOND_NUGGETS = ITEMS.register("diamond_nuggets", () -> new Item(component(new Item.Properties(), "diamond_nuggets", ChatFormatting.AQUA)));
    public static final RegistryObject<Item> NETHERITE_NUGGETS = ITEMS.register("netherite_nuggets", () -> new Item(component(new Item.Properties().fireResistant(),  "netherite_nuggets", ChatFormatting.DARK_GRAY)));


    public static final RegistryObject<Item> AMAZONITE_STICK = ITEMS.register("amazonite_stick", () -> new AmazoniteStick(component(new Item.Properties().fireResistant(), "amazonite_stick", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> DESTRIUM_STICK = ITEMS.register("destrium_stick", () -> new DestriumStick(component(new Item.Properties().fireResistant(), "destrium_stick", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> ARGONIDE_STICK = ITEMS.register("argonide_stick", () -> new ArgonideStick(component(new Item.Properties().fireResistant(), "argonide_stick", ChatFormatting.GOLD)));


    public static final RegistryObject<Item> GOLDEN_CORE = ITEMS.register("golden_core", () -> new Item(component(new Item.Properties(), "golden_core", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> COMPRESSED_GOLDEN = ITEMS.register("compressed_golden", () -> new Item(component(new Item.Properties(),  "compressed_golden", ChatFormatting.GOLD)));


    public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate", () -> new Item(component(new Item.Properties(), "iron_plate", ChatFormatting.WHITE)));
    public static final RegistryObject<Item> GOLD_PLATE = ITEMS.register("gold_plate", () -> new Item(component(new Item.Properties(), "gold_plate", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> DIAMOND_PLATE = ITEMS.register("diamond_plate", () -> new Item(component(new Item.Properties(), "diamond_plate", ChatFormatting.AQUA)));
    public static final RegistryObject<Item> NETHERITE_PLATE = ITEMS.register("netherite_plate", () -> new Item(component(new Item.Properties().fireResistant(), "netherite_plate", ChatFormatting.DARK_GRAY)));
    public static final RegistryObject<Item> ARGONIDE_PLATE = ITEMS.register("argonide_plate", () -> new Item(component(new Item.Properties().fireResistant(), "argonide_plate", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> DESTRIUM_PLATE = ITEMS.register("destrium_plate", () -> new Item(component(new Item.Properties().fireResistant(), "destrium_plate", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> AMAZONITE_PLATE = ITEMS.register("amazonite_plate", () -> new Item(component(new Item.Properties().fireResistant(), "amazonite_plate", ChatFormatting.DARK_AQUA)));


    //Fluids
    public static final RegistryObject<Item> POISON_WATER_BUCKET = ITEMS.register("poison_water_bucket", () -> new BucketItem(ModFluids.POISON_WATER_FLUID, component(new Item.Properties().stacksTo(1), "poison_water_bucket", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> POISON_STAR = ITEMS.register("poison_star", () -> new Item(component(new Item.Properties(), "poison_star", ChatFormatting.RED)));

    public static final RegistryObject<Item> RESISTANCE_LAVA_BUCKET = ITEMS.register("resistance_lava_bucket", () -> new BucketItem(ModFluids.RESISTANCE_LAVA_FLUID, component(new Item.Properties().stacksTo(1), "resistance_lava_bucket", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> RESISTANCE_STAR = ITEMS.register("resistance_star", () -> new Item(component(new Item.Properties(), "resistance_star", ChatFormatting.YELLOW)));

    public static final RegistryObject<Item> INFINITY_WATER_BUCKET = ITEMS.register("infinity_water_bucket", () -> new InfinityWaterBucketItem(() -> Fluids.WATER, component(new Item.Properties().stacksTo(1), "infinity_water_bucket", ChatFormatting.DARK_GREEN)));


    //Seeds
    public static final RegistryObject<Item> DESTRIUM_SEEDS = ITEMS.register("destrium_seeds", () -> new ItemNameBlockItem(ModBlocks.DESTRIUM_PLANTS.get(), component(new Item.Properties().fireResistant(), "destrium_seeds", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_SEEDS = ITEMS.register("amazonite_seeds", () -> new ItemNameBlockItem(ModBlocks.AMAZONITE_PLANTS.get(), component(new Item.Properties().fireResistant(), "amazonite_seeds", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> XP_SEEDS = ITEMS.register("xp_seeds", () -> new ItemNameBlockItem(ModBlocks.XP_PLANTS.get(), component(new Item.Properties().fireResistant(), "xp_seeds", ChatFormatting.DARK_PURPLE)));


    private static Item.Properties component(Item.Properties props, String id, ChatFormatting color) {
        props.component(DataComponents.ITEM_NAME, Component.translatable("item.destriummod." + id).setStyle(Style.EMPTY.withColor(color).withItalic(false)));
        //props.component(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
        return props;
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}