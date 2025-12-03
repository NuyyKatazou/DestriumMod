package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.DestriumMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class ModTags {

    public static class Blocks {

        public static final Tags.IOptionalNamedTag<Block> AMAZONITE_ORE = createTag("amazonite_ore");
        public static final Tags.IOptionalNamedTag<Block> DESTRIUM_ORE = createTag("destrium_ore");
        public static final Tags.IOptionalNamedTag<Block> ARGONIDE_ORE = createTag("argonide_ore");

        public static final Tags.IOptionalNamedTag<Block> CLOUDS = createTag("clouds");

        public static final Tags.IOptionalNamedTag<Block> COMPRESSED_COBBLESTONE = createTag("compressed_cobblestone");
        public static final Tags.IOptionalNamedTag<Block> COMPRESSED_DIRT = createTag("compressed_dirt");

        public static final Tags.IOptionalNamedTag<Block> CROPS = createTag("crops");

        private static Tags.IOptionalNamedTag<Block> createTag(String name) {
            return BlockTags.createOptional(new ResourceLocation(DestriumMod.MODID, name));
        }

        private static Tags.IOptionalNamedTag<Block> createForgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
    }

    public static class Items {

        public static final Tags.IOptionalNamedTag<Item> PLATES = createTag("plates");


        public static final Tags.IOptionalNamedTag<Item> AMAZONITE_ARMORS = createTag("amazonite_armors");
        public static final Tags.IOptionalNamedTag<Item> DESTRIUM_ARMORS = createTag("destrium_armors");
        public static final Tags.IOptionalNamedTag<Item> ARGONIDE_ARMORS = createTag("argonide_armors");

        public static final Tags.IOptionalNamedTag<Item> BOOTS = createTag("boots");

        public static final Tags.IOptionalNamedTag<Item> NECKLACE = createTag("necklace");


        public static final Tags.IOptionalNamedTag<Item> AMAZONITE_TOOLS = createTag("amazonite_tools");
        public static final Tags.IOptionalNamedTag<Item> DESTRIUM_TOOLS = createTag("destrium_tools");
        public static final Tags.IOptionalNamedTag<Item> ARGONIDE_TOOLS = createTag("argonide_tools");

        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(DestriumMod.MODID, name));
        }

        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}