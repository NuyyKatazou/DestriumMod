package fr.amazonia.destriummod.item.armor;

import fr.amazonia.destriummod.utils.ModArmorMaterials;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;

public class NecklaceArmor extends ArmorItem {

    public NecklaceArmor(ModArmorMaterials pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    public boolean isEnchantable(ItemStack pStack) {
        return false;
    }
}