package com.zonicair.infinitech.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class InfiniBlock extends Block {

    public InfiniBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(50f, 1200f)
                .sound(SoundType.METAL)
                .harvestLevel(3) // 0 = wood, 1 = stone, 2 = iron, 3 = diamond
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE));

    }

}
