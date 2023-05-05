package fr.amazonia.destriummod.block;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.utils.ParadisTeleporter;
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

public class ParadisPortalBlocks extends Block {

	public ParadisPortalBlocks(Properties p_i48440_1_) {
		super(p_i48440_1_);
	}

	@SuppressWarnings("deprecation")
	@Override
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        if (!worldIn.isClientSide()) {
            if (!player.isCrouching()) {
                MinecraftServer server = worldIn.getServer();
                if (server != null) {
                    if (worldIn.dimension() == DestriumMod.PARADIS_DIMENSION) {
                        
                    } else {
                        ServerLevel paradisWorld = server.getLevel(DestriumMod.PARADIS_DIMENSION);
                        if (paradisWorld != null) {
                            player.changeDimension(paradisWorld, new ParadisTeleporter(pos, true));
                        }
                    }
                    return InteractionResult.SUCCESS;
                }
            }
        }
        return super.use(state, worldIn, pos, player, handIn, hit);
    }
}
