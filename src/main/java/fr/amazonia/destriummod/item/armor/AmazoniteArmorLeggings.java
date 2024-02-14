package fr.amazonia.destriummod.item.armor;

import java.util.List;

import javax.annotation.Nullable;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class AmazoniteArmorLeggings extends ArmorItem {
	
	public AmazoniteArmorLeggings(ArmorMaterial materialIn, EquipmentSlot slot, Item.Properties properties) {
		super(materialIn, slot, properties);
	}
	
	@Override
    public void onArmorTick(ItemStack itemstack, Level world, Player player) {
		if(player.getItemBySlot(EquipmentSlot.LEGS).getItem() == ModItems.AMAZONITE_LEGGINGS.get()) {
			player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 1, false, false, true));
		}
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack p_42988_, @Nullable Level p_42989_, List<Component> p_42990_, TooltipFlag p_42991_) {
		p_42990_.add(new TranslatableComponent(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.GOLD));
	}

	@Override
	public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
		return true;
	}
}