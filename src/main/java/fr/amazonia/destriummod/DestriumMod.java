package fr.amazonia.destriummod;

import fr.amazonia.destriummod.block.OverworldPortalBlocks;
import fr.amazonia.destriummod.block.ParadisPortalBlocks;
import fr.amazonia.destriummod.init.ModBlocks;
import fr.amazonia.destriummod.init.ModFluids;
import fr.amazonia.destriummod.init.ModItems;
import fr.amazonia.destriummod.utils.HandlerEvent;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(DestriumMod.MODID)
public class DestriumMod {
	public static final String MODID = "destriummod";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public static final ItemGroup ItemTab = new ItemGroup(MODID + ".itemtab") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
        	 return new ItemStack(ModItems.AMAZONITE_FRAGMENT.get());
        }
    };
    public static final ItemGroup BlockTab = new ItemGroup(MODID + ".blocktab") {
    	@Override
    	@OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
    		return new ItemStack(ModBlocks.AMAZONITE_BLOCK.get());
    	}
    };
    public static final ItemGroup toolTab = new ItemGroup(MODID + ".tooltab") {
    	@Override
    	@OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
           return new ItemStack(ModItems.AMAZONITE_PICKAXE.get());
    	}
    };
    public static final ItemGroup foodTab = new ItemGroup(MODID + ".foodtab") {
    	@Override
    	@OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
    		return new ItemStack(ModItems.AMAZONITE_APPLE.get());
    	}
    };
 
	
	public DestriumMod() {
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
		
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, ParadisPortalBlocks::PlayerRightClick);
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OverworldPortalBlocks::PlayerRightClick);
		
		
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		ModItems.ITEMS.register(eventBus);
		ModBlocks.BLOCKS.register(eventBus);
		ModFluids.FLUIDS.register(eventBus);
	
	}
	
	private void setup(FMLCommonSetupEvent e) {
		MinecraftForge.EVENT_BUS.register(new HandlerEvent());
	}
	
	
	private void clientSetup(FMLClientSetupEvent e) {
		
		RenderTypeLookup.setRenderLayer(ModBlocks.AMAZONITE_PLANTS.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(ModBlocks.DESTRIUM_PLANTS.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(ModBlocks.XP_PLANTS.get(), RenderType.translucent());
		
		
		RenderTypeLookup.setRenderLayer(ModBlocks.BELOW_BLOCK.get(), RenderType.translucent());
		
		
		RenderTypeLookup.setRenderLayer(ModFluids.POISON_WATER_FLUID.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(ModFluids.POISON_WATER_BLOCK.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(ModFluids.POISON_WATER_FLOWING.get(), RenderType.translucent());
		
		RenderTypeLookup.setRenderLayer(ModFluids.RESISTANCE_LAVA_FLUID.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(ModFluids.RESISTANCE_LAVA_BLOCK.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(ModFluids.RESISTANCE_LAVA_FLOWING.get(), RenderType.translucent());
	}
	@SubscribeEvent
	public void ClientRequest(final FMLClientSetupEvent e){
		e.getMinecraftSupplier().get().execute(this::updateTitle);
	}
	private void serverSetup(FMLDedicatedServerSetupEvent e) {
		
	}
	private void updateTitle(){
		final MainWindow window = Minecraft.getInstance().getWindow();
		window.setTitle("Minecraft Modded - 1.16.5");
		
		
	}

}
