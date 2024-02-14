package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class HandlerEvent {

    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        LivingEntity entity = event.getEntityLiving();
        if (entity instanceof Player) {
            //Cancel OverworldTeleporter & ParadisTeleporter FallDamage
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
        if (entity instanceof Player) {
            //Cancel FeatherBoots FallDamage
            if(entity.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.FEATHER_BOOTS.get()) {
                event.setDamageMultiplier(0);
            }
            //Cancel AdventurerBoots FallDamage
            if(entity.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.ADVENTURER_BOOTS.get()) {
                event.setDamageMultiplier(0);
            }
            //Cancel ReinforcedAdventurerBoots FallDamage
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