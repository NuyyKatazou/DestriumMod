package fr.amazonia.destriummod.init;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties AMAZONITE_APPLE = (new FoodProperties.Builder()).nutrition(20).saturationMod(2.6F).effect(new MobEffectInstance(MobEffects.HEAL, 1, 10), 1.0F).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 800, 3), 1.0F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 24000, 3), 1.0F).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 12000, 4), 1.0F).effect(new MobEffectInstance(MobEffects.REGENERATION, 3000, 4), 1.0F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 12000, 9), 1.0F).alwaysEat().build();
    public static final FoodProperties DESTRIUM_APPLE = (new FoodProperties.Builder()).nutrition(10).saturationMod(1.3F).effect(new MobEffectInstance(MobEffects.HEAL, 1, 5), 1.0F).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 2), 1.0F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 12000, 1), 1.0F).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 6000, 1), 1.0F).effect(new MobEffectInstance(MobEffects.REGENERATION, 900, 2), 1.0F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 6000, 4), 1.0F).alwaysEat().build();


    private static FoodProperties.Builder stew(int p_150384_) {
        return (new FoodProperties.Builder()).nutrition(p_150384_).saturationMod(0.6F);
    }
}
