package fr.amazonia.destriummod.utils;

import java.util.function.Function;

import fr.amazonia.destriummod.block.OverworldPortalBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.util.ITeleporter;

public class OverworldTeleporter implements ITeleporter {

    public static int f = 0;

    public static BlockPos thisPos = BlockPos.ZERO;
    public static boolean thisIsToOverworldDim = true;

    public OverworldTeleporter(BlockPos pos, boolean isToOverworldDim) {
        thisPos = pos;
        thisIsToOverworldDim = isToOverworldDim;
    }

    @Override
    public Entity placeEntity(Entity entity, ServerWorld currentWorld, ServerWorld destWorld, float yaw, Function<Boolean, Entity> repositionEntity) {
        entity = repositionEntity.apply(false);
        double y = 61;
        if (!thisIsToOverworldDim) {
            y = thisPos.getY();
        }
        BlockPos destinationPos = new BlockPos(thisPos.getX(), y, thisPos.getZ());
        int tries = 0;
        while ((destWorld.getBlockState(destinationPos).getMaterial() != Material.AIR && !destWorld.getBlockState(destinationPos).canBeReplaced(Fluids.WATER)) &&
                (destWorld.getBlockState(destinationPos.above()).getMaterial() != Material.AIR && !destWorld.getBlockState(destinationPos.above()).canBeReplaced(Fluids.WATER)) &&
                tries < 25) {
        	destinationPos = destinationPos.above(2);
            tries++;
        }
        if (!(entity instanceof ServerPlayerEntity)) {
            return entity;
        }
        ServerPlayerEntity player = (ServerPlayerEntity) entity;
        if (destWorld.dimension().equals(World.OVERWORLD)) {
  
        }
        player.teleportTo(destinationPos.getX() + 0.5D, destinationPos.getY() + 1D, destinationPos.getZ() + 0.5D);
        if (thisIsToOverworldDim) {
            boolean doSetBlock = true;
            for (BlockPos checkPos : BlockPos.betweenClosed(destinationPos.below(10).west(10), destinationPos.above(10).east(10))) {
                if (destWorld.getBlockState(checkPos).getBlock() instanceof OverworldPortalBlocks) {
                    doSetBlock = false;
                    break;
                }
            }
            if (doSetBlock) {
                destWorld.setBlock(destinationPos, Blocks.GRASS.defaultBlockState(), 10);
                destWorld.setBlock(destinationPos.above(1), Blocks.AIR.defaultBlockState(), 10);
                destWorld.setBlock(destinationPos.above(2), Blocks.AIR.defaultBlockState(), 10);
                f = 1;
            }
        }
        return entity;
    }
}