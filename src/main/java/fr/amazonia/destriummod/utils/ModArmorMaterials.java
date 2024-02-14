package fr.amazonia.destriummod.utils;

import java.util.function.Supplier;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum ModArmorMaterials implements IArmorMaterial {

	NECKLACE("necklace", 74, new int[]{2, 5, 4, 1}, 0, SoundEvents.ARMOR_EQUIP_CHAIN, 0F, 0F, () -> Ingredient.of(ModItems.AMAZONITE_NUGGETS.get())),
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
	private final LazyValue<Ingredient> repairIngredient;

	ModArmorMaterials(String p_i231593_3_, int p_i231593_4_, int[] p_i231593_5_, int p_i231593_6_, SoundEvent p_i231593_7_, float p_i231593_8_, float p_i231593_9_, Supplier<Ingredient> p_i231593_10_) {
		this.name = p_i231593_3_;
		this.durabilityMultiplier = p_i231593_4_;
		this.slotProtections = p_i231593_5_;
		this.enchantmentValue = p_i231593_6_;
		this.sound = p_i231593_7_;
		this.toughness = p_i231593_8_;
		this.knockbackResistance = p_i231593_9_;
		this.repairIngredient = new LazyValue<>(p_i231593_10_);
	}

	public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
		return HEALTH_PER_SLOT[p_200896_1_.getIndex()] * this.durabilityMultiplier;
	}

	public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
	      return this.slotProtections[p_200902_1_.getIndex()];
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

	@OnlyIn(Dist.CLIENT)
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