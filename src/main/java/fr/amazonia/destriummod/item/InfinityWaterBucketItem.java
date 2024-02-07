package fr.amazonia.destriummod.item;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BlockState;
import net.minecraft.block.IBucketPickupHandler;
import net.minecraft.block.ILiquidContainer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Direction;
import net.minecraft.util.DrinkHelper;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class InfinityWaterBucketItem extends BucketItem {

	private final Fluid content;
	
	public InfinityWaterBucketItem(java.util.function.Supplier<? extends Fluid> supplier, Item.Properties builder) {
		super(supplier, builder);
		this.content = null;
		this.fluidSupplier = supplier;
	   }

	protected ItemStack getEmptySuccessItem(ItemStack p_203790_1_, PlayerEntity p_203790_2_) {
		return !p_203790_2_.abilities.instabuild ? new ItemStack(ModItems.INFINITY_WATER_BUCKET.get()) : p_203790_1_;
		}

	private final java.util.function.Supplier<? extends Fluid> fluidSupplier;
	public Fluid getFluid() { return fluidSupplier.get(); }

	private boolean canBlockContainFluid(World worldIn, BlockPos posIn, BlockState blockstate) {
		return blockstate.getBlock() instanceof ILiquidContainer && ((ILiquidContainer)blockstate.getBlock()).canPlaceLiquid(worldIn, posIn, blockstate, this.content);
	}
}