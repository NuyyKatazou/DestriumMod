package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.item.InfinityWaterBucketItem;
import fr.amazonia.destriummod.item.armor.*;
import fr.amazonia.destriummod.item.food.AmazoniteApple;
import fr.amazonia.destriummod.item.food.DestriumApple;
import fr.amazonia.destriummod.item.ingot.*;
import fr.amazonia.destriummod.item.stick.AmazoniteStick;
import fr.amazonia.destriummod.item.stick.ArgonideStick;
import fr.amazonia.destriummod.item.stick.DestriumStick;
import fr.amazonia.destriummod.item.tools.SpawnersPickaxe;
import fr.amazonia.destriummod.utils.ModArmorMaterials;
import fr.amazonia.destriummod.utils.ModRarity;
import fr.amazonia.destriummod.utils.ModTiers;
import fr.amazonia.destriummod.utils.ModToolsTiers;
import net.minecraft.world.item.*;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DestriumMod.MODID);

	//Foods
	public static final RegistryObject<Item> AMAZONITE_APPLE = ITEMS.register("amazonite_apple", () -> new AmazoniteApple(new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant().food(ModFoods.AMAZONITE_APPLE)));
	public static final RegistryObject<Item> DESTRIUM_APPLE = ITEMS.register("destrium_apple", () -> new DestriumApple(new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant().food(ModFoods.DESTRIUM_APPLE)));


	//Armors and Tools
	public static final RegistryObject<Item> AMAZONITE_SWORD = ITEMS.register("amazonite_sword", () -> new SwordItem(ModToolsTiers.AMAZONITE, 2, -0.8f, new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_PICKAXE = ITEMS.register("amazonite_pickaxe", () -> new PickaxeItem(ModToolsTiers.AMAZONITE, -1, -2.8f, new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_AXE = ITEMS.register("amazonite_axe", () -> new AxeItem(ModToolsTiers.AMAZONITE, 2, -3f, new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_SHOVEL = ITEMS.register("amazonite_shovel", () -> new ShovelItem(ModToolsTiers.AMAZONITE, -2, -3f, new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_HOES = ITEMS.register("amazonite_hoes", () -> new HoeItem(ModToolsTiers.AMAZONITE, -7, -3f, new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));

	public static final RegistryObject<Item> DESTRIUM_SWORD = ITEMS.register("destrium_sword", () -> new SwordItem(ModToolsTiers.DESTRIUM, 1, -1.4f, new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_PICKAXE = ITEMS.register("destrium_pickaxe", () -> new PickaxeItem(ModToolsTiers.DESTRIUM, 0, -2.8f, new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_AXE = ITEMS.register("destrium_axe", () -> new AxeItem(ModToolsTiers.DESTRIUM, 3, -3f, new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_SHOVEL = ITEMS.register("destrium_shovel", () -> new ShovelItem(ModToolsTiers.DESTRIUM, 0, -3f, new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_HOES = ITEMS.register("destrium_hoes", () -> new HoeItem(ModToolsTiers.DESTRIUM, -6, -3f, new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));

	public static final RegistryObject<Item> ARGONIDE_SWORD = ITEMS.register("argonide_sword", () -> new SwordItem(ModToolsTiers.ARGONIDE, 2, -1.9f, new Item.Properties().rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_PICKAXE = ITEMS.register("argonide_pickaxe", () -> new PickaxeItem(ModToolsTiers.ARGONIDE, 0, -2.8f, new Item.Properties().rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_AXE = ITEMS.register("argonide_axe", () -> new AxeItem(ModToolsTiers.ARGONIDE, 4, -3f, new Item.Properties().rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_SHOVEL = ITEMS.register("argonide_shovel", () -> new ShovelItem(ModToolsTiers.ARGONIDE, 1, -3f, new Item.Properties().rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_HOES = ITEMS.register("argonide_hoes", () -> new HoeItem(ModToolsTiers.ARGONIDE, -5, -3f, new Item.Properties().rarity(ModRarity.ARGONIDE).fireResistant()));

	public static final RegistryObject<Item> SPAWNERS_PICKAXE = ITEMS.register("spawners_pickaxe", () -> new SpawnersPickaxe(ModTiers.SPAWNERS, -1, -2.8f, new Item.Properties().rarity(ModRarity.SPECIAL).fireResistant()));


	public static final RegistryObject<Item> AMAZONITE_HELMET = ITEMS.register("amazonite_helmet", () -> new AmazoniteArmorHelmet(ModArmorMaterials.AMAZONITE, ArmorItem.Type.HELMET, new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_CHESTPLATE  = ITEMS.register("amazonite_chestplate", () -> new AmazoniteArmorChestPlate(ModArmorMaterials.AMAZONITE, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_LEGGINGS = ITEMS.register("amazonite_leggings", () -> new AmazoniteArmorLeggings(ModArmorMaterials.AMAZONITE, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_BOOTS = ITEMS.register("amazonite_boots", () -> new AmazoniteArmorBoots(ModArmorMaterials.AMAZONITE, ArmorItem.Type.BOOTS, new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));

	public static final RegistryObject<Item> DESTRIUM_HELMET = ITEMS.register("destrium_helmet", () -> new DestriumArmor(ModArmorMaterials.DESTRIUM, ArmorItem.Type.HELMET, new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_CHESTPLATE = ITEMS.register("destrium_chestplate", () -> new DestriumArmor(ModArmorMaterials.DESTRIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_LEGGINGS = ITEMS.register("destrium_leggings", () -> new DestriumArmor(ModArmorMaterials.DESTRIUM, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_BOOTS = ITEMS.register("destrium_boots", () -> new DestriumArmor(ModArmorMaterials.DESTRIUM, ArmorItem.Type.BOOTS, new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));

	public static final RegistryObject<Item> ARGONIDE_HELMET = ITEMS.register("argonide_helmet", () -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, ArmorItem.Type.HELMET, new Item.Properties().rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_CHESTPLATE = ITEMS.register("argonide_chestplate", () -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_LEGGINGS = ITEMS.register("argonide_leggings", () -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_BOOTS = ITEMS.register("argonide_boots", () -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, ArmorItem.Type.BOOTS, new Item.Properties().rarity(ModRarity.ARGONIDE).fireResistant()));

	public static final RegistryObject<Item> SPEED_BOOTS = ITEMS.register("speed_boots", () -> new SpeedArmorBoots(ModArmorMaterials.DESTRIUM, ArmorItem.Type.BOOTS, new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> FEATHER_BOOTS = ITEMS.register("feather_boots", () -> new ArmorItem(ModArmorMaterials.DESTRIUM, ArmorItem.Type.BOOTS, new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> JUMP_BOOTS = ITEMS.register("jump_boots", () -> new JumpArmorBoots(ModArmorMaterials.DESTRIUM, ArmorItem.Type.BOOTS, new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> ADVENTURER_BOOTS = ITEMS.register("adventurer_boots", () -> new AdventurerArmorBoots(ModArmorMaterials.DESTRIUM, ArmorItem.Type.BOOTS, new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> REINFORCED_ADVENTURER_BOOTS = ITEMS.register("reinforced_adventurer_boots", () -> new ReinforcedAdventurerArmorBoots(ModArmorMaterials.AMAZONITE, ArmorItem.Type.BOOTS, new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));

	public static final RegistryObject<Item> NECKLACE = ITEMS.register("necklace", () -> new NecklaceArmor(ModArmorMaterials.NECKLACE, ArmorItem.Type.CHESTPLATE, new Item.Properties().setNoRepair().durability(-1).rarity(ModRarity.BASIC)));
	public static final RegistryObject<Item> LUCKY_NECKLACE = ITEMS.register("lucky_necklace", () -> new LuckyNecklaceArmor(ModArmorMaterials.NECKLACE, ArmorItem.Type.CHESTPLATE, new Item.Properties().setNoRepair().durability(-1).rarity(ModRarity.DESTRIUM)));


	//Minerals
	public static final RegistryObject<Item> AMAZONITE_CRUMB = ITEMS.register("amazonite_crumb", () -> new Item(new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_DUST = ITEMS.register("amazonite_dust", () -> new Item(new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_FRAGMENT = ITEMS.register("amazonite_fragment", () -> new Item(new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_NUGGETS = ITEMS.register("amazonite_nuggets", () -> new Item(new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_INGOT = ITEMS.register("amazonite_ingot", () -> new AmazoniteIngot(new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_NUGGETS = ITEMS.register("destrium_nuggets", () -> new Item(new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_INGOT = ITEMS.register("destrium_ingot", () -> new DestriumIngot(new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_NUGGETS = ITEMS.register("argonide_nuggets", () -> new Item(new Item.Properties().rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_INGOT = ITEMS.register("argonide_ingot", () -> new ArgonideIngot(new Item.Properties().rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> REPAIR_FRAGMENT = ITEMS.register("repair_fragment", () -> new Item(new Item.Properties().rarity(ModRarity.REPAIR).fireResistant()));
	public static final RegistryObject<Item> REPAIR_GEM = ITEMS.register("repair_gem", () -> new RepairItems(new Item.Properties().rarity(ModRarity.REPAIR).fireResistant()));

	public static final RegistryObject<Item> EMERALD_NUGGETS = ITEMS.register("emerald_nuggets", () -> new Item(new Item.Properties().rarity(ModRarity.EMERALD)));
	public static final RegistryObject<Item> DIAMOND_NUGGETS = ITEMS.register("diamond_nuggets", () -> new Item(new Item.Properties().rarity(ModRarity.DIAMOND)));
	public static final RegistryObject<Item> NETHERITE_NUGGETS = ITEMS.register("netherite_nuggets", () -> new Item(new Item.Properties().rarity(ModRarity.NETHERITE)));


	public static final RegistryObject<Item> AMAZONITE_STICK = ITEMS.register("amazonite_stick", () -> new AmazoniteStick(new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_STICK = ITEMS.register("destrium_stick", () -> new DestriumStick(new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_STICK = ITEMS.register("argonide_stick", () -> new ArgonideStick(new Item.Properties().rarity(ModRarity.ARGONIDE).fireResistant()));

	
	public static final RegistryObject<Item> GOLDEN_CORE = ITEMS.register("golden_core", () -> new Item(new Item.Properties().rarity(ModRarity.ARGONIDE)));
	public static final RegistryObject<Item> COMPRESSED_GOLDEN = ITEMS.register("compressed_golden", () -> new Item(new Item.Properties().rarity(ModRarity.ARGONIDE)));
	
	
	public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> GOLD_PLATE = ITEMS.register("gold_plate", () -> new Item(new Item.Properties().rarity(ModRarity.ARGONIDE)));
	public static final RegistryObject<Item> DIAMOND_PLATE = ITEMS.register("diamond_plate", () -> new Item(new Item.Properties().rarity(ModRarity.DIAMOND)));
	public static final RegistryObject<Item> NETHERITE_PLATE = ITEMS.register("netherite_plate", () -> new Item(new Item.Properties().rarity(ModRarity.NETHERITE)));
	public static final RegistryObject<Item> ARGONIDE_PLATE = ITEMS.register("argonide_plate", () -> new Item(new Item.Properties().rarity(ModRarity.ARGONIDE)));
	public static final RegistryObject<Item> DESTRIUM_PLATE = ITEMS.register("destrium_plate", () -> new Item(new Item.Properties().rarity(ModRarity.DESTRIUM)));
	public static final RegistryObject<Item> AMAZONITE_PLATE = ITEMS.register("amazonite_plate", () -> new Item(new Item.Properties().rarity(ModRarity.AMAZONITE)));


	//Fluids
	public static final RegistryObject<Item> POISON_STAR = ITEMS.register("poison_star", () -> new Item(new Item.Properties().rarity(ModRarity.RED)));
	
	public static final RegistryObject<Item> RESISTANCE_STAR = ITEMS.register("resistance_star", () -> new Item(new Item.Properties().rarity(ModRarity.YELLOW)));

	public static final RegistryObject<Item> INFINITY_WATER_BUCKET = ITEMS.register("infinity_water_bucket", () -> new InfinityWaterBucketItem(() -> Fluids.WATER, (new Item.Properties()).stacksTo(1).rarity(ModRarity.DESTRIUM)));


	//Seeds
	public static final RegistryObject<Item> AMAZONITE_SEEDS = ITEMS.register("amazonite_seeds", () -> new ItemNameBlockItem(ModBlocks.AMAZONITE_PLANTS.get(), (new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant())));
	public static final RegistryObject<Item> DESTRIUM_SEEDS = ITEMS.register("destrium_seeds", () -> new ItemNameBlockItem(ModBlocks.DESTRIUM_PLANTS.get(), (new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant())));
	public static final RegistryObject<Item> XP_SEEDS = ITEMS.register("xp_seeds", () -> new ItemNameBlockItem(ModBlocks.XP_PLANTS.get(), (new Item.Properties().rarity(ModRarity.EXPERIENCE).fireResistant())));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}