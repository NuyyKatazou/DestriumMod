package fr.amazonia.destriummod.fluid;

import java.util.function.Supplier;

import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingFallEvent;

public class ResistanceLavaFluidBlock extends FlowingFluidBlock {

	public ResistanceLavaFluidBlock(Supplier<? extends FlowingFluid> supplier, Properties p_i48368_1_) {
		super(supplier, p_i48368_1_);
	}

	public void entityInside(BlockState p_196262_1_, World p_196262_2_, BlockPos p_196262_3_, Entity p_196262_4_) {
		  p_196262_4_.hurt(DamageSource.WITHER, 1F);
	      ((LivingEntity) p_196262_4_).addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 1, 2, false, false, false));
	      livingFallEvent(null);
	     }
	
	public static void livingFallEvent(LivingFallEvent event) {

    }

	@Override
    public void neighborChanged(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        if (this.receiveNeighborFluids(world, pos, state)) {
            world.getLiquidTicks().scheduleTick(pos, state.getFluidState().getType(), this.getFluid().getTickDelay(world));
        }
    }
	private boolean receiveNeighborFluids(World world, BlockPos pos, BlockState state) {
        boolean flag = false;

        for (Direction direction : Direction.values()) {
            if (direction != Direction.DOWN && world.getFluidState(pos.relative(direction)).is(FluidTags.WATER)) {
                flag = true;
                break;
            }
        }

        if (flag) {
            FluidState ifluidstate = world.getFluidState(pos);
            if (ifluidstate.isSource()) {
                world.setBlockAndUpdate(pos, Blocks.OBSIDIAN.defaultBlockState());
                this.triggerMixEffects(world, pos);
                return false;
            }

            if (ifluidstate.getHeight(world, pos) >= 0.44444445F) {
                world.setBlockAndUpdate(pos, ModBlocks.COBBLESTONE_COMPRESSED1.get().defaultBlockState());
                this.triggerMixEffects(world, pos);
                return false;
            }
        }

        return true;
    }

	private void triggerMixEffects(World world, BlockPos pos) {
        world.levelEvent(1501, pos, 0);
    }
}
