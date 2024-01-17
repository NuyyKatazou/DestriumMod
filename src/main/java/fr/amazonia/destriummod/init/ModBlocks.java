package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final ModBlocks INSTANCE = new ModBlocks();

    public static final Block DESTRIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 5).strength(25f, 100f));

    public void registerAll(){
        register(DESTRIUM_BLOCK, new Identifier(DestriumMod.MODID, "destrium_block"));
    }

    private void register(Block block, Identifier name) {
        Registry.register(Registry.BLOCK, name, block);
        createBlockItem(block, name);
    }

    private void createBlockItem(Block block, Identifier name) {
    Registry.register(Registry.ITEM, name, new BlockItem(block, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
