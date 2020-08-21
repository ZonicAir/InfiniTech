package com.zonicair.infinitech.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ReinforcedInfiniBlock extends Block {

    public ReinforcedInfiniBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(200f, 4800f)
                .sound(SoundType.METAL)
                .harvestLevel(4) // 0 = wood, 1 = stone, 2 = iron, 3 = diamond
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE));
    }


}
