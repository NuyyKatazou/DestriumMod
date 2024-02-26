package fr.amazonia.destriummod.block.plants;

import java.util.Random;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DestriumPlants extends CropsBlock {

	public DestriumPlants(AbstractBlock.Properties properties) {
	      super(properties);
	   }

	protected IItemProvider getBaseSeedId() {
	      return ModItems.DESTRIUM_SEEDS.get();
	   }

	public boolean isBonemealSuccess(World p_180670_1_, Random p_180670_2_, BlockPos p_180670_3_, BlockState p_180670_4_) {
		return false;
	}
}