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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
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
    
	@OnlyIn(Dist.CLIENT)
    public void animateTick(Level p_76208_, BlockPos p_76209_, FluidState p_76210_, Random p_76211_) {
        BlockPos blockpos = p_76209_.above();
        if (p_76208_.getBlockState(blockpos).isAir() && !p_76208_.getBlockState(blockpos).isSolidRender(p_76208_, blockpos)) {
           if (p_76211_.nextInt(100) == 0) {
              double d0 = (double)p_76209_.getX() + p_76211_.nextDouble();
              double d1 = (double)p_76209_.getY() + 1.0D;
              double d2 = (double)p_76209_.getZ() + p_76211_.nextDouble();
              p_76208_.addParticle(ParticleTypes.LAVA, d0, d1, d2, 0.0D, 0.0D, 0.0D);
              p_76208_.playLocalSound(d0, d1, d2, SoundEvents.LAVA_POP, SoundSource.BLOCKS, 0.2F + p_76211_.nextFloat() * 0.2F, 0.9F + p_76211_.nextFloat() * 0.15F, false);
           }

           if (p_76211_.nextInt(200) == 0) {
              p_76208_.playLocalSound((double)p_76209_.getX(), (double)p_76209_.getY(), (double)p_76209_.getZ(), SoundEvents.LAVA_AMBIENT, SoundSource.BLOCKS, 0.2F + p_76211_.nextFloat() * 0.2F, 0.9F + p_76211_.nextFloat() * 0.15F, false);
           }
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
    public int getTickDelay(LevelReader p_205569_1_) {
        return p_205569_1_.dimensionType().ultraWarm() ? 10 : 30;
     }

    @Override
    protected float getExplosionResistance() {
        return 100.0F;
    }
    @Override
    protected void beforeDestroyingBlock(LevelAccessor p_76216_, BlockPos p_76217_, BlockState p_76218_) {
        this.fizz(p_76216_, p_76217_);
     }
    @Override
    public int getSlopeFindDistance(LevelReader p_185698_1_) {
        return p_185698_1_.dimensionType().ultraWarm() ? 4 : 2;
     }

    @Override
    public int getDropOff(LevelReader p_204528_1_) {
        return p_204528_1_.dimensionType().ultraWarm() ? 1 : 2;
     }

    @Override
    public boolean canBeReplacedWith(FluidState p_76233_, BlockGetter p_76234_, BlockPos p_76235_, Fluid p_76236_, Direction p_76237_) {
        return p_76233_.getHeight(p_76234_, p_76235_) >= 0.44444445F && p_76236_.is(FluidTags.WATER);
     }
    @Override
    public BlockState createLegacyBlock(FluidState state) {
        return ModFluids.RESISTANCE_LAVA_BLOCK.get().defaultBlockState().setValue(LiquidBlock.LEVEL, Integer.valueOf(getLegacyLevel(state)));
    }
    
    private void fizz(LevelAccessor p_76213_, BlockPos p_76214_) {
        p_76213_.levelEvent(1501, p_76214_, 0);
     }
    public int getSpreadDelay(Level p_215667_1_, BlockPos p_215667_2_, FluidState p_215667_3_, FluidState p_215667_4_) {
        int i = this.getTickDelay(p_215667_1_);
        if (!p_215667_3_.isEmpty() && !p_215667_4_.isEmpty() && !p_215667_3_.getValue(FALLING) && !p_215667_4_.getValue(FALLING) && p_215667_4_.getHeight(p_215667_1_, p_215667_2_) > p_215667_3_.getHeight(p_215667_1_, p_215667_2_) && p_215667_1_.getRandom().nextInt(4) != 0) {
           i *= 4;
        }

        return i;
     }
    protected boolean canConvertToSource() {
        return false;
     }
    protected void spreadTo(LevelAccessor p_76220_, BlockPos p_76221_, BlockState p_76222_, Direction p_76223_, FluidState p_76224_) {
        if (p_76223_ == Direction.DOWN) {
           FluidState fluidstate = p_76220_.getFluidState(p_76221_);
           if (this.is(FluidTags.LAVA) && fluidstate.is(FluidTags.WATER)) {
              if (p_76222_.getBlock() instanceof LiquidBlock) {
                 p_76220_.setBlock(p_76221_, net.minecraftforge.event.ForgeEventFactory.fireFluidPlaceBlockEvent(p_76220_, p_76221_, p_76221_, Blocks.STONE.defaultBlockState()), 3);
              }

              this.fizz(p_76220_, p_76221_);
              return;
           }
        }

        super.spreadTo(p_76220_, p_76221_, p_76222_, p_76223_, p_76224_);
     }
    
    public static class Flowing extends ResistanceLavaFluid {
    	
        public Flowing(Properties properties) {
            super(properties);
            registerDefaultState(getStateDefinition().any().setValue(LEVEL, 7));
        }
        @Override
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

    }
    public static class Source extends ResistanceLavaFluid {

        public Source(Properties properties) {
            super(properties);
            registerDefaultState(getStateDefinition().any().setValue(LEVEL, 7));
        }
        @Override
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
