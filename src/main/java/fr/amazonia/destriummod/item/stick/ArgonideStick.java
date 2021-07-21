package fr.amazonia.destriummod.item.stick;

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

public class ArgonideStick extends Item{

	public ArgonideStick(Properties p_i48487_1_) {
		super(p_i48487_1_);
	}
	@OnlyIn(Dist.CLIENT)
	   public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> p_77624_3_, ITooltipFlag p_77624_4_) {
	      p_77624_3_.add(new TranslationTextComponent(this.getDescriptionId() + ".desc").withStyle(TextFormatting.GOLD));
	   }
}
