package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.DestriumMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> AMAZONITE_ORE = tag("amazonite_ore");
        public static final TagKey<Block> DESTRIUM_ORE = tag("destrium_ore");
        public static final TagKey<Block> ARGONIDE_ORE = tag("argonide_ore");

        public static final TagKey<Block> CLOUDS = tag("clouds");

        public static final TagKey<Block> COMPRESSED_COBBLESTONE = tag("compressed_cobblestone");
        public static final TagKey<Block> COMPRESSED_DIRT = tag("compressed_dirt");

        public static final TagKey<Block> CROPS = tag("crops");

        public static final TagKey<Block> NEEDS_ARGONIDE_TOOL
                = tag("needs_argonide_tool");

        public static final TagKey<Block> NEEDS_DESTRIUM_TOOL
                = tag("needs_destrium_tool");

        public static final TagKey<Block> NEEDS_AMAZONITE_TOOL
                = tag("needs_amazonite_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(DestriumMod.MODID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(DestriumMod.MODID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}