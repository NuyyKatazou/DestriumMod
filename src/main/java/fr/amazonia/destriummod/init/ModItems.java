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
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DestriumMod.MODID);

    //Foods
    public static final RegistryObject<Item> AMAZONITE_APPLE = registerItem("amazonite_apple", (properties) -> new AmazoniteApple(component(properties.fireResistant().food(ModFoods.AMAZONITE_APPLE, ModFoods.AMAZONITE_APPLE_EFFECT),"amazonite_apple", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> DESTRIUM_APPLE = registerItem("destrium_apple", (properties) -> new DestriumApple(component(properties.fireResistant().food(ModFoods.DESTRIUM_APPLE, ModFoods.DESTRIUM_APPLE_EFFECT), "destrium_apple", ChatFormatting.DARK_GREEN)));


    //Armors and Tools
    public static final RegistryObject<Item> AMAZONITE_SWORD = registerItem("amazonite_sword", (properties) -> new SwordItem(ModToolsTiers.AMAZONITE, 2, -0.8f, properties, component(properties.fireResistant(), "amazonite_sword", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_PICKAXE = registerItem("amazonite_pickaxe", (properties) -> new PickaxeItem(ModToolsTiers.AMAZONITE, 1, -2.8f, properties, component(properties.fireResistant(), "amazonite_pickaxe", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_AXE = registerItem("amazonite_axe", (properties) -> new AxeItem(ModToolsTiers.AMAZONITE, 2, -3f, properties, component(properties.fireResistant(), "amazonite_axe", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_SHOVEL = registerItem("amazonite_shovel", (properties) -> new ShovelItem(ModToolsTiers.AMAZONITE, -2, -3f, properties, component(properties.fireResistant(), "amazonite_shovel", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_HOES = registerItem("amazonite_hoes", (properties) -> new HoeItem(ModToolsTiers.AMAZONITE, -7, -3f, properties, component(properties.fireResistant(), "amazonite_hoes", ChatFormatting.DARK_AQUA)));

    public static final RegistryObject<Item> DESTRIUM_SWORD = registerItem("destrium_sword", (properties) -> new SwordItem(ModToolsTiers.DESTRIUM, 1, -1.4f, properties, component(properties.fireResistant(), "destrium_sword", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> DESTRIUM_PICKAXE = registerItem("destrium_pickaxe", (properties) -> new PickaxeItem(ModToolsTiers.DESTRIUM, 0, -2.8f, properties, component(properties.fireResistant(), "destrium_pickaxe", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> DESTRIUM_AXE = registerItem("destrium_axe", (properties) -> new AxeItem(ModToolsTiers.DESTRIUM, 3, -3f, properties, component(properties.fireResistant(), "destrium_axe", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> DESTRIUM_SHOVEL = registerItem("destrium_shovel", (properties) -> new ShovelItem(ModToolsTiers.DESTRIUM, 0, -3f, properties, component(properties.fireResistant(), "destrium_shovel", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> DESTRIUM_HOES = registerItem("destrium_hoes", (properties) -> new HoeItem(ModToolsTiers.DESTRIUM, -6, -3f, properties, component(properties.fireResistant(), "destrium_hoes", ChatFormatting.DARK_GREEN)));

    public static final RegistryObject<Item> ARGONIDE_SWORD = registerItem("argonide_sword", (properties) -> new SwordItem(ModToolsTiers.ARGONIDE, 2, -1.9f, properties, component(properties.fireResistant(), "argonide_sword", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> ARGONIDE_PICKAXE = registerItem("argonide_pickaxe", (properties) -> new PickaxeItem(ModToolsTiers.ARGONIDE, 0, -2.8f, properties, component(properties.fireResistant(), "argonide_pickaxe", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> ARGONIDE_AXE = registerItem("argonide_axe", (properties) -> new AxeItem(ModToolsTiers.ARGONIDE, 4, -3f, properties, component(properties.fireResistant(), "argonide_axe", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> ARGONIDE_SHOVEL = registerItem("argonide_shovel", (properties) -> new ShovelItem(ModToolsTiers.ARGONIDE, 1, -3f, properties, component(properties.fireResistant(), "argonide_shovel", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> ARGONIDE_HOES = registerItem("argonide_hoes", (properties) -> new HoeItem(ModToolsTiers.ARGONIDE, -5, -3f, properties, component(properties.fireResistant(), "argonide_hoes", ChatFormatting.GOLD)));

    public static final RegistryObject<Item> SPAWNERS_PICKAXE = registerItem("spawners_pickaxe", (properties) -> new SpawnersPickaxe(ModToolsTiers.SPAWNERS, 0, -2.8f, properties, component(properties.fireResistant(), "spawners_pickaxe", ChatFormatting.DARK_RED)));


    public static final RegistryObject<Item> AMAZONITE_HELMET = registerItem("amazonite_helmet", (properties) -> new AmazoniteArmorHelmet(ModArmorMaterials.AMAZONITE, ArmorType.HELMET, component(properties.durability(ArmorType.HELMET.getDurability(1256)).fireResistant(), "amazonite_helmet", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_CHESTPLATE = registerItem("amazonite_chestplate", (properties) -> new AmazoniteArmorChestPlate(ModArmorMaterials.AMAZONITE, ArmorType.CHESTPLATE, component(properties.durability(ArmorType.CHESTPLATE.getDurability(1256)).fireResistant(), "amazonite_chestplate", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_LEGGINGS = registerItem("amazonite_leggings", (properties) -> new AmazoniteArmorLeggings(ModArmorMaterials.AMAZONITE, ArmorType.LEGGINGS, component(properties.durability(ArmorType.LEGGINGS.getDurability(1256)).fireResistant(), "amazonite_leggings", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_BOOTS = registerItem("amazonite_boots", (properties) -> new AmazoniteArmorBoots(ModArmorMaterials.AMAZONITE, ArmorType.BOOTS, component(properties.durability(ArmorType.BOOTS.getDurability(1256)).fireResistant(), "amazonite_boots", ChatFormatting.DARK_AQUA)));

    public static final RegistryObject<Item> DESTRIUM_HELMET = registerItem("destrium_helmet", (properties) -> new DestriumArmor(ModArmorMaterials.DESTRIUM, ArmorType.HELMET, component(properties.durability(ArmorType.HELMET.getDurability(478)).fireResistant(), "destrium_helmet", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> DESTRIUM_CHESTPLATE = registerItem("destrium_chestplate", (properties) -> new DestriumArmor(ModArmorMaterials.DESTRIUM, ArmorType.CHESTPLATE, component(properties.durability(ArmorType.CHESTPLATE.getDurability(478)).fireResistant(), "destrium_chestplate", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> DESTRIUM_LEGGINGS = registerItem("destrium_leggings", (properties) -> new DestriumArmor(ModArmorMaterials.DESTRIUM, ArmorType.LEGGINGS, component(properties.durability(ArmorType.LEGGINGS.getDurability(478)).fireResistant(), "destrium_leggings", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> DESTRIUM_BOOTS = registerItem("destrium_boots", (properties) -> new DestriumArmor(ModArmorMaterials.DESTRIUM, ArmorType.BOOTS, component(properties.durability(ArmorType.BOOTS.getDurability(478)).fireResistant(), "destrium_boots", ChatFormatting.DARK_GREEN)));

    public static final RegistryObject<Item> ARGONIDE_HELMET = registerItem("argonide_helmet", (properties) -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, ArmorType.HELMET, component(properties.durability(ArmorType.HELMET.getDurability(74)).fireResistant(), "argonide_helmet", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> ARGONIDE_CHESTPLATE = registerItem("argonide_chestplate", (properties) -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, ArmorType.CHESTPLATE, component(properties.durability(ArmorType.CHESTPLATE.getDurability(74)).fireResistant(), "argonide_chestplate", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> ARGONIDE_LEGGINGS = registerItem("argonide_leggings", (properties) -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, ArmorType.LEGGINGS, component(properties.durability(ArmorType.LEGGINGS.getDurability(74)).fireResistant(), "argonide_leggings", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> ARGONIDE_BOOTS = registerItem("argonide_boots", (properties) -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, ArmorType.BOOTS, component(properties.durability(ArmorType.BOOTS.getDurability(74)).fireResistant(), "argonide_boots", ChatFormatting.GOLD)));

    public static final RegistryObject<Item> SPEED_BOOTS = registerItem("speed_boots", (properties) -> new SpeedArmorBoots(ModArmorMaterials.DESTRIUM, ArmorType.BOOTS, component(properties.durability(ArmorType.BOOTS.getDurability(478)).fireResistant(), "speed_boots", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> FEATHER_BOOTS = registerItem("feather_boots", (properties) -> new ArmorItem(ModArmorMaterials.DESTRIUM, ArmorType.BOOTS, component(properties.durability(ArmorType.BOOTS.getDurability(478)).fireResistant(), "feather_boots", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> JUMP_BOOTS = registerItem("jump_boots", (properties) -> new JumpArmorBoots(ModArmorMaterials.DESTRIUM, ArmorType.BOOTS, component(properties.durability(ArmorType.BOOTS.getDurability(478)).fireResistant(), "jump_boots", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> ADVENTURER_BOOTS = registerItem("adventurer_boots", (properties) -> new AdventurerArmorBoots(ModArmorMaterials.DESTRIUM, ArmorType.BOOTS, component(properties.durability(ArmorType.BOOTS.getDurability(478)).fireResistant(), "adventurer_boots", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> REINFORCED_ADVENTURER_BOOTS = registerItem("reinforced_adventurer_boots", (properties) -> new ReinforcedAdventurerArmorBoots(ModArmorMaterials.AMAZONITE, ArmorType.BOOTS, component(properties.durability(ArmorType.BOOTS.getDurability(1256)).fireResistant(), "reinforced_adventurer_boots", ChatFormatting.DARK_AQUA)));

    public static final RegistryObject<Item> NECKLACE = registerItem("necklace", (properties) -> new NecklaceArmor(ModArmorMaterials.NECKLACE, ArmorType.CHESTPLATE, component(properties.durability(-1).fireResistant(), "necklace", ChatFormatting.GRAY)));
    public static final RegistryObject<Item> LUCKY_NECKLACE = registerItem("lucky_necklace", (properties) -> new LuckyNecklaceArmor(ModArmorMaterials.NECKLACE, ArmorType.CHESTPLATE, component(properties.durability(-1).fireResistant(), "lucky_necklace", ChatFormatting.DARK_GREEN)));


    //Minerals
    public static final RegistryObject<Item> AMAZONITE_CRUMB = registerItem("amazonite_crumb", (properties) -> new Item(component(properties.fireResistant(), "amazonite_crumb", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_DUST = registerItem("amazonite_dust", (properties) -> new Item(component(properties.fireResistant(), "amazonite_dust", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_FRAGMENT = registerItem("amazonite_fragment", (properties) -> new Item(component(properties.fireResistant(), "amazonite_fragment", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_NUGGETS = registerItem("amazonite_nuggets", (properties) -> new Item(component(properties.fireResistant(), "amazonite_nuggets", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_INGOT = registerItem("amazonite_ingot", (properties) -> new AmazoniteIngot(component(properties.fireResistant(), "amazonite_ingot", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> DESTRIUM_NUGGETS = registerItem("destrium_nuggets", (properties) -> new Item(component(properties.fireResistant(), "destrium_nuggets", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> DESTRIUM_INGOT = registerItem("destrium_ingot", (properties) -> new DestriumIngot(component(properties.fireResistant(), "destrium_ingot", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> ARGONIDE_NUGGETS = registerItem("argonide_nuggets", (properties) -> new Item(component(properties.fireResistant(), "argonide_nuggets", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> ARGONIDE_INGOT = registerItem("argonide_ingot", (properties) -> new ArgonideIngot(component(properties.fireResistant(), "argonide_ingot", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> REPAIR_FRAGMENT = registerItem("repair_fragment", (properties) -> new Item(component(properties.fireResistant(), "repair_fragment", ChatFormatting.LIGHT_PURPLE)));
    public static final RegistryObject<Item> REPAIR_GEM = registerItem("repair_gem", (properties) -> new Item(component(properties.fireResistant(), "repair_gem", ChatFormatting.LIGHT_PURPLE)));

    public static final RegistryObject<Item> EMERALD_NUGGETS = registerItem("emerald_nuggets", (properties) -> new Item(component(properties, "emerald_nuggets", ChatFormatting.GREEN)));
    public static final RegistryObject<Item> DIAMOND_NUGGETS = registerItem("diamond_nuggets", (properties) -> new Item(component(properties, "diamond_nuggets", ChatFormatting.AQUA)));
    public static final RegistryObject<Item> NETHERITE_NUGGETS = registerItem("netherite_nuggets", (properties) -> new Item(component(properties.fireResistant(),  "netherite_nuggets", ChatFormatting.DARK_GRAY)));


    public static final RegistryObject<Item> AMAZONITE_STICK = registerItem("amazonite_stick", (properties) -> new AmazoniteStick(component(properties.fireResistant(), "amazonite_stick", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> DESTRIUM_STICK = registerItem("destrium_stick", (properties) -> new DestriumStick(component(properties.fireResistant(), "destrium_stick", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> ARGONIDE_STICK = registerItem("argonide_stick", (properties) -> new ArgonideStick(component(properties.fireResistant(), "argonide_stick", ChatFormatting.GOLD)));


    public static final RegistryObject<Item> GOLDEN_CORE = registerItem("golden_core", (properties) -> new Item(component(properties, "golden_core", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> COMPRESSED_GOLDEN = registerItem("compressed_golden", (properties) -> new Item(component(properties,  "compressed_golden", ChatFormatting.GOLD)));


    public static final RegistryObject<Item> IRON_PLATE = registerItem("iron_plate", (properties) -> new Item(component(properties, "iron_plate", ChatFormatting.WHITE)));
    public static final RegistryObject<Item> GOLD_PLATE = registerItem("gold_plate", (properties) -> new Item(component(properties, "gold_plate", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> DIAMOND_PLATE = registerItem("diamond_plate", (properties) -> new Item(component(properties, "diamond_plate", ChatFormatting.AQUA)));
    public static final RegistryObject<Item> NETHERITE_PLATE = registerItem("netherite_plate", (properties) -> new Item(component(properties.fireResistant(), "netherite_plate", ChatFormatting.DARK_GRAY)));
    public static final RegistryObject<Item> ARGONIDE_PLATE = registerItem("argonide_plate", (properties) -> new Item(component(properties.fireResistant(), "argonide_plate", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> DESTRIUM_PLATE = registerItem("destrium_plate", (properties) -> new Item(component(properties.fireResistant(), "destrium_plate", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> AMAZONITE_PLATE = registerItem("amazonite_plate", (properties) -> new Item(component(properties.fireResistant(), "amazonite_plate", ChatFormatting.DARK_AQUA)));


    //Fluids
    public static final RegistryObject<Item> POISON_WATER_BUCKET = registerItem("poison_water_bucket", (properties) -> new BucketItem(ModFluids.POISON_WATER_FLUID, component(properties.stacksTo(1), "poison_water_bucket", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> POISON_STAR = registerItem("poison_star", (properties) -> new Item(component(properties, "poison_star", ChatFormatting.RED)));

    public static final RegistryObject<Item> RESISTANCE_LAVA_BUCKET = registerItem("resistance_lava_bucket", (properties) -> new BucketItem(ModFluids.RESISTANCE_LAVA_FLUID, component(properties.stacksTo(1), "resistance_lava_bucket", ChatFormatting.GOLD)));
    public static final RegistryObject<Item> RESISTANCE_STAR = registerItem("resistance_star", (properties) -> new Item(component(properties, "resistance_star", ChatFormatting.YELLOW)));

    public static final RegistryObject<Item> INFINITY_WATER_BUCKET = registerItem("infinity_water_bucket", (properties) -> new InfinityWaterBucketItem(() -> Fluids.WATER, component(properties.stacksTo(1), "infinity_water_bucket", ChatFormatting.DARK_GREEN)));


    //Seeds
    public static final RegistryObject<Item> DESTRIUM_SEEDS = registerItem("destrium_seeds", (properties) -> new BlockItem(ModBlocks.DESTRIUM_PLANTS.get(), component(properties.fireResistant(), "destrium_seeds", ChatFormatting.DARK_AQUA)));
    public static final RegistryObject<Item> AMAZONITE_SEEDS = registerItem("amazonite_seeds", (properties) -> new BlockItem(ModBlocks.AMAZONITE_PLANTS.get(), component(properties.fireResistant(), "amazonite_seeds", ChatFormatting.DARK_GREEN)));
    public static final RegistryObject<Item> XP_SEEDS = registerItem("xp_seeds", (properties) -> new BlockItem(ModBlocks.XP_PLANTS.get(), component(properties.fireResistant(), "xp_seeds", ChatFormatting.DARK_PURPLE)));


    public static RegistryObject<Item> registerItem(String name, Function<Item.Properties, Item> function) {
        return ModItems.ITEMS.register(name, () -> function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, name)))));
    }

    private static Item.Properties component(Item.Properties props, String id, ChatFormatting color) {
        props.component(DataComponents.ITEM_NAME, Component.translatable("item.destriummod." + id).setStyle(Style.EMPTY.withColor(color).withItalic(false)));
        //props.component(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
        return props;
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}