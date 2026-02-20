package fr.amazonia.destriummod.block.plants;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class DestriumPlants extends CropsBlock {

    public DestriumPlants(AbstractBlock.Properties properties) {
        super(properties);
    }

    protected IItemProvider getBaseSeedId() {
        return ModItems.DESTRIUM_SEEDS.get();
    }

    public boolean isValidBonemealTarget(IBlockReader pLevel, BlockPos pPos, BlockState pState, boolean pIsClient) {
        return false;
    }
}