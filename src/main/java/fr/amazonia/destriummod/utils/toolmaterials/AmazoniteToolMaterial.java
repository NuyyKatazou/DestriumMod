package fr.amazonia.destriummod.utils.toolmaterials;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AmazoniteToolMaterial implements ToolMaterial {

    public static final AmazoniteToolMaterial INSTANCE = new AmazoniteToolMaterial();

    @Override
    public int getDurability() {
        return 45051;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 20F;
    }

    @Override
    public float getAttackDamage() {
        return 10F;
    }

    @Override
    public int getMiningLevel() {
        return 6;
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.AMAZONITE_FRAGMENT);
    }
}
