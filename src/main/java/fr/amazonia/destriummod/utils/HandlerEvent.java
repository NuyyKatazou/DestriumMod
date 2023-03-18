package fr.amazonia.destriummod.utils;


import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class HandlerEvent {
	@SubscribeEvent
    public void onLivingFall(LivingFallEvent event) {
        LivingEntity entity = event.getEntityLiving();
//        if (entity instanceof Player) {
//            
//            if(OverworldPortalBlocks.f == 1) 
//            {
//
//            event.setDamageMultiplier(0);
//            
//            OverworldPortalBlocks.f = 0;
//            }
//        }
    }
}
