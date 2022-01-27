package fr.amazonia.destriummod.item.food;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class AmazoniteApple extends Item{

	public AmazoniteApple(Properties properties) {
		super(properties);
	}
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack p_42988_, @Nullable Level p_42989_, List<Component> p_42990_, TooltipFlag p_42991_) {
		p_42990_.add(new TranslatableComponent(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.RED));
		p_42990_.add(new TranslatableComponent(this.getDescriptionId() + ".desc2").withStyle(ChatFormatting.DARK_RED));
		p_42990_.add(new TranslatableComponent(this.getDescriptionId() + ".desc3").withStyle(ChatFormatting.GRAY));
		p_42990_.add(new TranslatableComponent(this.getDescriptionId() + ".desc4").withStyle(ChatFormatting.LIGHT_PURPLE));
		p_42990_.add(new TranslatableComponent(this.getDescriptionId() + ".desc5").withStyle(ChatFormatting.DARK_PURPLE));
		p_42990_.add(new TranslatableComponent(this.getDescriptionId() + ".desc6").withStyle(ChatFormatting.YELLOW));
	   }
}
