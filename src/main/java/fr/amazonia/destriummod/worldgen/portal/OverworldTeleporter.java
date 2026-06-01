package fr.amazonia.destriummod.worldgen.portal;

import fr.amazonia.destriummod.block.OverworldPortalBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.util.ITeleporter;

import java.util.function.Function;

public class OverworldTeleporter implements ITeleporter {

    public static int f = 0;

    public static BlockPos thisPos = BlockPos.ZERO;
    public static boolean thisIsToOverworldDim = true;

    public OverworldTeleporter(BlockPos pos, boolean insideDim) {
        thisPos = pos;
        thisIsToOverworldDim = insideDim;
    }

    @Override
    public Entity placeEntity(Entity entity, ServerLevel currentWorld, ServerLevel destinationWorld, float yaw, Function<Boolean, Entity> repositionEntity) {
        entity = repositionEntity.apply(false);
        int y = 61;

        if (!thisIsToOverworldDim) {
            y = thisPos.getY();
        }

        BlockPos destinationPos = new BlockPos(thisPos.getX(), y, thisPos.getZ());

        int tries = 0;
        while ((destinationWorld.getBlockState(destinationPos).getBlock() != Blocks.AIR) &&
                !destinationWorld.getBlockState(destinationPos).canBeReplaced(Fluids.WATER) &&
                (destinationWorld.getBlockState(destinationPos.above()).getBlock() != Blocks.AIR) &&
                !destinationWorld.getBlockState(destinationPos.above()).canBeReplaced(Fluids.WATER) && (tries < 25)) {
            destinationPos = destinationPos.above(2);
            tries++;
        }
        if (!(entity instanceof ServerPlayer player)) {
            return entity;
        }

        player.teleportTo(destinationPos.getX() + 0.5D, destinationPos.getY() + 1D, destinationPos.getZ() + 0.5D);

        if (thisIsToOverworldDim) {
            boolean doSetBlock = true;
            for (BlockPos checkPos : BlockPos.betweenClosed(destinationPos.below(10).west(10), destinationPos.above(10).east(10))) {
                if (destinationWorld.getBlockState(checkPos).getBlock() instanceof OverworldPortalBlocks) {
                    doSetBlock = false;
                    break;
                }
            }
            if (doSetBlock) {
                destinationWorld.setBlock(destinationPos, Blocks.DIRT.defaultBlockState(), 10);
                destinationWorld.setBlock(destinationPos.above(1), Blocks.AIR.defaultBlockState(), 10);
                destinationWorld.setBlock(destinationPos.above(2), Blocks.AIR.defaultBlockState(), 10);
                f = 1;
            }
        }

        return entity;
    }
}