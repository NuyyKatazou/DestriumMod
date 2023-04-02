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
import net.minecraftforge.event.AnvilUpdateEvent;

public class LuckyNecklaceArmor extends ArmorItem {
	
	public LuckyNecklaceArmor(IArmorMaterial p_i48534_1_, EquipmentSlotType p_i48534_2_, Properties p_i48534_3_) {
		super(p_i48534_1_, p_i48534_2_, p_i48534_3_);
	}
	
	@Override
    public void onArmorTick(ItemStack itemstack, World world, PlayerEntity player) {
		if(player.getItemBySlot(EquipmentSlotType.CHEST).getItem() == ModItems.LUCKY_NECKLACE.get()) {
			player.addEffect(new EffectInstance(Effects.LUCK, 300, 4, false, false, true));
		}
	}

	public boolean isEnchantable(ItemStack p_77616_1_) {
	      return false;
	   }
	public boolean AnvilUse(AnvilUpdateEvent event) {
		return false;
	}
}
