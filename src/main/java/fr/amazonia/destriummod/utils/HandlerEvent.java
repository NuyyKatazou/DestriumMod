package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.block.OverworldPortalBlocks;
import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class HandlerEvent {

    @SubscribeEvent
    public void onLivingFall(LivingFallEvent event) {
        LivingEntity entity = event.getEntity();
        if (entity instanceof Player) {
            //Cancel FeatherBoots FallDamage
            if(entity.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.FEATHER_BOOTS.get()) {
                event.setDamageMultiplier(0);
            }
            //Cancel AdventurerBoots FallDamage
            if(entity.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.ADVENTURER_BOOTS.get()) {
                event.setDamageMultiplier(0);
            }
            //Cancel RenforcedAdventurerBoots FallDamage
            if(entity.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.REINFORCED_ADVENTURER_BOOTS.get()) {
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
