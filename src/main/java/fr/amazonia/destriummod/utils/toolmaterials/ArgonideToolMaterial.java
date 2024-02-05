package fr.amazonia.destriummod.utils.toolmaterials;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ArgonideToolMaterial implements ToolMaterial {

    public static final ArgonideToolMaterial INSTANCE = new ArgonideToolMaterial();

    @Override
    public int getDurability() {
        return 4048;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 13F;
    }

    @Override
    public float getAttackDamage() {
        return 5.5F;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.ARGONIDE_INGOT);
    }
}
