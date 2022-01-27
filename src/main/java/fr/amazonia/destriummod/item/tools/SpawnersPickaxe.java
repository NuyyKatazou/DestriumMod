package fr.amazonia.destriummod.item.tools;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SpawnersPickaxe extends PickaxeItem{

	public SpawnersPickaxe(Tier p_i48478_1_, int p_i48478_2_, float p_i48478_3_, Properties p_i48478_4_) {
		super(p_i48478_1_, p_i48478_2_, p_i48478_3_, p_i48478_4_);
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack p_42988_, @Nullable Level p_42989_, List<Component> p_42990_, TooltipFlag p_42991_) {
		p_42990_.add(new TranslatableComponent(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.DARK_AQUA));
		p_42990_.add(new TranslatableComponent(this.getDescriptionId() + ".desc2").withStyle(ChatFormatting.DARK_AQUA));
		p_42990_.add(new TranslatableComponent(this.getDescriptionId() + ".desc3").withStyle(ChatFormatting.DARK_AQUA));
		p_42990_.add(new TranslatableComponent(this.getDescriptionId() + ".desc4").withStyle(ChatFormatting.DARK_AQUA));
	   }

}
