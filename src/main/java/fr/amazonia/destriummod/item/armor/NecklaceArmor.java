package fr.amazonia.destriummod.item.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class NecklaceArmor extends ArmorItem {
	
	public NecklaceArmor(IArmorMaterial p_i48534_1_, EquipmentSlotType p_i48534_2_, Properties p_i48534_3_) {
		super(p_i48534_1_, p_i48534_2_, p_i48534_3_);
	}

	public boolean isEnchantable(ItemStack p_77616_1_) {
	      return false;
	   }
}
