package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.DestriumMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> AMAZONITE_ORE = createTag("amazonite_ore");
        public static final TagKey<Block> DESTRIUM_ORE = createTag("destrium_ore");
        public static final TagKey<Block> ARGONIDE_ORE = createTag("argonide_ore");

        public static final TagKey<Block> CLOUDS = createTag("clouds");

        public static final TagKey<Block> COMPRESSED_COBBLESTONE = createTag("compressed_cobblestone");
        public static final TagKey<Block> COMPRESSED_DIRT = createTag("compressed_dirt");

        public static final TagKey<Block> CROPS = createTag("crops");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(new ResourceLocation(DestriumMod.MODID, name));
        }

        private static TagKey<Block> createForgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(new ResourceLocation(DestriumMod.MODID, name));
        }

        private static TagKey<Item> createForgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}