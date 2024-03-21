package fr.amazonia.destriummod.item.stick;

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

public class DestriumStick extends Item {

	public DestriumStick(Properties p_i48487_1_) {
		super(p_i48487_1_);
	}

	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack p_270235_, @Nullable Level p_270688_, List<Component> p_270630_, TooltipFlag p_270170_) {
		p_270630_.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.GREEN));
	}
}