package fr.amazonia.destriummod.utils;

import java.util.function.Supplier;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

@SuppressWarnings("deprecation")
public enum DestriumModItemTiers implements Tier{
	SPAWNERS(4, 3, 8F, 4F, 55, () -> {
		return Ingredient.of(ModItems.AMAZONITE_APPLE.get());
	   }),
	ARGONIDE(4, 4048, 14F, 5.5F, 18, () -> {
		return Ingredient.of(ModItems.AMAZONITE_APPLE.get());
	   }),
	DESTRIUM(5, 8074, 16F, 7F, 20, () -> {
		return Ingredient.of(ModItems.AMAZONITE_APPLE.get());
	   }),
	AMAZONITE(6, 45051, 18F, 10F, 25, () -> {
		return Ingredient.of(ModItems.AMAZONITE_APPLE.get());
	   });
	
	   private final int level;
	   private final int uses;
	   private final float speed;
	   private final float damage;
	   private final int enchantmentValue;
	   private final LazyLoadedValue<Ingredient> repairIngredient;

	   private DestriumModItemTiers(int p_43332_, int p_43333_, float p_43334_, float p_43335_, int p_43336_, Supplier<Ingredient> p_43337_) {
	      this.level = p_43332_;
	      this.uses = p_43333_;
	      this.speed = p_43334_;
	      this.damage = p_43335_;
	      this.enchantmentValue = p_43336_;
	      this.repairIngredient = new LazyLoadedValue<>(p_43337_);
	   }

	   public int getUses() {
	      return this.uses;
	   }

	   public float getSpeed() {
	      return this.speed;
	   }

	   public float getAttackDamageBonus() {
	      return this.damage;
	   }

	   public int getLevel() {
	      return this.level;
	   }

	   public int getEnchantmentValue() {
	      return this.enchantmentValue;
	   }

	   public Ingredient getRepairIngredient() {
	      return this.repairIngredient.get();
	   }
//	   public static final Tag.Named<Block> NEED_AMAZONITE_TOOL = BlockTags.createOptional(new ResourceLocation(DestriumMod.MODID + "needs_amazonite_tool"));
//	   public static final Tag.Named<Block> NEED_DESTRIUM_TOOL = BlockTags.createOptional(new ResourceLocation(DestriumMod.MODID + "needs_destrium_tool"));
//	   
//	   public static final Tier DESTRIUM_TIER = TierSortingRegistry.registerTier(
//	            new ForgeTier(5, 8074, 16F, 7F, 20, NEED_DESTRIUM_TOOL, () -> Ingredient.of(ModItems.AMAZONITE_APPLE.get())),
//	            new ResourceLocation(DestriumMod.MODID + "destrium_tier"),
//	            List.of(), List.of());
//	   
//	   public static final Tier AMAZONITE_TIER = TierSortingRegistry.registerTier(
//	            new ForgeTier(6, 45051, 18F, 10F, 25, NEED_AMAZONITE_TOOL, () -> Ingredient.of(ModItems.AMAZONITE_APPLE.get())),
//	            new ResourceLocation(DestriumMod.MODID + "amazonite_tier"),
//	            List.of(), List.of());
	}