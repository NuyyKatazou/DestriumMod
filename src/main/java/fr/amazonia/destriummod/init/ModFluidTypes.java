package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.fluid.PoisonWaterFluidType;
import fr.amazonia.destriummod.fluid.ResistanceLavaFluidType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class ModFluidTypes {


    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final ResourceLocation LAVA_STILL_RL = new ResourceLocation("block/lava_still");
    public static final ResourceLocation LAVA_FLOWING_RL = new ResourceLocation("block/lava_flow");

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, DestriumMod.MODID);


    public static final RegistryObject<FluidType> POISON_WATER_FLUID_TYPE = registerWater("poison_water_fluid_type", FluidType.Properties.create().lightLevel(0).density(1000).temperature(300).viscosity(1000).sound(SoundAction.get("drink"), SoundEvents.AMBIENT_UNDERWATER_LOOP).canConvertToSource(false));

    public static final RegistryObject<FluidType> RESISTANCE_LAVA_FLUID_TYPE = registerLava("resistance_lava_fluid_type", FluidType.Properties.create().lightLevel(2).density(500).temperature(300).viscosity(100).sound(SoundAction.get("drink"), SoundEvents.AMBIENT_UNDERWATER_LOOP).canConvertToSource(false));


    private static RegistryObject<FluidType> registerWater(String name, FluidType.Properties properties) {

        return FLUID_TYPES.register(name, () -> new PoisonWaterFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xA1E038D0, new Vector3f(7f / 255f, 64f / 255f, 179f / 255f), properties));
    }

    private static RegistryObject<FluidType> registerLava(String name, FluidType.Properties properties) {

        return FLUID_TYPES.register(name, () -> new ResistanceLavaFluidType(LAVA_STILL_RL, LAVA_FLOWING_RL, WATER_OVERLAY_RL, new Vector3f(198f / 255f, 69f / 255f, 4f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {

        FLUID_TYPES.register(eventBus);
    }
}