package fr.amazonia.destriummod.fluid;

import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.function.Supplier;

public class PoisonWaterFluidBlock extends FlowingFluidBlock {

    public PoisonWaterFluidBlock(Supplier<? extends FlowingFluid> supplier, Properties p_i48368_1_) {
        super(supplier, p_i48368_1_);
    }

    public void entityInside(BlockState p_196262_1_, World p_196262_2_, BlockPos p_196262_3_, Entity p_196262_4_) {
        if (p_196262_4_ instanceof PlayerEntity) {
            p_196262_4_.hurt(DamageSource.WITHER, 1.5F);
        }
    }

    @Override
    public void neighborChanged(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        if (this.shouldSpreadLiquid(world, pos, state)) {
            world.getLiquidTicks().scheduleTick(pos, state.getFluidState().getType(), this.getFluid().getTickDelay(world));
        }
    }

    private boolean shouldSpreadLiquid(World pWorld, BlockPos pPos, BlockState pBlockState) {
        if (this.getFluid().is(FluidTags.LAVA)) {
            boolean flag = pWorld.getBlockState(pPos.below()).is(Blocks.SOUL_SOIL);

            for (Direction direction : Direction.values()) {
                if (direction != Direction.DOWN) {
                    BlockPos blockpos = pPos.relative(direction);
                    if (pWorld.getFluidState(blockpos).is(FluidTags.WATER)) {
                        Block block = pWorld.getFluidState(pPos).isSource() ? Blocks.OBSIDIAN : ModBlocks.COBBLESTONE_COMPRESSED1.get();
                        pWorld.setBlockAndUpdate(pPos, net.minecraftforge.event.ForgeEventFactory.fireFluidPlaceBlockEvent(pWorld, pPos, pPos, block.defaultBlockState()));
                        this.fizz(pWorld, pPos);
                        return false;
                    }

                    if (flag && pWorld.getBlockState(blockpos).is(Blocks.BLUE_ICE)) {
                        pWorld.setBlockAndUpdate(pPos, net.minecraftforge.event.ForgeEventFactory.fireFluidPlaceBlockEvent(pWorld, pPos, pPos, Blocks.BASALT.defaultBlockState()));
                        this.fizz(pWorld, pPos);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private void fizz(World world, BlockPos pos) {
        world.levelEvent(1501, pos, 0);
    }
}