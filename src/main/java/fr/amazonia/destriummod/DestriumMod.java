package fr.amazonia.destriummod;

import com.mojang.logging.LogUtils;
import fr.amazonia.destriummod.init.ModBlocks;
import fr.amazonia.destriummod.init.ModFluidTypes;
import fr.amazonia.destriummod.init.ModFluids;
import fr.amazonia.destriummod.init.ModItems;
import fr.amazonia.destriummod.utils.HandlerEvent;
import fr.amazonia.destriummod.utils.ModCreativeTabs;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.Optional;

@Mod(DestriumMod.MODID)
public class DestriumMod {

    public static final String MODID = "destriummod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public DestriumMod(FMLJavaModLoadingContext context) {

        Optional<? extends ModContainer> container = ModList.get().getModContainerById(DestriumMod.MODID);
        container.ifPresent(c -> {
            String version = c.getModInfo().getVersion().toString();
            LOGGER.atInfo().log("DestriumMod version : {} !", version);
        });

        //Setup Event
        context.getModEventBus().addListener(this::setup);
        context.getModEventBus().addListener(this::clientSetup);
        context.getModEventBus().addListener(this::serverSetup);
        context.getModEventBus().register(this);

        //Init Class
        IEventBus eventBus = context.getModEventBus();
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModFluids.register(eventBus);
        ModFluidTypes.register(eventBus);
        ModCreativeTabs.register(eventBus);

    }

    private void setup(FMLCommonSetupEvent event) {
        //Events Class
        MinecraftForge.EVENT_BUS.register(new HandlerEvent());

    }

    private void clientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModFluids.POISON_WATER_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.POISON_WATER_FLOWING.get(), RenderType.translucent());
    }

    private void serverSetup(FMLDedicatedServerSetupEvent event) {
    }
}