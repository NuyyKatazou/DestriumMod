package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.init.ModBlocks;
import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
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
        pOutput.accept(ModItems.POISON_STAR.get());
        pOutput.accept(ModItems.RESISTANCE_STAR.get());

        }).build());

    public static final RegistryObject<CreativeModeTab> BLOCK_TAB = CREATIVE_MODE_TABS.register("block_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.AMAZONITE_BLOCK.get())).title(Component.translatable("creativetab.block_tab")).displayItems((pParameters, pOutput) -> {
        pOutput.accept(ModBlocks.CLOUD.get());
        pOutput.accept(ModBlocks.BLUE_CLOUD.get());
        pOutput.accept(ModBlocks.BLACK_CLOUD.get());
        pOutput.accept(ModBlocks.BROWN_CLOUD.get());
        pOutput.accept(ModBlocks.CYAN_CLOUD.get());
        pOutput.accept(ModBlocks.DARK_BLUE_CLOUD.get());
        pOutput.accept(ModBlocks.DARK_GRAY_CLOUD.get());
        pOutput.accept(ModBlocks.DARK_GREEN_CLOUD.get());
        pOutput.accept(ModBlocks.DARK_PURPLE_CLOUD.get());
        pOutput.accept(ModBlocks.DARK_RED_CLOUD.get());
        pOutput.accept(ModBlocks.GRAY_CLOUD.get());
        pOutput.accept(ModBlocks.GREEN_CLOUD.get());
        pOutput.accept(ModBlocks.LIGHT_BLUE_CLOUD.get());
        pOutput.accept(ModBlocks.LIGHT_GRAY_CLOUD.get());
        pOutput.accept(ModBlocks.LIGHT_RED_CLOUD.get());
        pOutput.accept(ModBlocks.LIME_CLOUD.get());
        pOutput.accept(ModBlocks.MAGENTA_CLOUD.get());
        pOutput.accept(ModBlocks.ORANGE_CLOUD.get());
        pOutput.accept(ModBlocks.PINK_CLOUD.get());
        pOutput.accept(ModBlocks.PURPLE_CLOUD.get());
        pOutput.accept(ModBlocks.RED_CLOUD.get());
        pOutput.accept(ModBlocks.ULTRA_DARK_BLUE_CLOUD.get());
        pOutput.accept(ModBlocks.YELLOW_CLOUD.get());
        pOutput.accept(ModBlocks.CRACKED_CLOUD.get());
        pOutput.accept(ModBlocks.CLOUD2.get());
        pOutput.accept(ModBlocks.RANDOM_ORE.get());
        pOutput.accept(ModBlocks.AMAZONITE_ORE.get());
        pOutput.accept(ModBlocks.DESTRIUM_ORE.get());
        pOutput.accept(ModBlocks.ARGONIDE_ORE.get());
        pOutput.accept(ModBlocks.CRACKED_ARGONIDE_ORE.get());
        pOutput.accept(ModBlocks.REPAIR_ORE.get());
        pOutput.accept(ModBlocks.AMAZONITE_BLOCK.get());
        pOutput.accept(ModBlocks.FAKE_AMAZONITE_BLOCK.get());
        pOutput.accept(ModBlocks.DESTRIUM_BLOCK.get());
        pOutput.accept(ModBlocks.ARGONIDE_BLOCK.get());
        pOutput.accept(ModBlocks.COBBLESTONE_COMPRESSED1.get());
        pOutput.accept(ModBlocks.COBBLESTONE_COMPRESSED2.get());
        pOutput.accept(ModBlocks.COBBLESTONE_COMPRESSED3.get());
        pOutput.accept(ModBlocks.COBBLESTONE_COMPRESSED4.get());
        pOutput.accept(ModBlocks.COBBLESTONE_COMPRESSED5.get());
        pOutput.accept(ModBlocks.COBBLESTONE_COMPRESSED6.get());
        pOutput.accept(ModBlocks.COBBLESTONE_COMPRESSED7.get());
        pOutput.accept(ModBlocks.COBBLESTONE_COMPRESSED8.get());
        pOutput.accept(ModBlocks.DIRT_COMPRESSED1.get());
        pOutput.accept(ModBlocks.DIRT_COMPRESSED2.get());
        pOutput.accept(ModBlocks.DIRT_COMPRESSED3.get());
        pOutput.accept(ModBlocks.DIRT_COMPRESSED4.get());
        pOutput.accept(ModBlocks.DIRT_COMPRESSED5.get());
        pOutput.accept(ModBlocks.AMAZONITE_RELIQUE_BLOCK.get());
        pOutput.accept(ModBlocks.BELOW_BLOCK.get());
        pOutput.accept(ModBlocks.PARADIS_PORTAL_BLOCK.get());
        pOutput.accept(ModBlocks.OVERWORLD_PORTAL_BLOCK.get());
        pOutput.accept(ModBlocks.AMAZONITE_PLANTS.get());
        pOutput.accept(ModBlocks.DESTRIUM_PLANTS.get());
        pOutput.accept(ModBlocks.XP_PLANTS.get());

    }).build());

    public static final RegistryObject<CreativeModeTab> TOOL_TAB = CREATIVE_MODE_TABS.register("tool_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMAZONITE_PICKAXE.get())).title(Component.translatable("creativetab.tool_tab")).displayItems((pParameters, pOutput) -> {
        pOutput.accept(ModItems.AMAZONITE_SWORD.get());
        pOutput.accept(ModItems.AMAZONITE_PICKAXE.get());
        pOutput.accept(ModItems.AMAZONITE_AXE.get());
        pOutput.accept(ModItems.AMAZONITE_SHOVEL.get());
        pOutput.accept(ModItems.AMAZONITE_HOES.get());
        pOutput.accept(ModItems.DESTRIUM_SWORD.get());
        pOutput.accept(ModItems.DESTRIUM_PICKAXE.get());
        pOutput.accept(ModItems.DESTRIUM_AXE.get());
        pOutput.accept(ModItems.DESTRIUM_SHOVEL.get());
        pOutput.accept(ModItems.DESTRIUM_HOES.get());
        pOutput.accept(ModItems.ARGONIDE_SWORD.get());
        pOutput.accept(ModItems.ARGONIDE_PICKAXE.get());
        pOutput.accept(ModItems.ARGONIDE_AXE.get());
        pOutput.accept(ModItems.ARGONIDE_SHOVEL.get());
        pOutput.accept(ModItems.ARGONIDE_HOES.get());
        pOutput.accept(ModItems.SPAWNERS_PICKAXE.get());
        pOutput.accept(ModItems.AMAZONITE_HELMET.get());
        pOutput.accept(ModItems.AMAZONITE_CHESTPLATE.get());
        pOutput.accept(ModItems.AMAZONITE_LEGGINGS.get());
        pOutput.accept(ModItems.AMAZONITE_BOOTS.get());
        pOutput.accept(ModItems.DESTRIUM_HELMET.get());
        pOutput.accept(ModItems.DESTRIUM_CHESTPLATE.get());
        pOutput.accept(ModItems.DESTRIUM_LEGGINGS.get());
        pOutput.accept(ModItems.DESTRIUM_BOOTS.get());
        pOutput.accept(ModItems.ARGONIDE_HELMET.get());
        pOutput.accept(ModItems.ARGONIDE_CHESTPLATE.get());
        pOutput.accept(ModItems.ARGONIDE_LEGGINGS.get());
        pOutput.accept(ModItems.ARGONIDE_BOOTS.get());
        pOutput.accept(ModItems.SPEED_BOOTS.get());
        pOutput.accept(ModItems.FEATHER_BOOTS.get());
        pOutput.accept(ModItems.JUMP_BOOTS.get());
        pOutput.accept(ModItems.ADVENTURER_BOOTS.get());
        pOutput.accept(ModItems.RENFORCED_ADVENTURER_BOOTS.get());
        pOutput.accept(ModItems.NECKLACE.get());
        pOutput.accept(ModItems.LUCKY_NECKLACE.get());

    }).build());

    public static final RegistryObject<CreativeModeTab> FOOD_TAB = CREATIVE_MODE_TABS.register("food_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMAZONITE_APPLE.get())).title(Component.translatable("creativetab.food_tab")).displayItems((pParameters, pOutput) -> {
        pOutput.accept(ModItems.DESTRIUM_APPLE.get());
        pOutput.accept(ModItems.AMAZONITE_APPLE.get());

    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}