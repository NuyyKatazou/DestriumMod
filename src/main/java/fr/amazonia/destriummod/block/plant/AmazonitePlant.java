package fr.amazonia.destriummod.block.plant;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;

public class AmazonitePlant extends CropBlock {

    public AmazonitePlant(Properties pProperties) {
        super(pProperties);
    }

    protected ItemLike getBaseSeedId() {
        return ModItems.AMAZONITE_SEEDS.get();
    }

    public boolean isValidBonemealTarget(LevelReader pLevel, BlockPos pPos, BlockState pState) {
        return false;
    }
}