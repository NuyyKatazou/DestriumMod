package fr.amazonia.destriummod.block;

import net.minecraft.world.level.block.Block;

public class ParadisPortalBlocks extends Block {

	public ParadisPortalBlocks(Properties p_i48440_1_) {
		super(p_i48440_1_);
	}

    /*
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

     */
}
