package fr.amazonia.destriummod.item.food;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DestriumApple extends Item  {

    public DestriumApple(FabricItemSettings fireproof) {
        super(fireproof);
    }

    @Environment(value= EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText(this.getTranslationKey() + ".desc").formatted(Formatting.RED));
        tooltip.add(new TranslatableText(this.getTranslationKey() + ".desc2").formatted(Formatting.DARK_RED));
        tooltip.add(new TranslatableText(this.getTranslationKey() + ".desc3").formatted(Formatting.GRAY));
        tooltip.add(new TranslatableText(this.getTranslationKey() + ".desc4").formatted(Formatting.LIGHT_PURPLE));
        tooltip.add(new TranslatableText(this.getTranslationKey() + ".desc5").formatted(Formatting.DARK_PURPLE));
        tooltip.add(new TranslatableText(this.getTranslationKey() + ".desc6").formatted(Formatting.YELLOW));
    }
}
