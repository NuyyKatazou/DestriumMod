package fr.amazonia.destriummod.block;

import net.minecraft.world.level.block.Block;

public class OverworldPortalBlocks extends Block{
	
	public static int f = 0;

	public OverworldPortalBlocks(Properties p_i48440_1_) {
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
                    if (worldIn.dimension() == Level.OVERWORLD) {
                        
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

	 */
}

