package fr.amazonia.destriummod.utils.toolmaterials;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class DestriumToolMaterial implements ToolMaterial {

    public static final DestriumToolMaterial INSTANCE = new DestriumToolMaterial();

    @Override
    public int getDurability() {
        return 8074;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 18F;
    }

    @Override
    public float getAttackDamage() {
        return 7F;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.DESTRIUM_INGOT);
    }
}
