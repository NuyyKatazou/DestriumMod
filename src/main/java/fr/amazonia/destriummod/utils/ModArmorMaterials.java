package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final Holder<ArmorMaterial> NECKLACE = register("necklace", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.BOOTS, 3);
        attribute.put(ArmorItem.Type.LEGGINGS, 6);
        attribute.put(ArmorItem.Type.CHESTPLATE, 5);
        attribute.put(ArmorItem.Type.HELMET, 1);
        attribute.put(ArmorItem.Type.BODY, 5);
    }), 0, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> Ingredient.of(ModItems.AMAZONITE_NUGGETS.get()));
    public static final Holder<ArmorMaterial> ARGONIDE = register("argonide", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.BOOTS, 4);
        attribute.put(ArmorItem.Type.LEGGINGS, 7);
        attribute.put(ArmorItem.Type.CHESTPLATE, 9);
        attribute.put(ArmorItem.Type.HELMET, 4);
        attribute.put(ArmorItem.Type.BODY, 12);
    }), 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.5F, 0.1F, () -> Ingredient.of(ModItems.ARGONIDE_INGOT.get()));
    public static final Holder<ArmorMaterial> DESTRIUM = register("destrium", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.BOOTS, 5);
        attribute.put(ArmorItem.Type.LEGGINGS, 8);
        attribute.put(ArmorItem.Type.CHESTPLATE, 10);
        attribute.put(ArmorItem.Type.HELMET, 5);
        attribute.put(ArmorItem.Type.BODY, 14);
    }), 3, SoundEvents.ARMOR_EQUIP_DIAMOND, 4.0F, 0.1F, () -> Ingredient.of(ModItems.DESTRIUM_INGOT.get()));
    public static final Holder<ArmorMaterial> AMAZONITE = register("amazonite", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.BOOTS, 9);
        attribute.put(ArmorItem.Type.LEGGINGS, 12);
        attribute.put(ArmorItem.Type.CHESTPLATE, 14);
        attribute.put(ArmorItem.Type.HELMET, 9);
        attribute.put(ArmorItem.Type.BODY, 22);
    }), 25, SoundEvents.ARMOR_EQUIP_NETHERITE, 5.0F, 0.1F, () -> Ingredient.of(ModItems.AMAZONITE_FRAGMENT.get()));

    private static Holder<ArmorMaterial> register(
            String pName,
            EnumMap<ArmorItem.Type, Integer> pDefense,
            int pEnchantmentValue,
            Holder<SoundEvent> pEquipSound,
            float pToughness,
            float pKnockbackResistance,
            Supplier<Ingredient> pRepairIngredient
    ) {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, pName)));
        return register(pName, pDefense, pEnchantmentValue, pEquipSound, pToughness, pKnockbackResistance, pRepairIngredient, list);
    }

    private static Holder<ArmorMaterial> register(
            String pName,
            EnumMap<ArmorItem.Type, Integer> pDefense,
            int pEnchantmentValue,
            Holder<SoundEvent> pEquipSound,
            float pToughness,
            float pKnockbackResistance,
            Supplier<Ingredient> pRepairIngredient,
            List<ArmorMaterial.Layer> pLayers
    ) {
        EnumMap<ArmorItem.Type, Integer> enummap = new EnumMap<>(ArmorItem.Type.class);

        for (ArmorItem.Type armoritem$type : ArmorItem.Type.values()) {
            enummap.put(armoritem$type, pDefense.get(armoritem$type));
        }

        return Registry.registerForHolder(
                BuiltInRegistries.ARMOR_MATERIAL,
                ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, pName),
                new ArmorMaterial(enummap, pEnchantmentValue, pEquipSound, pRepairIngredient, pLayers, pToughness, pKnockbackResistance)
        );
    }
}