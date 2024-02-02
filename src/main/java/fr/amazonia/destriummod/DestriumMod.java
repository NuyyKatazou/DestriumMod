package fr.amazonia.destriummod;

import fr.amazonia.destriummod.init.ModBlocks;
import fr.amazonia.destriummod.init.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class DestriumMod implements ModInitializer {

    public static final String MODID = "destriummod";

    @Override
    public void onInitialize() {
        //Init Class
        ModItems.INSTANCE.registerItems();
        ModBlocks.INSTANCE.registerAll();
    }

    //CreativeTabs
    public static final ItemGroup ITEM_TAB = FabricItemGroupBuilder.build(
            new Identifier(MODID, ".itemtab"),
            () -> new ItemStack(ModItems.DESTRIUM_INGOT));

    public static final ItemGroup BLOCK_TAB = FabricItemGroupBuilder.build(
            new Identifier(MODID, ".blocktab"),
            () -> new ItemStack(ModItems.DESTRIUM_INGOT));
}
