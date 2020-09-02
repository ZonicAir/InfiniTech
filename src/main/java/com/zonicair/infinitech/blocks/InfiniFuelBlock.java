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

public class InfiniFuelBlock extends Block {

    public InfiniFuelBlock() {
        super(Block.Properties.create(Material.EARTH)
                .hardnessAndResistance(20f, 600F)
                .sound(SoundType.STONE)
                .harvestLevel(2) // 0 = wood, 1 = stone, 2 = iron, 3 = diamond
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE));

    }


}
