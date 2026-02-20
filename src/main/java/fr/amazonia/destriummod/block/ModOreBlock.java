package fr.amazonia.destriummod.block;

import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class ModOreBlock extends OreBlock {

    public ModOreBlock(AbstractBlock.Properties properties) {
        super(properties);
    }

    protected int xpOnDrop(Random pRandom) {
        if (this == ModBlocks.RANDOM_ORE.get()) {
            return MathHelper.nextInt(pRandom, 1, 5);
        } else if (this == ModBlocks.REPAIR_ORE.get()) {
            return MathHelper.nextInt(pRandom, 0, 2);
        } else {
            return this == ModBlocks.AMAZONITE_RELIQUE_BLOCK.get() ? MathHelper.nextInt(pRandom, 5, 15) : 0;
        }
    }
}