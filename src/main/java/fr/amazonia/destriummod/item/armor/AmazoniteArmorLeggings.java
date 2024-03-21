package fr.amazonia.destriummod.item.armor;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class AmazoniteArmorLeggings extends ArmorItem {

	public AmazoniteArmorLeggings(ArmorMaterial p_40386_, Type p_266831_, Properties p_40388_) {
		super(p_40386_, p_266831_, p_40388_);
	}

	@Override
    public void onArmorTick(ItemStack itemstack, Level world, Player player) {
		if(player.getItemBySlot(EquipmentSlot.LEGS).getItem() == ModItems.AMAZONITE_LEGGINGS.get()) {
			player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 1, false, false, true));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack p_270235_, @Nullable Level p_270688_, List<Component> p_270630_, TooltipFlag p_270170_) {
		p_270630_.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.GOLD));
	}

	@Override
	public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
		return true;
	}
}