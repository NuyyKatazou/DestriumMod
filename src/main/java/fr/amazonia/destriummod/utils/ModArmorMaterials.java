package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {

    NECKLACE("necklace", 74, new int[]{3, 6, 5, 1}, 0, SoundEvents.ARMOR_EQUIP_CHAIN, 0F, 0F, () -> Ingredient.of(ModItems.AMAZONITE_NUGGETS.get())),
    ARGONIDE("argonide", 74, new int[]{4, 7, 9, 4}, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.5F, 0.1F, () -> Ingredient.of(ModItems.ARGONIDE_INGOT.get())),
    DESTRIUM("destrium", 478, new int[]{5, 8, 10, 5}, 3, SoundEvents.ARMOR_EQUIP_DIAMOND, 4F, 0.1F, () -> Ingredient.of(ModItems.DESTRIUM_INGOT.get())),
    AMAZONITE("amazonite", 1256, new int[]{9, 12, 14, 9}, 25, SoundEvents.ARMOR_EQUIP_NETHERITE, 5F, 0.1F, () -> Ingredient.of(ModItems.AMAZONITE_FRAGMENT.get()));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return DestriumMod.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}