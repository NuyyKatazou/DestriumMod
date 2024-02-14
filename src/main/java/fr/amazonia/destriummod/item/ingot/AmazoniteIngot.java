package fr.amazonia.destriummod.item.ingot;

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

public class AmazoniteIngot extends Item {

	public AmazoniteIngot(Properties properties) {
		super(properties);
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> p_77624_3_, ITooltipFlag p_77624_4_) {
		p_77624_3_.add(new TranslationTextComponent(this.getDescriptionId() + ".desc").withStyle(TextFormatting.DARK_BLUE).withStyle(TextFormatting.BOLD));
		p_77624_3_.add(new TranslationTextComponent(this.getDescriptionId() + ".desc2").withStyle(TextFormatting.DARK_GREEN));
		p_77624_3_.add(new TranslationTextComponent(this.getDescriptionId() + ".desc3").withStyle(TextFormatting.GOLD));
	}
}