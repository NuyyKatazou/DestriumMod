package fr.amazonia.destriummod.client;

import fr.amazonia.destriummod.init.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class DestriumModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        //Plants
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AMAZONITE_PLANTS, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DESTRIUM_PLANTS, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.XP_PLANTS, RenderLayer.getCutoutMipped());

        ///Flowers

        //Blocks
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BELOW_BLOCK, RenderLayer.getTranslucent());

        //Fluids
    }
}
