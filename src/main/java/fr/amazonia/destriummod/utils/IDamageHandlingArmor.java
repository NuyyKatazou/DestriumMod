package fr.amazonia.destriummod.utils;

import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.DamageSource;

public interface IDamageHandlingArmor {

	default float onDamaged(LivingEntity entity, EquipmentSlotType slot, DamageSource source, float amount){
        return amount;
    }
}
