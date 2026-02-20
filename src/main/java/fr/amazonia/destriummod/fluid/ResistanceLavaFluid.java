package fr.amazonia.destriummod.fluid;

import fr.amazonia.destriummod.init.ModBlocks;
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
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fluids.ForgeFlowingFluid;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class ResistanceLavaFluid extends ForgeFlowingFluid {

    protected ResistanceLavaFluid(Properties properties) {
        super(properties);
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
    public void animateTick(World pWorld, BlockPos pPos, FluidState pState, Random pRandom) {
        BlockPos blockpos = pPos.above();
        if (pWorld.getBlockState(blockpos).isAir() && !pWorld.getBlockState(blockpos).isSolidRender(pWorld, blockpos)) {
            if (pRandom.nextInt(100) == 0) {
                double d0 = (double) pPos.getX() + pRandom.nextDouble();
                double d1 = (double) pPos.getY() + 1.0D;
                double d2 = (double) pPos.getZ() + pRandom.nextDouble();
                pWorld.addParticle(ParticleTypes.LAVA, d0, d1, d2, 0.0D, 0.0D, 0.0D);
                pWorld.playLocalSound(d0, d1, d2, SoundEvents.LAVA_POP, SoundCategory.BLOCKS, 0.2F + pRandom.nextFloat() * 0.2F, 0.9F + pRandom.nextFloat() * 0.15F, false);
            }
            if (pRandom.nextInt(200) == 0) {
                pWorld.playLocalSound(pPos.getX(), pPos.getY(), pPos.getZ(), SoundEvents.LAVA_AMBIENT, SoundCategory.BLOCKS, 0.2F + pRandom.nextFloat() * 0.2F, 0.9F + pRandom.nextFloat() * 0.15F, false);
            }
        }
    }

    @Override
    public BlockState createLegacyBlock(FluidState state) {
        return ModBlocks.RESISTANCE_LAVA_BLOCK.get().defaultBlockState().setValue(FlowingFluidBlock.LEVEL, getLegacyLevel(state));
    }

    @Override
    public boolean canBeReplacedWith(FluidState pFluidState, IBlockReader pBlockReader, BlockPos pPos, Fluid pFluid, Direction pDirection) {
        return pFluidState.getHeight(pBlockReader, pPos) >= 0.44444445F && pFluid.is(FluidTags.WATER);
    }

    @Nullable
    @OnlyIn(Dist.CLIENT)
    public IParticleData getDripParticle() {
        return ParticleTypes.DRIPPING_LAVA;
    }

    private void fizz(IWorld pWorld, BlockPos pPos) {
        pWorld.levelEvent(1501, pPos, 0);
    }

    protected void spreadTo(IWorld pWorld, BlockPos pPos, BlockState pBlockState, Direction pDirection, FluidState pFluidState) {
        if (pDirection == Direction.DOWN) {
            FluidState fluidstate = pWorld.getFluidState(pPos);
            if (this.is(FluidTags.LAVA) && fluidstate.is(FluidTags.WATER)) {
                if (pBlockState.getBlock() instanceof FlowingFluidBlock) {
                    pWorld.setBlock(pPos, net.minecraftforge.event.ForgeEventFactory.fireFluidPlaceBlockEvent(pWorld, pPos, pPos, Blocks.STONE.defaultBlockState()), 3);
                }
                this.fizz(pWorld, pPos);
                return;
            }
        }
        super.spreadTo(pWorld, pPos, pBlockState, pDirection, pFluidState);
    }

    protected boolean canConvertToSource() {
        return false;
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
    }
}