package fr.amazonia.destriummod.item.ingot;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

public class ArgonideIngot extends Item {

    public ArgonideIngot(Properties pProperties) {
        super(pProperties);
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(style -> style.withColor(TextColor.fromRgb(0x0066FF))));
        pTooltip.add(Component.translatable(this.getDescriptionId() + ".desc2").withStyle(style -> style.withColor(TextColor.fromRgb(0x29F500))));
        pTooltip.add(Component.translatable(this.getDescriptionId() + ".desc3").withStyle(style -> style.withColor(TextColor.fromRgb(0xFF7300))).withStyle(ChatFormatting.BOLD));
    }
}