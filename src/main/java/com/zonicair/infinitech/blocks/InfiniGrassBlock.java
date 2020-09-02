package com.zonicair.infinitech.blocks;

import com.zonicair.infinitech.init.BlockRegistryHandler;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DecoratedFeatureConfig;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class InfiniGrassBlock extends Block implements  IGrowable{
    private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public InfiniGrassBlock() {
        super(Properties.create(Material.EARTH).tickRandomly()
                .hardnessAndResistance(15f, 1200f)
                .sound(SoundType.GROUND)
                .harvestLevel(0) // 0 = wood, 1 = stone, 2 = iron, 3 = diamond
                .harvestTool(ToolType.SHOVEL));

    }

    @Override
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        BlockPos w = new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ());
        BlockPos e = new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ());
        BlockPos s = new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1);
        BlockPos n = new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1);
        //Set random int for side, change that side to grass
        int x = random.nextInt(4);
        switch(x) {
            case 0:
                if (worldIn.getBlockState(n).getBlock() == BlockRegistryHandler.INFINI_DIRT_BLOCK.get()) {
                    worldIn.setBlockState(n, this.getDefaultState());
                }
                break;
            case 1:
                if (worldIn.getBlockState(s).getBlock() == BlockRegistryHandler.INFINI_DIRT_BLOCK.get()) {
                    worldIn.setBlockState(s, this.getDefaultState());
                }
                break;
            case 2:
                if (worldIn.getBlockState(e).getBlock() == BlockRegistryHandler.INFINI_DIRT_BLOCK.get()) {
                    worldIn.setBlockState(e, this.getDefaultState());
                }
                break;
            case 3:
                if (worldIn.getBlockState(w).getBlock() == BlockRegistryHandler.INFINI_DIRT_BLOCK.get()) {
                    worldIn.setBlockState(w, this.getDefaultState());
                }
                break;
        }
    }

    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
        return true;
    }





    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context){
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot){
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }
    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {

    }
}
