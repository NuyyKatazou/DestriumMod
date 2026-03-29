package fr.amazonia.destriummod.item.ingot;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class DestriumIngot extends Item {

    public DestriumIngot(Properties pProperties) {
        super(pProperties);
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(new TranslatableComponent(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.DARK_AQUA));
        pTooltip.add(new TranslatableComponent(this.getDescriptionId() + ".desc2").withStyle(ChatFormatting.DARK_GREEN).withStyle(ChatFormatting.BOLD));
        pTooltip.add(new TranslatableComponent(this.getDescriptionId() + ".desc3").withStyle(ChatFormatting.GOLD));
    }
}