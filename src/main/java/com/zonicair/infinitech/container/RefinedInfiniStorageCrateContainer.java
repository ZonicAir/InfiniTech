package com.zonicair.infinitech.container;

import com.zonicair.infinitech.init.BlockRegistryHandler;
import com.zonicair.infinitech.init.ContainerTypes;
import com.zonicair.infinitech.tileentity.RefinedInfiniStorageCrateTileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IWorldPosCallable;

import java.util.Objects;

public class RefinedInfiniStorageCrateContainer extends Container {

    public final RefinedInfiniStorageCrateTileEntity tileEntity;
    private final IWorldPosCallable canInteractWithCallable;

    public RefinedInfiniStorageCrateContainer(final int windowID, final PlayerInventory playerInventory, final RefinedInfiniStorageCrateTileEntity tileEntity) {
        super(ContainerTypes.REFINED_INFINI_STORAGE_CRATE_CONTAINER.get(), windowID);
        this.tileEntity = tileEntity;
        this.canInteractWithCallable = IWorldPosCallable.of(tileEntity.getWorld(), tileEntity.getPos());

        //Chest Inventory Slot Creation (loops through slots)
        int startX = 8;
        int startY = 18;
        int startPlayerInvX = 8;
        int startPlayerInvY = 194;
        int slotSizePlus2 = 18;

        for(int row = 0; row < 9; ++row){
            for(int column = 0; column < 9; ++column){
                this.addSlot(new Slot(tileEntity, (row * 9) + column, startX + (column * slotSizePlus2), startY + (row *slotSizePlus2)));
            }
        }

        //Main Player Inventory Slot Creation (loops through slots)
        for(int row = 0; row < 3; ++row){
            for(int column = 0; column < 9; ++column){
                this.addSlot(new Slot(playerInventory, 9 + (row * 9) + column,startPlayerInvX + (column * slotSizePlus2),startPlayerInvY + (row *slotSizePlus2)));
            }
        }

        //Hotbar Slot Creation (loops through slots)
        int hotbarY = startPlayerInvY + 58;
        for(int column = 0; column < 9; ++column){
            this.addSlot(new Slot(playerInventory, column, startPlayerInvX + (column * slotSizePlus2), hotbarY));
        }
    }

    private static RefinedInfiniStorageCrateTileEntity getTileEntity(final PlayerInventory playerInventory, final PacketBuffer data){
        Objects.requireNonNull(playerInventory, "playerInventory cannot be null");
        Objects.requireNonNull(data, "data cannot be null");
        final TileEntity tileAtPos = playerInventory.player.world.getTileEntity(data.readBlockPos());
        if(tileAtPos instanceof RefinedInfiniStorageCrateTileEntity){
            return (RefinedInfiniStorageCrateTileEntity)tileAtPos;
        }
        throw new IllegalStateException("Tile Entity is not correct!" + tileAtPos);
    }

    public RefinedInfiniStorageCrateContainer(final int windowID, final PlayerInventory playerInventory, final PacketBuffer data){
            this(windowID, playerInventory, getTileEntity(playerInventory, data));
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return isWithinUsableDistance(canInteractWithCallable, playerIn, BlockRegistryHandler.REFINED_INFINI_STORAGE_CRATE.get());
    }


    //Index Value here is Total #of slots in chest
    @Override
    public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);
        if(slot != null && slot.getHasStack()){
            ItemStack itemstack1 = slot.getStack();
            itemStack = itemstack1.copy();
            if(index < 81){
                if(!this.mergeItemStack(itemstack1, 81, this.inventorySlots.size(), true)){
                    return ItemStack.EMPTY;
                }
            }else if(!this.mergeItemStack(itemstack1, 0, 81, false)){
                return ItemStack.EMPTY;
            }
            if(itemstack1.isEmpty()){
                slot.putStack(ItemStack.EMPTY);
            }else{
                slot.onSlotChanged();
            }
        }
        return itemStack;
    }
}
