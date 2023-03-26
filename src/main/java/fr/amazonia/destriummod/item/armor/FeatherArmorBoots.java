package fr.amazonia.destriummod.item.armor;

import fr.amazonia.destriummod.utils.IDamageHandlingArmor;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.util.DamageSource;

public class FeatherArmorBoots extends ArmorItem implements IDamageHandlingArmor{
	
	public FeatherArmorBoots(IArmorMaterial materialIn, EquipmentSlotType slot, Properties properties) {
		super(materialIn, slot, properties);
	}
	
	@Override
    public float onDamaged(LivingEntity entity, EquipmentSlotType slot, DamageSource source, float amount) {
        if(source == DamageSource.FALL) {
            	return 0;
            }
		return amount;
    }
}