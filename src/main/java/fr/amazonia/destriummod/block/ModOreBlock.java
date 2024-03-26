package fr.amazonia.destriummod.block;

import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.util.math.MathHelper;

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
}