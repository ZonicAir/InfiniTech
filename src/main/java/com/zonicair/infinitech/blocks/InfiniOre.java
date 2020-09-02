package com.zonicair.infinitech.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class InfiniOre extends OreBlock {

    public InfiniOre() {

        super(Properties.create(Material.EARTH)
                .hardnessAndResistance(60f, 300f)
                .sound(SoundType.STONE)
                .harvestLevel(3) // 0 = wood, 1 = stone, 2 = iron, 3 = diamond
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE));


    }

}
