package fr.amazonia.destriummod.worldgen.portal;

import fr.amazonia.destriummod.block.ParadisPortalBlocks;
import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.portal.DimensionTransition;
import net.minecraft.world.phys.Vec3;

public final class ParadisTeleporter {

    public static int f = 0;

    private ParadisTeleporter() {
    }

    public static DimensionTransition create(ServerPlayer player, ServerLevel destinationWorld, BlockPos portalPos, boolean toParadis) {
        BlockPos destinationPos = findDestinationPos(destinationWorld, portalPos, toParadis);
        Vec3 targetPos = new Vec3(destinationPos.getX() + 0.5D, destinationPos.getY() + 1D, destinationPos.getZ() + 0.5D);

        return new DimensionTransition(
                destinationWorld,
                targetPos,
                player.getDeltaMovement(),
                player.getYRot(),
                player.getXRot(),
                entity -> {
                    if (entity instanceof ServerPlayer serverPlayer) {
                        giveReturnPortalBlock(serverPlayer);
                        if (toParadis) {
                            setupParadisPlatform(destinationWorld, destinationPos);
                            f = 1;
                        }
                    }
                    DimensionTransition.PLAY_PORTAL_SOUND.onTransition(entity);
                }
        );
    }

    private static BlockPos findDestinationPos(ServerLevel destinationWorld, BlockPos portalPos, boolean toParadis) {
        int y = toParadis ? 61 : portalPos.getY();
        BlockPos destinationPos = new BlockPos(portalPos.getX(), y, portalPos.getZ());

        int tries = 0;
        while (!isSafeStandingSpot(destinationWorld, destinationPos) && tries < 25) {
            destinationPos = destinationPos.above(2);
            tries++;
        }
        return destinationPos;
    }

    private static boolean isSafeStandingSpot(ServerLevel destinationWorld, BlockPos destinationPos) {
        return (destinationWorld.getBlockState(destinationPos).getBlock() == Blocks.AIR
                || destinationWorld.getBlockState(destinationPos).canBeReplaced(Fluids.WATER))
                && (destinationWorld.getBlockState(destinationPos.above()).getBlock() == Blocks.AIR
                || destinationWorld.getBlockState(destinationPos.above()).canBeReplaced(Fluids.WATER));
    }

    private static void giveReturnPortalBlock(ServerPlayer player) {
        if (!player.getInventory().contains(new ItemStack(ModBlocks.OVERWORLD_PORTAL_BLOCK.get()))) {
            if (player.getInventory().getFreeSlot() != -1) {
                player.addItem(new ItemStack(ModBlocks.OVERWORLD_PORTAL_BLOCK.get()));
            } else {
                player.drop(new ItemStack(ModBlocks.OVERWORLD_PORTAL_BLOCK.get()), true);
            }
        }
    }

    private static void setupParadisPlatform(ServerLevel destinationWorld, BlockPos destinationPos) {
        boolean doSetBlock = true;
        for (BlockPos checkPos : BlockPos.betweenClosed(destinationPos.below(10).west(10), destinationPos.above(10).east(10))) {
            if (destinationWorld.getBlockState(checkPos).getBlock() instanceof ParadisPortalBlocks) {
                doSetBlock = false;
                break;
            }
        }

        if (doSetBlock) {
            destinationWorld.setBlock(destinationPos, ModBlocks.CLOUD.get().defaultBlockState(), 10);
            destinationWorld.setBlock(destinationPos.above(1), Blocks.AIR.defaultBlockState(), 10);
            destinationWorld.setBlock(destinationPos.above(2), Blocks.AIR.defaultBlockState(), 10);
        }
    }
}