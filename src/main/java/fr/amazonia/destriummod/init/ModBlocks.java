package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.block.OverworldPortalBlocks;
import fr.amazonia.destriummod.block.ParadisPortalBlocks;
import fr.amazonia.destriummod.block.plants.AmazonitePlants;
import fr.amazonia.destriummod.block.plants.DestriumPlants;
import fr.amazonia.destriummod.block.plants.XpPlants;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DestriumMod.MODID);
	//Blocks (Paradis)
	public static final RegistryObject<Block> CLOUD = registerBlock("cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.5f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BLUE_CLOUD = registerBlock("blue_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BLACK_CLOUD = registerBlock("black_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BROWN_CLOUD = registerBlock("brown_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> CYAN_CLOUD = registerBlock("cyan_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DARK_BLUE_CLOUD = registerBlock("dark_blue_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DARK_GRAY_CLOUD = registerBlock("dark_gray_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DARK_GREEN_CLOUD = registerBlock("dark_green_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DARK_PURPLE_CLOUD = registerBlock("dark_purple_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DARK_RED_CLOUD = registerBlock("dark_red_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> GRAY_CLOUD = registerBlock("gray_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> GREEN_CLOUD = registerBlock("green_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> LIGHT_BLUE_CLOUD = registerBlock("light_blue_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> LIGHT_GRAY_CLOUD = registerBlock("light_gray_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> LIGHT_RED_CLOUD = registerBlock("light_red_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> LIME_CLOUD = registerBlock("lime_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MAGENTA_CLOUD = registerBlock("magenta_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> ORANGE_CLOUD = registerBlock("orange_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PINK_CLOUD = registerBlock("pink_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PURPLE_CLOUD = registerBlock("purple_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RED_CLOUD = registerBlock("red_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> ULTRA_DARK_BLUE_CLOUD = registerBlock("ultra_dark_blue_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> YELLOW_CLOUD = registerBlock("yellow_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> CRACKED_CLOUD = registerBlock("cracked_cloud", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.5f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> CLOUD2 = registerBlock("cloud2", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.5f, 25f).requiresCorrectToolForDrops()));

	//(Ore)
	public static final RegistryObject<Block> RANDOM_ORE = registerBlock("random_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(5f, 100f).requiresCorrectToolForDrops(), UniformInt.of(1, 5)));
	public static final RegistryObject<Block> PARADIS_AMAZONITE_ORE = registerBlock("paradis_amazonite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(10f, 100f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PARADIS_DESTRIUM_ORE = registerBlock("paradis_destrium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f, 50f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PARADIS_ARGONIDE_ORE = registerBlock("paradis_argonide_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f, 10f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> CRACKED_ARGONIDE_ORE = registerBlock("cracked_argonide_ore", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(4f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> REPAIR_ORE = registerBlock("repair_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(4f, 50f).requiresCorrectToolForDrops(), UniformInt.of(0, 2)));


	public static final RegistryObject<Block> AMAZONITE_BLOCK = registerBlock("amazonite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(25f, 1000f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> FAKE_AMAZONITE_BLOCK = registerBlock("fake_amazonite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(25f, 1000f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DESTRIUM_BLOCK = registerBlock("destrium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(15f, 125f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> ARGONIDE_BLOCK = registerBlock("argonide_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(10f, 25f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> REPAIR_BLOCK = registerBlock("repair_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(8f, 32f).requiresCorrectToolForDrops()));

	//(Compressed)
	public static final RegistryObject<Block> COBBLESTONE_COMPRESSED1 = registerBlock("cobblestone_compressed1", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 6.5F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> COBBLESTONE_COMPRESSED2 = registerBlock("cobblestone_compressed2", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5.0F, 7.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> COBBLESTONE_COMPRESSED3 = registerBlock("cobblestone_compressed3", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(8.0F, 9.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> COBBLESTONE_COMPRESSED4 = registerBlock("cobblestone_compressed4", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(12.0F, 10.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> COBBLESTONE_COMPRESSED5 = registerBlock("cobblestone_compressed5", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(20.0F, 14.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> COBBLESTONE_COMPRESSED6 = registerBlock("cobblestone_compressed6", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(30.0F, 18.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> COBBLESTONE_COMPRESSED7 = registerBlock("cobblestone_compressed7", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 25.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> COBBLESTONE_COMPRESSED8 = registerBlock("cobblestone_compressed8", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(250.0F, 500.0F).requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> DIRT_COMPRESSED1 = registerBlock("dirt_compressed1", () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(3.0F, 6.5F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DIRT_COMPRESSED2 = registerBlock("dirt_compressed2", () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(5.0F, 7.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DIRT_COMPRESSED3 = registerBlock("dirt_compressed3", () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(8.0F, 9.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DIRT_COMPRESSED4 = registerBlock("dirt_compressed4", () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(12.0F, 10.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DIRT_COMPRESSED5 = registerBlock("dirt_compressed5", () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(20.0F, 14.0F).requiresCorrectToolForDrops()));

	//(Other)
	public static final RegistryObject<Block> AMAZONITE_RELIQUE_BLOCK = registerBlock("amazonite_relique_block", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(25.0F, 100.0F).requiresCorrectToolForDrops(), UniformInt.of(5, 15)));
	
	
	public static final RegistryObject<Block> BELOW_BLOCK = registerBlock("below_block", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(4.0F, 10.0F).requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> PARADIS_PORTAL_BLOCK = registerBlock("paradis_portal_block", () -> new ParadisPortalBlocks(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.AMETHYST).strength(10.0F, 200.0F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> OVERWORLD_PORTAL_BLOCK = registerBlock("overworld_portal_block", () -> new OverworldPortalBlocks(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.AMETHYST).strength(10.0F, 200.0F).requiresCorrectToolForDrops()));

	//Plants
	public static final RegistryObject<Block> AMAZONITE_PLANTS = BLOCKS.register("amazonite_plants", () -> new AmazonitePlants(BlockBehaviour.Properties.of(Material.PLANT).instabreak().randomTicks().noCollission().sound(SoundType.CROP)));
	public static final RegistryObject<Block> DESTRIUM_PLANTS = BLOCKS.register("destrium_plants", () -> new DestriumPlants(BlockBehaviour.Properties.of(Material.PLANT).instabreak().randomTicks().noCollission().sound(SoundType.CROP)));
	public static final RegistryObject<Block> XP_PLANTS = BLOCKS.register("xp_plants", () -> new XpPlants(BlockBehaviour.Properties.of(Material.PLANT).instabreak().randomTicks().noCollission().sound(SoundType.CROP)));

	//Flowers
	//public static final RegistryObject<FlowerBlock> CLOVER = BLOCKS.register("clover", () -> new FlowerBlock(MobEffects.LUCK, 9, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS)));
	//public static final RegistryObject<Block> CLOVER_TWO = BLOCKS.register("clover_two", () -> new FlowerBlock(MobEffects.LUCK, 9, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS)));

	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}

	private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
		return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
	}

	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}