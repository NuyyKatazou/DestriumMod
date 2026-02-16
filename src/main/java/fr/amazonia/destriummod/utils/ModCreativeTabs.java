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

    public static CreativeModeTab BlockTab;
    public static CreativeModeTab ItemTab;
    public static CreativeModeTab ToolTab;
    public static CreativeModeTab FoodTab;

    protected ModCreativeTabs(Builder builder) {
        super(builder);
    }

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        BlockTab = event.registerCreativeModeTab(ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "blocktab"),
                builder -> builder.icon(() -> new ItemStack(ModBlocks.AMAZONITE_BLOCK.get())).title(Component.translatable(String.valueOf(ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "blocktab")))).build());

        ItemTab = event.registerCreativeModeTab(ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "itemtab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.AMAZONITE_FRAGMENT.get())).title(Component.translatable(String.valueOf(ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "itemtab")))).build());

        ToolTab = event.registerCreativeModeTab(ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "tooltab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.AMAZONITE_PICKAXE.get())).title(Component.translatable(String.valueOf(ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "tooltab")))).build());

        FoodTab = event.registerCreativeModeTab(ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "foodtab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.AMAZONITE_APPLE.get())).title(Component.translatable(String.valueOf(ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "foodtab")))).build());
    }
}