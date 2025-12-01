package fr.amazonia.destriummod.block.plants;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;

public class AmazonitePlants extends CropBlock {

    public AmazonitePlants(Properties properties) {
        super(properties);
    }

    protected ItemLike getBaseSeedId() {
        return ModItems.AMAZONITE_SEEDS.get();
    }

    public boolean isValidBonemealTarget(LevelReader p_255715_, BlockPos p_52259_, BlockState p_52260_, boolean p_52261_) {
        return false;
    }
}