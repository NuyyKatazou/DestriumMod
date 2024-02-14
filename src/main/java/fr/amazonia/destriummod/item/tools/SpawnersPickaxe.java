package fr.amazonia.destriummod.item.tools;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SpawnersPickaxe extends PickaxeItem {

	public SpawnersPickaxe(IItemTier p_i48478_1_, int p_i48478_2_, float p_i48478_3_, Properties p_i48478_4_) {
		super(p_i48478_1_, p_i48478_2_, p_i48478_3_, p_i48478_4_);
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> p_77624_3_, ITooltipFlag p_77624_4_) {
		p_77624_3_.add(new TranslationTextComponent(this.getDescriptionId() + ".desc").withStyle(TextFormatting.DARK_AQUA));
		p_77624_3_.add(new TranslationTextComponent(this.getDescriptionId() + ".desc2").withStyle(TextFormatting.DARK_AQUA));
		p_77624_3_.add(new TranslationTextComponent(this.getDescriptionId() + ".desc3").withStyle(TextFormatting.DARK_AQUA));
		p_77624_3_.add(new TranslationTextComponent(this.getDescriptionId() + ".desc4").withStyle(TextFormatting.DARK_AQUA));
	}
}