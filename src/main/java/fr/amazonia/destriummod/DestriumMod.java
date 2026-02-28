package fr.amazonia.destriummod;

import com.mojang.logging.LogUtils;
import fr.amazonia.destriummod.init.ModBlocks;
import fr.amazonia.destriummod.init.ModFluidTypes;
import fr.amazonia.destriummod.init.ModFluids;
import fr.amazonia.destriummod.init.ModItems;
import fr.amazonia.destriummod.utils.HandlerEvent;
import fr.amazonia.destriummod.utils.ModCreativeTabs;
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

@Mod(DestriumMod.MODID)
public class DestriumMod {

    public static final String MODID = "destriummod";
    public static final Logger LOGGER = LogUtils.getLogger();

    //Dimensions
    public static ResourceKey<Level> PARADIS_DIMENSION;

    public DestriumMod(FMLJavaModLoadingContext context) {

        //Setup Event
        context.getModEventBus().addListener(this::setup);
        context.getModEventBus().addListener(this::clientSetup);
        context.getModEventBus().addListener(this::serverSetup);
        context.getModEventBus().register(this);

        //Init Class
        IEventBus eventBus = context.getModEventBus();
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModCreativeTabs.register(eventBus);
        ModFluids.register(eventBus);
        ModFluidTypes.register(eventBus);

    }

    private void setup(FMLCommonSetupEvent event) {
        //Events Class
        MinecraftForge.EVENT_BUS.register(new HandlerEvent());

        //Dimensions
        //PARADIS_DIMENSION = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(DestriumMod.MODID, "paradis"));

    }

    private void clientSetup(FMLClientSetupEvent event) {
    }

    private void serverSetup(FMLDedicatedServerSetupEvent event) {
    }
}