package fr.amazonia.destriummod.item.armor;

import fr.amazonia.destriummod.init.ModItems;
import fr.amazonia.destriummod.utils.ModArmorMaterials;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class AmazoniteArmorHelmet extends ArmorItem {

    public AmazoniteArmorHelmet(ArmorMaterial p_40386_, Type p_266831_, Properties p_40388_) {
        super(p_40386_, p_266831_, p_40388_);
    }

    @Override
    public void onArmorTick(ItemStack itemstack, Level world, Player player) {
        if(player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.AMAZONITE_HELMET.get()) {
            player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 300, 0, false, false, true));
        }
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.BLUE));
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return true;
    }
}
