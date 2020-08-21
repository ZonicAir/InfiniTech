package com.zonicair.infinitech.items;

import com.zonicair.infinitech.InfiniTech;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(InfiniTech.TAB));
    }
}
