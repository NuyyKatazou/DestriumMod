package fr.amazonia.destriummod.item;

import fr.amazonia.destriummod.init.ModItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BucketPickup;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

import java.util.function.Supplier;

public class InfinityWaterBucketItem extends BucketItem {

    private final Fluid content;
    private final java.util.function.Supplier<? extends Fluid> fluidSupplier;

    public InfinityWaterBucketItem(Supplier<? extends Fluid> supplier, Properties builder) {
        super(supplier, builder);
        this.content = null;
        this.fluidSupplier = supplier;
    }

    public static ItemStack getEmptySuccessItem(ItemStack pBucketStack, Player pPlayer) {
        return !pPlayer.hasInfiniteMaterials() ? new ItemStack(ModItems.INFINITY_WATER_BUCKET.get()) : pBucketStack;
    }

    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pHand);
        BlockHitResult blockhitresult = getPlayerPOVHitResult(pLevel, pPlayer, this.content == Fluids.EMPTY ? ClipContext.Fluid.SOURCE_ONLY : ClipContext.Fluid.NONE);
        InteractionResultHolder<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onBucketUse(pPlayer, pLevel, itemstack, blockhitresult);
        if (ret != null) return ret;
        if (blockhitresult.getType() == HitResult.Type.MISS) {
            return InteractionResultHolder.pass(itemstack);
        } else if (blockhitresult.getType() != HitResult.Type.BLOCK) {
            return InteractionResultHolder.pass(itemstack);
        } else {
            BlockPos blockpos = blockhitresult.getBlockPos();
            Direction direction = blockhitresult.getDirection();
            BlockPos blockpos1 = blockpos.relative(direction);
            if (!pLevel.mayInteract(pPlayer, blockpos) || !pPlayer.mayUseItemAt(blockpos1, direction, itemstack)) {
                return InteractionResultHolder.fail(itemstack);
            } else if (this.content == Fluids.EMPTY) {
                BlockState blockstate1 = pLevel.getBlockState(blockpos);
                if (blockstate1.getBlock() instanceof BucketPickup bucketpickup) {
                    ItemStack itemstack2 = bucketpickup.pickupBlock(pPlayer, pLevel, blockpos, blockstate1);
                    if (!itemstack2.isEmpty()) {
                        pPlayer.awardStat(Stats.ITEM_USED.get(this));
                        bucketpickup.getPickupSound(blockstate1).ifPresent(p_150709_ -> pPlayer.playSound(p_150709_, 1.0F, 1.0F));
                        pLevel.gameEvent(pPlayer, GameEvent.FLUID_PICKUP, blockpos);
                        ItemStack itemstack1 = ItemUtils.createFilledResult(itemstack, pPlayer, itemstack2);
                        if (!pLevel.isClientSide) {
                            CriteriaTriggers.FILLED_BUCKET.trigger((ServerPlayer) pPlayer, itemstack2);
                        }

                        return InteractionResultHolder.sidedSuccess(itemstack1, pLevel.isClientSide());
                    }
                }

                return InteractionResultHolder.fail(itemstack);
            } else {
                BlockState blockstate = pLevel.getBlockState(blockpos);
                BlockPos blockpos2 = canBlockContainFluid(pLevel, blockpos, blockstate) ? blockpos : blockpos1;
                if (this.emptyContents(pPlayer, pLevel, blockpos2, blockhitresult, itemstack)) {
                    this.checkExtraContent(pPlayer, pLevel, itemstack, blockpos2);
                    if (pPlayer instanceof ServerPlayer) {
                        CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayer) pPlayer, blockpos2, itemstack);
                    }

                    pPlayer.awardStat(Stats.ITEM_USED.get(this));
                    return InteractionResultHolder.sidedSuccess(getEmptySuccessItem(itemstack, pPlayer), pLevel.isClientSide());
                } else {
                    return InteractionResultHolder.fail(itemstack);
                }
            }
        }
    }

    public Fluid getFluid() {
        return fluidSupplier.get();
    }

    protected boolean canBlockContainFluid(Level pLevel, BlockPos pPos, BlockState pState) {
        return pState.getBlock() instanceof LiquidBlockContainer liquid && liquid.canPlaceLiquid(null, pLevel, pPos, pState, this.content);
    }
}