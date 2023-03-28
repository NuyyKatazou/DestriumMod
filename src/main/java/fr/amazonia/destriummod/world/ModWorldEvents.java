package fr.amazonia.destriummod.world;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.world.gen.ModFlowerGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DestriumMod.MODID)
public class ModWorldEvents {
	
	@SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModFlowerGeneration.generatePlainsFlowers(event);
    }
}
