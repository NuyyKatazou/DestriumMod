package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.DestriumMod;
import net.minecraft.Util;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.EnumMap;

public class ModArmorMaterials {

    public static final ArmorMaterial ARGONIDE = new ArmorMaterial(74,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 4);
                attribute.put(ArmorType.LEGGINGS, 7);
                attribute.put(ArmorType.CHESTPLATE, 9);
                attribute.put(ArmorType.HELMET, 4);
                attribute.put(ArmorType.BODY, 12);
            }), 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.5f, 0.1f, ModTags.Items.ARGONIDE_REPAIRABLE, ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "argonide")));

    public static final ArmorMaterial DESTRIUM = new ArmorMaterial(478,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 5);
                attribute.put(ArmorType.LEGGINGS, 8);
                attribute.put(ArmorType.CHESTPLATE, 10);
                attribute.put(ArmorType.HELMET, 5);
                attribute.put(ArmorType.BODY, 14);
            }), 3, SoundEvents.ARMOR_EQUIP_DIAMOND, 4f, 0.1f, ModTags.Items.DESTRIUM_REPAIRABLE, ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "destrium")));

    public static final ArmorMaterial AMAZONITE = new ArmorMaterial(1256,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 9);
                attribute.put(ArmorType.LEGGINGS, 12);
                attribute.put(ArmorType.CHESTPLATE, 14);
                attribute.put(ArmorType.HELMET, 9);
                attribute.put(ArmorType.BODY, 22);
            }), 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 5f, 0.1f, ModTags.Items.AMAZONITE_REPAIRABLE, ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "amazonite")));


    public static final ArmorMaterial NECKLACE = new ArmorMaterial(-1,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 3);
                attribute.put(ArmorType.LEGGINGS, 6);
                attribute.put(ArmorType.CHESTPLATE, 5);
                attribute.put(ArmorType.HELMET, 1);
                attribute.put(ArmorType.BODY, 5);
            }), 1, SoundEvents.ARMOR_EQUIP_CHAIN, 0f, 0f, ModTags.Items.NONE_REPAIRABLE, ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.fromNamespaceAndPath(DestriumMod.MODID, "necklace")));
}