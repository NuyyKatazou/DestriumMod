package fr.amazonia.destriummod.item.armor;

/*import java.util.List;

import javax.annotation.Nullable;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DestriumArmorLeggings extends ArmorItem {
	
	public DestriumArmorLeggings(IArmorMaterial materialIn, EquipmentSlotType slot, Properties properties) {
		super(materialIn, slot, properties);
	}
	@Override
    public void onArmorTick(ItemStack itemstack, World world, PlayerEntity player) {
		if(player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == ModItems.DESTRIUM_LEGGINGS.get()) {
			player.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 300, 0, false, false, true));
		}
}
	@OnlyIn(Dist.CLIENT)
	   public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
	      tooltip.add(new TranslationTextComponent(this.getTranslationKey() + ".desc").mergeStyle(TextFormatting.GOLD));
	   }
}*/
