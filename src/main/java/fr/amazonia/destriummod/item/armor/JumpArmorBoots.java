package fr.amazonia.destriummod.item.armor;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class JumpArmorBoots extends ArmorItem {

    public JumpArmorBoots(ArmorMaterial p_40386_, Type p_266831_, Properties p_40388_) {
        super(p_40386_, p_266831_, p_40388_);
    }

    @Override
    public void onArmorTick(ItemStack itemstack, Level world, Player player) {
        if(player.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.JUMP_BOOTS.get()) {
            player.addEffect(new MobEffectInstance(MobEffects.JUMP, 300, 2, false, false, true));
        }
    }
}
