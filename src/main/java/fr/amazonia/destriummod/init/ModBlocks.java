package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.block.OverworldPortalBlocks;
import fr.amazonia.destriummod.block.ParadisPortalBlocks;
import fr.amazonia.destriummod.block.plants.AmazonitePlants;
import fr.amazonia.destriummod.block.plants.DestriumPlants;
import fr.amazonia.destriummod.block.plants.XpPlants;
import fr.amazonia.destriummod.fluid.PoisonWaterFluidBlock;
import fr.amazonia.destriummod.fluid.ResistanceLavaFluidBlock;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DestriumMod.MODID);

    //Paradis
    public static final RegistryObject<Block> CLOUD = registerBlock("cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_CLOUD = registerBlock("blue_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_CLOUD = registerBlock("black_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_CLOUD = registerBlock("brown_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_CLOUD = registerBlock("cyan_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DARK_BLUE_CLOUD = registerBlock("dark_blue_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DARK_GRAY_CLOUD = registerBlock("dark_gray_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DARK_GREEN_CLOUD = registerBlock("dark_green_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DARK_PURPLE_CLOUD = registerBlock("dark_purple_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DARK_RED_CLOUD = registerBlock("dark_red_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_CLOUD = registerBlock("gray_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_CLOUD = registerBlock("green_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_CLOUD = registerBlock("light_blue_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_CLOUD = registerBlock("light_gray_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_RED_CLOUD = registerBlock("light_red_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_CLOUD = registerBlock("lime_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_CLOUD = registerBlock("magenta_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_CLOUD = registerBlock("orange_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_CLOUD = registerBlock("pink_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_CLOUD = registerBlock("purple_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_CLOUD = registerBlock("red_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ULTRA_DARK_BLUE_CLOUD = registerBlock("ultra_dark_blue_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_CLOUD = registerBlock("yellow_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_CLOUD = registerBlock("cracked_cloud", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(2.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CLOUD2 = registerBlock("cloud2", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));


    //Ores
    public static final RegistryObject<Block> RANDOM_ORE = registerBlock("random_ore", () -> new DropExperienceBlock(UniformInt.of(1, 5), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).strength(4f, 25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PARADIS_AMAZONITE_ORE = registerBlock("paradis_amazonite_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).strength(10f, 25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PARADIS_DESTRIUM_ORE = registerBlock("paradis_destrium_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).strength(6f, 5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PARADIS_ARGONIDE_ORE = registerBlock("paradis_argonide_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).strength(4f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_ARGONIDE_ORE = registerBlock("cracked_argonide_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.STONE).strength(4f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> REPAIR_ORE = registerBlock("repair_ore", () -> new DropExperienceBlock(UniformInt.of(0, 2), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(4f, 9f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> AMAZONITE_BLOCK = registerBlock("amazonite_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).strength(20f, 999f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FAKE_AMAZONITE_BLOCK = registerBlock("fake_amazonite_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).strength(20f, 999f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DESTRIUM_BLOCK = registerBlock("destrium_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).strength(15f, 125f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ARGONIDE_BLOCK = registerBlock("argonide_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).strength(10f, 25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> REPAIR_BLOCK = registerBlock("repair_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).strength(8f, 32f).requiresCorrectToolForDrops()));


    //Compressed
    public static final RegistryObject<Block> COBBLESTONE_COMPRESSED1 = registerBlock("cobblestone_compressed1", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1.5f, 25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBBLESTONE_COMPRESSED2 = registerBlock("cobblestone_compressed2", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(2f, 50f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBBLESTONE_COMPRESSED3 = registerBlock("cobblestone_compressed3", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(4f, 75f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBBLESTONE_COMPRESSED4 = registerBlock("cobblestone_compressed4", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(8f, 100f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBBLESTONE_COMPRESSED5 = registerBlock("cobblestone_compressed5", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(14f, 150f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBBLESTONE_COMPRESSED6 = registerBlock("cobblestone_compressed6", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(20f, 200f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBBLESTONE_COMPRESSED7 = registerBlock("cobblestone_compressed7", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(50f, 250f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBBLESTONE_COMPRESSED8 = registerBlock("cobblestone_compressed8", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(250f, 500f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DIRT_COMPRESSED1 = registerBlock("dirt_compressed1", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).strength(0.5f, 5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRT_COMPRESSED2 = registerBlock("dirt_compressed2", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).strength(1f, 25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRT_COMPRESSED3 = registerBlock("dirt_compressed3", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).strength(1.5f, 50f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRT_COMPRESSED4 = registerBlock("dirt_compressed4", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).strength(3f, 75f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRT_COMPRESSED5 = registerBlock("dirt_compressed5", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).strength(5f, 100f).requiresCorrectToolForDrops()));


    //Others
    public static final RegistryObject<Block> AMAZONITE_RELIQUE_BLOCK = registerBlock("amazonite_relique_block", () -> new DropExperienceBlock(UniformInt.of(5, 15), BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).strength(25f, 100f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> BELOW_BLOCK = registerBlock("below_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).strength(2f, 1f).requiresCorrectToolForDrops()));


    //Portal Blocks
    public static final RegistryObject<Block> PARADIS_PORTAL_BLOCK = registerBlock("paradis_portal_block", () -> new ParadisPortalBlocks(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK).strength(5f, 999f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OVERWORLD_PORTAL_BLOCK = registerBlock("overworld_portal_block", () -> new OverworldPortalBlocks(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK).strength(5f, 999f).requiresCorrectToolForDrops()));


    //Plants
    public static final RegistryObject<Block> AMAZONITE_PLANTS = BLOCKS.register("amazonite_plants", () -> new AmazonitePlants(BlockBehaviour.Properties.ofFullCopy(Blocks.CARROTS).instabreak().randomTicks().noCollission().sound(SoundType.CROP)));
    public static final RegistryObject<Block> DESTRIUM_PLANTS = BLOCKS.register("destrium_plants", () -> new DestriumPlants(BlockBehaviour.Properties.ofFullCopy(Blocks.CARROTS).instabreak().randomTicks().noCollission().sound(SoundType.CROP)));
    public static final RegistryObject<Block> XP_PLANTS = BLOCKS.register("xp_plants", () -> new XpPlants(BlockBehaviour.Properties.ofFullCopy(Blocks.CARROTS).instabreak().randomTicks().noCollission().sound(SoundType.CROP)));


    //Flowers
    public static final RegistryObject<Block> CLOVER = registerBlock("clover", () -> new FlowerBlock(MobEffects.LUCK, 9, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION).noCollission().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> CLOVER_TWO = registerBlock("clover_two", () -> new FlowerBlock(MobEffects.LUCK, 9, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION).noCollission().instabreak().sound(SoundType.GRASS)));


    //Fluids
    public static final RegistryObject<LiquidBlock> POISON_WATER_BLOCK = BLOCKS.register("poison_water_block", () -> new PoisonWaterFluidBlock(ModFluids.POISON_WATER_FLUID, BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100f).speedFactor(0.95F).noLootTable()));

    public static final RegistryObject<LiquidBlock> RESISTANCE_LAVA_BLOCK = BLOCKS.register("resistance_lava_block", () -> new ResistanceLavaFluidBlock(ModFluids.RESISTANCE_LAVA_FLUID, BlockBehaviour.Properties.ofFullCopy(Blocks.LAVA).noCollission().strength(100f).speedFactor(0.95F).noLootTable().noOcclusion().lightLevel((pLightEmission) -> 14)));

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