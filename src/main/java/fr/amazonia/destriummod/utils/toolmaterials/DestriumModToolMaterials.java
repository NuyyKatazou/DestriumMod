package fr.amazonia.destriummod.utils.toolmaterials;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum DestriumModToolMaterials implements ToolMaterial
{
    SPAWNERS(4, 3, 8f, 4f, 55, () -> Ingredient.ofItems(ModItems.AMAZONITE_FRAGMENT)),
    ARGONIDE(4, 4048, 13f, 5.5f, 18, () -> Ingredient.ofItems(ModItems.ARGONIDE_INGOT)),
    DESTRIUM(5, 8074, 18f, 7f, 20, () -> Ingredient.ofItems(ModItems.DESTRIUM_INGOT)),
    AMAZONITE(6, 45051, 20f, 10f, 25, () -> Ingredient.ofItems(ModItems.AMAZONITE_FRAGMENT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private DestriumModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
