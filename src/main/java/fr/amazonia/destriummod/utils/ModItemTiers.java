package fr.amazonia.destriummod.utils;

import java.util.function.Supplier;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ModItemTiers implements IItemTier {

	SPAWNERS(4, 3, 8F, 4F, 55, () -> Ingredient.of(ModItems.AMAZONITE_FRAGMENT.get())),
	ARGONIDE(4, 4048, 13F, 5.5F, 18, () -> Ingredient.of(ModItems.ARGONIDE_INGOT.get())),
	DESTRIUM(5, 8074, 18F, 7F, 20, () -> Ingredient.of(ModItems.DESTRIUM_INGOT.get())),
	AMAZONITE(6, 45051, 20F, 10F, 25, () -> Ingredient.of(ModItems.AMAZONITE_FRAGMENT.get()));
	   
	private final int level;
	private final int uses;
	private final float speed;
	private final float damage;
	private final int enchantmentValue;
	private final LazyValue<Ingredient> repairIngredient;

	ModItemTiers(int p_i48458_3_, int p_i48458_4_, float p_i48458_5_, float p_i48458_6_, int p_i48458_7_, Supplier<Ingredient> p_i48458_8_) {
		this.level = p_i48458_3_;
		this.uses = p_i48458_4_;
		this.speed = p_i48458_5_;
		this.damage = p_i48458_6_;
		this.enchantmentValue = p_i48458_7_;
		this.repairIngredient = new LazyValue<>(p_i48458_8_);
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
}