package fr.amazonia.destriummod.item.ingot;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class DestriumIngot extends Item {

    public DestriumIngot(Properties properties) {
        super(properties);
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack pStack, @Nullable World pWorld, List<ITextComponent> pTooltip, ITooltipFlag pFlag) {
        pTooltip.add(new TranslationTextComponent(this.getDescriptionId() + ".desc").withStyle(TextFormatting.DARK_AQUA));
        pTooltip.add(new TranslationTextComponent(this.getDescriptionId() + ".desc2").withStyle(TextFormatting.DARK_GREEN).withStyle(TextFormatting.BOLD));
        pTooltip.add(new TranslationTextComponent(this.getDescriptionId() + ".desc3").withStyle(TextFormatting.GOLD));
    }
}