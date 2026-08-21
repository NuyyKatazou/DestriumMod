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
import net.minecraft.world.item.component.Unbreakable;
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
    public static final RegistryObject<Item> DESTRIUM_APPLE = registerItem("destrium_apple", (properties) -> new DestriumApple(properties.fireResistant().food(ModFoods.DESTRIUM_APPLE, ModFoods.DESTRIUM_APPLE_EFFECT)));
    public static final RegistryObject<Item> AMAZONITE_APPLE = registerItem("amazonite_apple", (properties) -> new AmazoniteApple(properties.fireResistant().food(ModFoods.AMAZONITE_APPLE, ModFoods.AMAZONITE_APPLE_EFFECT)));


    //Armors and Tools
    public static final RegistryObject<Item> ARGONIDE_SWORD = registerItem("argonide_sword", (properties) -> new SwordItem(ModToolsTiers.ARGONIDE, 2, -1.9f, properties.fireResistant()));
    public static final RegistryObject<Item> DESTRIUM_SWORD = registerItem("destrium_sword", (properties) -> new SwordItem(ModToolsTiers.DESTRIUM, 1, -1.4f, properties.fireResistant()));
    public static final RegistryObject<Item> AMAZONITE_SWORD = registerItem("amazonite_sword", (properties) -> new SwordItem(ModToolsTiers.AMAZONITE, 2, -0.8f, properties.fireResistant()));

    public static final RegistryObject<Item> ARGONIDE_PICKAXE = registerItem("argonide_pickaxe", (properties) -> new PickaxeItem(ModToolsTiers.ARGONIDE, 0, -2.8f, properties.fireResistant()));
    public static final RegistryObject<Item> DESTRIUM_PICKAXE = registerItem("destrium_pickaxe", (properties) -> new PickaxeItem(ModToolsTiers.DESTRIUM, 0, -2.8f, properties.fireResistant()));
    public static final RegistryObject<Item> AMAZONITE_PICKAXE = registerItem("amazonite_pickaxe", (properties) -> new PickaxeItem(ModToolsTiers.AMAZONITE, 1, -2.8f, properties.fireResistant()));

    public static final RegistryObject<Item> ARGONIDE_AXE = registerItem("argonide_axe", (properties) -> new AxeItem(ModToolsTiers.ARGONIDE, 4, -3f, properties.fireResistant()));
    public static final RegistryObject<Item> DESTRIUM_AXE = registerItem("destrium_axe", (properties) -> new AxeItem(ModToolsTiers.DESTRIUM, 3, -3f, properties.fireResistant()));
    public static final RegistryObject<Item> AMAZONITE_AXE = registerItem("amazonite_axe", (properties) -> new AxeItem(ModToolsTiers.AMAZONITE, 2, -3f, properties.fireResistant()));

    public static final RegistryObject<Item> ARGONIDE_SHOVEL = registerItem("argonide_shovel", (properties) -> new ShovelItem(ModToolsTiers.ARGONIDE, 1, -3f, properties.fireResistant()));
    public static final RegistryObject<Item> DESTRIUM_SHOVEL = registerItem("destrium_shovel", (properties) -> new ShovelItem(ModToolsTiers.DESTRIUM, 0, -3f, properties.fireResistant()));
    public static final RegistryObject<Item> AMAZONITE_SHOVEL = registerItem("amazonite_shovel", (properties) -> new ShovelItem(ModToolsTiers.AMAZONITE, -2, -3f, properties.fireResistant()));

    public static final RegistryObject<Item> ARGONIDE_HOE = registerItem("argonide_hoe", (properties) -> new HoeItem(ModToolsTiers.ARGONIDE, -5, -3f, properties.fireResistant()));
    public static final RegistryObject<Item> DESTRIUM_HOE = registerItem("destrium_hoe", (properties) -> new HoeItem(ModToolsTiers.DESTRIUM, -6, -3f, properties.fireResistant()));
    public static final RegistryObject<Item> AMAZONITE_HOE = registerItem("amazonite_hoe", (properties) -> new HoeItem(ModToolsTiers.AMAZONITE, -7, -3f, properties.fireResistant()));

    public static final RegistryObject<Item> SPAWNERS_PICKAXE = registerItem("spawners_pickaxe", (properties) -> new SpawnersPickaxe(ModToolsTiers.SPAWNERS, 0, -2.8f, properties.fireResistant()));


    public static final RegistryObject<Item> ARGONIDE_HELMET = registerItem("argonide_helmet", (properties) -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, ArmorType.HELMET, properties.fireResistant()));
    public static final RegistryObject<Item> ARGONIDE_CHESTPLATE = registerItem("argonide_chestplate", (properties) -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, ArmorType.CHESTPLATE, properties.fireResistant()));
    public static final RegistryObject<Item> ARGONIDE_LEGGINGS = registerItem("argonide_leggings", (properties) -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, ArmorType.LEGGINGS, properties.fireResistant()));
    public static final RegistryObject<Item> ARGONIDE_BOOTS = registerItem("argonide_boots", (properties) -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, ArmorType.BOOTS, properties.fireResistant()));

    public static final RegistryObject<Item> DESTRIUM_HELMET = registerItem("destrium_helmet", (properties) -> new DestriumArmor(ModArmorMaterials.DESTRIUM, ArmorType.HELMET, properties.fireResistant()));
    public static final RegistryObject<Item> DESTRIUM_CHESTPLATE = registerItem("destrium_chestplate", (properties) -> new DestriumArmor(ModArmorMaterials.DESTRIUM, ArmorType.CHESTPLATE, properties.fireResistant()));
    public static final RegistryObject<Item> DESTRIUM_LEGGINGS = registerItem("destrium_leggings", (properties) -> new DestriumArmor(ModArmorMaterials.DESTRIUM, ArmorType.LEGGINGS, properties.fireResistant()));
    public static final RegistryObject<Item> DESTRIUM_BOOTS = registerItem("destrium_boots", (properties) -> new DestriumArmor(ModArmorMaterials.DESTRIUM, ArmorType.BOOTS, properties.fireResistant()));

    public static final RegistryObject<Item> AMAZONITE_HELMET = registerItem("amazonite_helmet", (properties) -> new AmazoniteArmorHelmet(ModArmorMaterials.AMAZONITE, ArmorType.HELMET, properties.fireResistant()));
    public static final RegistryObject<Item> AMAZONITE_CHESTPLATE = registerItem("amazonite_chestplate", (properties) -> new AmazoniteArmorChestPlate(ModArmorMaterials.AMAZONITE, ArmorType.CHESTPLATE, properties.fireResistant()));
    public static final RegistryObject<Item> AMAZONITE_LEGGINGS = registerItem("amazonite_leggings", (properties) -> new AmazoniteArmorLeggings(ModArmorMaterials.AMAZONITE, ArmorType.LEGGINGS, properties.fireResistant()));
    public static final RegistryObject<Item> AMAZONITE_BOOTS = registerItem("amazonite_boots", (properties) -> new AmazoniteArmorBoots(ModArmorMaterials.AMAZONITE, ArmorType.BOOTS, properties.fireResistant()));

    public static final RegistryObject<Item> JUMP_BOOTS = registerItem("jump_boots", (properties) -> new JumpArmorBoots(ModArmorMaterials.DESTRIUM, ArmorType.BOOTS, properties.fireResistant()));
    public static final RegistryObject<Item> SPEED_BOOTS = registerItem("speed_boots", (properties) -> new SpeedArmorBoots(ModArmorMaterials.DESTRIUM, ArmorType.BOOTS, properties.fireResistant()));
    public static final RegistryObject<Item> FEATHER_BOOTS = registerItem("feather_boots", (properties) -> new ArmorItem(ModArmorMaterials.DESTRIUM, ArmorType.BOOTS, properties.fireResistant()));
    public static final RegistryObject<Item> ADVENTURER_BOOTS = registerItem("adventurer_boots", (properties) -> new AdventurerArmorBoots(ModArmorMaterials.DESTRIUM, ArmorType.BOOTS, properties.fireResistant()));
    public static final RegistryObject<Item> REINFORCED_ADVENTURER_BOOTS = registerItem("reinforced_adventurer_boots", (properties) -> new ReinforcedAdventurerArmorBoots(ModArmorMaterials.AMAZONITE, ArmorType.BOOTS, properties.fireResistant()));

    public static final RegistryObject<Item> NECKLACE = registerItem("necklace", (properties) -> new NecklaceArmor(ModArmorMaterials.NECKLACE, ArmorType.CHESTPLATE, properties.fireResistant().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LUCKY_NECKLACE = registerItem("lucky_necklace", (properties) -> new LuckyNecklaceArmor(ModArmorMaterials.NECKLACE, ArmorType.CHESTPLATE, properties.fireResistant().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));


    //Minerals
    public static final RegistryObject<Item> ARGONIDE_NUGGET = registerItem("argonide_nugget", (properties) -> new Item(properties.fireResistant()));
    public static final RegistryObject<Item> ARGONIDE_INGOT = registerItem("argonide_ingot", (properties) -> new ArgonideIngot(properties.fireResistant()));
    public static final RegistryObject<Item> DESTRIUM_NUGGET = registerItem("destrium_nugget", (properties) -> new Item(properties.fireResistant()));
    public static final RegistryObject<Item> DESTRIUM_INGOT = registerItem("destrium_ingot", (properties) -> new DestriumIngot(properties.fireResistant()));
    public static final RegistryObject<Item> AMAZONITE_CRUMB = registerItem("amazonite_crumb", (properties) -> new Item(properties.fireResistant()));
    public static final RegistryObject<Item> AMAZONITE_DUST = registerItem("amazonite_dust", (properties) -> new Item(properties.fireResistant()));
    public static final RegistryObject<Item> AMAZONITE_FRAGMENT = registerItem("amazonite_fragment", (properties) -> new Item(properties.fireResistant()));
    public static final RegistryObject<Item> AMAZONITE_NUGGET = registerItem("amazonite_nugget", (properties) -> new Item(properties.fireResistant()));
    public static final RegistryObject<Item> AMAZONITE_INGOT = registerItem("amazonite_ingot", (properties) -> new AmazoniteIngot(properties.fireResistant()));
    public static final RegistryObject<Item> REPAIR_FRAGMENT = registerItem("repair_fragment", (properties) -> new Item(properties.fireResistant()));
    public static final RegistryObject<Item> REPAIR_GEM = registerItem("repair_gem", (properties) -> new Item(properties.fireResistant()));

    public static final RegistryObject<Item> EMERALD_NUGGET = registerItem("emerald_nugget", Item::new);
    public static final RegistryObject<Item> DIAMOND_NUGGET = registerItem("diamond_nugget", Item::new);
    public static final RegistryObject<Item> NETHERITE_NUGGET = registerItem("netherite_nugget", (properties) -> new Item(properties.fireResistant()));


    public static final RegistryObject<Item> ARGONIDE_STICK = registerItem("argonide_stick", (properties) -> new ArgonideStick(properties.fireResistant()));
    public static final RegistryObject<Item> DESTRIUM_STICK = registerItem("destrium_stick", (properties) -> new DestriumStick(properties.fireResistant()));
    public static final RegistryObject<Item> AMAZONITE_STICK = registerItem("amazonite_stick", (properties) -> new AmazoniteStick(properties.fireResistant()));


    public static final RegistryObject<Item> COMPRESSED_GOLDEN = registerItem("compressed_golden", Item::new);
    public static final RegistryObject<Item> GOLDEN_CORE = registerItem("golden_core", Item::new);


    public static final RegistryObject<Item> IRON_PLATE = registerItem("iron_plate", Item::new);
    public static final RegistryObject<Item> GOLD_PLATE = registerItem("gold_plate", Item::new);
    public static final RegistryObject<Item> DIAMOND_PLATE = registerItem("diamond_plate", Item::new);
    public static final RegistryObject<Item> NETHERITE_PLATE = registerItem("netherite_plate", (properties) -> new Item(properties.fireResistant()));
    public static final RegistryObject<Item> ARGONIDE_PLATE = registerItem("argonide_plate", (properties) -> new Item(properties.fireResistant()));
    public static final RegistryObject<Item> DESTRIUM_PLATE = registerItem("destrium_plate", (properties) -> new Item(properties.fireResistant()));
    public static final RegistryObject<Item> AMAZONITE_PLATE = registerItem("amazonite_plate", (properties) -> new Item(properties.fireResistant()));


    //Fluids
    public static final RegistryObject<Item> POISON_STAR = registerItem("poison_star", Item::new);
    public static final RegistryObject<Item> POISON_WATER_BUCKET = registerItem("poison_water_bucket", (properties) -> new BucketItem(ModFluids.POISON_WATER_FLUID, properties.stacksTo(1)));

    public static final RegistryObject<Item> RESISTANCE_STAR = registerItem("resistance_star", Item::new);
    public static final RegistryObject<Item> RESISTANCE_LAVA_BUCKET = registerItem("resistance_lava_bucket", (properties) -> new BucketItem(ModFluids.RESISTANCE_LAVA_FLUID, properties.stacksTo(1)));

    public static final RegistryObject<Item> INFINITY_WATER_BUCKET = registerItem("infinity_water_bucket", (properties) -> new InfinityWaterBucketItem(() -> Fluids.WATER, properties.stacksTo(1)));


    //Seeds
    public static final RegistryObject<Item> EXPERIENCE_SEEDS = registerItem("experience_seeds", (properties) -> new BlockItem(ModBlocks.EXPERIENCE_PLANT.get(), properties.fireResistant()));
    public static final RegistryObject<Item> DESTRIUM_SEEDS = registerItem("destrium_seeds", (properties) -> new BlockItem(ModBlocks.DESTRIUM_PLANT.get(), properties.fireResistant()));
    public static final RegistryObject<Item> AMAZONITE_SEEDS = registerItem("amazonite_seeds", (properties) -> new BlockItem(ModBlocks.AMAZONITE_PLANT.get(), properties.fireResistant()));


    public static RegistryObject<Item> registerItem(String name, Function<Item.Properties, Item> function) {
        return ModItems.ITEMS.register(name, () -> function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, name)))));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}