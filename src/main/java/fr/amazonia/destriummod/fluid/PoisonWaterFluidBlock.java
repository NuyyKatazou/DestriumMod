package fr.amazonia.destriummod.fluid;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;

import java.util.function.Supplier;

public class PoisonWaterFluidBlock extends LiquidBlock {

    public PoisonWaterFluidBlock(Supplier<? extends FlowingFluid> supplier, Properties properties) {
        super(supplier, properties);
    }

    public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
        if (pEntity instanceof Player) {
            pEntity.hurt(DamageSource.WITHER, 1.5F);
        }
    }

    @Override
    public void neighborChanged(BlockState pState, Level pLevel, BlockPos pPos, Block pBlock, BlockPos fromPos, boolean notify) {
        if (this.shouldSpreadLiquid(pLevel, pPos)) {
            pLevel.scheduleTick(pPos, pState.getFluidState().getType(), this.getFluid().getTickDelay(pLevel));
        }
    }

    private boolean shouldSpreadLiquid(Level pLevel, BlockPos pPos) {
        if (this.getFluid().is(FluidTags.LAVA)) {
            boolean flag = pLevel.getBlockState(pPos.below()).is(Blocks.SOUL_SOIL);

            for (Direction direction : POSSIBLE_FLOW_DIRECTIONS) {
                BlockPos blockpos = pPos.relative(direction.getOpposite());
                if (pLevel.getFluidState(blockpos).is(FluidTags.WATER)) {
                    Block block = pLevel.getFluidState(pPos).isSource() ? Blocks.OBSIDIAN : Blocks.COBBLESTONE;
                    pLevel.setBlockAndUpdate(pPos, net.minecraftforge.event.ForgeEventFactory.fireFluidPlaceBlockEvent(pLevel, pPos, pPos, block.defaultBlockState()));
                    this.fizz(pLevel, pPos);
                    return false;
                }

                if (flag && pLevel.getBlockState(blockpos).is(Blocks.BLUE_ICE)) {
                    pLevel.setBlockAndUpdate(pPos, net.minecraftforge.event.ForgeEventFactory.fireFluidPlaceBlockEvent(pLevel, pPos, pPos, Blocks.BASALT.defaultBlockState()));
                    this.fizz(pLevel, pPos);
                    return false;
                }
            }
        }
        return true;
    }

    private void fizz(LevelAccessor pLevel, BlockPos pPos) {
        pLevel.levelEvent(1501, pPos, 0);
    }
}