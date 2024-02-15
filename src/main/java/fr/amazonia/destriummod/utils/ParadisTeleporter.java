package fr.amazonia.destriummod.utils;

import java.util.function.Function;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.block.ParadisPortalBlocks;
import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.util.ITeleporter;

public class ParadisTeleporter implements ITeleporter {

    public static int f = 0;

    public static BlockPos thisPos = BlockPos.ZERO;
    public static boolean thisIsToParadisDim = true;

    public ParadisTeleporter(BlockPos pos, boolean isToParadisDim) {
        thisPos = pos;
        thisIsToParadisDim = isToParadisDim;
    }

    @Override
    public Entity placeEntity(Entity entity, ServerWorld currentWorld, ServerWorld destWorld, float yaw, Function<Boolean, Entity> repositionEntity) {
        entity = repositionEntity.apply(false);
        double y = 61;
        if (!thisIsToParadisDim) {
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
        if (destWorld.dimension().equals(DestriumMod.PARADIS_DIMENSION)) {

        }
        if (!player.inventory.contains(new ItemStack(ModBlocks.OVERWORLD_PORTAL_BLOCK.get()))) {
            if (player.inventory.getFreeSlot() != -1) {
                player.addItem(new ItemStack(ModBlocks.OVERWORLD_PORTAL_BLOCK.get()));
            } else {
                player.drop(new ItemStack(ModBlocks.OVERWORLD_PORTAL_BLOCK.get()), true);
            }
        }
        player.teleportTo(destinationPos.getX() + 0.5D, destinationPos.getY() + 1D, destinationPos.getZ() + 0.5D);
        if (thisIsToParadisDim) {
            boolean doSetBlock = true;
            for (BlockPos checkPos : BlockPos.betweenClosed(destinationPos.below(10).west(10), destinationPos.above(10).east(10))) {
                if (destWorld.getBlockState(checkPos).getBlock() instanceof ParadisPortalBlocks) {
                    doSetBlock = false;
                    break;
                }
            }
            if (doSetBlock) {
                destWorld.setBlock(destinationPos, ModBlocks.CLOUD.get().defaultBlockState(), 10);
                f = 1;
            }
        }
        return entity;
    }
}