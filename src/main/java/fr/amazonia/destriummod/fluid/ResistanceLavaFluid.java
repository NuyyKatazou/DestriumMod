package fr.amazonia.destriummod.fluid;

import java.util.Random;

import fr.amazonia.destriummod.init.ModFluids;
import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.StateContainer;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public abstract class ResistanceLavaFluid extends ForgeFlowingFluid {

	protected ResistanceLavaFluid(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
	}

	@Override
    public Fluid getFlowing() {
        return ModFluids.RESISTANCE_LAVA_FLOWING.get();
    }

    @Override
    public Fluid getSource() {
        return ModFluids.RESISTANCE_LAVA_FLUID.get();
    }

    @Override
    public Item getBucket() {
        return ModItems.RESISTANCE_LAVA_BUCKET.get();
    }
    
    @SuppressWarnings("deprecation")
	@OnlyIn(Dist.CLIENT)
    public void animateTick(World p_204522_1_, BlockPos p_204522_2_, FluidState p_204522_3_, Random p_204522_4_) {
       BlockPos blockpos = p_204522_2_.above();
       if (p_204522_1_.getBlockState(blockpos).isAir() && !p_204522_1_.getBlockState(blockpos).isSolidRender(p_204522_1_, blockpos)) {
          if (p_204522_4_.nextInt(100) == 0) {
             double d0 = (double)p_204522_2_.getX() + p_204522_4_.nextDouble();
             double d1 = (double)p_204522_2_.getY() + 1.0D;
             double d2 = (double)p_204522_2_.getZ() + p_204522_4_.nextDouble();
             p_204522_1_.addParticle(ParticleTypes.LAVA, d0, d1, d2, 0.0D, 0.0D, 0.0D);
             p_204522_1_.playLocalSound(d0, d1, d2, SoundEvents.LAVA_POP, SoundCategory.BLOCKS, 0.2F + p_204522_4_.nextFloat() * 0.2F, 0.9F + p_204522_4_.nextFloat() * 0.15F, false);
          }

          if (p_204522_4_.nextInt(200) == 0) {
             p_204522_1_.playLocalSound((double)p_204522_2_.getX(), (double)p_204522_2_.getY(), (double)p_204522_2_.getZ(), SoundEvents.LAVA_AMBIENT, SoundCategory.BLOCKS, 0.2F + p_204522_4_.nextFloat() * 0.2F, 0.9F + p_204522_4_.nextFloat() * 0.15F, false);
          }
       }

    }
    @Override
    public IParticleData getDripParticle() {
        return ParticleTypes.DRIPPING_LAVA;
    }
    @Override
    protected boolean isRandomlyTicking() {
        return true;
     }
    @Override
    public int getTickDelay(IWorldReader p_205569_1_) {
        return p_205569_1_.dimensionType().ultraWarm() ? 10 : 30;
     }

    @Override
    protected float getExplosionResistance() {
        return 100.0F;
    }
    @Override
    protected void beforeDestroyingBlock(IWorld p_205580_1_, BlockPos p_205580_2_, BlockState p_205580_3_) {
        this.fizz(p_205580_1_, p_205580_2_);
     }
    @Override
    public int getSlopeFindDistance(IWorldReader p_185698_1_) {
        return p_185698_1_.dimensionType().ultraWarm() ? 4 : 2;
     }

    @Override
    public int getDropOff(IWorldReader p_204528_1_) {
        return p_204528_1_.dimensionType().ultraWarm() ? 1 : 2;
     }

    @Override
    public boolean canBeReplacedWith(FluidState p_215665_1_, IBlockReader p_215665_2_, BlockPos p_215665_3_, Fluid p_215665_4_, Direction p_215665_5_) {
        return p_215665_1_.getHeight(p_215665_2_, p_215665_3_) >= 0.44444445F && p_215665_4_.is(FluidTags.WATER);
     }
    @Override
    public BlockState createLegacyBlock(FluidState state) {
        return ModFluids.RESISTANCE_LAVA_BLOCK.get().defaultBlockState().setValue(FlowingFluidBlock.LEVEL, Integer.valueOf(getLegacyLevel(state)));
    }
    
    private void fizz(IWorld p_205581_1_, BlockPos p_205581_2_) {
        p_205581_1_.levelEvent(1501, p_205581_2_, 0);
     }
    public int getSpreadDelay(World p_215667_1_, BlockPos p_215667_2_, FluidState p_215667_3_, FluidState p_215667_4_) {
        int i = this.getTickDelay(p_215667_1_);
        if (!p_215667_3_.isEmpty() && !p_215667_4_.isEmpty() && !p_215667_3_.getValue(FALLING) && !p_215667_4_.getValue(FALLING) && p_215667_4_.getHeight(p_215667_1_, p_215667_2_) > p_215667_3_.getHeight(p_215667_1_, p_215667_2_) && p_215667_1_.getRandom().nextInt(4) != 0) {
           i *= 4;
        }

        return i;
     }
    protected boolean canConvertToSource() {
        return false;
     }
    protected void spreadTo(IWorld p_205574_1_, BlockPos p_205574_2_, BlockState p_205574_3_, Direction p_205574_4_, FluidState p_205574_5_) {
        if (p_205574_4_ == Direction.DOWN) {
           FluidState fluidstate = p_205574_1_.getFluidState(p_205574_2_);
           if (this.is(FluidTags.LAVA) && fluidstate.is(FluidTags.WATER)) {
              if (p_205574_3_.getBlock() instanceof FlowingFluidBlock) {
                 p_205574_1_.setBlock(p_205574_2_, Blocks.STONE.defaultBlockState(), 3);
              }

              this.fizz(p_205574_1_, p_205574_2_);
              return;
           }
        }

        super.spreadTo(p_205574_1_, p_205574_2_, p_205574_3_, p_205574_4_, p_205574_5_);
     }
    
    public static class Flowing extends ResistanceLavaFluid {
    	
        public Flowing(Properties properties) {
            super(properties);
            registerDefaultState(getStateDefinition().any().setValue(LEVEL, 7));
        }
        @Override
        protected void createFluidStateDefinition(StateContainer.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getAmount(FluidState state) {
            return state.getValue(LEVEL);
        }

        @Override
        public boolean isSource(FluidState state) {
            return false;
        }

    }
    public static class Source extends ResistanceLavaFluid {

        public Source(Properties properties) {
            super(properties);
            registerDefaultState(getStateDefinition().any().setValue(LEVEL, 7));
        }
        @Override
        protected void createFluidStateDefinition(StateContainer.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getAmount(FluidState state) {
            return 8;
        }

        @Override
        public boolean isSource(FluidState state) {
            return true;
        }

        @Override
        protected boolean canConvertToSource() {
            return false;
        }
    }
}
