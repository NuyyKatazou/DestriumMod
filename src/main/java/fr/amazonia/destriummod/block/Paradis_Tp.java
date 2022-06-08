package fr.amazonia.destriummod.block;

import net.minecraft.block.Block;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.LogicalSidedProvider;

public class Paradis_Tp extends Block{


	public Paradis_Tp(Properties p_i48440_1_) {
		super(p_i48440_1_);
		// TODO Auto-generated constructor stub
	}
	@SubscribeEvent
	public static void PlayerRightClick(RightClickBlock event) {
		MinecraftServer source = LogicalSidedProvider.INSTANCE.get(LogicalSide.SERVER);
		source.getCommands().performCommand(source.createCommandSourceStack(), "execute in destriummod:paradis run teleport @p 1 100 1");
	}

	}