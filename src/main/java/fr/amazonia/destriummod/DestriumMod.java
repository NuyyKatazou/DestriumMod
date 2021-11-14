package fr.amazonia.destriummod;



import fr.amazonia.destriummod.init.ModBlocks;
import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(DestriumMod.MODID)
public class DestriumMod {
	
	
	public static final String MODID = "destriummod";
	
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
		
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ModItems.ITEMS.register(bus);
		ModBlocks.BLOCKS.register(bus);
		
		
	
	}
	
	private void setup(FMLCommonSetupEvent e) {
		
	}

	private void clientSetup(FMLClientSetupEvent e) {
		
		RenderTypeLookup.setRenderLayer(ModBlocks.AMAZONITE_PLANTS.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(ModBlocks.DESTRIUM_PLANTS.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(ModBlocks.XP_PLANTS.get(), RenderType.translucent());
		
		RenderTypeLookup.setRenderLayer(ModBlocks.BELOW_BLOCK.get(), RenderType.translucent());
		
		
	}
	
	private void serverSetup(FMLDedicatedServerSetupEvent e) {
		
	}

}
