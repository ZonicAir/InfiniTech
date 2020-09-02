package com.zonicair.infinitech.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class InfiniFuel extends Item {
    public InfiniFuel(Properties properties) {
        super(properties);
    }
/*
    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(KeyboardHelper.isHoldingShift()){
            tooltip.add(new StringTextComponent("Test"));
        }else{
            tooltip.add(new StringTextComponent("Hold Shift"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public boolean isFood() {
        return super.isFood();
    }

    @Override
    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
        return false;
    }
*/
    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 3200;
    }
}
