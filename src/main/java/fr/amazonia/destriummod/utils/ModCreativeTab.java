package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.DestriumMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DestriumMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTab {

    public static CreativeModeTab TUTORIAL_TAB;


    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        TUTORIAL_TAB = event.registerCreativeModeTab(new ResourceLocation(DestriumMod.MODID, "tutorial_tab"),
                builder -> builder.icon(() -> new ItemStack(Items.ACACIA_LEAVES)).title(Component.literal("Tutorial Tab")).build());
    }
}
