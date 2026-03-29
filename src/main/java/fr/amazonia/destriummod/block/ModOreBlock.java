package fr.amazonia.destriummod.block;

import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ModOreBlock extends OreBlock {

    public ModOreBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getExpDrop(BlockState state, LevelReader level, BlockPos pos, int fortuneLevel, int silkTouchLevel) {
        if (silkTouchLevel == 0) {
            if (this == ModBlocks.RANDOM_ORE.get()) {
                return RANDOM.nextInt(1, 5);
            } else if (this == ModBlocks.REPAIR_ORE.get()) {
                return RANDOM.nextInt(0, 2);
            }
        }
        return this == ModBlocks.AMAZONITE_RELIQUE_BLOCK.get() ? RANDOM.nextInt(5, 15) : 0;
    }
}