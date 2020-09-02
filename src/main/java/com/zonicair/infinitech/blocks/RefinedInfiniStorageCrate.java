package com.zonicair.infinitech.blocks;

import com.zonicair.infinitech.init.InfiniTileEntityTypes;
import com.zonicair.infinitech.tileentity.InfiniStorageCrateTileEntity;
import com.zonicair.infinitech.tileentity.RefinedInfiniStorageCrateTileEntity;
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

public class RefinedInfiniStorageCrate extends Block {


    public RefinedInfiniStorageCrate() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(75f, 1800f)
                .sound(SoundType.METAL)
                .harvestLevel(5) // 0 = wood, 1 = stone, 2 = iron, 3 = diamond
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE));
    }


    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return InfiniTileEntityTypes.REFINED_INFINI_STORAGE_CRATE.get().create();
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isRemote) {
            TileEntity tile = worldIn.getTileEntity(pos);
            if (tile instanceof RefinedInfiniStorageCrateTileEntity) {
                NetworkHooks.openGui((ServerPlayerEntity) player, (RefinedInfiniStorageCrateTileEntity) tile, pos);
                return ActionResultType.SUCCESS;

            }
        }
        return ActionResultType.FAIL;
    }

    @Override
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        if (state.getBlock() != newState.getBlock()) {
            TileEntity te = worldIn.getTileEntity(pos);
            if (te instanceof RefinedInfiniStorageCrateTileEntity) {
                InventoryHelper.dropItems(worldIn, pos, ((RefinedInfiniStorageCrateTileEntity) te).getItems());
                te.remove();
            }
        }
    }

}
