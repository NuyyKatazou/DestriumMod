package fr.amazonia.destriummod.item.armor;

import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class NecklaceArmor extends ArmorItem {

    public NecklaceArmor(Holder<ArmorMaterial> material, Type type, Properties properties) {
        super(material, type, properties);
    }

    public boolean isEnchantable(ItemStack p_77616_1_) {
        return false;
    }
}