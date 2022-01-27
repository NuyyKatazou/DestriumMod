package fr.amazonia.destriummod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.amazonia.destriummod.init.ModBlocks;
import fr.amazonia.destriummod.init.ModFluids;
import fr.amazonia.destriummod.init.ModItems;


@Mod(DestriumMod.MODID)
public class DestriumMod {
	public static final String MODID = "destriummod";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	final Supplier<Minecraft> minecraftSupplier;
	
	
	
  	public static final CreativeModeTab ItemTab = new CreativeModeTab(MODID + ".itemtab") {
          @Override
          @OnlyIn(Dist.CLIENT)
          public ItemStack makeIcon() {
          	 return new ItemStack(ModItems.AMAZONITE_FRAGMENT.get());
          }
      };
    public static final CreativeModeTab BlockTab = new CreativeModeTab(MODID + ".blocktab") {
    	@Override
    	@OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
    		return new ItemStack(ModBlocks.AMAZONITE_BLOCK.get());
    	}
    };
    public static final CreativeModeTab toolTab = new CreativeModeTab(MODID + ".tooltab") {
    	@Override
        public ItemStack makeIcon() {
           return new ItemStack(ModItems.AMAZONITE_PICKAXE.get());
    	}
    };
	
    public static final CreativeModeTab foodTab = new CreativeModeTab(MODID + ".foodtab") {
    	@Override
    	@OnlyIn(Dist.CLIENT)
    	public ItemStack makeIcon() {
    		return new ItemStack(ModItems.AMAZONITE_APPLE.get());
    	}
    };
 
	
	public DestriumMod() {
		
		minecraftSupplier = Minecraft::getInstance;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
		
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		ModItems.ITEMS.register(eventBus);
		ModBlocks.BLOCKS.register(eventBus);
		ModFluids.FLUIDS.register(eventBus);
	
	}
	
	private void setup(FMLCommonSetupEvent e) {
		
	}
	
	
	private void clientSetup(FMLClientSetupEvent e) {
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.AMAZONITE_PLANTS.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.DESTRIUM_PLANTS.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.XP_PLANTS.get(), RenderType.translucent());
		
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.BELOW_BLOCK.get(), RenderType.translucent());
		
		
		ItemBlockRenderTypes.setRenderLayer(ModFluids.POISON_WATER_FLUID.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(ModFluids.POISON_WATER_BLOCK.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(ModFluids.POISON_WATER_FLOWING.get(), RenderType.translucent());
		
		ItemBlockRenderTypes.setRenderLayer(ModFluids.RESISTANCE_LAVA_FLUID.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(ModFluids.RESISTANCE_LAVA_BLOCK.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(ModFluids.RESISTANCE_LAVA_FLOWING.get(), RenderType.translucent());
	}

	private void serverSetup(FMLDedicatedServerSetupEvent e) {
		
	}

}