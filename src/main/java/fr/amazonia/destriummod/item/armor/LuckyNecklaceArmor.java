package fr.amazonia.destriummod.item.armor;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class LuckyNecklaceArmor extends ArmorItem {

    public LuckyNecklaceArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties properties) {
        super(materialIn, slot, properties);
    }

    @Override
    public void onArmorTick(ItemStack itemstack, World world, PlayerEntity player) {
        if (player.getItemBySlot(EquipmentSlotType.CHEST).getItem() == ModItems.LUCKY_NECKLACE.get()) {
            player.addEffect(new EffectInstance(Effects.LUCK, 300, 4, false, false, true));
        }
    }

    public boolean isEnchantable(ItemStack pStack) {
        return false;
    }
}