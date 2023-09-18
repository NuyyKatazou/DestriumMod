package fr.amazonia.destriummod.item.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class NecklaceArmor extends ArmorItem {

    public NecklaceArmor(ArmorMaterial p_40386_, ArmorItem.Type p_266831_, Item.Properties p_40388_) {
        super(p_40386_, p_266831_, p_40388_);
    }

    public boolean isEnchantable(ItemStack p_77616_1_) {
        return false;
    }
}
