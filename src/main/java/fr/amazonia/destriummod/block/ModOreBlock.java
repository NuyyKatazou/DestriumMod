package fr.amazonia.destriummod.block;

import fr.amazonia.destriummod.init.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.GameRules;

public class ModOreBlock extends Block {

    public ModOreBlock(FabricBlockSettings strength) {
        super(strength);
    }

    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            if (this == ModBlocks.RANDOM_ORE) {
                int i = 1 + world.random.nextInt(4);
                this.dropExperience(world, pos, i);
            } else if (this == ModBlocks.REPAIR_ORE) {
                int i = world.random.nextInt(2);
                this.dropExperience(world, pos, i);
            } else if (this == ModBlocks.AMAZONITE_RELIQUE_BLOCK) {
                int i = 5 + world.random.nextInt(10);
                    this.dropExperience(world, pos, i);
            }
        }
    }
}