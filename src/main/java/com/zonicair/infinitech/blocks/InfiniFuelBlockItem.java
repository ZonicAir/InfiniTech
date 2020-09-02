package com.zonicair.infinitech.blocks;

import com.zonicair.infinitech.InfiniTech;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class InfiniFuelBlockItem extends BlockItem {

    public InfiniFuelBlockItem(Block block) {
        super(block, new Item.Properties().group(InfiniTech.TAB));
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 28800;
    }
}
