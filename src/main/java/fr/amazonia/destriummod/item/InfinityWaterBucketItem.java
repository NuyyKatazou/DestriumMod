package fr.amazonia.destriummod.item;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class InfinityWaterBucketItem extends BucketItem {

    private final java.util.function.Supplier<? extends Fluid> fluidSupplier;

    public InfinityWaterBucketItem(java.util.function.Supplier<? extends Fluid> supplier, Item.Properties builder) {
        super(supplier, builder);
        this.fluidSupplier = supplier;
    }

    protected ItemStack getEmptySuccessItem(ItemStack pBucketStack, PlayerEntity pPlayer) {
        return !pPlayer.abilities.instabuild ? new ItemStack(ModItems.INFINITY_WATER_BUCKET.get()) : pBucketStack;
    }

    public Fluid getFluid() {
        return fluidSupplier.get();
    }
}