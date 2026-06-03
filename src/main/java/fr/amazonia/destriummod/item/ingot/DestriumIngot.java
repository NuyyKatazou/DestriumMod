package fr.amazonia.destriummod.item.ingot;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

public class DestriumIngot extends Item {

    public DestriumIngot(Properties pProperties) {
        super(pProperties);
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.DARK_AQUA));
        pTooltip.add(Component.translatable(this.getDescriptionId() + ".desc2").withStyle(ChatFormatting.DARK_GREEN).withStyle(ChatFormatting.BOLD));
        pTooltip.add(Component.translatable(this.getDescriptionId() + ".desc3").withStyle(ChatFormatting.GOLD));
    }
}