package fr.amazonia.destriummod.init;

import fr.amazonia.destriummod.DestriumMod;
import fr.amazonia.destriummod.fluid.PoisonWaterFluid;
import fr.amazonia.destriummod.fluid.PoisonWaterFluidBlock;
import fr.amazonia.destriummod.fluid.ResistanceLavaFluid;
import fr.amazonia.destriummod.fluid.ResistanceLavaFluidBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFluids {
	
	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, DestriumMod.MODID);
	
	
	public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still"); 
	public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
	public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");
	
	public static final ResourceLocation LAVA_STILL_RL = new ResourceLocation("block/lava_still"); 
	public static final ResourceLocation LAVA_FLOWING_RL = new ResourceLocation("block/lava_flow");
	
	
	public static final RegistryObject<FlowingFluid> POISON_WATER_FLUID = FLUIDS.register("poison_water_fluid", () -> new PoisonWaterFluid.Source(ModFluids.POISON_WATER_PROPERTIES));
	public static final RegistryObject<FlowingFluid> POISON_WATER_FLOWING = FLUIDS.register("poison_water_flowing", () -> new PoisonWaterFluid.Flowing(ModFluids.POISON_WATER_PROPERTIES));
	
	public static final RegistryObject<FlowingFluid> RESISTANCE_LAVA_FLUID = FLUIDS.register("resistance_lava_fluid", () -> new ResistanceLavaFluid.Source(ModFluids.RESISTANCE_LAVA_PROPERTIES));
	public static final RegistryObject<FlowingFluid> RESISTANCE_LAVA_FLOWING = FLUIDS.register("resistance_lava_flowing", () -> new ResistanceLavaFluid.Flowing(ModFluids.RESISTANCE_LAVA_PROPERTIES));
	
	
	public static final ForgeFlowingFluid.Properties POISON_WATER_PROPERTIES = new ForgeFlowingFluid.Properties(() -> POISON_WATER_FLUID.get(), () -> POISON_WATER_FLOWING.get(), FluidAttributes.Water.builder(WATER_STILL_RL, WATER_FLOWING_RL).color(0xFFFFFFFF).density(500).luminosity(2).viscosity(100).gaseous().sound(SoundEvents.AMBIENT_UNDERWATER_LOOP).overlay(WATER_OVERLAY_RL)).slopeFindDistance(4).levelDecreasePerBlock(1).block(() -> ModFluids.POISON_WATER_BLOCK.get()).bucket(() -> ModItems.POISON_WATER_BUCKET.get());
		
	public static final ForgeFlowingFluid.Properties RESISTANCE_LAVA_PROPERTIES = new ForgeFlowingFluid.Properties(() -> RESISTANCE_LAVA_FLUID.get(), () -> RESISTANCE_LAVA_FLOWING.get(), FluidAttributes.builder(LAVA_STILL_RL, LAVA_FLOWING_RL).density(500).luminosity(2).viscosity(100).gaseous().sound(SoundEvents.AMBIENT_UNDERWATER_LOOP).overlay(WATER_OVERLAY_RL)).slopeFindDistance(4).levelDecreasePerBlock(1).block(() -> ModFluids.RESISTANCE_LAVA_BLOCK.get()).bucket(() -> ModItems.RESISTANCE_LAVA_BUCKET.get());
	
	
	public static final RegistryObject<FlowingFluidBlock> POISON_WATER_BLOCK = ModBlocks.BLOCKS.register("poison_water", () -> new PoisonWaterFluidBlock(() -> ModFluids.POISON_WATER_FLUID.get(), AbstractBlock.Properties.of(Material.WATER).noCollission().strength(100f).noDrops().speedFactor(0.95F)));
	
	public static final RegistryObject<FlowingFluidBlock> RESISTANCE_LAVA_BLOCK = ModBlocks.BLOCKS.register("resistance_lava", () -> new ResistanceLavaFluidBlock(() -> ModFluids.RESISTANCE_LAVA_FLUID.get(), AbstractBlock.Properties.of(Material.LAVA).noCollission().strength(100f).noDrops().speedFactor(0.95F).lightLevel((p_235470_0_) -> {return 14;})));
			
	public static void register(IEventBus eventBus) {
		FLUIDS.register(eventBus);
	}
}