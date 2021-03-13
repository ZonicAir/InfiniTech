package com.zonicair.infinitech.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
public class InfiniWoodPlanks extends Block {

    public InfiniWoodPlanks() {
        super(Block.Properties.create(Material.WOOD)
                .hardnessAndResistance(10F, 1200f)
                .sound(SoundType.WOOD)
                .harvestLevel(3) // 0 = wood, 1 = stone, 2 = iron, 3 = diamond
                .setRequiresTool()
                .harvestTool(ToolType.AXE));
    }


}
