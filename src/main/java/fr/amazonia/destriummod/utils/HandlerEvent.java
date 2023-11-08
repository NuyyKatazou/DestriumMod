package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.block.OverworldPortalBlocks;
import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class HandlerEvent {
	
	@SubscribeEvent
    public void onLivingFall(LivingFallEvent event) {
        LivingEntity entity = event.getEntityLiving();
        if (entity instanceof PlayerEntity) {
        	//Cancel OverworldPortalBlocks FallDamage
            if(OverworldPortalBlocks.f == 1) {
            event.setDamageMultiplier(0);
            OverworldPortalBlocks.f = 0;
            }
          //Cancel FeatherBoots FallDamage
            if(entity.getItemBySlot(EquipmentSlotType.FEET).getItem() == ModItems.FEATHER_BOOTS.get()) {
            	event.setDamageMultiplier(0);
    		}
          //Cancel AdventurerBoots FallDamage
            if(entity.getItemBySlot(EquipmentSlotType.FEET).getItem() == ModItems.ADVENTURER_BOOTS.get()) {
            	event.setDamageMultiplier(0);
    		}
          //Cancel RenforcedAdventurerBoots FallDamage
            if(entity.getItemBySlot(EquipmentSlotType.FEET).getItem() == ModItems.REINFORCED_ADVENTURER_BOOTS.get()) {
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
