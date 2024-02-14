package fr.amazonia.destriummod.utils;

import java.util.function.Supplier;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModArmorMaterial implements ArmorMaterial {

	NECKLACE("necklace", 74, new int[]{3, 6, 5, 1}, 0, SoundEvents.ARMOR_EQUIP_CHAIN, 0F, 0F, () -> Ingredient.of(ModItems.AMAZONITE_NUGGETS.get())),
	ARGONIDE("argonide", 74, new int[]{4, 7, 9, 4}, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.5F, 0.1F, () -> Ingredient.of(ModItems.ARGONIDE_INGOT.get())),
	DESTRIUM("destrium", 478, new int[]{5, 8, 10, 5}, 3, SoundEvents.ARMOR_EQUIP_DIAMOND, 4.0F, 0.1F, () -> Ingredient.of(ModItems.DESTRIUM_INGOT.get())),
	AMAZONITE("amazonite", 1256, new int[]{9, 12, 14, 9}, 25, SoundEvents.ARMOR_EQUIP_NETHERITE, 5.0F, 0.1F, () -> Ingredient.of(ModItems.AMAZONITE_FRAGMENT.get()));

	private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] slotProtections;
	private final int enchantmentValue;
	private final SoundEvent sound;
	private final float toughness;
	private final float knockbackResistance;
	private final LazyLoadedValue<Ingredient> repairIngredient;

	ModArmorMaterial(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
		this.name = p_40474_;
		this.durabilityMultiplier = p_40475_;
		this.slotProtections = p_40476_;
		this.enchantmentValue = p_40477_;
		this.sound = p_40478_;
		this.toughness = p_40479_;
		this.knockbackResistance = p_40480_;
		this.repairIngredient = new LazyLoadedValue<>(p_40481_);
	}

	public int getDurabilityForSlot(EquipmentSlot p_40484_) {
		return HEALTH_PER_SLOT[p_40484_.getIndex()] * this.durabilityMultiplier;
	}

	public int getDefenseForSlot(EquipmentSlot p_40487_) {
	      return this.slotProtections[p_40487_.getIndex()];
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
}