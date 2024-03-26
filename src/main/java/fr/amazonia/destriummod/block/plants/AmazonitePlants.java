package fr.amazonia.destriummod.block.plants;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class AmazonitePlants extends CropsBlock {

	public AmazonitePlants(AbstractBlock.Properties properties) {
	      super(properties);
	   }

	protected IItemProvider getBaseSeedId() {
	      return ModItems.AMAZONITE_SEEDS.get();
	   }

	public boolean isValidBonemealTarget(IBlockReader p_176473_1_, BlockPos p_176473_2_, BlockState p_176473_3_, boolean p_176473_4_) {
		return false;
	}
}