package fr.amazonia.destriummod;

import com.mojang.logging.LogUtils;
import fr.amazonia.destriummod.init.ModBlocks;
import fr.amazonia.destriummod.init.ModItems;
import fr.amazonia.destriummod.utils.HandlerEvent;
import fr.amazonia.destriummod.utils.ModCreativeTabs;
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
import org.slf4j.Logger;

import java.util.function.Supplier;

@Mod(DestriumMod.MODID)
public class DestriumMod {

    public static final String MODID = "destriummod";
    public static final Logger LOGGER = LogUtils.getLogger();
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

        //Init Class
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModCreativeTabs.register(eventBus);
    }

    private void setup(FMLCommonSetupEvent event) {
        //Events Class
        MinecraftForge.EVENT_BUS.register(new HandlerEvent());

        //Dimensions
        //PARADIS_DIMENSION = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(DestriumMod.MODID, "paradis"));

    }

    private void clientSetup(FMLClientSetupEvent event) {
        /*
        //Flowers
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLOVER.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLOVER_TWO.get(), RenderType.translucent());

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
