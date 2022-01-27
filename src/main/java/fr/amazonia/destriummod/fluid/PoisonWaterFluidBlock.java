package fr.amazonia.destriummod.fluid;

import java.util.function.Supplier;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;

public class PoisonWaterFluidBlock extends LiquidBlock {
	public PoisonWaterFluidBlock(Supplier<? extends FlowingFluid> supplier, Properties p_i48368_1_) {
		super(supplier, p_i48368_1_);
	}

	public void entityInside(BlockState p_196262_1_, Level p_196262_2_, BlockPos p_196262_3_, Entity p_196262_4_, Player p_77659_2_) {
		if (p_77659_2_ != null)  
	      p_196262_4_.hurt(DamageSource.WITHER, 1F);
	      ((LivingEntity) p_196262_4_).addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 2, false, false, false));
	     }
	

	@Override
	public void neighborChanged(BlockState p_54709_, Level p_54710_, BlockPos p_54711_, Block p_54712_, BlockPos p_54713_, boolean p_54714_) {
	      if (this.shouldSpreadLiquid(p_54710_, p_54711_, p_54709_)) {
	         p_54710_.scheduleTick(p_54711_, p_54709_.getFluidState().getType(), this.getFluid().getTickDelay(p_54710_));
	      }

	   }
	
	private boolean shouldSpreadLiquid(Level p_54697_, BlockPos p_54698_, BlockState p_54699_) {
	      if (this.getFluid().is(FluidTags.LAVA)) {
	         boolean flag = p_54697_.getBlockState(p_54698_.below()).is(Blocks.SOUL_SOIL);

	         for(Direction direction : POSSIBLE_FLOW_DIRECTIONS) {
	            BlockPos blockpos = p_54698_.relative(direction.getOpposite());
	            if (p_54697_.getFluidState(blockpos).is(FluidTags.WATER)) {
	               Block block = p_54697_.getFluidState(p_54698_).isSource() ? Blocks.OBSIDIAN : Blocks.COBBLESTONE;
	               p_54697_.setBlockAndUpdate(p_54698_, net.minecraftforge.event.ForgeEventFactory.fireFluidPlaceBlockEvent(p_54697_, p_54698_, p_54698_, block.defaultBlockState()));
	               this.fizz(p_54697_, p_54698_);
	               return false;
	            }

	            if (flag && p_54697_.getBlockState(blockpos).is(Blocks.BLUE_ICE)) {
	               p_54697_.setBlockAndUpdate(p_54698_, net.minecraftforge.event.ForgeEventFactory.fireFluidPlaceBlockEvent(p_54697_, p_54698_, p_54698_, Blocks.BASALT.defaultBlockState()));
	               this.fizz(p_54697_, p_54698_);
	               return false;
	            }
	         }
	      }

	      return true;
	   }
	private void fizz(LevelAccessor p_54701_, BlockPos p_54702_) {
	      p_54701_.levelEvent(1501, p_54702_, 0);
	   }
}
