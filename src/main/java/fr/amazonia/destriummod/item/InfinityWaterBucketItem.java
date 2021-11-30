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
	@Deprecated
	   public InfinityWaterBucketItem(Fluid p_i49025_1_, Item.Properties p_i49025_2_) {
	      super(p_i49025_1_, p_i49025_2_);
	      this.content = p_i49025_1_;
	      this.fluidSupplier = p_i49025_1_.delegate;
	   }

	   /**
	    * @param supplier A fluid supplier such as {@link net.minecraftforge.fml.RegistryObject<Fluid>}
	    */
	   public InfinityWaterBucketItem(java.util.function.Supplier<? extends Fluid> supplier, Item.Properties builder) {
	      super(supplier, builder);
	      this.content = null;
	      this.fluidSupplier = supplier;
	   }
	   protected ItemStack getEmptySuccessItem(ItemStack p_203790_1_, PlayerEntity p_203790_2_) {
		      return !p_203790_2_.abilities.instabuild ? new ItemStack(ModItems.INFINITY_WATER_BUCKET.get()) : p_203790_1_;
		   }
	
	public ActionResult<ItemStack> use(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
		ItemStack itemstack = p_77659_2_.getItemInHand(p_77659_3_);
	      RayTraceResult raytraceresult = getPlayerPOVHitResult(p_77659_1_, p_77659_2_, this.content == Fluids.EMPTY ? RayTraceContext.FluidMode.SOURCE_ONLY : RayTraceContext.FluidMode.NONE);
	      ActionResult<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onBucketUse(p_77659_2_, p_77659_1_, itemstack, raytraceresult);
	      if (ret != null) return ret;
	      if (raytraceresult.getType() == RayTraceResult.Type.MISS) {
	         return ActionResult.pass(itemstack);
	      } else if (raytraceresult.getType() != RayTraceResult.Type.BLOCK) {
	         return ActionResult.pass(itemstack);
	      } else {
	         BlockRayTraceResult blockraytraceresult = (BlockRayTraceResult)raytraceresult;
	         BlockPos blockpos = blockraytraceresult.getBlockPos();
	         Direction direction = blockraytraceresult.getDirection();
	         BlockPos blockpos1 = blockpos.relative(direction);
	         if (p_77659_1_.mayInteract(p_77659_2_, blockpos) && p_77659_2_.mayUseItemAt(blockpos1, direction, itemstack)) {
	            if (this.content == Fluids.EMPTY) {
	               BlockState blockstate1 = p_77659_1_.getBlockState(blockpos);
	               if (blockstate1.getBlock() instanceof IBucketPickupHandler) {
	                  Fluid fluid = ((IBucketPickupHandler)blockstate1.getBlock()).takeLiquid(p_77659_1_, blockpos, blockstate1);
	                  if (fluid != Fluids.EMPTY) {
	                     p_77659_2_.awardStat(Stats.ITEM_USED.get(this));

	                     SoundEvent soundevent = this.content.getAttributes().getFillSound();
	                     if (soundevent == null) soundevent = fluid.is(FluidTags.LAVA) ? SoundEvents.BUCKET_FILL_LAVA : SoundEvents.BUCKET_FILL;
	                     p_77659_2_.playSound(soundevent, 1.0F, 1.0F);
	                     ItemStack itemstack1 = DrinkHelper.createFilledResult(itemstack, p_77659_2_, new ItemStack(fluid.getBucket()));
	                     if (!p_77659_1_.isClientSide) {
	                        CriteriaTriggers.FILLED_BUCKET.trigger((ServerPlayerEntity)p_77659_2_, new ItemStack(fluid.getBucket()));
	                     }

	                     return ActionResult.sidedSuccess(itemstack1, p_77659_1_.isClientSide());
	                  }
	               }

	               return ActionResult.fail(itemstack);
	            } else {
	               BlockState blockstate = p_77659_1_.getBlockState(blockpos);
	               BlockPos blockpos2 = canBlockContainFluid(p_77659_1_, blockpos, blockstate) ? blockpos : blockpos1;
	               if (this.emptyBucket(p_77659_2_, p_77659_1_, blockpos2, blockraytraceresult)) {
	                  this.checkExtraContent(p_77659_1_, itemstack, blockpos2);
	                  if (p_77659_2_ instanceof ServerPlayerEntity) {
	                     CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayerEntity)p_77659_2_, blockpos2, itemstack);
	                  }

	                  p_77659_2_.awardStat(Stats.ITEM_USED.get(this));
	                  return ActionResult.sidedSuccess(this.getEmptySuccessItem(itemstack, p_77659_2_), p_77659_1_.isClientSide());
	               } else {
	                  return ActionResult.fail(itemstack);
	               }
	            }
	         } else {
	            return ActionResult.fail(itemstack);
	         }
	      }
	      
	   }
	private final java.util.function.Supplier<? extends Fluid> fluidSupplier;
	public Fluid getFluid() { return fluidSupplier.get(); }

	   private boolean canBlockContainFluid(World worldIn, BlockPos posIn, BlockState blockstate)
	   {
	      return blockstate.getBlock() instanceof ILiquidContainer && ((ILiquidContainer)blockstate.getBlock()).canPlaceLiquid(worldIn, posIn, blockstate, this.content);
	   }
}
