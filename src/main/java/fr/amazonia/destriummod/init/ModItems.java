package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.item.ingot.*;
import fr.amazonia.destriummod.item.stick.AmazoniteStick;
import fr.amazonia.destriummod.item.stick.ArgonideStick;
import fr.amazonia.destriummod.item.stick.DestriumStick;
import fr.amazonia.destriummod.utils.ModRarity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DestriumMod.MODID);


	//Items (Mineral)
	public static final RegistryObject<Item> AMAZONITE_CRUMB = ITEMS.register("amazonite_crumb", () -> new AmazoniteItems(new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_DUST = ITEMS.register("amazonite_dust", () -> new AmazoniteItems(new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_FRAGMENT = ITEMS.register("amazonite_fragment", () -> new AmazoniteItems(new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_NUGGETS = ITEMS.register("amazonite_nuggets", () -> new AmazoniteItems(new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_INGOT = ITEMS.register("amazonite_ingot", () -> new AmazoniteIngot(new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_NUGGETS = ITEMS.register("destrium_nuggets", () -> new DestriumNuggets(new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_INGOT = ITEMS.register("destrium_ingot", () -> new DestriumIngot(new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_NUGGETS = ITEMS.register("argonide_nuggets", () -> new ArgonideNuggets(new Item.Properties().rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_INGOT = ITEMS.register("argonide_ingot", () -> new ArgonideIngot(new Item.Properties().rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> REPAIR_FRAGMENT = ITEMS.register("repair_fragment", () -> new Item(new Item.Properties().rarity(ModRarity.REPAIR).fireResistant()));
	public static final RegistryObject<Item> REPAIR_INGOT = ITEMS.register("repair_ingot", () -> new Item(new Item.Properties().rarity(ModRarity.REPAIR).fireResistant()));

	public static final RegistryObject<Item> EMERALD_NUGGETS = ITEMS.register("emerald_nuggets", () -> new EmeraldNuggets(new Item.Properties().rarity(ModRarity.EMERALD)));
	public static final RegistryObject<Item> DIAMOND_NUGGETS = ITEMS.register("diamond_nuggets", () -> new DiamondNuggets(new Item.Properties().rarity(ModRarity.DIAMOND)));
	public static final RegistryObject<Item> NETHERITE_NUGGETS = ITEMS.register("netherite_nuggets", () -> new NetheriteNuggets(new Item.Properties().rarity(ModRarity.NETHERITE)));


	public static final RegistryObject<Item> AMAZONITE_STICK = ITEMS.register("amazonite_stick", () -> new AmazoniteStick(new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_STICK = ITEMS.register("destrium_stick", () -> new DestriumStick(new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_STICK = ITEMS.register("argonide_stick", () -> new ArgonideStick(new Item.Properties().rarity(ModRarity.ARGONIDE).fireResistant()));

	
	public static final RegistryObject<Item> GOLDEN_CORE = ITEMS.register("golden_core", () -> new GoldenItems(new Item.Properties().rarity(ModRarity.ARGONIDE)));
	public static final RegistryObject<Item> COMPRESSED_GOLDEN = ITEMS.register("compressed_golden", () -> new GoldenItems(new Item.Properties().rarity(ModRarity.ARGONIDE)));
	
	
	public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> GOLD_PLATE = ITEMS.register("gold_plate", () -> new Item(new Item.Properties().rarity(ModRarity.ARGONIDE)));
	public static final RegistryObject<Item> DIAMOND_PLATE = ITEMS.register("diamond_plate", () -> new Item(new Item.Properties().rarity(ModRarity.DIAMOND)));
	public static final RegistryObject<Item> NETHERITE_PLATE = ITEMS.register("netherite_plate", () -> new Item(new Item.Properties().rarity(ModRarity.NETHERITE)));
	public static final RegistryObject<Item> ARGONIDE_PLATE = ITEMS.register("argonide_plate", () -> new Item(new Item.Properties().rarity(ModRarity.ARGONIDE)));
	public static final RegistryObject<Item> DESTRIUM_PLATE = ITEMS.register("destrium_plate", () -> new Item(new Item.Properties().rarity(ModRarity.DESTRIUM)));
	public static final RegistryObject<Item> AMAZONITE_PLATE = ITEMS.register("amazonite_plate", () -> new Item(new Item.Properties().rarity(ModRarity.AMAZONITE)));

	//(Fluid)
	public static final RegistryObject<Item> POISON_STAR = ITEMS.register("poison_star", () -> new Item(new Item.Properties().rarity(ModRarity.RED)));
	
	public static final RegistryObject<Item> RESISTANCE_STAR = ITEMS.register("resistance_star", () -> new Item(new Item.Properties().rarity(ModRarity.YELLOW)));

	//Seeds
	public static final RegistryObject<Item> DESTRIUM_SEEDS = ITEMS.register("destrium_seeds", () -> new ItemNameBlockItem(ModBlocks.DESTRIUM_PLANTS.get(), (new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant())));
	public static final RegistryObject<Item> AMAZONITE_SEEDS = ITEMS.register("amazonite_seeds", () -> new ItemNameBlockItem(ModBlocks.AMAZONITE_PLANTS.get(), (new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant())));
	public static final RegistryObject<Item> XP_SEEDS = ITEMS.register("xp_seeds", () -> new ItemNameBlockItem(ModBlocks.XP_PLANTS.get(), (new Item.Properties().rarity(ModRarity.EXPERIENCE).fireResistant())));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}