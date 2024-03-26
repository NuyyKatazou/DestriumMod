package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class HandlerEvent {

	@SubscribeEvent
	public void onLivingHurt(LivingHurtEvent event) {
		LivingEntity entity = event.getEntityLiving();
		if (entity instanceof PlayerEntity) {
			//Cancel Overworld & Paradis Teleporter FallDamage
			if (event.getSource() == DamageSource.FALL && OverworldTeleporter.f >= 1 || ParadisTeleporter.f >= 1) {
				OverworldTeleporter.f = 0;
				ParadisTeleporter.f = 0;
				event.setAmount(0);
			}
		}
	}

	@SubscribeEvent
    public void onLivingFall(LivingFallEvent event) {
    	LivingEntity entity = event.getEntityLiving();
    	if (entity instanceof PlayerEntity) {
			Item feetEquip = entity.getItemBySlot(EquipmentSlotType.FEET).getItem();
        	//Cancel FeatherBoots FallDamage
        	if(feetEquip == ModItems.FEATHER_BOOTS.get()) {
            	event.setDamageMultiplier(0);
    		}
        	//Cancel AdventurerBoots FallDamage
            if(feetEquip == ModItems.ADVENTURER_BOOTS.get()) {
            	event.setDamageMultiplier(0);
    		}
        	//Cancel ReinforcedAdventurerBoots FallDamage
            if(feetEquip == ModItems.REINFORCED_ADVENTURER_BOOTS.get()) {
            	event.setDamageMultiplier(0);
    		}
        }
    }
	
	@SubscribeEvent
	public void AnvilUse(AnvilUpdateEvent event) {
		Item left = event.getLeft().getItem();
		if(left == ModItems.NECKLACE.get() || left == ModItems.LUCKY_NECKLACE.get()) {
			event.setCanceled(true);
		}
	}
}