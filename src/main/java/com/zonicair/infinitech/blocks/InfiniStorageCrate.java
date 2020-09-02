package com.zonicair.infinitech.blocks;

import com.zonicair.infinitech.init.InfiniTileEntityTypes;
import com.zonicair.infinitech.tileentity.InfiniStorageCrateTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;

public class InfiniStorageCrate extends Block {

    public InfiniStorageCrate( ) {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(50f, 1200f)
                .sound(SoundType.METAL)
                .harvestLevel(3) // 0 = wood, 1 = stone, 2 = iron, 3 = diamond
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE));
    }


    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return InfiniTileEntityTypes.INFINI_STORAGE_CRATE.get().create();
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if(!worldIn.isRemote){
            TileEntity tile = worldIn.getTileEntity(pos);
            if(tile instanceof InfiniStorageCrateTileEntity){
                NetworkHooks.openGui((ServerPlayerEntity)player, (InfiniStorageCrateTileEntity)tile, pos);
                return ActionResultType.SUCCESS;

            }
        }
        return ActionResultType.FAIL;
    }

    @Override
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        if(state.getBlock() != newState.getBlock()){
            TileEntity te = worldIn.getTileEntity(pos);
            if(te instanceof InfiniStorageCrateTileEntity){
                InventoryHelper.dropItems(worldIn, pos, ((InfiniStorageCrateTileEntity)te).getItems());
                te.remove();
            }
        }
    }

}
