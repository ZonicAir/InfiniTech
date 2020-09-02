package com.zonicair.infinitech.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.ToolType;

public class InfiniDirt extends Block {

    public InfiniDirt() {
        super(Properties.create(Material.EARTH)
                .hardnessAndResistance(10f, 1200f)
                .sound(SoundType.GROUND)
                .harvestLevel(0) // 0 = wood, 1 = stone, 2 = iron, 3 = diamond
                .harvestTool(ToolType.SHOVEL));
    }

    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
        return true;
    }


}
