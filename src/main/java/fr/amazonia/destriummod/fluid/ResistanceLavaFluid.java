package fr.amazonia.destriummod.fluid;

import fr.amazonia.destriummod.init.ModFluids;
import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateContainer;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraftforge.fluids.ForgeFlowingFluid;

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

    @Override
    protected float getExplosionResistance() {
        return 100.0F;
    }

    @Override
    public boolean canBeReplacedWith(FluidState p_215665_1_, IBlockReader p_215665_2_, BlockPos p_215665_3_, Fluid p_215665_4_, Direction p_215665_5_) {
        return p_215665_1_.getHeight(p_215665_2_, p_215665_3_) >= 0.44444445F && p_215665_4_.is(FluidTags.WATER);
    }
    
    @Override
    public BlockState createLegacyBlock(FluidState state) {
        return ModFluids.RESISTANCE_LAVA_BLOCK.get().defaultBlockState().setValue(FlowingFluidBlock.LEVEL, getLegacyLevel(state));
    }

    private void fizz(IWorld p_205581_1_, BlockPos p_205581_2_) {
        p_205581_1_.levelEvent(1501, p_205581_2_, 0);
     }
    
    protected boolean canConvertToSource() {
        return false;
     }
    
    protected void spreadTo(IWorld p_205574_1_, BlockPos p_205574_2_, BlockState p_205574_3_, Direction p_205574_4_, FluidState p_205574_5_) {
        if (p_205574_4_ == Direction.DOWN) {
           FluidState fluidstate = p_205574_1_.getFluidState(p_205574_2_);
           if (this.is(FluidTags.LAVA) && fluidstate.is(FluidTags.WATER)) {
              if (p_205574_3_.getBlock() instanceof FlowingFluidBlock) {
                 p_205574_1_.setBlock(p_205574_2_, Blocks.STONE.defaultBlockState(), 3);
              }
              this.fizz(p_205574_1_, p_205574_2_);
              return;
           }
        }
        super.spreadTo(p_205574_1_, p_205574_2_, p_205574_3_, p_205574_4_, p_205574_5_);
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