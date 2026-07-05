package fr.amazonia.destriummod.init;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

import java.util.List;

public class ModFoods {

    public static final FoodProperties AMAZONITE_APPLE = (new FoodProperties.Builder()).nutrition(20).saturationModifier(2.6F).alwaysEdible().build();
    public static final FoodProperties DESTRIUM_APPLE = (new FoodProperties.Builder()).nutrition(10).saturationModifier(1.3F).alwaysEdible().build();

    public static final Consumable AMAZONITE_APPLE_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(
                    List.of(
                            new MobEffectInstance(MobEffects.HEAL, 1, 10),
                            new MobEffectInstance(MobEffects.DAMAGE_BOOST, 800, 3),
                            new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 24000, 3),
                            new MobEffectInstance(MobEffects.HEALTH_BOOST, 12000, 4),
                            new MobEffectInstance(MobEffects.REGENERATION, 3000, 4),
                            new MobEffectInstance(MobEffects.ABSORPTION, 12000, 9)
                    )
            )
    ).build();

    public static final Consumable DESTRIUM_APPLE_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(
                    List.of(
                            new MobEffectInstance(MobEffects.HEAL, 1, 5),
                            new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 2),
                            new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 12000, 1),
                            new MobEffectInstance(MobEffects.HEALTH_BOOST, 6000, 1),
                            new MobEffectInstance(MobEffects.REGENERATION, 900, 2),
                            new MobEffectInstance(MobEffects.ABSORPTION, 6000, 4)
                    )
            )
    ).build();
}