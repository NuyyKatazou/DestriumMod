package fr.amazonia.destriummod;

import fr.amazonia.destriummod.init.ModBlocks;
import fr.amazonia.destriummod.init.ModItems;
import net.fabricmc.api.ModInitializer;

public class DestriumMod implements ModInitializer {

    public static final String MODID = "destriummod";

    @Override
    public void onInitialize() {
        ModItems.RegisterAll();
        ModBlocks.INSTANCE.registerAll();
    }
}
