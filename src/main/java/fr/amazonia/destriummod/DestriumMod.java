package fr.amazonia.destriummod;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;

@Mod(DestriumMod.MODID)
public class DestriumMod {

    public static final String MODID = "destriummod";
    public static final Logger LOGGER = LogManager.getLogger(MODID);
    final Supplier<Minecraft> minecraftSupplier;

    //Dimensions
    public static ResourceKey<Level> PARADIS_DIMENSION;

    public DestriumMod() {

        minecraftSupplier = Minecraft::getInstance;

        //Setup Event
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::addCreative);
        FMLJavaModLoadingContext.get().getModEventBus().register(this);

        //Init Class
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        //ModItems.ITEMS.register(eventBus);
        //ModBlocks.BLOCKS.register(eventBus);
    }

    private void setup(FMLCommonSetupEvent event) {
        //Events Class
        //MinecraftForge.EVENT_BUS.register(new HandlerEvent());

        //Dimensions
        //PARADIS_DIMENSION = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(DestriumMod.MODID, "paradis"));

    }

    private void clientSetup(FMLClientSetupEvent event) {
        //Plants
        /*
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.AMAZONITE_PLANTS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DESTRIUM_PLANTS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.XP_PLANTS.get(), RenderType.translucent());

        //Flowers
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLOVER.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLOVER_TWO.get(), RenderType.translucent());

        //Blocks
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BELOW_BLOCK.get(), RenderType.translucent());

        //Fluids
        ItemBlockRenderTypes.setRenderLayer(ModFluids.POISON_WATER_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.POISON_WATER_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.POISON_WATER_FLOWING.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(ModFluids.RESISTANCE_LAVA_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.RESISTANCE_LAVA_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.RESISTANCE_LAVA_FLOWING.get(), RenderType.translucent());

         */
    }

    private void serverSetup(FMLDedicatedServerSetupEvent event) {

    }
    /*
    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == ModCreativeTabs.ItemTab) {
            event.accept(ModItems.AMAZONITE_CRUMB);
            event.accept(ModItems.AMAZONITE_DUST);
            event.accept(ModItems.AMAZONITE_FRAGMENT);
            event.accept(ModItems.AMAZONITE_NUGGETS);
            event.accept(ModItems.AMAZONITE_INGOT);
            event.accept(ModItems.DESTRIUM_NUGGETS);
            event.accept(ModItems.DESTRIUM_INGOT);
            event.accept(ModItems.ARGONIDE_NUGGETS);
            event.accept(ModItems.ARGONIDE_INGOT);
            event.accept(ModItems.REPAIR_FRAGMENT);
            event.accept(ModItems.REPAIR_INGOT);
            event.accept(ModItems.EMERALD_NUGGETS);
            event.accept(ModItems.DIAMOND_NUGGETS);
            event.accept(ModItems.NETHERITE_NUGGETS);
            event.accept(ModItems.AMAZONITE_STICK);
            event.accept(ModItems.DESTRIUM_STICK);
            event.accept(ModItems.ARGONIDE_STICK);
            event.accept(ModItems.GOLDEN_CORE);
            event.accept(ModItems.COMPRESSED_GOLDEN);
            event.accept(ModItems.IRON_PLATE);
            event.accept(ModItems.GOLD_PLATE);
            event.accept(ModItems.DIAMOND_PLATE);
            event.accept(ModItems.NETHERITE_PLATE);
            event.accept(ModItems.ARGONIDE_PLATE);
            event.accept(ModItems.DESTRIUM_PLATE);
            event.accept(ModItems.AMAZONITE_PLATE);
            //event.accept(ModItems.EMPOISONED_WATER_BUCKET);
            event.accept(ModItems.POISON_STAR);
            //event.accept(ModItems.RESISTANCE_LAVA_BUCKET);
            event.accept(ModItems.RESISTANCE_STAR);
            //event.accept(ModItems.INFINITY_WATER_BUCKET);

        }
        if(event.getTab() == ModCreativeTabs.BlockTab) {
            event.accept(ModBlocks.CLOUD);
            event.accept(ModBlocks.BLUE_CLOUD);
            event.accept(ModBlocks.BLACK_CLOUD);
            event.accept(ModBlocks.BROWN_CLOUD);
            event.accept(ModBlocks.CYAN_CLOUD);
            event.accept(ModBlocks.DARK_BLUE_CLOUD);
            event.accept(ModBlocks.DARK_GRAY_CLOUD);
            event.accept(ModBlocks.DARK_GREEN_CLOUD);
            event.accept(ModBlocks.DARK_PURPLE_CLOUD);
            event.accept(ModBlocks.DARK_RED_CLOUD);
            event.accept(ModBlocks.GRAY_CLOUD);
            event.accept(ModBlocks.GREEN_CLOUD);
            event.accept(ModBlocks.LIGHT_BLUE_CLOUD);
            event.accept(ModBlocks.LIGHT_GRAY_CLOUD);
            event.accept(ModBlocks.LIGHT_RED_CLOUD);
            event.accept(ModBlocks.LIME_CLOUD);
            event.accept(ModBlocks.MAGENTA_CLOUD);
            event.accept(ModBlocks.ORANGE_CLOUD);
            event.accept(ModBlocks.PINK_CLOUD);
            event.accept(ModBlocks.PURPLE_CLOUD);
            event.accept(ModBlocks.RED_CLOUD);
            event.accept(ModBlocks.ULTRA_DARK_BLUE_CLOUD);
            event.accept(ModBlocks.YELLOW_CLOUD);
            event.accept(ModBlocks.CRACKED_CLOUD);
            event.accept(ModBlocks.CLOUD2);
            event.accept(ModBlocks.RANDOM_ORE);
            event.accept(ModBlocks.AMAZONITE_ORE);
            event.accept(ModBlocks.DESTRIUM_ORE);
            event.accept(ModBlocks.ARGONIDE_ORE);
            event.accept(ModBlocks.CRACKED_ARGONIDE_ORE);
            event.accept(ModBlocks.REPAIR_ORE);
            event.accept(ModBlocks.AMAZONITE_BLOCK);
            event.accept(ModBlocks.FAKE_AMAZONITE_BLOCK);
            event.accept(ModBlocks.DESTRIUM_BLOCK);
            event.accept(ModBlocks.ARGONIDE_BLOCK);
            event.accept(ModBlocks.COBBLESTONE_COMPRESSED1);
            event.accept(ModBlocks.COBBLESTONE_COMPRESSED2);
            event.accept(ModBlocks.COBBLESTONE_COMPRESSED3);
            event.accept(ModBlocks.COBBLESTONE_COMPRESSED4);
            event.accept(ModBlocks.COBBLESTONE_COMPRESSED5);
            event.accept(ModBlocks.COBBLESTONE_COMPRESSED6);
            event.accept(ModBlocks.COBBLESTONE_COMPRESSED7);
            event.accept(ModBlocks.COBBLESTONE_COMPRESSED8);
            event.accept(ModBlocks.DIRT_COMPRESSED1);
            event.accept(ModBlocks.DIRT_COMPRESSED2);
            event.accept(ModBlocks.DIRT_COMPRESSED3);
            event.accept(ModBlocks.DIRT_COMPRESSED4);
            event.accept(ModBlocks.DIRT_COMPRESSED5);
            event.accept(ModBlocks.AMAZONITE_RELIQUE_BLOCK);
            event.accept(ModBlocks.BELOW_BLOCK);
            event.accept(ModBlocks.PARADIS_PORTAL_BLOCK);
            event.accept(ModBlocks.OVERWORLD_PORTAL_BLOCK);
            event.accept(ModBlocks.AMAZONITE_PLANTS);
            event.accept(ModBlocks.DESTRIUM_PLANTS);
            event.accept(ModBlocks.XP_PLANTS);
            //event.accept(ModBlocks.CLOVER);
            //event.accept(ModBlocks.CLOVER_TWO);

        }
        if(event.getTab() == ModCreativeTabs.ToolTab) {
            event.accept(ModItems.AMAZONITE_SWORD);
            event.accept(ModItems.AMAZONITE_PICKAXE);
            event.accept(ModItems.AMAZONITE_AXE);
            event.accept(ModItems.AMAZONITE_SHOVEL);
            event.accept(ModItems.AMAZONITE_HOES);
            event.accept(ModItems.DESTRIUM_SWORD);
            event.accept(ModItems.DESTRIUM_PICKAXE);
            event.accept(ModItems.DESTRIUM_AXE);
            event.accept(ModItems.DESTRIUM_SHOVEL);
            event.accept(ModItems.DESTRIUM_HOES);
            event.accept(ModItems.ARGONIDE_SWORD);
            event.accept(ModItems.ARGONIDE_PICKAXE);
            event.accept(ModItems.ARGONIDE_AXE);
            event.accept(ModItems.ARGONIDE_SHOVEL);
            event.accept(ModItems.ARGONIDE_HOES);
            event.accept(ModItems.SPAWNERS_PICKAXE);
            event.accept(ModItems.AMAZONITE_HELMET);
            event.accept(ModItems.AMAZONITE_CHESTPLATE);
            event.accept(ModItems.AMAZONITE_LEGGINGS);
            event.accept(ModItems.AMAZONITE_BOOTS);
            event.accept(ModItems.DESTRIUM_HELMET);
            event.accept(ModItems.DESTRIUM_CHESTPLATE);
            event.accept(ModItems.DESTRIUM_LEGGINGS);
            event.accept(ModItems.DESTRIUM_BOOTS);
            event.accept(ModItems.ARGONIDE_HELMET);
            event.accept(ModItems.ARGONIDE_CHESTPLATE);
            event.accept(ModItems.ARGONIDE_LEGGINGS);
            event.accept(ModItems.ARGONIDE_BOOTS);
            event.accept(ModItems.SPEED_BOOTS);
            event.accept(ModItems.FEATHER_BOOTS);
            event.accept(ModItems.JUMP_BOOTS);
            event.accept(ModItems.ADVENTURER_BOOTS);
            event.accept(ModItems.RENFORCED_ADVENTURER_BOOTS);
            event.accept(ModItems.NECKLACE);
            event.accept(ModItems.LUCKY_NECKLACE);

        }
        if(event.getTab() == ModCreativeTabs.FoodTab) {
            event.accept(ModItems.DESTRIUM_APPLE);
            event.accept(ModItems.AMAZONITE_APPLE);

        }
    }

     */


}
