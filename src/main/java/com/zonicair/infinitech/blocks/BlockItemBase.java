package com.zonicair.infinitech.blocks;

import com.zonicair.infinitech.InfiniTech;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(InfiniTech.TAB));
    }

}
