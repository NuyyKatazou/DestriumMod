package fr.amazonia.destriummod.item.armor;

import java.util.List;

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

public class AmazoniteArmorHelmet extends ArmorItem {
	
	public AmazoniteArmorHelmet(IArmorMaterial materialIn, EquipmentSlotType slot, Properties properties) {
		super(materialIn, slot, properties);
	}
	@Override
    public void onArmorTick(ItemStack itemstack, World world, PlayerEntity player) {
		if(player.getItemBySlot(EquipmentSlotType.HEAD).getItem() == ModItems.AMAZONITE_HELMET.get()) {
			player.addEffect(new EffectInstance(Effects.INVISIBILITY, 300, 1, false, false, true));
		}
	}
	@OnlyIn(Dist.CLIENT)
	   public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> p_77624_3_, ITooltipFlag p_77624_4_) {
	      p_77624_3_.add(new TranslationTextComponent(this.getDescriptionId() + ".desc").withStyle(TextFormatting.BLUE));
	   }
}