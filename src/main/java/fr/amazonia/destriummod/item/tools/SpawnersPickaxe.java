package fr.amazonia.destriummod.item.tools;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class SpawnersPickaxe extends PickaxeItem {

	public SpawnersPickaxe(Tier p_i48478_1_, int p_i48478_2_, float p_i48478_3_, Properties p_i48478_4_) {
		super(p_i48478_1_, p_i48478_2_, p_i48478_3_, p_i48478_4_);
	}

	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack p_270235_, @Nullable Level p_270688_, List<Component> p_270630_, TooltipFlag p_270170_) {
		p_270630_.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.DARK_AQUA));
		p_270630_.add(Component.translatable(this.getDescriptionId() + ".desc2").withStyle(ChatFormatting.DARK_AQUA));
		p_270630_.add(Component.translatable(this.getDescriptionId() + ".desc3").withStyle(ChatFormatting.DARK_AQUA));
		p_270630_.add(Component.translatable(this.getDescriptionId() + ".desc4").withStyle(ChatFormatting.DARK_AQUA));
	}
}