package fr.amazonia.destriummod.item.tools;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class SpawnersPickaxe extends PickaxeItem {

    public SpawnersPickaxe(Tier p_42961_, Properties p_42964_) {
        super(p_42961_, p_42964_);
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack pStack, Item.TooltipContext pContext, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.DARK_AQUA));
        pTooltip.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.DARK_AQUA));
        pTooltip.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.DARK_AQUA));
        pTooltip.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.DARK_AQUA));
    }
}