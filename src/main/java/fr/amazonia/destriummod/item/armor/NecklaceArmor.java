package fr.amazonia.destriummod.item.armor;

import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class NecklaceArmor extends ArmorItem {

    public NecklaceArmor(Holder<ArmorMaterial> pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    public boolean isEnchantable(ItemStack pStack) {
        return false;
    }
}