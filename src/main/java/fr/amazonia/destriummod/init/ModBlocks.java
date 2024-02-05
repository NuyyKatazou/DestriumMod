package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.block.ModOreBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static void initialize() {}

    //Paradis
    public static final Block CLOUD = register("cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(2.5f, 25f)));
    public static final Block BLUE_CLOUD = register("blue_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block BLACK_CLOUD = register("black_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block BROWN_CLOUD = register("brown_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block CYAN_CLOUD = register("cyan_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block DARK_BLUE_CLOUD = register("dark_blue_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block DARK_GRAY_CLOUD = register("dark_gray_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block DARK_GREEN_CLOUD = register("dark_green_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block DARK_PURPLE_CLOUD = register("dark_purple_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block DARK_RED_CLOUD = register("dark_red_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block GRAY_CLOUD = register("gray_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block GREEN_CLOUD = register("green_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block LIGHT_BLUE_CLOUD = register("light_blue_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block LIGHT_GRAY_CLOUD = register("light_gray_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block LIGHT_RED_CLOUD = register("light_red_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block LIME_CLOUD = register("lime_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block MAGENTA_CLOUD = register("magenta_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block ORANGE_CLOUD = register("orange_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block PINK_CLOUD = register("pink_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block PURPLE_CLOUD = register("purple_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block RED_CLOUD = register("red_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block ULTRA_DARK_BLUE_CLOUD = register("ultra_dark_blue_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block YELLOW_CLOUD = register("yellow_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f)));
    public static final Block CRACKED_CLOUD = register("cracked_cloud", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(2.5f, 25f)));
    public static final Block CLOUD2 = register("cloud2", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).strength(2.5f, 25f)));


    //Ore
    public static final Block RANDOM_ORE = register("random_ore", true, new ModOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 5).strength(5f, 100f)));
    public static final Block PARADIS_AMAZONITE_ORE = register("paradis_amazonite_ore", true, new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 5).strength(10f, 100f)));
    public static final Block PARADIS_DESTRIUM_ORE = register("paradis_destrium_ore", true, new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 4).strength(6f, 50f)));
    public static final Block PARADIS_ARGONIDE_ORE = register("paradis_argonide_ore", true, new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 4).strength(4f, 10f)));
    public static final Block CRACKED_ARGONIDE_ORE = register("cracked_argonide_ore", true, new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 3).strength(4f, 25f)));
    public static final Block REPAIR_ORE = register("repair_ore", true, new ModOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(4f, 50f)));

    public static final Block AMAZONITE_BLOCK = register("amazonite_block", true, new Block(FabricBlockSettings.of(Material.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 5).strength(25f, 1000f)));
    public static final Block FAKE_AMAZONITE_BLOCK = register("fake_amazonite_block", true, new Block(FabricBlockSettings.of(Material.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 5).strength(25f, 1000f)));
    public static final Block DESTRIUM_BLOCK = register("destrium_block", true, new Block(FabricBlockSettings.of(Material.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 4).strength(15f, 125f)));
    public static final Block ARGONIDE_BLOCK = register("argonide_block", true, new Block(FabricBlockSettings.of(Material.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 4).strength(10f, 25f)));
    public static final Block REPAIR_BLOCK = register("repair_block", true, new Block(FabricBlockSettings.of(Material.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(8f, 32f)));


    //Compressed
    public static final Block COBBLESTONE_COMPRESSED1 = register("cobblestone_compressed1", true, new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1).strength(3f, 6.5f)));
    public static final Block COBBLESTONE_COMPRESSED2 = register("cobblestone_compressed2", true, new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).strength(5f, 7f)));
    public static final Block COBBLESTONE_COMPRESSED3 = register("cobblestone_compressed3", true, new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(8f, 9f)));
    public static final Block COBBLESTONE_COMPRESSED4 = register("cobblestone_compressed4", true, new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 4).strength(12f, 10f)));
    public static final Block COBBLESTONE_COMPRESSED5 = register("cobblestone_compressed5", true, new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 4).strength(20f, 14f)));
    public static final Block COBBLESTONE_COMPRESSED6 = register("cobblestone_compressed6", true, new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 5).strength(30f, 18f)));
    public static final Block COBBLESTONE_COMPRESSED7 = register("cobblestone_compressed7", true, new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 6).strength(50f, 25f)));
    public static final Block COBBLESTONE_COMPRESSED8 = register("cobblestone_compressed8", true, new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 7).strength(250f, 500f)));

    public static final Block DIRT_COMPRESSED1 = register("dirt_compressed1", true, new Block(FabricBlockSettings.of(Material.SOIL).requiresTool().breakByTool(FabricToolTags.SHOVELS, 2).strength(3f, 6.5f)));
    public static final Block DIRT_COMPRESSED2 = register("dirt_compressed2", true, new Block(FabricBlockSettings.of(Material.SOIL).requiresTool().breakByTool(FabricToolTags.SHOVELS, 3).strength(5f, 7f)));
    public static final Block DIRT_COMPRESSED3 = register("dirt_compressed3", true, new Block(FabricBlockSettings.of(Material.SOIL).requiresTool().breakByTool(FabricToolTags.SHOVELS, 3).strength(8f, 9f)));
    public static final Block DIRT_COMPRESSED4 = register("dirt_compressed4", true, new Block(FabricBlockSettings.of(Material.SOIL).requiresTool().breakByTool(FabricToolTags.SHOVELS, 4).strength(12f, 10f)));
    public static final Block DIRT_COMPRESSED5 = register("dirt_compressed5", true, new Block(FabricBlockSettings.of(Material.SOIL).requiresTool().breakByTool(FabricToolTags.SHOVELS, 4).strength(20f, 14f)));


    //Other
    public static final Block AMAZONITE_RELIQUE_BLOCK = register("amazonite_relique_block", true, new ModOreBlock(FabricBlockSettings.of(Material.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 5).strength(25f, 100f)));


    public static final Block BELOW_BLOCK = register("below_block", true, new Block(FabricBlockSettings.of(Material.GLASS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 5).strength(4f, 10f)));


    //Portal Blocks
    //PARADIS_PORTAL_BLOCK
    //OVERWORLD_PORTAL_BLOCK


    //Plants
    //AMAZONITE_PLANTS
    //DESTRIUM_PLANTS
    //XP_PLANTS


    //Flowers
    //CLOVER
    //CLOVER_TWO

    public static <T extends Block> T register(String name, boolean shouldRegisterItem, T block){
        Identifier id = new Identifier(DestriumMod.MODID, name);

        if(shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings().group(DestriumMod.BLOCK_TAB));
            Registry.register(Registry.ITEM, id, blockItem);
        }
        return Registry.register(Registry.BLOCK, id, block);
    }
}
