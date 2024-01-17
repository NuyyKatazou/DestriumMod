package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item DESTRIUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static void RegisterAll(){
    Registry.register(Registry.ITEM, new Identifier(DestriumMod.MODID, "destrium_ingot"), DESTRIUM_INGOT);
    }
}
