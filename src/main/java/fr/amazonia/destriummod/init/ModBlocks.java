package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final ModBlocks INSTANCE = new ModBlocks();

    //Paradis
    public static final Block CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(2.5f, 25f));
    public static final Block BLUE_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block BLACK_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block BROWN_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block CYAN_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block DARK_BLUE_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block DARK_GRAY_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block DARK_GREEN_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block DARK_PURPLE_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block DARK_RED_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block GRAY_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block GREEN_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block LIGHT_BLUE_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block LIGHT_GRAY_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block LIGHT_RED_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block LIME_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block MAGENTA_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block ORANGE_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block PINK_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block PURPLE_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block RED_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block ULTRA_DARK_BLUE_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block YELLOW_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(3f, 25f));
    public static final Block CRACKED_CLOUD = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 2).strength(2.5f, 25f));
    public static final Block CLOUD2 = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).strength(2.5f, 25f));

    //Ore
    public static final Block RANDOM_ORE = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 5).strength(5f, 100f));
    public static final Block PARADIS_AMAZONITE_ORE = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 5).strength(10f, 100f));
    public static final Block PARADIS_DESTRIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 4).strength(6f, 50f));
    public static final Block PARADIS_ARGONIDE_ORE = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 4).strength(4f, 10f));
    public static final Block CRACKED_ARGONIDE_ORE = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().breakByTool(FabricToolTags.HOES, 3).strength(4f, 25f));
    public static final Block REPAIR_ORE = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(4f, 50f));

    public static final Block AMAZONITE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 5).strength(25f, 1000f));
    public static final Block FAKE_AMAZONITE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 5).strength(25f, 1000f));
    public static final Block DESTRIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 4).strength(15f, 125f));
    public static final Block ARGONIDE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 4).strength(10f, 25f));
    public static final Block REPAIR_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(8f, 32f));


    //Compressed
    //COBBLESTONE_COMPRESSED1
    //COBBLESTONE_COMPRESSED2
    //COBBLESTONE_COMPRESSED3
    //COBBLESTONE_COMPRESSED4
    //COBBLESTONE_COMPRESSED5
    //COBBLESTONE_COMPRESSED6
    //COBBLESTONE_COMPRESSED7
    //COBBLESTONE_COMPRESSED8

    //DIRT_COMPRESSED1
    //DIRT_COMPRESSED2
    //DIRT_COMPRESSED3
    //DIRT_COMPRESSED4
    //DIRT_COMPRESSED5

    //Other
    //AMAZONITE_RELIQUE_BLOCK


    //BELOW_BLOCK


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

    public void registerAll(){
        //Paradis
        register(CLOUD, new Identifier(DestriumMod.MODID, "cloud"));
        register(BLUE_CLOUD, new Identifier(DestriumMod.MODID, "blue_cloud"));
        register(BLACK_CLOUD, new Identifier(DestriumMod.MODID, "black_cloud"));
        register(BROWN_CLOUD, new Identifier(DestriumMod.MODID, "brown_cloud"));
        register(CYAN_CLOUD, new Identifier(DestriumMod.MODID, "cyan_cloud"));
        register(DARK_BLUE_CLOUD, new Identifier(DestriumMod.MODID, "dark_blue_cloud"));
        register(DARK_GRAY_CLOUD, new Identifier(DestriumMod.MODID, "dark_gray_cloud"));
        register(DARK_GREEN_CLOUD, new Identifier(DestriumMod.MODID, "dark_green_cloud"));
        register(DARK_PURPLE_CLOUD, new Identifier(DestriumMod.MODID, "dark_purple_cloud"));
        register(DARK_RED_CLOUD, new Identifier(DestriumMod.MODID, "dark_red_cloud"));
        register(GRAY_CLOUD, new Identifier(DestriumMod.MODID, "gray_cloud"));
        register(GREEN_CLOUD, new Identifier(DestriumMod.MODID, "green_cloud"));
        register(LIGHT_BLUE_CLOUD, new Identifier(DestriumMod.MODID, "light_blue_cloud"));
        register(LIGHT_GRAY_CLOUD, new Identifier(DestriumMod.MODID, "light_gray_cloud"));
        register(LIGHT_RED_CLOUD, new Identifier(DestriumMod.MODID, "light_red_cloud"));
        register(LIME_CLOUD, new Identifier(DestriumMod.MODID, "lime_cloud"));
        register(MAGENTA_CLOUD, new Identifier(DestriumMod.MODID, "magenta_cloud"));
        register(ORANGE_CLOUD, new Identifier(DestriumMod.MODID, "orange_cloud"));
        register(PINK_CLOUD, new Identifier(DestriumMod.MODID, "pink_cloud"));
        register(PURPLE_CLOUD, new Identifier(DestriumMod.MODID, "purple_cloud"));
        register(RED_CLOUD, new Identifier(DestriumMod.MODID, "red_cloud"));
        register(ULTRA_DARK_BLUE_CLOUD, new Identifier(DestriumMod.MODID, "ultra_dark_blue_cloud"));
        register(YELLOW_CLOUD, new Identifier(DestriumMod.MODID, "yellow_cloud"));
        register(CRACKED_CLOUD, new Identifier(DestriumMod.MODID, "cracked_cloud"));
        register(CLOUD2, new Identifier(DestriumMod.MODID, "cloud2"));


        //Ore
        register(RANDOM_ORE, new Identifier(DestriumMod.MODID, "random_ore"));
        register(PARADIS_AMAZONITE_ORE, new Identifier(DestriumMod.MODID, "paradis_amazonite_ore"));
        register(PARADIS_DESTRIUM_ORE, new Identifier(DestriumMod.MODID, "paradis_destrium_ore"));
        register(PARADIS_ARGONIDE_ORE, new Identifier(DestriumMod.MODID, "paradis_argonide_ore"));
        register(CRACKED_ARGONIDE_ORE, new Identifier(DestriumMod.MODID, "cracked_argonide_ore"));
        register(REPAIR_ORE, new Identifier(DestriumMod.MODID, "repair_ore"));

        register(AMAZONITE_BLOCK, new Identifier(DestriumMod.MODID, "amazonite_block"));
        register(FAKE_AMAZONITE_BLOCK, new Identifier(DestriumMod.MODID, "fake_amazonite_block"));
        register(DESTRIUM_BLOCK, new Identifier(DestriumMod.MODID, "destrium_block"));
        register(ARGONIDE_BLOCK, new Identifier(DestriumMod.MODID, "argonide_block"));
        register(REPAIR_BLOCK, new Identifier(DestriumMod.MODID, "repair_block"));
    }

    private void register(Block block, Identifier name) {
        Registry.register(Registry.BLOCK, name, block);
        createBlockItem(block, name);
    }

    private void createBlockItem(Block block, Identifier name) {
    Registry.register(Registry.ITEM, name, new BlockItem(block, new Item.Settings().group(DestriumMod.BLOCK_TAB)));
    }
}
