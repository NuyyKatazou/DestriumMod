package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.utils.toolmaterials.DestriumToolMaterial;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item DESTRIUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static final Item DESTRIUM_SWORD = new SwordItem(DestriumToolMaterial.INSTANCE, 1, -1.4f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));

    public static void RegisterAll(){
    Registry.register(Registry.ITEM, new Identifier(DestriumMod.MODID, "destrium_ingot"), DESTRIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(DestriumMod.MODID, "destrium_sword"), DESTRIUM_SWORD);
    }
}
