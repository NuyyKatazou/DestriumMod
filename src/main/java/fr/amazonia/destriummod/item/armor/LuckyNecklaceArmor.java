package fr.amazonia.destriummod.item.armor;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.Level;

public class LuckyNecklaceArmor extends ArmorItem {

    public LuckyNecklaceArmor(ArmorMaterial pMaterial, ArmorType pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    public void onInventoryTick(ItemStack stack, Level level, Player player, int slotIndex, int selectedIndex) {
        if (player.getItemBySlot(EquipmentSlot.CHEST).getItem() == ModItems.LUCKY_NECKLACE.get()) {
            player.addEffect(new MobEffectInstance(MobEffects.LUCK, 300, 4, false, false, true));
        }
    }
}