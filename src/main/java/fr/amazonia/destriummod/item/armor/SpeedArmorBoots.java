package fr.amazonia.destriummod.item.armor;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SpeedArmorBoots extends ArmorItem {

    public SpeedArmorBoots(Holder<ArmorMaterial> p_40386_, Type p_266831_, Properties p_40388_) {
        super(p_40386_, p_266831_, p_40388_);
    }

    public void onInventoryTick(ItemStack stack, Level level, Player player, int slotIndex, int selectedIndex) {
        if(player.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.SPEED_BOOTS.get()) {
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 2, false, false, true));
        }
    }
}
