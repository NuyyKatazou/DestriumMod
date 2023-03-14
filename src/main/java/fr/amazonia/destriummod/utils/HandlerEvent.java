package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.block.OverworldPortalBlocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class HandlerEvent {
	
	@SubscribeEvent
    public void onLivingFall(LivingFallEvent event) {
        LivingEntity entity = event.getEntityLiving();
        if (entity instanceof PlayerEntity) {
            
            if(OverworldPortalBlocks.f == 1) 
            {

            event.setDamageMultiplier(0);
            
            OverworldPortalBlocks.f = 0;
            }
        }
    }
}
