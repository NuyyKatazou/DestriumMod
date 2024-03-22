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

	public InteractionResult use(BlockState p_52923_, Level p_52924_, BlockPos p_52925_, Player p_52926_, InteractionHand p_52927_, BlockHitResult p_52928_) {
		if (!p_52924_.isClientSide()) {
			if (!p_52926_.isCrouching() && p_52926_.canChangeDimensions()) {
				MinecraftServer server = p_52924_.getServer();
				if (server != null) {
					if (p_52924_.dimension() == DestriumMod.PARADIS_DIMENSION) {
					return InteractionResult.FAIL;
					} else {
						ServerLevel paradisWorld = server.getLevel(DestriumMod.PARADIS_DIMENSION);
						if (paradisWorld != null) {
							p_52926_.changeDimension(paradisWorld, new ParadisTeleporter(p_52925_, true));
						}
					}
					return InteractionResult.SUCCESS;
				}
			}
		}
		return super.use(p_52923_, p_52924_, p_52925_, p_52926_, p_52927_, p_52928_);
	}
}