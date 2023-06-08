package fr.amazonia.destriummod;

import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
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
        FMLJavaModLoadingContext.get().getModEventBus().register(this);

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




}
