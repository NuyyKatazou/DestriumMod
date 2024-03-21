package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.init.ModBlocks;
import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DestriumMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTabs extends CreativeModeTab {

    public static CreativeModeTab ItemTab;
    public static CreativeModeTab BlockTab;
    public static CreativeModeTab ToolTab;
    public static CreativeModeTab FoodTab;

    protected ModCreativeTabs(Builder builder) {
        super(builder);
    }

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        ItemTab = event.registerCreativeModeTab(new ResourceLocation(DestriumMod.MODID, "itemtab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.AMAZONITE_FRAGMENT.get())).title(Component.literal("Items Tabs")).build());

        BlockTab = event.registerCreativeModeTab(new ResourceLocation(DestriumMod.MODID, "blocktab"),
                builder -> builder.icon(() -> new ItemStack(ModBlocks.AMAZONITE_BLOCK.get())).title(Component.literal("Blocks Tabs")).build());

        ToolTab = event.registerCreativeModeTab(new ResourceLocation(DestriumMod.MODID, "tooltab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.AMAZONITE_PICKAXE.get())).title(Component.literal("Tools & Armors Tabs")).build());

        FoodTab = event.registerCreativeModeTab(new ResourceLocation(DestriumMod.MODID, "foodtab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.AMAZONITE_APPLE.get())).title(Component.literal("Foods Tabs")).build());
    }
}