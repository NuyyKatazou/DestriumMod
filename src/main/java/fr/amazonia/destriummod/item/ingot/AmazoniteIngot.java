package fr.amazonia.destriummod.item.ingot;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AmazoniteIngot extends Item {

    public AmazoniteIngot(FabricItemSettings fireproof) {
        super(fireproof);
    }

    @Environment(value= EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText(this.getTranslationKey() + ".desc").formatted(Formatting.DARK_BLUE).formatted(Formatting.BOLD));
        tooltip.add(new TranslatableText(this.getTranslationKey() + ".desc2").formatted(Formatting.DARK_GREEN));
        tooltip.add(new TranslatableText(this.getTranslationKey() + ".desc3").formatted(Formatting.GOLD));
    }
}
