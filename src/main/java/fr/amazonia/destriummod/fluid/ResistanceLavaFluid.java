package fr.amazonia.destriummod.fluid;

import fr.amazonia.destriummod.init.ModFluids;
import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.fluids.ForgeFlowingFluid;

import javax.annotation.Nullable;

public abstract class ResistanceLavaFluid extends ForgeFlowingFluid {

    protected ResistanceLavaFluid(Properties properties) {
        super(properties);
    }

    @Nullable
    public ParticleOptions getDripParticle() {
        return ParticleTypes.DRIPPING_LAVA;
    }

    @Override
    public boolean canBeReplacedWith(FluidState p_76458_, BlockGetter p_76459_, BlockPos p_76460_, Fluid p_76461_, Direction p_76462_) {
        return p_76462_ == Direction.DOWN && !p_76461_.is(FluidTags.WATER);
    }

    @Override
    public BlockState createLegacyBlock(FluidState state) {
        return ModFluids.RESISTANCE_LAVA_BLOCK.get().defaultBlockState().setValue(LiquidBlock.LEVEL, getLegacyLevel(state));
    }

    private void fizz(LevelAccessor p_76213_, BlockPos p_76214_) {
        p_76213_.levelEvent(1501, p_76214_, 0);
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
    }
}