package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DestriumMod.MODID);


    public static final RegistryObject<CreativeModeTab> ITEM_TAB = CREATIVE_MODE_TABS.register("item_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMAZONITE_FRAGMENT.get())).title(Component.translatable("creativetab.item_tab")).displayItems((pParameters, pOutput) -> {
        pOutput.accept(ModItems.AMAZONITE_CRUMB.get());
        pOutput.accept(ModItems.AMAZONITE_DUST.get());
        pOutput.accept(ModItems.AMAZONITE_FRAGMENT.get());
        pOutput.accept(ModItems.AMAZONITE_NUGGETS.get());
        pOutput.accept(ModItems.AMAZONITE_INGOT.get());
        pOutput.accept(ModItems.DESTRIUM_NUGGETS.get());
        pOutput.accept(ModItems.DESTRIUM_INGOT.get());
        pOutput.accept(ModItems.ARGONIDE_NUGGETS.get());
        pOutput.accept(ModItems.ARGONIDE_INGOT.get());
        pOutput.accept(ModItems.REPAIR_FRAGMENT.get());
        pOutput.accept(ModItems.REPAIR_INGOT.get());
        pOutput.accept(ModItems.EMERALD_NUGGETS.get());
        pOutput.accept(ModItems.DIAMOND_NUGGETS.get());
        pOutput.accept(ModItems.NETHERITE_NUGGETS.get());
        pOutput.accept(ModItems.AMAZONITE_STICK.get());
        pOutput.accept(ModItems.DESTRIUM_STICK.get());
        pOutput.accept(ModItems.ARGONIDE_STICK.get());
        pOutput.accept(ModItems.GOLDEN_CORE.get());
        pOutput.accept(ModItems.COMPRESSED_GOLDEN.get());
        pOutput.accept(ModItems.IRON_PLATE.get());
        pOutput.accept(ModItems.GOLD_PLATE.get());
        pOutput.accept(ModItems.DIAMOND_PLATE.get());
        pOutput.accept(ModItems.NETHERITE_PLATE.get());
        pOutput.accept(ModItems.ARGONIDE_PLATE.get());
        pOutput.accept(ModItems.DESTRIUM_PLATE.get());
        pOutput.accept(ModItems.AMAZONITE_PLATE.get());

        }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}