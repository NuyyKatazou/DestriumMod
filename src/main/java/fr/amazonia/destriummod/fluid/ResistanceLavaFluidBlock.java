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

    public ResistanceLavaFluidBlock(Supplier<? extends FlowingFluid> supplier, Properties p_i48368_1_) {
        super(supplier, p_i48368_1_);
    }

    public void entityInside(BlockState p_196262_1_, World p_196262_2_, BlockPos p_196262_3_, Entity p_196262_4_) {
        if (p_196262_4_ instanceof PlayerEntity) {
            p_196262_4_.fireImmune();
            ((LivingEntity) p_196262_4_).addEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 20, 0, false, false, false));
            p_196262_4_.setRemainingFireTicks(0);
            p_196262_4_.clearFire();
        }
    }

    @Override
    public void neighborChanged(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        if (this.shouldSpreadLiquid(world, pos, state)) {
            world.getLiquidTicks().scheduleTick(pos, state.getFluidState().getType(), this.getFluid().getTickDelay(world));
        }
    }

    private boolean shouldSpreadLiquid(World p_204515_1_, BlockPos p_204515_2_, BlockState p_204515_3_) {
        if (this.getFluid().is(FluidTags.LAVA)) {
            boolean flag = p_204515_1_.getBlockState(p_204515_2_.below()).is(Blocks.SOUL_SOIL);

            for (Direction direction : Direction.values()) {
                if (direction != Direction.DOWN) {
                    BlockPos blockpos = p_204515_2_.relative(direction);
                    if (p_204515_1_.getFluidState(blockpos).is(FluidTags.WATER)) {
                        Block block = p_204515_1_.getFluidState(p_204515_2_).isSource() ? Blocks.OBSIDIAN : ModBlocks.COBBLESTONE_COMPRESSED1.get();
                        p_204515_1_.setBlockAndUpdate(p_204515_2_, net.minecraftforge.event.ForgeEventFactory.fireFluidPlaceBlockEvent(p_204515_1_, p_204515_2_, p_204515_2_, block.defaultBlockState()));
                        this.fizz(p_204515_1_, p_204515_2_);
                        return false;
                    }

                    if (flag && p_204515_1_.getBlockState(blockpos).is(Blocks.BLUE_ICE)) {
                        p_204515_1_.setBlockAndUpdate(p_204515_2_, net.minecraftforge.event.ForgeEventFactory.fireFluidPlaceBlockEvent(p_204515_1_, p_204515_2_, p_204515_2_, Blocks.BASALT.defaultBlockState()));
                        this.fizz(p_204515_1_, p_204515_2_);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private void fizz(IWorld p_180688_1_, BlockPos p_180688_2_) {
        p_180688_1_.levelEvent(1501, p_180688_2_, 0);
    }
}