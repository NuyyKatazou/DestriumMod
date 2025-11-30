package fr.amazonia.destriummod.fluid;

import fr.amazonia.destriummod.init.ModFluids;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.fluids.ForgeFlowingFluid;

import javax.annotation.Nullable;

public abstract class PoisonWaterFluid extends ForgeFlowingFluid {

    protected PoisonWaterFluid(Properties properties) {
        super(properties);
    }

    public void animateTick(Level p_230606_, BlockPos p_230607_, FluidState p_230608_, RandomSource p_230609_) {
        if (!p_230608_.isSource() && !p_230608_.getValue(FALLING)) {
            if (p_230609_.nextInt(64) == 0) {
                p_230606_.playLocalSound((double) p_230607_.getX() + 0.5D, (double) p_230607_.getY() + 0.5D, (double) p_230607_.getZ() + 0.5D, SoundEvents.WATER_AMBIENT, SoundSource.BLOCKS, p_230609_.nextFloat() * 0.25F + 0.75F, p_230609_.nextFloat() + 0.5F, false);
            }
        } else if (p_230609_.nextInt(10) == 0) {
            p_230606_.addParticle(ParticleTypes.UNDERWATER, (double) p_230607_.getX() + p_230609_.nextDouble(), (double) p_230607_.getY() + p_230609_.nextDouble(), (double) p_230607_.getZ() + p_230609_.nextDouble(), 0.0D, 0.0D, 0.0D);
        }

    }

    @Nullable
    public ParticleOptions getDripParticle() {
        return ParticleTypes.DRIPPING_WATER;
    }

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
    }
}