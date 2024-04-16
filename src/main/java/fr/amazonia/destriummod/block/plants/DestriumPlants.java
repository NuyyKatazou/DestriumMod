package fr.amazonia.destriummod.block.plants;

import java.util.Random;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class DestriumPlants extends CropBlock {

	public DestriumPlants(BlockBehaviour.Properties properties) {
	      super(properties);
	   }

	protected ItemLike getBaseSeedId() {
	      return ModItems.DESTRIUM_SEEDS.get();
	   }


	public boolean isBonemealSuccess(Level p_180670_1_, Random p_180670_2_, BlockPos p_180670_3_, BlockState p_180670_4_) {
		return false;
	}
}