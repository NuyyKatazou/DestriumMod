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

public class AdventurerArmorBoots extends ArmorItem {

    public AdventurerArmorBoots(ArmorMaterial materialIn, EquipmentSlot slot, Properties properties) {
        super(materialIn, slot, properties);
    }
    @Override
    public void onArmorTick(ItemStack itemstack, Level world, Player player) {
        if(player.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.ADVENTURER_BOOTS.get()) {
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 2, false, false, true));
        }
    }
}
