package fr.amazonia.destriummod.item.stick;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ArgonideStick extends Item {

	public ArgonideStick(Properties p_i48487_1_) {
		super(p_i48487_1_);
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack p_42988_, @Nullable Level p_42989_, List<Component> p_42990_, TooltipFlag p_42991_) {
		p_42990_.add(new TranslatableComponent(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.YELLOW));
	}
}