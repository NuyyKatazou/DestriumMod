package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

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

    ModItemTiers(int pLevel, int pUses, float pUseSpeed, float pDamage, int pEnchantmentValue, Supplier<Ingredient> pRepairIngredient) {
        this.level = pLevel;
        this.uses = pUses;
        this.speed = pUseSpeed;
        this.damage = pDamage;
        this.enchantmentValue = pEnchantmentValue;
        this.repairIngredient = new LazyValue<>(pRepairIngredient);
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