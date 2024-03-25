package fr.amazonia.destriummod.item;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.Fluid;

public class InfinityWaterBucketItem extends BucketItem {

	public InfinityWaterBucketItem(java.util.function.Supplier<? extends Fluid> supplier, Item.Properties builder) {
	   super(supplier, builder);
	   this.fluidSupplier = supplier;
	}

	public static ItemStack getEmptySuccessItem(ItemStack p_40700_, Player p_40701_) {
		return !p_40701_.getAbilities().instabuild ? new ItemStack(ModItems.INFINITY_WATER_BUCKET.get()) : p_40700_;
	}

	private final java.util.function.Supplier<? extends Fluid> fluidSupplier;

	public Fluid getFluid() { return fluidSupplier.get(); }
}