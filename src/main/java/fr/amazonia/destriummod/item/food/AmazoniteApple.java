package fr.amazonia.destriummod.item.food;

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

public class AmazoniteApple extends Item {

    public AmazoniteApple(Properties properties) {
        super(properties);
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack pStack, @Nullable World pWorld, List<ITextComponent> pTooltip, ITooltipFlag pFlag) {
        pTooltip.add(new TranslationTextComponent(this.getDescriptionId() + ".desc").withStyle(TextFormatting.RED));
        pTooltip.add(new TranslationTextComponent(this.getDescriptionId() + ".desc2").withStyle(TextFormatting.DARK_RED));
        pTooltip.add(new TranslationTextComponent(this.getDescriptionId() + ".desc3").withStyle(TextFormatting.GRAY));
        pTooltip.add(new TranslationTextComponent(this.getDescriptionId() + ".desc4").withStyle(TextFormatting.LIGHT_PURPLE));
        pTooltip.add(new TranslationTextComponent(this.getDescriptionId() + ".desc5").withStyle(TextFormatting.DARK_PURPLE));
        pTooltip.add(new TranslationTextComponent(this.getDescriptionId() + ".desc6").withStyle(TextFormatting.YELLOW));
    }
}