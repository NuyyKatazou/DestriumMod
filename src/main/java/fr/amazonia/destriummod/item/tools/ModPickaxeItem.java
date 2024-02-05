package fr.amazonia.destriummod.item.tools;

import fr.amazonia.destriummod.utils.toolmaterials.DestriumModToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class ModPickaxeItem extends PickaxeItem {

    public ModPickaxeItem(DestriumModToolMaterials destriumModToolMaterials, int i, float v, FabricItemSettings group) {
        super(destriumModToolMaterials, i, v, group);
    }

}
