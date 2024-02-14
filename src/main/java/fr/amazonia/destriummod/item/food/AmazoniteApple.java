package fr.amazonia.destriummod.item.food;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class AmazoniteApple extends Item {

	public AmazoniteApple(Properties properties) {
		super(properties);
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> p_77624_3_, ITooltipFlag p_77624_4_) {
		p_77624_3_.add(new TranslationTextComponent(this.getDescriptionId() + ".desc").withStyle(TextFormatting.RED));
		p_77624_3_.add(new TranslationTextComponent(this.getDescriptionId() + ".desc2").withStyle(TextFormatting.DARK_RED));
		p_77624_3_.add(new TranslationTextComponent(this.getDescriptionId() + ".desc3").withStyle(TextFormatting.GRAY));
		p_77624_3_.add(new TranslationTextComponent(this.getDescriptionId() + ".desc4").withStyle(TextFormatting.LIGHT_PURPLE));
		p_77624_3_.add(new TranslationTextComponent(this.getDescriptionId() + ".desc5").withStyle(TextFormatting.DARK_PURPLE));
		p_77624_3_.add(new TranslationTextComponent(this.getDescriptionId() + ".desc6").withStyle(TextFormatting.YELLOW));
	}
}