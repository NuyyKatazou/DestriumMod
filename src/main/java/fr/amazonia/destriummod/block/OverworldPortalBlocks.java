package fr.amazonia.destriummod.block;

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

	public OverworldPortalBlocks(Properties p_i48440_1_) {
		super(p_i48440_1_);
	}

	@Override
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        if (player.getVehicle() != null || player.isVehicle()) {
            return InteractionResult.FAIL;
        }
        if (!worldIn.isClientSide()) {
            if (!player.isCrouching() && player.canChangeDimensions()) {
                MinecraftServer server = worldIn.getServer();
                if (server != null) {
                    if (worldIn.dimension() == Level.OVERWORLD) {
                        return InteractionResult.FAIL;
                    } else {
                        ServerLevel overworldWorld = server.getLevel(Level.OVERWORLD);
                        if (overworldWorld != null) {
                            player.changeDimension(overworldWorld, new OverworldTeleporter(pos, true));
                        }
                    }
                    return InteractionResult.SUCCESS;
                }
            }
        }
        return super.use(state, worldIn, pos, player, handIn, hit);
    }
}