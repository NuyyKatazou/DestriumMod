package fr.amazonia.destriummod.utils;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ArmorHandlers {
	
	private Item left = ModItems.NECKLACE.get();
	
	@SubscribeEvent
	public static void armorDamageHandler(LivingDamageEvent event){
	    for (ItemStack armor : event.getEntityLiving().getArmorSlots()){
	        if (armor.getItem() instanceof IDamageHandlingArmor){
	            float newDamage = ((IDamageHandlingArmor)armor.getItem()).onDamaged(event.getEntityLiving(), armor.getEquipmentSlot(), event.getSource(), event.getAmount());
	            event.setAmount(newDamage);
	        }
	    }
	}
	@SubscribeEvent
	public void AnvilUse(AnvilUpdateEvent event) {
		left = event.getLeft().getItem();
		if(left == ModItems.NECKLACE.get()) {
			event.setCanceled(true);
		}
	}
}