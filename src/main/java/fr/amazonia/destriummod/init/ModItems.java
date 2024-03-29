package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.item.InfinityWaterBucketItem;
import fr.amazonia.destriummod.item.armor.AdventurerArmorBoots;
import fr.amazonia.destriummod.item.armor.AmazoniteArmorBoots;
import fr.amazonia.destriummod.item.armor.AmazoniteArmorChestPlate;
import fr.amazonia.destriummod.item.armor.AmazoniteArmorHelmet;
import fr.amazonia.destriummod.item.armor.AmazoniteArmorLeggings;
import fr.amazonia.destriummod.item.armor.ArgonideArmor;
import fr.amazonia.destriummod.item.armor.DestriumArmor;
import fr.amazonia.destriummod.item.armor.JumpArmorBoots;
import fr.amazonia.destriummod.item.armor.LuckyNecklaceArmor;
import fr.amazonia.destriummod.item.armor.NecklaceArmor;
import fr.amazonia.destriummod.item.armor.ReinforcedAdventurerArmorBoots;
import fr.amazonia.destriummod.item.armor.SpeedArmorBoots;
import fr.amazonia.destriummod.item.food.AmazoniteApple;
import fr.amazonia.destriummod.item.food.DestriumApple;
import fr.amazonia.destriummod.item.ingot.*;
import fr.amazonia.destriummod.item.stick.AmazoniteStick;
import fr.amazonia.destriummod.item.stick.ArgonideStick;
import fr.amazonia.destriummod.item.stick.DestriumStick;
import fr.amazonia.destriummod.item.tools.SpawnersPickaxe;
import fr.amazonia.destriummod.utils.ModItemTiers;
import fr.amazonia.destriummod.utils.ModArmorMaterials;
import fr.amazonia.destriummod.utils.ModRarity;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DestriumMod.MODID);
	
	//Foods
	public static final Food AMAZONITEAPPLE = (new Food.Builder()).nutrition(20).saturationMod(2.6F).effect(new EffectInstance(Effects.HEAL, 1, 10), 1.0F).effect(new EffectInstance(Effects.DAMAGE_BOOST, 800, 3), 1.0F).effect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 24000, 3), 1.0F).effect(new EffectInstance(Effects.HEALTH_BOOST, 12000, 4), 1.0F).effect(new EffectInstance(Effects.REGENERATION, 3000, 4), 1.0F).effect(new EffectInstance(Effects.ABSORPTION, 12000, 9), 1.0F).alwaysEat().build();
	public static final Food DESTRIUMAPPLE = (new Food.Builder()).nutrition(10).saturationMod(1.3F).effect(new EffectInstance(Effects.HEAL, 1, 5), 1.0F).effect(new EffectInstance(Effects.DAMAGE_BOOST, 400, 2), 1.0F).effect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 12000, 1), 1.0F).effect(new EffectInstance(Effects.HEALTH_BOOST, 6000, 1), 1.0F).effect(new EffectInstance(Effects.REGENERATION, 900, 2), 1.0F).effect(new EffectInstance(Effects.ABSORPTION, 6000, 4), 1.0F).alwaysEat().build();
	
	public static final RegistryObject<Item> DESTRIUM_APPLE = ITEMS.register("destrium_apple", () -> new DestriumApple(new Item.Properties().tab(DestriumMod.FoodTab).rarity(ModRarity.DESTRIUM).food(ModItems.DESTRIUMAPPLE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_APPLE = ITEMS.register("amazonite_apple", () -> new AmazoniteApple(new Item.Properties().tab(DestriumMod.FoodTab).rarity(ModRarity.AMAZONITE).food(ModItems.AMAZONITEAPPLE).fireResistant()));

	
	//Armors and Tools
	public static final RegistryObject<Item> AMAZONITE_SWORD = ITEMS.register("amazonite_sword", () -> new SwordItem(ModItemTiers.AMAZONITE, 2, -0.8f, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_PICKAXE = ITEMS.register("amazonite_pickaxe", () -> new PickaxeItem(ModItemTiers.AMAZONITE, -1, -2.8f, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_AXE = ITEMS.register("amazonite_axe", () -> new AxeItem(ModItemTiers.AMAZONITE, 2, -3f, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_SHOVEL = ITEMS.register("amazonite_shovel", () -> new ShovelItem(ModItemTiers.AMAZONITE, -2, -3f, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_HOES = ITEMS.register("amazonite_hoes", () -> new HoeItem(ModItemTiers.AMAZONITE, -7, -3f, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.AMAZONITE).fireResistant()));
	
	public static final RegistryObject<Item> DESTRIUM_SWORD = ITEMS.register("destrium_sword", () -> new SwordItem(ModItemTiers.DESTRIUM, 1, -1.4f, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_PICKAXE = ITEMS.register("destrium_pickaxe", () -> new PickaxeItem(ModItemTiers.DESTRIUM, 0, -2.8f, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_AXE = ITEMS.register("destrium_axe", () -> new AxeItem(ModItemTiers.DESTRIUM, 3, -3f, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_SHOVEL = ITEMS.register("destrium_shovel", () -> new ShovelItem(ModItemTiers.DESTRIUM, 0, -3f, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_HOES = ITEMS.register("destrium_hoes", () -> new HoeItem(ModItemTiers.DESTRIUM, -6, -3f, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.DESTRIUM).fireResistant()));
	
	public static final RegistryObject<Item> ARGONIDE_SWORD = ITEMS.register("argonide_sword", () -> new SwordItem(ModItemTiers.ARGONIDE, 2, -1.9f, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_PICKAXE = ITEMS.register("argonide_pickaxe", () -> new PickaxeItem(ModItemTiers.ARGONIDE, 0, -2.8f, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_AXE = ITEMS.register("argonide_axe", () -> new AxeItem(ModItemTiers.ARGONIDE, 4, -3f, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_SHOVEL = ITEMS.register("argonide_shovel", () -> new ShovelItem(ModItemTiers.ARGONIDE, 1, -3f, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_HOES = ITEMS.register("argonide_hoes", () -> new HoeItem(ModItemTiers.ARGONIDE, -5, -3f, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.ARGONIDE).fireResistant()));
	
	public static final RegistryObject<Item> SPAWNERS_PICKAXE = ITEMS.register("spawners_pickaxe", () -> new SpawnersPickaxe(ModItemTiers.SPAWNERS, -1, -2.8f, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.SPECIAL).fireResistant()));
	
	
	public static final RegistryObject<Item> AMAZONITE_HELMET = ITEMS.register("amazonite_helmet", () -> new AmazoniteArmorHelmet(ModArmorMaterials.AMAZONITE, EquipmentSlotType.HEAD, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_CHESTPLATE = ITEMS.register("amazonite_chestplate", () -> new AmazoniteArmorChestPlate(ModArmorMaterials.AMAZONITE, EquipmentSlotType.CHEST, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_LEGGINGS = ITEMS.register("amazonite_leggings", () -> new AmazoniteArmorLeggings(ModArmorMaterials.AMAZONITE, EquipmentSlotType.LEGS, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_BOOTS = ITEMS.register("amazonite_boots", () -> new AmazoniteArmorBoots(ModArmorMaterials.AMAZONITE, EquipmentSlotType.FEET, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.AMAZONITE).fireResistant()));
	
	public static final RegistryObject<Item> DESTRIUM_HELMET = ITEMS.register("destrium_helmet", () -> new DestriumArmor(ModArmorMaterials.DESTRIUM, EquipmentSlotType.HEAD, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_CHESTPLATE = ITEMS.register("destrium_chestplate", () -> new DestriumArmor(ModArmorMaterials.DESTRIUM, EquipmentSlotType.CHEST, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_LEGGINGS = ITEMS.register("destrium_leggings", () -> new DestriumArmor(ModArmorMaterials.DESTRIUM, EquipmentSlotType.LEGS, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_BOOTS = ITEMS.register("destrium_boots", () -> new DestriumArmor(ModArmorMaterials.DESTRIUM, EquipmentSlotType.FEET, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.DESTRIUM).fireResistant()));
	
	public static final RegistryObject<Item> ARGONIDE_HELMET = ITEMS.register("argonide_helmet", () -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, EquipmentSlotType.HEAD, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_CHESTPLATE = ITEMS.register("argonide_chestplate", () -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, EquipmentSlotType.CHEST, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_LEGGINGS = ITEMS.register("argonide_leggings", () -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, EquipmentSlotType.LEGS, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_BOOTS = ITEMS.register("argonide_boots", () -> new ArgonideArmor(ModArmorMaterials.ARGONIDE, EquipmentSlotType.FEET, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.ARGONIDE).fireResistant()));
	
	public static final RegistryObject<Item> SPEED_BOOTS = ITEMS.register("speed_boots", () -> new SpeedArmorBoots(ModArmorMaterials.DESTRIUM, EquipmentSlotType.FEET, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> FEATHER_BOOTS = ITEMS.register("feather_boots", () -> new ArmorItem(ModArmorMaterials.DESTRIUM, EquipmentSlotType.FEET, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> JUMP_BOOTS = ITEMS.register("jump_boots", () -> new JumpArmorBoots(ModArmorMaterials.DESTRIUM, EquipmentSlotType.FEET, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> ADVENTURER_BOOTS = ITEMS.register("adventurer_boots", () -> new AdventurerArmorBoots(ModArmorMaterials.DESTRIUM, EquipmentSlotType.FEET, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> REINFORCED_ADVENTURER_BOOTS = ITEMS.register("reinforced_adventurer_boots", () -> new ReinforcedAdventurerArmorBoots(ModArmorMaterials.AMAZONITE, EquipmentSlotType.FEET, new Item.Properties().tab(DestriumMod.ToolTab).rarity(ModRarity.AMAZONITE).fireResistant()));
	
	public static final RegistryObject<Item> NECKLACE = ITEMS.register("necklace", () -> new NecklaceArmor(ModArmorMaterials.NECKLACE, EquipmentSlotType.CHEST, new Item.Properties().tab(DestriumMod.ToolTab).setNoRepair().durability(-1).rarity(ModRarity.BASIC)));
	public static final RegistryObject<Item> LUCKY_NECKLACE = ITEMS.register("lucky_necklace", () -> new LuckyNecklaceArmor(ModArmorMaterials.NECKLACE, EquipmentSlotType.CHEST, new Item.Properties().tab(DestriumMod.ToolTab).setNoRepair().durability(-1).rarity(ModRarity.DESTRIUM)));
	
	
	//Minerals
	public static final RegistryObject<Item> AMAZONITE_CRUMB = ITEMS.register("amazonite_crumb", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_DUST = ITEMS.register("amazonite_dust", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_FRAGMENT = ITEMS.register("amazonite_fragment", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_NUGGETS = ITEMS.register("amazonite_nuggets", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> AMAZONITE_INGOT = ITEMS.register("amazonite_ingot", () -> new AmazoniteIngot(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_NUGGETS = ITEMS.register("destrium_nuggets", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_INGOT = ITEMS.register("destrium_ingot", () -> new DestriumIngot(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_NUGGETS = ITEMS.register("argonide_nuggets", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_INGOT = ITEMS.register("argonide_ingot", () -> new ArgonideIngot(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.ARGONIDE).fireResistant()));
	public static final RegistryObject<Item> REPAIR_FRAGMENT = ITEMS.register("repair_fragment", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.REPAIR).fireResistant()));
	public static final RegistryObject<Item> REPAIR_GEM = ITEMS.register("repair_gem", () -> new RepairItems(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.REPAIR).fireResistant()));
	
	public static final RegistryObject<Item> EMERALD_NUGGETS = ITEMS.register("emerald_nuggets", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.EMERALD)));
	public static final RegistryObject<Item> DIAMOND_NUGGETS = ITEMS.register("diamond_nuggets", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.DIAMOND)));
	public static final RegistryObject<Item> NETHERITE_NUGGETS = ITEMS.register("netherite_nuggets", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.NETHERITE)));
	
	
	public static final RegistryObject<Item> AMAZONITE_STICK = ITEMS.register("amazonite_stick", () -> new AmazoniteStick(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.AMAZONITE).fireResistant()));
	public static final RegistryObject<Item> DESTRIUM_STICK = ITEMS.register("destrium_stick", () -> new DestriumStick(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.DESTRIUM).fireResistant()));
	public static final RegistryObject<Item> ARGONIDE_STICK = ITEMS.register("argonide_stick", () -> new ArgonideStick(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.ARGONIDE).fireResistant()));
	
	
	public static final RegistryObject<Item> GOLDEN_CORE = ITEMS.register("golden_core", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.ARGONIDE)));
	public static final RegistryObject<Item> COMPRESSED_GOLDEN = ITEMS.register("compressed_golden", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.ARGONIDE)));
	
	
	public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab)));
	public static final RegistryObject<Item> GOLD_PLATE = ITEMS.register("gold_plate", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.ARGONIDE)));
	public static final RegistryObject<Item> DIAMOND_PLATE = ITEMS.register("diamond_plate", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.DIAMOND)));
	public static final RegistryObject<Item> NETHERITE_PLATE = ITEMS.register("netherite_plate", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.NETHERITE)));
	public static final RegistryObject<Item> ARGONIDE_PLATE = ITEMS.register("argonide_plate", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.ARGONIDE)));
	public static final RegistryObject<Item> DESTRIUM_PLATE = ITEMS.register("destrium_plate", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.DESTRIUM)));
	public static final RegistryObject<Item> AMAZONITE_PLATE = ITEMS.register("amazonite_plate", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.AMAZONITE)));


	//Fluids
	public static final RegistryObject<Item> POISON_WATER_BUCKET = ITEMS.register("poison_water_bucket", () -> new BucketItem(ModFluids.POISON_WATER_FLUID, new Item.Properties().stacksTo(1).tab(DestriumMod.ItemTab).rarity(ModRarity.AMAZONITE)));
	public static final RegistryObject<Item> POISON_STAR = ITEMS.register("poison_star", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.RED)));
	
	public static final RegistryObject<Item> RESISTANCE_LAVA_BUCKET = ITEMS.register("resistance_lava_bucket", () -> new BucketItem(ModFluids.RESISTANCE_LAVA_FLUID, new Item.Properties().stacksTo(1).tab(DestriumMod.ItemTab).rarity(ModRarity.ARGONIDE)));
	public static final RegistryObject<Item> RESISTANCE_STAR = ITEMS.register("resistance_star", () -> new Item(new Item.Properties().tab(DestriumMod.ItemTab).rarity(ModRarity.YELLOW)));
	
	public static final RegistryObject<Item> INFINITY_WATER_BUCKET = ITEMS.register("infinity_water_bucket", () -> new InfinityWaterBucketItem(() -> Fluids.WATER, new Item.Properties().stacksTo(1).tab(DestriumMod.ItemTab).rarity(ModRarity.DESTRIUM)));


	//Seeds
	public static final RegistryObject<Item> AMAZONITE_SEEDS = ITEMS.register("amazonite_seeds", () -> new BlockNamedItem(ModBlocks.AMAZONITE_PLANTS.get(), (new Item.Properties().rarity(ModRarity.AMAZONITE).fireResistant())));
	public static final RegistryObject<Item> DESTRIUM_SEEDS = ITEMS.register("destrium_seeds", () -> new BlockNamedItem(ModBlocks.DESTRIUM_PLANTS.get(), (new Item.Properties().rarity(ModRarity.DESTRIUM).fireResistant())));
	public static final RegistryObject<Item> XP_SEEDS = ITEMS.register("xp_seeds", () -> new BlockNamedItem(ModBlocks.XP_PLANTS.get(), (new Item.Properties().rarity(ModRarity.EXPERIENCE).fireResistant())));
}