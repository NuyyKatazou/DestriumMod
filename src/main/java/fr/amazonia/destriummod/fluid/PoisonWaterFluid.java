package fr.amazonia.destriummod.fluid;

import java.util.Random;

import fr.amazonia.destriummod.init.ModFluids;
import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public abstract class PoisonWaterFluid extends ForgeFlowingFluid {

	protected PoisonWaterFluid(Properties properties) {
		super(properties);
	}

	@Override
    public Fluid getFlowing() {
        return ModFluids.POISON_WATER_FLOWING.get();
    }

    @Override
    public Fluid getSource() {
        return ModFluids.POISON_WATER_FLUID.get();
    }

    @Override
    public Item getBucket() {
        return ModItems.POISON_WATER_BUCKET.get();
    }
    
    @Override
    public void animateTick(Level p_76445_, BlockPos p_76446_, FluidState p_76447_, Random p_76448_) {
        if (!p_76447_.isSource() && !p_76447_.getValue(FALLING)) {
           if (p_76448_.nextInt(64) == 0) {
              p_76445_.playLocalSound((double)p_76446_.getX() + 0.5D, (double)p_76446_.getY() + 0.5D, (double)p_76446_.getZ() + 0.5D, SoundEvents.WATER_AMBIENT, SoundSource.BLOCKS, p_76448_.nextFloat() * 0.25F + 0.75F, p_76448_.nextFloat() + 0.5F, false);
           }
        } else if (p_76448_.nextInt(10) == 0) {
           p_76445_.addParticle(ParticleTypes.UNDERWATER, (double)p_76446_.getX() + p_76448_.nextDouble(), (double)p_76446_.getY() + p_76448_.nextDouble(), (double)p_76446_.getZ() + p_76448_.nextDouble(), 0.0D, 0.0D, 0.0D);
        }

     }
    
    @Override
    public ParticleOptions getDripParticle() {
        return ParticleTypes.DRIPPING_WATER;
     }
    
    @Override
    protected boolean isRandomlyTicking() {
        return true;
    }
    
    @Override
    public int getTickDelay(LevelReader p_76454_) {
        return 5;
     }

    @Override
    protected float getExplosionResistance() {
        return 100.0F;
    }
    
	@Override
	protected void beforeDestroyingBlock(LevelAccessor p_76450_, BlockPos p_76451_, BlockState p_76452_) {
	      BlockEntity blockentity = p_76452_.hasBlockEntity() ? p_76450_.getBlockEntity(p_76451_) : null;
	      Block.dropResources(p_76452_, p_76450_, p_76451_, blockentity);
	   }
	
    @Override
    public int getSlopeFindDistance(LevelReader world) {
        return 4;
    }

    @Override
    public int getDropOff(LevelReader world) {
        return 1;
    }

    @SuppressWarnings("deprecation")
	@Override
    public boolean canBeReplacedWith(FluidState p_76458_, BlockGetter p_76459_, BlockPos p_76460_, Fluid p_76461_, Direction p_76462_) {
        return p_76462_ == Direction.DOWN && !p_76461_.is(FluidTags.WATER);
     }
    
    @Override
    public BlockState createLegacyBlock(FluidState state) {
        return ModFluids.POISON_WATER_BLOCK.get().defaultBlockState().setValue(LiquidBlock.LEVEL, getLegacyLevel(state));
    }
    
    public static class Flowing extends PoisonWaterFluid {
        public Flowing(Properties properties) {
            super(properties);
            registerDefaultState(getStateDefinition().any().setValue(LEVEL, 7));
        }

        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> p_76476_) {
            super.createFluidStateDefinition(p_76476_);
            p_76476_.add(LEVEL);
         }

        @Override
        public int getAmount(FluidState state) {
            return state.getValue(LEVEL);
        }

        @Override
        public boolean isSource(FluidState state) {
            return false;
        }

        @Override
        protected boolean canConvertToSource() {
            return true;
        }
    }
    
    public static class Source extends PoisonWaterFluid {

        public Source(Properties properties) {
            super(properties);
            registerDefaultState(getStateDefinition().any().setValue(LEVEL, 7));
        }

        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> p_76476_) {
            super.createFluidStateDefinition(p_76476_);
            p_76476_.add(LEVEL);
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
