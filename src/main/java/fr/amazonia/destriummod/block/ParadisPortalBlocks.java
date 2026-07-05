package fr.amazonia.destriummod.block;

import fr.amazonia.destriummod.worldgen.dimension.ModDimensions;
import fr.amazonia.destriummod.worldgen.portal.ParadisTeleporter;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class ParadisPortalBlocks extends Block {

    public ParadisPortalBlocks(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) {
        if (!pLevel.isClientSide && pPlayer.canUsePortal(false) && pPlayer instanceof ServerPlayer serverPlayer) {
            handlePortal(serverPlayer, pPos);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    private void handlePortal(ServerPlayer player, BlockPos pPos) {
        ServerLevel serverLevel = player.serverLevel();
        MinecraftServer minecraftServer = serverLevel.getServer();
        ResourceKey<Level> resourceKey = serverLevel.dimension() == ModDimensions.PARADIS_DIMENSION_LEVEL_KEY
                ? Level.OVERWORLD
                : ModDimensions.PARADIS_DIMENSION_LEVEL_KEY;

        ServerLevel portalDimension = minecraftServer.getLevel(resourceKey);
        if (portalDimension != null && !player.isPassenger() && resourceKey == ModDimensions.PARADIS_DIMENSION_LEVEL_KEY
                && player.canTeleport(serverLevel, portalDimension)) {
            player.teleport(ParadisTeleporter.create(player, portalDimension, pPos, true));
        }
    }
}