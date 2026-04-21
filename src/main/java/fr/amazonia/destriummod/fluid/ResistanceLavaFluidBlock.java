package fr.amazonia.destriummod.fluid;

import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.function.Supplier;

public class ResistanceLavaFluidBlock extends FlowingFluidBlock {

    public ResistanceLavaFluidBlock(Supplier<? extends FlowingFluid> supplier, Properties properties) {
        super(supplier, properties);
    }

    public void entityInside(BlockState pState, World pWorld, BlockPos pPos, Entity pEntity) {
        if (pEntity instanceof PlayerEntity) {
            pEntity.fireImmune();
            ((LivingEntity) pEntity).addEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 20, 0, false, false, false));
            pEntity.setRemainingFireTicks(0);
            pEntity.clearFire();
        }
    }

    @Override
    public void neighborChanged(BlockState pState, World pLevel, BlockPos pPos, Block pBlock, BlockPos pFromPos, boolean pIsMoving) {
        if (this.shouldSpreadLiquid(pLevel, pPos, pState)) {
            pLevel.getLiquidTicks().scheduleTick(pPos, pState.getFluidState().getType(), this.getFluid().getTickDelay(pLevel));
        }
    }

    private boolean shouldSpreadLiquid(World pLevel, BlockPos pPos, BlockState pState) {
        if (this.getFluid().is(FluidTags.LAVA)) {
            boolean flag = pLevel.getBlockState(pPos.below()).is(Blocks.SOUL_SOIL);

            for (Direction direction : Direction.values()) {
                if (direction != Direction.DOWN) {
                    BlockPos blockpos = pPos.relative(direction);
                    if (pLevel.getFluidState(blockpos).is(FluidTags.WATER)) {
                        Block block = pLevel.getFluidState(pPos).isSource() ? Blocks.OBSIDIAN : ModBlocks.COBBLESTONE_COMPRESSED1.get();
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
        }
        return true;
    }

    private void fizz(IWorld pLevel, BlockPos pPos) {
        pLevel.levelEvent(1501, pPos, 0);
    }
}