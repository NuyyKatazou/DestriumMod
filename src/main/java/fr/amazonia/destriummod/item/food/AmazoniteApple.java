package fr.amazonia.destriummod.item.food;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class AmazoniteApple extends Item {

	public AmazoniteApple(Properties properties) {
		super(properties);
	}

	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack p_270235_, @Nullable Level p_270688_, List<Component> p_270630_, TooltipFlag p_270170_) {
		p_270630_.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.RED));
		p_270630_.add(Component.translatable(this.getDescriptionId() + ".desc2").withStyle(ChatFormatting.DARK_RED));
		p_270630_.add(Component.translatable(this.getDescriptionId() + ".desc3").withStyle(ChatFormatting.GRAY));
		p_270630_.add(Component.translatable(this.getDescriptionId() + ".desc4").withStyle(ChatFormatting.LIGHT_PURPLE));
		p_270630_.add(Component.translatable(this.getDescriptionId() + ".desc5").withStyle(ChatFormatting.DARK_PURPLE));
		p_270630_.add(Component.translatable(this.getDescriptionId() + ".desc6").withStyle(ChatFormatting.YELLOW));
	}
}