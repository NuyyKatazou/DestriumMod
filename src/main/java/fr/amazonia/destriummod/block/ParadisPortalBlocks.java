package fr.amazonia.destriummod.block;


import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.utils.ParadisTeleporter;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class ParadisPortalBlocks extends Block {

	public ParadisPortalBlocks(Properties p_i48440_1_) {
		super(p_i48440_1_);
	}

	@SuppressWarnings("deprecation")
	@Override
    public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isClientSide()) {
            if (!player.isCrouching()) {
                MinecraftServer server = worldIn.getServer();
                if (server != null) {
                    if (worldIn.dimension() == DestriumMod.PARADIS_DIMENSION) {
                        
                    } else {
                        ServerWorld paradisWorld = server.getLevel(DestriumMod.PARADIS_DIMENSION);
                        if (paradisWorld != null) {
                            player.changeDimension(paradisWorld, new ParadisTeleporter(pos, true));
                        }
                    }
                    return ActionResultType.SUCCESS;
                }
            }
        }
        return super.use(state, worldIn, pos, player, handIn, hit);
    }
}
