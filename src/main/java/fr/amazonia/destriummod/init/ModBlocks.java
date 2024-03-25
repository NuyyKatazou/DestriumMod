package fr.amazonia.destriummod.init;

import java.util.function.Supplier;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.block.ModOreBlock;
import fr.amazonia.destriummod.block.OverworldPortalBlocks;
import fr.amazonia.destriummod.block.ParadisPortalBlocks;
import fr.amazonia.destriummod.block.plants.AmazonitePlants;
import fr.amazonia.destriummod.block.plants.DestriumPlants;
import fr.amazonia.destriummod.block.plants.XpPlants;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.potion.Effects;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DestriumMod.MODID);

	//Paradis
	public static final RegistryObject<Block> CLOUD = createBlock("cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(2.5f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BLUE_CLOUD = createBlock("blue_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BLACK_CLOUD = createBlock("black_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BROWN_CLOUD = createBlock("brown_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> CYAN_CLOUD = createBlock("cyan_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DARK_BLUE_CLOUD = createBlock("dark_blue_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DARK_GRAY_CLOUD = createBlock("dark_gray_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DARK_GREEN_CLOUD = createBlock("dark_green_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DARK_PURPLE_CLOUD = createBlock("dark_purple_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DARK_RED_CLOUD = createBlock("dark_red_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> GRAY_CLOUD = createBlock("gray_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> GREEN_CLOUD = createBlock("green_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> LIGHT_BLUE_CLOUD = createBlock("light_blue_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> LIGHT_GRAY_CLOUD = createBlock("light_gray_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> LIGHT_RED_CLOUD = createBlock("light_red_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> LIME_CLOUD = createBlock("lime_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MAGENTA_CLOUD = createBlock("magenta_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> ORANGE_CLOUD = createBlock("orange_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PINK_CLOUD = createBlock("pink_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PURPLE_CLOUD = createBlock("purple_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RED_CLOUD = createBlock("red_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> ULTRA_DARK_BLUE_CLOUD = createBlock("ultra_dark_blue_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> YELLOW_CLOUD = createBlock("yellow_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> CRACKED_CLOUD = createBlock("cracked_cloud", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(2).strength(2.5f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> CLOUD2 = createBlock("cloud2", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(2.5f, 25f).requiresCorrectToolForDrops()));


	//Ores
	public static final RegistryObject<Block> RANDOM_ORE = createBlock("random_ore", () -> new ModOreBlock(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(5).strength(5f, 100f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PARADIS_AMAZONITE_ORE = createBlock("paradis_amazonite_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(5).strength(10f, 100f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PARADIS_DESTRIUM_ORE = createBlock("paradis_destrium_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(6f, 50f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PARADIS_ARGONIDE_ORE = createBlock("paradis_argonide_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(4f, 10f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> CRACKED_ARGONIDE_ORE = createBlock("cracked_argonide_ore", () -> new Block(AbstractBlock.Properties.of(Material.CLAY).harvestTool(ToolType.HOE).harvestLevel(3).strength(4f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> REPAIR_ORE = createBlock("repair_ore", () -> new ModOreBlock(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(4f, 50f).requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> AMAZONITE_BLOCK = createBlock("amazonite_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(5).strength(25f, 1000f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> FAKE_AMAZONITE_BLOCK = createBlock("fake_amazonite_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(5).strength(25f, 1000f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DESTRIUM_BLOCK = createBlock("destrium_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(15f, 125f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> ARGONIDE_BLOCK = createBlock("argonide_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(10f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> REPAIR_BLOCK = createBlock("repair_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(8f, 32f).requiresCorrectToolForDrops()));


	//Compressed
	public static final RegistryObject<Block> COBBLESTONE_COMPRESSED1 = createBlock("cobblestone_compressed1", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1).strength(3.0F, 6.5F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> COBBLESTONE_COMPRESSED2 = createBlock("cobblestone_compressed2", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(5.0F, 7.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> COBBLESTONE_COMPRESSED3 = createBlock("cobblestone_compressed3", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(8.0F, 9.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> COBBLESTONE_COMPRESSED4 = createBlock("cobblestone_compressed4", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(12.0F, 10.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> COBBLESTONE_COMPRESSED5 = createBlock("cobblestone_compressed5", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(20.0F, 14.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> COBBLESTONE_COMPRESSED6 = createBlock("cobblestone_compressed6", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(5).strength(30.0F, 18.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> COBBLESTONE_COMPRESSED7 = createBlock("cobblestone_compressed7", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(6).strength(50.0F, 25.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> COBBLESTONE_COMPRESSED8 = createBlock("cobblestone_compressed8", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(7).strength(250.0F, 500.0F).requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> DIRT_COMPRESSED1 = createBlock("dirt_compressed1", () -> new Block(AbstractBlock.Properties.of(Material.DIRT).harvestTool(ToolType.SHOVEL).harvestLevel(2).strength(3.0F, 6.5F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DIRT_COMPRESSED2 = createBlock("dirt_compressed2", () -> new Block(AbstractBlock.Properties.of(Material.DIRT).harvestTool(ToolType.SHOVEL).harvestLevel(3).strength(5.0F, 7.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DIRT_COMPRESSED3 = createBlock("dirt_compressed3", () -> new Block(AbstractBlock.Properties.of(Material.DIRT).harvestTool(ToolType.SHOVEL).harvestLevel(3).strength(8.0F, 9.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DIRT_COMPRESSED4 = createBlock("dirt_compressed4", () -> new Block(AbstractBlock.Properties.of(Material.DIRT).harvestTool(ToolType.SHOVEL).harvestLevel(4).strength(12.0F, 10.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DIRT_COMPRESSED5 = createBlock("dirt_compressed5", () -> new Block(AbstractBlock.Properties.of(Material.DIRT).harvestTool(ToolType.SHOVEL).harvestLevel(4).strength(20.0F, 14.0F).requiresCorrectToolForDrops()));


	//Others
	public static final RegistryObject<Block> AMAZONITE_RELIQUE_BLOCK = createBlock("amazonite_relique_block", () -> new ModOreBlock(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(5).strength(25.0F, 100.0F).requiresCorrectToolForDrops()));
	
	
	public static final RegistryObject<Block> BELOW_BLOCK = createBlock("below_block", () -> new Block(AbstractBlock.Properties.of(Material.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(5).strength(4.0F, 10.0F).requiresCorrectToolForDrops()));
	

	//Portal Blocks
	public static final RegistryObject<Block> PARADIS_PORTAL_BLOCK = createBlock("paradis_portal_block", () -> new ParadisPortalBlocks(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(10.0F, 200.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> OVERWORLD_PORTAL_BLOCK = createBlock("overworld_portal_block", () -> new OverworldPortalBlocks(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(10.0F, 200.0F).requiresCorrectToolForDrops()));


	//Plants
	public static final RegistryObject<Block> AMAZONITE_PLANTS = createBlock("amazonite_plants", () -> new AmazonitePlants(AbstractBlock.Properties.of(Material.PLANT).instabreak().randomTicks().noCollission().sound(SoundType.CROP)));
	public static final RegistryObject<Block> DESTRIUM_PLANTS = createBlock("destrium_plants", () -> new DestriumPlants(AbstractBlock.Properties.of(Material.PLANT).instabreak().randomTicks().noCollission().sound(SoundType.CROP)));
	public static final RegistryObject<Block> XP_PLANTS = createBlock("xp_plants", () -> new XpPlants(AbstractBlock.Properties.of(Material.PLANT).instabreak().randomTicks().noCollission().sound(SoundType.CROP)));


	//Flowers
	public static final RegistryObject<Block> CLOVER = createBlock("clover", () -> new FlowerBlock(Effects.LUCK, 9, AbstractBlock.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CLOVER_TWO = createBlock("clover_two", () -> new FlowerBlock(Effects.LUCK, 9, AbstractBlock.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS)));
	
	public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier) {
		
		RegistryObject<Block> block = BLOCKS.register(name, supplier);
		ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(DestriumMod.BlockTab)));
		return block;
	}
}