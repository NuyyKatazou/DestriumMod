package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.item.InfinityWaterBucketItem;
import fr.amazonia.destriummod.item.armor.AmazoniteArmorBoots;
import fr.amazonia.destriummod.item.armor.AmazoniteArmorChestPlate;
import fr.amazonia.destriummod.item.armor.AmazoniteArmorHelmet;
import fr.amazonia.destriummod.item.armor.AmazoniteArmorLeggings;
import fr.amazonia.destriummod.item.armor.ArgonideArmorBoots;
import fr.amazonia.destriummod.item.armor.ArgonideArmorChestPlate;
import fr.amazonia.destriummod.item.armor.ArgonideArmorHelmet;
import fr.amazonia.destriummod.item.armor.ArgonideArmorLeggings;
import fr.amazonia.destriummod.item.armor.DestriumArmorBoots;
import fr.amazonia.destriummod.item.armor.DestriumArmorChestPlate;
import fr.amazonia.destriummod.item.armor.DestriumArmorHelmet;
import fr.amazonia.destriummod.item.armor.DestriumArmorLeggings;
import fr.amazonia.destriummod.item.food.AmazoniteApple;
import fr.amazonia.destriummod.item.food.DestriumApple;
import fr.amazonia.destriummod.item.ingot.AmazoniteCrumb;
import fr.amazonia.destriummod.item.ingot.AmazoniteDust;
import fr.amazonia.destriummod.item.ingot.AmazoniteFragment;
import fr.amazonia.destriummod.item.ingot.AmazoniteIngot;
import fr.amazonia.destriummod.item.ingot.AmazoniteNuggets;
import fr.amazonia.destriummod.item.ingot.ArgonideIngot;
import fr.amazonia.destriummod.item.ingot.ArgonideNuggets;
import fr.amazonia.destriummod.item.ingot.CompressedGolden;
import fr.amazonia.destriummod.item.ingot.DestriumIngot;
import fr.amazonia.destriummod.item.ingot.DestriumNuggets;
import fr.amazonia.destriummod.item.ingot.DiamondNuggets;
import fr.amazonia.destriummod.item.ingot.EmeraldNuggets;
import fr.amazonia.destriummod.item.ingot.GoldenCore;
import fr.amazonia.destriummod.item.ingot.NetheriteNuggets;
import fr.amazonia.destriummod.item.stick.AmazoniteStick;
import fr.amazonia.destriummod.item.stick.ArgonideStick;
import fr.amazonia.destriummod.item.stick.DestriumStick;
import fr.amazonia.destriummod.item.tools.SpawnersPickaxe;
import fr.amazonia.destriummod.utils.DestriumModItemTiers;
import fr.amazonia.destriummod.utils.ModArmorMaterial;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DestriumMod.MODID);
	
	
	@SuppressWarnings("deprecation")
	public static final Food AMAZONITEAPPLE = (new Food.Builder()).nutrition(20).saturationMod(2.6F).effect(new EffectInstance(Effects.HEAL, 1, 10), 1.0F).effect(new EffectInstance(Effects.DAMAGE_BOOST, 800, 3), 1.0F).effect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 24000, 3), 1.0F).effect(new EffectInstance(Effects.HEALTH_BOOST, 12000, 4), 1.0F).effect(new EffectInstance(Effects.REGENERATION, 3000, 4), 1.0F).effect(new EffectInstance(Effects.ABSORPTION, 12000, 9), 1.0F).alwaysEat().build();
	@SuppressWarnings("deprecation")
	public static final Food DESTRIUMAPPLE = (new Food.Builder()).nutrition(10).saturationMod(1.3F).effect(new EffectInstance(Effects.HEAL, 1, 5), 1.0F).effect(new EffectInstance(Effects.DAMAGE_BOOST, 400, 2), 1.0F).effect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 12000, 1), 1.0F).effect(new EffectInstance(Effects.HEALTH_BOOST, 6000, 1), 1.0F).effect(new EffectInstance(Effects.REGENERATION, 900, 2), 1.0F).effect(new EffectInstance(Effects.ABSORPTION, 6000, 4), 1.0F).alwaysEat().build();
	
	public static final RegistryObject<Item> DESTRIUM_APPLE = ITEMS.register("destrium_apple", () -> new DestriumApple(new Item.Properties().tab(DestriumMod.foodTab).rarity(Rarity.create("destrium", TextFormatting.DARK_GREEN)).food(ModItems.DESTRIUMAPPLE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_APPLE = ITEMS.register("amazonite_apple", () -> new AmazoniteApple(new Item.Properties().tab(DestriumMod.foodTab).rarity(Rarity.create("amazonite", TextFormatting.DARK_BLUE)).food(ModItems.AMAZONITEAPPLE).fireResistant()));

	
	public static final RegistryObject<Item> AMAZONITE_CRUMB = ITEMS.register("amazonite_crumb", () -> new AmazoniteCrumb(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("amazonite", TextFormatting.DARK_BLUE)).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_DUST = ITEMS.register("amazonite_dust", () -> new AmazoniteDust(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("amazonite", TextFormatting.DARK_BLUE)).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_FRAGMENT = ITEMS.register("amazonite_fragment", () -> new AmazoniteFragment(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("amazonite", TextFormatting.DARK_BLUE)).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_NUGGETS = ITEMS.register("amazonite_nuggets", () -> new AmazoniteNuggets(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("amazonite", TextFormatting.DARK_BLUE)).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_INGOT = ITEMS.register("amazonite_ingot", () -> new AmazoniteIngot(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("amazonite", TextFormatting.DARK_BLUE)).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_NUGGETS = ITEMS.register("destrium_nuggets", () -> new DestriumNuggets(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("destrium", TextFormatting.DARK_GREEN)).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_INGOT = ITEMS.register("destrium_ingot", () -> new DestriumIngot(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("destrium", TextFormatting.DARK_GREEN)).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_NUGGETS = ITEMS.register("argonide_nuggets", () -> new ArgonideNuggets(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("argonide", TextFormatting.GOLD)).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_INGOT = ITEMS.register("argonide_ingot", () -> new ArgonideIngot(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("argonide", TextFormatting.GOLD)).fireResistant()));
	
	public static final RegistryObject<Item> EMERALD_NUGGETS = ITEMS.register("emerald_nuggets", () -> new EmeraldNuggets(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("emerald", TextFormatting.GREEN))));
	public static final RegistryObject<Item> DIAMOND_NUGGETS = ITEMS.register("diamond_nuggets", () -> new DiamondNuggets(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("diamond", TextFormatting.BLUE))));
	public static final RegistryObject<Item> NETHERITE_NUGGETS = ITEMS.register("netherite_nuggets", () -> new NetheriteNuggets(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("netherite", TextFormatting.DARK_GRAY))));
	
	
	public static final RegistryObject<Item> AMAZONITE_STICK = ITEMS.register("amazonite_stick", () -> new AmazoniteStick(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("amazonite", TextFormatting.DARK_BLUE)).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_STICK = ITEMS.register("destrium_stick", () -> new DestriumStick(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("destrium", TextFormatting.DARK_GREEN)).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_STICK = ITEMS.register("argonide_stick", () -> new ArgonideStick(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("argonide", TextFormatting.GOLD)).fireResistant()));
	
	
	public static final RegistryObject<Item> AMAZONITE_SWORD = ITEMS.register("amazonite_sword", () -> new SwordItem(DestriumModItemTiers.AMAZONITE, 2, -0.8f, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("amazonite", TextFormatting.DARK_BLUE)).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_PICKAXE = ITEMS.register("amazonite_pickaxe", () -> new PickaxeItem(DestriumModItemTiers.AMAZONITE, -1, -2.8f, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("amazonite", TextFormatting.DARK_BLUE)).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_AXE = ITEMS.register("amazonite_axe", () -> new AxeItem(DestriumModItemTiers.AMAZONITE, 2, -3.0f, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("amazonite", TextFormatting.DARK_BLUE)).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_SHOVEL = ITEMS.register("amazonite_shovel", () -> new ShovelItem(DestriumModItemTiers.AMAZONITE, -2, -3f, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("amazonite", TextFormatting.DARK_BLUE)).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_HOES = ITEMS.register("amazonite_hoes", () -> new HoeItem(DestriumModItemTiers.AMAZONITE, -7, -3f, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("amazonite", TextFormatting.DARK_BLUE)).fireResistant()));
	
	public static final RegistryObject<Item> DESTRIUM_SWORD = ITEMS.register("destrium_sword", () -> new SwordItem(DestriumModItemTiers.DESTRIUM, 1, -1.4f, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("destrium", TextFormatting.DARK_GREEN)).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_PICKAXE = ITEMS.register("destrium_pickaxe", () -> new PickaxeItem(DestriumModItemTiers.DESTRIUM, 0, -2.8f, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("destrium", TextFormatting.DARK_GREEN)).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_AXE = ITEMS.register("destrium_axe", () -> new AxeItem(DestriumModItemTiers.DESTRIUM, 3, -3.0f, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("destrium", TextFormatting.DARK_GREEN)).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_SHOVEL = ITEMS.register("destrium_shovel", () -> new ShovelItem(DestriumModItemTiers.DESTRIUM, 0, -3f, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("destrium", TextFormatting.DARK_GREEN)).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_HOES = ITEMS.register("destrium_hoes", () -> new HoeItem(DestriumModItemTiers.DESTRIUM, -6, -3f, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("destrium", TextFormatting.DARK_GREEN)).fireResistant()));
	
	public static final RegistryObject<Item> ARGONIDE_SWORD = ITEMS.register("argonide_sword", () -> new SwordItem(DestriumModItemTiers.ARGONIDE, 2, -1.9f, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("argonide", TextFormatting.GOLD)).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_PICKAXE = ITEMS.register("argonide_pickaxe", () -> new PickaxeItem(DestriumModItemTiers.ARGONIDE, 0, -2.8f, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("argonide", TextFormatting.GOLD)).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_AXE = ITEMS.register("argonide_axe", () -> new AxeItem(DestriumModItemTiers.ARGONIDE, 4, -3.0f, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("argonide", TextFormatting.GOLD)).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_SHOVEL = ITEMS.register("argonide_shovel", () -> new ShovelItem(DestriumModItemTiers.ARGONIDE, 1, -3f, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("argonide", TextFormatting.GOLD)).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_HOES = ITEMS.register("argonide_hoes", () -> new HoeItem(DestriumModItemTiers.ARGONIDE, -5, 0f, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("argonide", TextFormatting.GOLD)).fireResistant()));
	
	public static final RegistryObject<Item> SPAWNERS_PICKAXE = ITEMS.register("spawners_pickaxe", () -> new SpawnersPickaxe(DestriumModItemTiers.SPAWNERS, -1, -2.8f, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("spawners", TextFormatting.DARK_RED)).fireResistant()));
	
	
	public static final RegistryObject<Item> AMAZONITE_HELMET = ITEMS.register("amazonite_helmet", () -> new AmazoniteArmorHelmet(ModArmorMaterial.AMAZONITE, EquipmentSlotType.HEAD, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("amazonite", TextFormatting.DARK_BLUE)).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_CHESTPLATE = ITEMS.register("amazonite_chestplate", () -> new AmazoniteArmorChestPlate(ModArmorMaterial.AMAZONITE, EquipmentSlotType.CHEST, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("amazonite", TextFormatting.DARK_BLUE)).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_LEGGINGS = ITEMS.register("amazonite_leggings", () -> new AmazoniteArmorLeggings(ModArmorMaterial.AMAZONITE, EquipmentSlotType.LEGS, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("amazonite", TextFormatting.DARK_BLUE)).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_BOOTS = ITEMS.register("amazonite_boots", () -> new AmazoniteArmorBoots(ModArmorMaterial.AMAZONITE, EquipmentSlotType.FEET, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("amazonite", TextFormatting.DARK_BLUE)).fireResistant()));
	
	public static final RegistryObject<Item> DESTRIUM_HELMET = ITEMS.register("destrium_helmet", () -> new DestriumArmorHelmet(ModArmorMaterial.DESTRIUM, EquipmentSlotType.HEAD, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("destrium", TextFormatting.DARK_GREEN)).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_CHESTPLATE = ITEMS.register("destrium_chestplate", () -> new DestriumArmorChestPlate(ModArmorMaterial.DESTRIUM, EquipmentSlotType.CHEST, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("destrium", TextFormatting.DARK_GREEN)).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_LEGGINGS = ITEMS.register("destrium_leggings", () -> new DestriumArmorLeggings(ModArmorMaterial.DESTRIUM, EquipmentSlotType.LEGS, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("destrium", TextFormatting.DARK_GREEN)).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_BOOTS = ITEMS.register("destrium_boots", () -> new DestriumArmorBoots(ModArmorMaterial.DESTRIUM, EquipmentSlotType.FEET, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("destrium", TextFormatting.DARK_GREEN)).fireResistant()));
	
	public static final RegistryObject<Item> ARGONIDE_HELMET = ITEMS.register("argonide_helmet", () -> new ArgonideArmorHelmet(ModArmorMaterial.ARGONIDE, EquipmentSlotType.HEAD, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("argonide", TextFormatting.GOLD)).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_CHESTPLATE = ITEMS.register("argonide_chestplate", () -> new ArgonideArmorChestPlate(ModArmorMaterial.ARGONIDE, EquipmentSlotType.CHEST, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("argonide", TextFormatting.GOLD)).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_LEGGINGS = ITEMS.register("argonide_leggings", () -> new ArgonideArmorLeggings(ModArmorMaterial.ARGONIDE, EquipmentSlotType.LEGS, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("argonide", TextFormatting.GOLD)).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_BOOTS = ITEMS.register("argonide_boots", () -> new ArgonideArmorBoots(ModArmorMaterial.ARGONIDE, EquipmentSlotType.FEET, new Item.Properties().tab(DestriumMod.toolTab).rarity(Rarity.create("argonide", TextFormatting.GOLD)).fireResistant()));
	
	
	public static final RegistryObject<Item> DESTRIUM_SEEDS = ITEMS.register("destrium_seeds", () -> new BlockNamedItem(ModBlocks.DESTRIUM_PLANTS.get(), (new Item.Properties().rarity(Rarity.create("destrium", TextFormatting.DARK_GREEN)).fireResistant())));
	public static final RegistryObject<Item> AMAZONITE_SEEDS = ITEMS.register("amazonite_seeds", () -> new BlockNamedItem(ModBlocks.AMAZONITE_PLANTS.get(), (new Item.Properties().rarity(Rarity.create("amazonite", TextFormatting.DARK_BLUE)).fireResistant())));
	public static final RegistryObject<Item> XP_SEEDS = ITEMS.register("xp_seeds", () -> new BlockNamedItem(ModBlocks.XP_PLANTS.get(), (new Item.Properties().rarity(Rarity.create("xp", TextFormatting.DARK_PURPLE)).fireResistant())));

	
	public static final RegistryObject<Item> GOLDEN_CORE = ITEMS.register("golden_core", () -> new GoldenCore(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("gold", TextFormatting.GOLD))));
	public static final RegistryObject<Item> COMPRESSED_GOLDEN = ITEMS.register("compressed_golden", () -> new CompressedGolden(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("gold", TextFormatting.GOLD))));
	
	
	public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab)));
	public static final RegistryObject<Item> GOLD_PLATE = ITEMS.register("gold_plate", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("gold", TextFormatting.GOLD))));	
	public static final RegistryObject<Item> DIAMOND_PLATE = ITEMS.register("diamond_plate", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("diamond", TextFormatting.BLUE))));	
	public static final RegistryObject<Item> NETHERITE_PLATE = ITEMS.register("netherite_plate", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("netherite", TextFormatting.DARK_GRAY))));	
	public static final RegistryObject<Item> ARGONIDE_PLATE = ITEMS.register("argonide_plate", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("argonide", TextFormatting.GOLD))));	
	public static final RegistryObject<Item> DESTRIUM_PLATE = ITEMS.register("destrium_plate", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("destrium", TextFormatting.DARK_GREEN))));	
	public static final RegistryObject<Item> AMAZONITE_PLATE = ITEMS.register("amazonite_plate", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("amazonite", TextFormatting.DARK_BLUE))));	
	
	
	public static final RegistryObject<Item> POISON_WATER_BUCKET = ITEMS.register("poison_water_bucket", () -> new BucketItem(() -> ModFluids.POISON_WATER_FLUID.get(), new Item.Properties().stacksTo(1).tab(DestriumMod.ItemTab)));	
	public static final RegistryObject<Item> POISON_STAR = ITEMS.register("poison_star", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("Poison", TextFormatting.RED))));	
	
	public static final RegistryObject<Item> RESISTANCE_LAVA_BUCKET = ITEMS.register("resistance_lava_bucket", () -> new BucketItem(() -> ModFluids.RESISTANCE_LAVA_FLUID.get(), new Item.Properties().stacksTo(1).tab(DestriumMod.ItemTab)));	
	public static final RegistryObject<Item> RESISTANCE_STAR = ITEMS.register("resistance_star", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(Rarity.create("Resistance", TextFormatting.YELLOW))));	
	
	public static final RegistryObject<Item> INFINITY_WATER_BUCKET = ITEMS.register("infinity_water_bucket", () -> new InfinityWaterBucketItem(() -> Fluids.WATER, new Item.Properties().stacksTo(1).tab(DestriumMod.ItemTab)));	
	
}

