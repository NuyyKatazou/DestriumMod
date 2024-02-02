package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.utils.toolmaterials.DestriumToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final ModItems INSTANCE = new ModItems();


    //Armors and Tools
    public static final Item DESTRIUM_SWORD = new SwordItem(DestriumToolMaterial.INSTANCE, 1, -1.4f, new FabricItemSettings().group(DestriumMod.ITEM_TAB));


    //Items (Mineral)
    public static final Item AMAZONITE_CRUMB = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());
    public static final Item AMAZONITE_DUST = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());
    public static final Item AMAZONITE_FRAGMENT = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());
    public static final Item AMAZONITE_NUGGETS = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());
    public static final Item AMAZONITE_INGOT = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());
    public static final Item DESTRIUM_NUGGETS = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());
    public static final Item DESTRIUM_INGOT = new Item(new FabricItemSettings().group(DestriumMod.ITEM_TAB).fireproof());

    public void registerItems() {
        registerItem(DESTRIUM_INGOT, "destrium_ingot");
        registerItem(DESTRIUM_SWORD, "destrium_sword");
    }

    public void registerItem(Item item, String name) {
    Registry.register(Registry.ITEM, new Identifier(DestriumMod.MODID, name), item);
    }
}
