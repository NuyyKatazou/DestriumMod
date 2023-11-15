package fr.amazonia.destriummod.block;

import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class ModOreBlock extends OreBlock {
    public ModOreBlock(AbstractBlock.Properties p_i48357_1_) {
        super(p_i48357_1_);
    }

    protected int xpOnDrop(Random p_220281_1_) {
        if (this == ModBlocks.RANDOM_ORE.get()) {
            return MathHelper.nextInt(p_220281_1_, 1, 5);
        } else if (this == ModBlocks.REPAIR_ORE.get()) {
            return MathHelper.nextInt(p_220281_1_, 0, 2);
        } else {
            return this == ModBlocks.AMAZONITE_RELIQUE_BLOCK.get() ? MathHelper.nextInt(p_220281_1_, 5, 15) : 0;
        }
    }

    public void spawnAfterBreak(BlockState p_220062_1_, ServerWorld p_220062_2_, BlockPos p_220062_3_, ItemStack p_220062_4_) {
        super.spawnAfterBreak(p_220062_1_, p_220062_2_, p_220062_3_, p_220062_4_);
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.xpOnDrop(RANDOM) : 0;
    }
}
