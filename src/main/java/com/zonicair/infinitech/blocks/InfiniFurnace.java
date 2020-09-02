package com.zonicair.infinitech.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class InfiniFurnace extends Block {

    private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 16, 6, 16),
            Block.makeCuboidShape(0, 15, 0, 16, 16, 16),
            Block.makeCuboidShape(4, 14, 1, 12, 15, 2),
            Block.makeCuboidShape(2, 10, 1, 3, 15, 2),
            Block.makeCuboidShape(13, 10, 1, 14, 15, 2),
            Block.makeCuboidShape(3, 12, 1, 4, 15, 2),
            Block.makeCuboidShape(12, 12, 1, 13, 15, 2),
            Block.makeCuboidShape(3, 5, 2, 13, 14, 3),
            Block.makeCuboidShape(0, 6, 15, 1, 15, 16),
            Block.makeCuboidShape(0, 6, 0, 1, 15, 1),
            Block.makeCuboidShape(15, 6, 15, 16, 15, 16),
            Block.makeCuboidShape(15, 6, 0, 16, 15, 1),
            Block.makeCuboidShape(2, 6, 1, 14, 10, 2),
            Block.makeCuboidShape(1, 6, 14, 15, 15, 15),
            Block.makeCuboidShape(1, 6, 1, 2, 15, 15),
            Block.makeCuboidShape(14, 6, 1, 15, 15, 15)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 16, 6, 16),
            Block.makeCuboidShape(0, 15, 0, 16, 16, 16),
            Block.makeCuboidShape(1, 14, 4, 2, 15, 12),
            Block.makeCuboidShape(1, 10, 13, 2, 15, 14),
            Block.makeCuboidShape(1, 10, 2, 2, 15, 3),
            Block.makeCuboidShape(1, 12, 12, 2, 15, 13),
            Block.makeCuboidShape(1, 12, 3, 2, 15, 4),
            Block.makeCuboidShape(2, 5, 3, 3, 14, 13),
            Block.makeCuboidShape(15, 6, 15, 16, 15, 16),
            Block.makeCuboidShape(0, 6, 15, 1, 15, 16),
            Block.makeCuboidShape(15, 6, 0, 16, 15, 1),
            Block.makeCuboidShape(0, 6, 0, 1, 15, 1),
            Block.makeCuboidShape(1, 6, 2, 2, 10, 14),
            Block.makeCuboidShape(14, 6, 1, 15, 15, 15),
            Block.makeCuboidShape(1, 6, 14, 15, 15, 15),
            Block.makeCuboidShape(1, 6, 1, 15, 15, 2)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 16, 6, 16),
            Block.makeCuboidShape(0, 15, 0, 16, 16, 16),
            Block.makeCuboidShape(14, 14, 4, 15, 15, 12),
            Block.makeCuboidShape(14, 10, 2, 15, 15, 3),
            Block.makeCuboidShape(14, 10, 13, 15, 15, 14),
            Block.makeCuboidShape(14, 12, 3, 15, 15, 4),
            Block.makeCuboidShape(14, 12, 12, 15, 15, 13),
            Block.makeCuboidShape(13, 5, 3, 14, 14, 13),
            Block.makeCuboidShape(0, 6, 0, 1, 15, 1),
            Block.makeCuboidShape(15, 6, 0, 16, 15, 1),
            Block.makeCuboidShape(0, 6, 15, 1, 15, 16),
            Block.makeCuboidShape(15, 6, 15, 16, 15, 16),
            Block.makeCuboidShape(14, 6, 2, 15, 10, 14),
            Block.makeCuboidShape(1, 6, 1, 2, 15, 15),
            Block.makeCuboidShape(1, 6, 1, 15, 15, 2),
            Block.makeCuboidShape(1, 6, 14, 15, 15, 15)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 16, 6, 16),
            Block.makeCuboidShape(0, 15, 0, 16, 16, 16),
            Block.makeCuboidShape(4, 14, 14, 12, 15, 15),
            Block.makeCuboidShape(13, 10, 14, 14, 15, 15),
            Block.makeCuboidShape(2, 10, 14, 3, 15, 15),
            Block.makeCuboidShape(12, 12, 14, 13, 15, 15),
            Block.makeCuboidShape(3, 12, 14, 4, 15, 15),
            Block.makeCuboidShape(3, 5, 13, 13, 14, 14),
            Block.makeCuboidShape(15, 6, 0, 16, 15, 1),
            Block.makeCuboidShape(15, 6, 15, 16, 15, 16),
            Block.makeCuboidShape(0, 6, 0, 1, 15, 1),
            Block.makeCuboidShape(0, 6, 15, 1, 15, 16),
            Block.makeCuboidShape(2, 6, 14, 14, 10, 15),
            Block.makeCuboidShape(1, 6, 1, 15, 15, 2),
            Block.makeCuboidShape(14, 6, 1, 15, 15, 15),
            Block.makeCuboidShape(1, 6, 1, 2, 15, 15)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public InfiniFurnace() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(50f, 1200f)
                .sound(SoundType.METAL)
                .harvestLevel(3) // 0 = wood, 1 = stone, 2 = iron, 3 = diamond
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE)
                );
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch(state.get(FACING)){
            case NORTH:
                return SHAPE_N;
            case EAST:
                return SHAPE_E;
            case WEST:
                return SHAPE_W;
            case SOUTH:
                return SHAPE_S;
            default:
                return SHAPE_N;
        }
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
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return 0.6F;
    }



}
