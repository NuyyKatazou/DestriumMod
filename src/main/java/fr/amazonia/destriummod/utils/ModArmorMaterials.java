package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum ModArmorMaterials implements StringRepresentable, ArmorMaterial {

    NECKLACE("necklace", 74, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266652_) -> {
        p_266652_.put(ArmorItem.Type.BOOTS, 3);
        p_266652_.put(ArmorItem.Type.LEGGINGS, 6);
        p_266652_.put(ArmorItem.Type.CHESTPLATE, 5);
        p_266652_.put(ArmorItem.Type.HELMET, 1);
    }), 0, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
        return Ingredient.of(ModItems.AMAZONITE_NUGGETS.get());
    }),

    ARGONIDE("argonide", 74, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266654_) -> {
        p_266654_.put(ArmorItem.Type.BOOTS, 4);
        p_266654_.put(ArmorItem.Type.LEGGINGS, 7);
        p_266654_.put(ArmorItem.Type.CHESTPLATE, 9);
        p_266654_.put(ArmorItem.Type.HELMET, 4);
    }), 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.5F, 0.1F, () -> {
        return Ingredient.of(ModItems.ARGONIDE_INGOT.get());
    }),

    DESTRIUM("destrium", 478, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266649_) -> {
        p_266649_.put(ArmorItem.Type.BOOTS, 5);
        p_266649_.put(ArmorItem.Type.LEGGINGS, 8);
        p_266649_.put(ArmorItem.Type.CHESTPLATE, 10);
        p_266649_.put(ArmorItem.Type.HELMET, 5);
    }), 3, SoundEvents.ARMOR_EQUIP_DIAMOND, 4.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.DESTRIUM_INGOT.get());
    }),

    AMAZONITE("amazonite", 1256, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266655_) -> {
        p_266655_.put(ArmorItem.Type.BOOTS, 9);
        p_266655_.put(ArmorItem.Type.LEGGINGS, 12);
        p_266655_.put(ArmorItem.Type.CHESTPLATE, 14);
        p_266655_.put(ArmorItem.Type.HELMET, 9);
    }), 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 5.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.AMAZONITE_FRAGMENT.get());
    });

    public static final StringRepresentable.EnumCodec<ArmorMaterials> CODEC = StringRepresentable.fromEnum(ArmorMaterials::values);
    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266653_) -> {
        p_266653_.put(ArmorItem.Type.BOOTS, 13);
        p_266653_.put(ArmorItem.Type.LEGGINGS, 15);
        p_266653_.put(ArmorItem.Type.CHESTPLATE, 16);
        p_266653_.put(ArmorItem.Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModArmorMaterials(String pName, int pDurabilityMultiplier, EnumMap<ArmorItem.Type, Integer> pProtectionFunctionForType, int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance, Supplier<Ingredient> pRepairIngredient) {
        this.name = pName;
        this.durabilityMultiplier = pDurabilityMultiplier;
        this.protectionFunctionForType = pProtectionFunctionForType;
        this.enchantmentValue = pEnchantmentValue;
        this.sound = pSound;
        this.toughness = pToughness;
        this.knockbackResistance = pKnockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);
    }

    public int getDurabilityForType(ArmorItem.Type pType) {
        return HEALTH_FUNCTION_FOR_TYPE.get(pType) * this.durabilityMultiplier;
    }

    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionFunctionForType.get(pType);
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return DestriumMod.MODID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public String getSerializedName() {
        return this.name;
    }
}
