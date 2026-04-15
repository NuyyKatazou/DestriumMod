package fr.amazonia.destriummod.block;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.utils.OverworldTeleporter;
import net.minecraft.core.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class OverworldPortalBlocks extends Block {

    public OverworldPortalBlocks(Properties pProperties) {
        super(pProperties);
    }

    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (pPlayer.getVehicle() != null || pPlayer.isVehicle()) {
            return InteractionResult.FAIL;
        }
        if (!pLevel.isClientSide()) {
            if (!pPlayer.isCrouching() && pPlayer.canChangeDimensions()) {
                MinecraftServer server = pLevel.getServer();
                if (server != null) {
                    if (pLevel.dimension() != DestriumMod.PARADIS_DIMENSION) {
                        return InteractionResult.FAIL;
                    } else {
                        ServerLevel paradisWorld = server.getLevel(Level.OVERWORLD);
                        if (paradisWorld != null) {
                            pPlayer.changeDimension(paradisWorld, new OverworldTeleporter(pPos, true));
                        }
                    }
                    return InteractionResult.SUCCESS;
                }
            }
        }
        return super.use(pState, pLevel, pPos, pPlayer, pHand, pHit);
    }
}