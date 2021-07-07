package fr.amazonia.destriummod.block.Plants;


import java.util.Random;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class AmazonitePlants extends CropsBlock {
	private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D)};

	   public AmazonitePlants(AbstractBlock.Properties properties) {
	      super(properties);
	   }
	  

	   protected IItemProvider getBaseSeedId() {
	      return ModItems.AMAZONITE_SEEDS.get();
	   }
	   
	   
	   public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
	         return SHAPE_BY_AGE[p_220053_1_.getValue(this.getAgeProperty())];
	      }
	   
	   public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
		      return 1;
		   }
	   
	   public boolean isFullCube() {
		   return false;
	   }
	   
	   public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
		      return false;
		   }
	}
