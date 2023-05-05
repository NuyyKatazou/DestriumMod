package fr.amazonia.destriummod.item.armor;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class NecklaceArmor extends ArmorItem {
    public NecklaceArmor(ArmorMaterial materialIn, EquipmentSlot slot, Item.Properties properties) {
        super(materialIn, slot, properties);
    }
    public boolean isEnchantable(ItemStack p_77616_1_) {
        return false;
    }
}
