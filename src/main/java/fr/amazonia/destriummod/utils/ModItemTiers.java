package fr.amazonia.destriummod.utils;


import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModItemTiers {

	public static final ForgeTier SPAWNERS = new ForgeTier(4, 3, 8f,
			4f, 55, BlockTags.NEEDS_DIAMOND_TOOL,
			() -> Ingredient.of(ModItems.AMAZONITE_NUGGETS.get()));
	public static final ForgeTier ARGONIDE = new ForgeTier(4, 4048, 13f,
			5.5f, 18, BlockTags.NEEDS_DIAMOND_TOOL,
			() -> Ingredient.of(ModItems.ARGONIDE_INGOT.get()));
	public static final ForgeTier DESTRIUM = new ForgeTier(5, 8074, 18f,
			7f, 20, BlockTags.NEEDS_DIAMOND_TOOL,
			() -> Ingredient.of(ModItems.DESTRIUM_INGOT.get()));
	public static final ForgeTier AMAZONITE = new ForgeTier(6, 45051, 20f,
			10f, 25, BlockTags.NEEDS_DIAMOND_TOOL,
			() -> Ingredient.of(ModItems.AMAZONITE_FRAGMENT.get()));

	}