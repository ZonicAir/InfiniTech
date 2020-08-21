package com.zonicair.infinitech.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class FieryInfiniOre extends Block {

    public FieryInfiniOre() {

        super(Properties.create(Material.EARTH)
                .hardnessAndResistance(100f, 200f)
                .sound(SoundType.STONE)
                .harvestLevel(4) // 0 = wood, 1 = stone, 2 = iron, 3 = diamond
                .setRequiresTool()

                .harvestTool(ToolType.PICKAXE));


    }

}
