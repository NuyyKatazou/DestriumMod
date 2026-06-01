package fr.amazonia.destriummod.block;

import fr.amazonia.destriummod.worldgen.dimension.ModDimensions;
import fr.amazonia.destriummod.worldgen.portal.ParadisTeleporter;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class ParadisPortalBlocks extends Block {

    public ParadisPortalBlocks(Properties pProperties) {
        super(pProperties);
    }

    public InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) {
        if (pPlayer.canChangeDimensions()) {
            handlePortal(pPlayer, pPos);
            return InteractionResult.SUCCESS;
        } else {
            return InteractionResult.PASS;
        }
    }

    private void handlePortal(Entity player, BlockPos pPos) {
        if (player.level() instanceof ServerLevel serverlevel) {
            MinecraftServer minecraftserver = serverlevel.getServer();
            ResourceKey<Level> resourcekey = player.level().dimension() == ModDimensions.PARADIS_DIMENSION_LEVEL_KEY ?
                    Level.OVERWORLD : ModDimensions.PARADIS_DIMENSION_LEVEL_KEY;

            ServerLevel portalDimension = minecraftserver.getLevel(resourcekey);
            if (portalDimension != null && !player.isPassenger()) {
                if(resourcekey == ModDimensions.PARADIS_DIMENSION_LEVEL_KEY) {
                    player.changeDimension(portalDimension, new ParadisTeleporter(pPos, true));
                }
            }
        }
    }
}