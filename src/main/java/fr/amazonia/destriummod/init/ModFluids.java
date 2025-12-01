package fr.amazonia.destriummod.init;


import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.fluid.PoisonWaterFluid;
import fr.amazonia.destriummod.fluid.PoisonWaterFluidBlock;
import fr.amazonia.destriummod.fluid.ResistanceLavaFluid;
import fr.amazonia.destriummod.fluid.ResistanceLavaFluidBlock;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, DestriumMod.MODID);


    public static final RegistryObject<FlowingFluid> POISON_WATER_FLUID = FLUIDS.register("poison_water_fluid", () -> new PoisonWaterFluid.Source(ModFluids.POISON_WATER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> POISON_WATER_FLOWING = FLUIDS.register("poison_water_flowing", () -> new PoisonWaterFluid.Flowing(ModFluids.POISON_WATER_PROPERTIES));

    public static final RegistryObject<FlowingFluid> RESISTANCE_LAVA_FLUID = FLUIDS.register("resistance_lava_fluid", () -> new ResistanceLavaFluid.Source(ModFluids.RESISTANCE_LAVA_PROPERTIES));
    public static final RegistryObject<FlowingFluid> RESISTANCE_LAVA_FLOWING = FLUIDS.register("resistance_lava_flowing", () -> new ResistanceLavaFluid.Flowing(ModFluids.RESISTANCE_LAVA_PROPERTIES));


    public static final ForgeFlowingFluid.Properties POISON_WATER_PROPERTIES = new ForgeFlowingFluid.Properties(ModFluidTypes.POISON_WATER_FLUID_TYPE, POISON_WATER_FLUID, POISON_WATER_FLOWING).slopeFindDistance(4).levelDecreasePerBlock(1).block(ModFluids.POISON_WATER_BLOCK).bucket(ModItems.POISON_WATER_BUCKET).explosionResistance(100F);

    public static final ForgeFlowingFluid.Properties RESISTANCE_LAVA_PROPERTIES = new ForgeFlowingFluid.Properties(ModFluidTypes.RESISTANCE_LAVA_FLUID_TYPE, RESISTANCE_LAVA_FLUID, RESISTANCE_LAVA_FLOWING).slopeFindDistance(4).levelDecreasePerBlock(1).block(ModFluids.RESISTANCE_LAVA_BLOCK).bucket(ModItems.RESISTANCE_LAVA_BUCKET);


    public static final RegistryObject<LiquidBlock> POISON_WATER_BLOCK = ModBlocks.BLOCKS.register("poison_water_block", () -> new PoisonWaterFluidBlock(ModFluids.POISON_WATER_FLUID, BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f).speedFactor(0.95F).noLootTable()));

    public static final RegistryObject<LiquidBlock> RESISTANCE_LAVA_BLOCK = ModBlocks.BLOCKS.register("resistance_lava_block", () -> new ResistanceLavaFluidBlock(ModFluids.RESISTANCE_LAVA_FLUID, BlockBehaviour.Properties.of(Material.LAVA).noCollission().strength(100f).speedFactor(0.95F).noLootTable().noOcclusion().lightLevel((p_235470_0_) -> 14)));


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}