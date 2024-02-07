package fr.amazonia.destriummod.item;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.ItemStack;

public class InfinityWaterBucketItem extends BucketItem {

    public InfinityWaterBucketItem(Fluid fluid, Settings settings) {
        super(fluid, settings);
    }

    protected ItemStack getEmptiedStack(ItemStack stack, PlayerEntity player) {
        if (!player.abilities.creativeMode) {
            return new ItemStack(ModItems.INFINITY_WATER_BUCKET);
        }
        return stack;
    }
}
