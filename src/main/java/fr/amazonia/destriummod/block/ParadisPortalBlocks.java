package fr.amazonia.destriummod.block;

import fr.amazonia.destriummod.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.LogicalSidedProvider;

public class ParadisPortalBlocks extends Block{


	public ParadisPortalBlocks(Properties p_i48440_1_) {
		super(p_i48440_1_);
	}
	@SubscribeEvent
	public static void PlayerRightClick(PlayerInteractEvent.RightClickBlock event) {
		BlockState iblockstate = event.getWorld().getBlockState(event.getPos());
        Block block = iblockstate.getBlock();
        if (block == ModBlocks.PARADIS_PORTAL_BLOCK.get())
        {
        	ParadisPortalBlocks.onBlockActivated();
        }
	}
	public static void onBlockActivated() {
			MinecraftServer source = LogicalSidedProvider.INSTANCE.get(LogicalSide.SERVER);
			source.getCommands().performCommand(source.createCommandSourceStack(), "gamerule sendCommandFeedback false");
	  		source.getCommands().performCommand(source.createCommandSourceStack(), "execute in destriummod:paradis run teleport @p 1 100 1");
	}

	}
