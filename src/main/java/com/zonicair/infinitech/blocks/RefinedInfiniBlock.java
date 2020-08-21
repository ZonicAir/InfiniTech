package com.zonicair.infinitech.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RefinedInfiniBlock extends Block {

    public RefinedInfiniBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(100f, 2400f)
                .sound(SoundType.METAL)
                .harvestLevel(3) // 0 = wood, 1 = stone, 2 = iron, 3 = diamond
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE));
    }


}
