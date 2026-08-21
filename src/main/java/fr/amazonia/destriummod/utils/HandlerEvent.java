package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.init.ModItems;
import fr.amazonia.destriummod.worldgen.portal.OverworldTeleporter;
import fr.amazonia.destriummod.worldgen.portal.ParadisTeleporter;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DestriumMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class HandlerEvent {

    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        LivingEntity entity = event.getEntity();
        if (entity instanceof Player) {
            //Cancel Overworld & Paradis Teleporter FallDamage
            if (event.getSource().is(DamageTypes.FALL) && OverworldTeleporter.f >= 1 || ParadisTeleporter.f >= 1) {
                OverworldTeleporter.f = 0;
                ParadisTeleporter.f = 0;
                event.setAmount(0);
            }
        }
    }

    @SubscribeEvent
    public void onLivingFall(LivingFallEvent event) {
        LivingEntity entity = event.getEntity();
        if (entity instanceof Player) {
            Item feetEquip = entity.getItemBySlot(EquipmentSlot.FEET).getItem();
            //Cancel Feather, Adventurer & ReinforcedAdventurer Boots FallDamage
            if (feetEquip == ModItems.FEATHER_BOOTS.get() || feetEquip == ModItems.ADVENTURER_BOOTS.get() || feetEquip == ModItems.REINFORCED_ADVENTURER_BOOTS.get()) {
                event.setDamageMultiplier(0);
            }
        }
    }

    @SubscribeEvent
    public void AnvilUse(AnvilUpdateEvent event) {
        Item left = event.getLeft().getItem();
        if (left == ModItems.NECKLACE.get() || left == ModItems.LUCKY_NECKLACE.get()) {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public static void onTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();

        TextColor color = ModColor.ITEM_COLORS.get(stack.getItem());

        if (color != null) {
            boolean isRenamed = stack.has(DataComponents.CUSTOM_NAME);
            String rawName = event.getToolTip().get(0).getString();

            event.getToolTip().set(0, Component.literal(rawName).withStyle(style -> style.withColor(color).withItalic(isRenamed)));
        }
    }
}