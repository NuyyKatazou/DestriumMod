package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.block.OverworldPortalBlock;
import fr.amazonia.destriummod.block.ParadisPortalBlock;
import fr.amazonia.destriummod.block.plant.AmazonitePlant;
import fr.amazonia.destriummod.block.plant.DestriumPlant;
import fr.amazonia.destriummod.block.plant.ExperiencePlant;
import fr.amazonia.destriummod.fluid.PoisonWaterFluidBlock;
import fr.amazonia.destriummod.fluid.ResistanceLavaFluidBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
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

import java.util.function.Function;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DestriumMod.MODID);

    //Paradis
    public static final RegistryObject<Block> CLOUD = registerBlock("cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_CLOUD = registerBlock("blue_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_CLOUD = registerBlock("black_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_CLOUD = registerBlock("brown_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_CLOUD = registerBlock("cyan_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DARK_BLUE_CLOUD = registerBlock("dark_blue_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DARK_GRAY_CLOUD = registerBlock("dark_gray_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DARK_GREEN_CLOUD = registerBlock("dark_green_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DARK_PURPLE_CLOUD = registerBlock("dark_purple_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DARK_RED_CLOUD = registerBlock("dark_red_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_CLOUD = registerBlock("gray_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_CLOUD = registerBlock("green_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_CLOUD = registerBlock("light_blue_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_CLOUD = registerBlock("light_gray_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_RED_CLOUD = registerBlock("light_red_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_CLOUD = registerBlock("lime_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_CLOUD = registerBlock("magenta_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_CLOUD = registerBlock("orange_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_CLOUD = registerBlock("pink_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_CLOUD = registerBlock("purple_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_CLOUD = registerBlock("red_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ULTRA_DARK_BLUE_CLOUD = registerBlock("ultra_dark_blue_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_CLOUD = registerBlock("yellow_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_CLOUD = registerBlock("cracked_cloud", (properties) -> new Block(properties.sound(SoundType.STEM).strength(2.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CLOUD2 = registerBlock("cloud2", (properties) -> new Block(properties.sound(SoundType.STEM).strength(1.5f, 1f).requiresCorrectToolForDrops()));


    //Ores
    public static final RegistryObject<Block> RANDOM_ORE = registerBlock("random_ore", (properties) -> new DropExperienceBlock(UniformInt.of(1, 5), properties.sound(SoundType.NETHER_ORE).strength(4f, 25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PARADIS_AMAZONITE_ORE = registerBlock("paradis_amazonite_ore", (properties) -> new Block(properties.sound(SoundType.NETHER_ORE).strength(10f, 25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PARADIS_DESTRIUM_ORE = registerBlock("paradis_destrium_ore", (properties) -> new Block(properties.sound(SoundType.NETHER_ORE).strength(6f, 5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PARADIS_ARGONIDE_ORE = registerBlock("paradis_argonide_ore", (properties) -> new Block(properties.sound(SoundType.NETHER_ORE).strength(4f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_ARGONIDE_ORE = registerBlock("cracked_argonide_ore", (properties) -> new Block(properties.sound(SoundType.STEM).strength(4f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> REPAIR_ORE = registerBlock("repair_ore", (properties) -> new DropExperienceBlock(UniformInt.of(0, 2), properties.sound(SoundType.NETHER_ORE).strength(4f, 9f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> AMAZONITE_BLOCK = registerBlock("amazonite_block", (properties) -> new Block(properties.sound(SoundType.NETHERITE_BLOCK).strength(20f, 999f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FAKE_AMAZONITE_BLOCK = registerBlock("fake_amazonite_block", (properties) -> new Block(properties.sound(SoundType.NETHERITE_BLOCK).strength(20f, 999f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DESTRIUM_BLOCK = registerBlock("destrium_block", (properties) -> new Block(properties.sound(SoundType.NETHERITE_BLOCK).strength(15f, 125f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ARGONIDE_BLOCK = registerBlock("argonide_block", (properties) -> new Block(properties.sound(SoundType.NETHERITE_BLOCK).strength(10f, 25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> REPAIR_BLOCK = registerBlock("repair_block", (properties) -> new Block(properties.sound(SoundType.NETHERITE_BLOCK).strength(8f, 32f).requiresCorrectToolForDrops()));


    //Compressed
    public static final RegistryObject<Block> COBBLESTONE_COMPRESSED1 = registerBlock("cobblestone_compressed1", (properties) -> new Block(properties.sound(SoundType.STONE).strength(1.5f, 25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBBLESTONE_COMPRESSED2 = registerBlock("cobblestone_compressed2", (properties) -> new Block(properties.sound(SoundType.STONE).strength(2f, 50f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBBLESTONE_COMPRESSED3 = registerBlock("cobblestone_compressed3", (properties) -> new Block(properties.sound(SoundType.STONE).strength(4f, 75f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBBLESTONE_COMPRESSED4 = registerBlock("cobblestone_compressed4", (properties) -> new Block(properties.sound(SoundType.STONE).strength(8f, 100f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBBLESTONE_COMPRESSED5 = registerBlock("cobblestone_compressed5", (properties) -> new Block(properties.sound(SoundType.STONE).strength(14f, 150f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBBLESTONE_COMPRESSED6 = registerBlock("cobblestone_compressed6", (properties) -> new Block(properties.sound(SoundType.STONE).strength(20f, 200f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBBLESTONE_COMPRESSED7 = registerBlock("cobblestone_compressed7", (properties) -> new Block(properties.sound(SoundType.STONE).strength(50f, 250f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBBLESTONE_COMPRESSED8 = registerBlock("cobblestone_compressed8", (properties) -> new Block(properties.sound(SoundType.STONE).strength(250f, 500f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DIRT_COMPRESSED1 = registerBlock("dirt_compressed1", (properties) -> new Block(properties.sound(SoundType.GRAVEL).strength(0.5f, 5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRT_COMPRESSED2 = registerBlock("dirt_compressed2", (properties) -> new Block(properties.sound(SoundType.GRAVEL).strength(1f, 25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRT_COMPRESSED3 = registerBlock("dirt_compressed3", (properties) -> new Block(properties.sound(SoundType.GRAVEL).strength(1.5f, 50f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRT_COMPRESSED4 = registerBlock("dirt_compressed4", (properties) -> new Block(properties.sound(SoundType.GRAVEL).strength(3f, 75f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRT_COMPRESSED5 = registerBlock("dirt_compressed5", (properties) -> new Block(properties.sound(SoundType.GRAVEL).strength(5f, 100f).requiresCorrectToolForDrops()));


    //Others
    public static final RegistryObject<Block> AMAZONITE_RELIC = registerBlock("amazonite_relic", (properties) -> new DropExperienceBlock(UniformInt.of(5, 15), properties.sound(SoundType.NETHERITE_BLOCK).strength(25f, 100f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> BELOW_BLOCK = registerBlock("below_block", (properties) -> new Block(properties.sound(SoundType.GLASS).strength(2f, 1f).requiresCorrectToolForDrops()));


    //Portal Blocks
    public static final RegistryObject<Block> PARADIS_PORTAL_BLOCK = registerBlock("paradis_portal_block", (properties) -> new ParadisPortalBlock(properties.strength(5f, 999f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OVERWORLD_PORTAL_BLOCK = registerBlock("overworld_portal_block", (properties) -> new OverworldPortalBlock(properties.strength(5f, 999f).requiresCorrectToolForDrops()));


    //Plants
    public static final RegistryObject<Block> AMAZONITE_PLANT = BLOCKS.register("amazonite_plant", () -> new AmazonitePlant(BlockBehaviour.Properties.of().instabreak().randomTicks().noCollission().sound(SoundType.CROP).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "amazonite_plant")))));
    public static final RegistryObject<Block> DESTRIUM_PLANT = BLOCKS.register("destrium_plant", () -> new DestriumPlant(BlockBehaviour.Properties.of().instabreak().randomTicks().noCollission().sound(SoundType.CROP).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "destrium_plant")))));
    public static final RegistryObject<Block> EXPERIENCE_PLANT = BLOCKS.register("experience_plant", () -> new ExperiencePlant(BlockBehaviour.Properties.of().instabreak().randomTicks().noCollission().sound(SoundType.CROP).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "experience_plant")))));


    //Flowers
    public static final RegistryObject<Block> CLOVER = registerBlock("clover", (properties) -> new FlowerBlock(MobEffects.LUCK, 9, properties.noCollission().instabreak().sound(SoundType.FUNGUS)));
    public static final RegistryObject<Block> CLOVER_TWO = registerBlock("clover_two", (properties) -> new FlowerBlock(MobEffects.LUCK, 9, properties.noCollission().instabreak().sound(SoundType.FUNGUS)));


    //Fluids
    public static final RegistryObject<LiquidBlock> POISON_WATER_BLOCK = BLOCKS.register("poison_water_block", () -> new PoisonWaterFluidBlock(ModFluids.POISON_WATER_FLUID, BlockBehaviour.Properties.of().noCollission().strength(100f).speedFactor(0.95F).noLootTable().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "poison_water_block")))));

    public static final RegistryObject<LiquidBlock> RESISTANCE_LAVA_BLOCK = BLOCKS.register("resistance_lava_block", () -> new ResistanceLavaFluidBlock(ModFluids.RESISTANCE_LAVA_FLUID, BlockBehaviour.Properties.of().noCollission().strength(100f).speedFactor(0.95F).noLootTable().noOcclusion().lightLevel((pLightEmission) -> 14).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "resistance_lava_block")))));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        RegistryObject<T> toReturn = BLOCKS.register(name, () -> function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, name)))));
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, name))).useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}