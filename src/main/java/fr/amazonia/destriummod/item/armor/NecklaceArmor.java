package fr.amazonia.destriummod.item.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class NecklaceArmor extends ArmorItem {

    public NecklaceArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties properties) {
        super(materialIn, slot, properties);
    }

    public boolean isEnchantable(ItemStack pStack) {
        return false;
    }
}