package com.zonicair.infinitech.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class InfiniLeaves extends LeavesBlock {
    public InfiniLeaves() {
        super(Block.Properties.create(Material.LEAVES)
        .hardnessAndResistance(0.5F, 900F)
        .harvestLevel(0));
    }
}
