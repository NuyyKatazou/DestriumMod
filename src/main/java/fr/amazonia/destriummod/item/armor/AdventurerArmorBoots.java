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

public class AdventurerArmorBoots extends ArmorItem {
	
	public AdventurerArmorBoots(IArmorMaterial materialIn, EquipmentSlotType slot, Properties properties) {
		super(materialIn, slot, properties);
	}
	
	@Override
    public void onArmorTick(ItemStack itemstack, World world, PlayerEntity player) {
		if(player.getItemBySlot(EquipmentSlotType.FEET).getItem() == ModItems.ADVENTURER_BOOTS.get()) {
			player.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 300, 2, false, false, true));
		}
	}
}