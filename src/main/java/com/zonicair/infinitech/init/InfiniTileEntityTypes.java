package com.zonicair.infinitech.init;

import com.zonicair.infinitech.InfiniTech;
import com.zonicair.infinitech.tileentity.InfiniStorageCrateTileEntity;
import com.zonicair.infinitech.tileentity.RefinedInfiniStorageCrateTileEntity;
import com.zonicair.infinitech.tileentity.ReinforcedInfiniStorageCrateTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InfiniTileEntityTypes {
    public static final DeferredRegister<TileEntityType<?>> TILES_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, InfiniTech.MOD_ID);

    //Chest Tile Entities
    public static final RegistryObject<TileEntityType<InfiniStorageCrateTileEntity>> INFINI_STORAGE_CRATE = TILES_ENTITIES
            .register("infini_storage_crate", () -> TileEntityType.Builder
                    .create(InfiniStorageCrateTileEntity::new, BlockRegistryHandler.INFINI_STORAGE_CRATE.get()).build(null));

    public static final RegistryObject<TileEntityType<RefinedInfiniStorageCrateTileEntity>> REFINED_INFINI_STORAGE_CRATE = TILES_ENTITIES
            .register("refined_infini_storage_crate", () -> TileEntityType.Builder
                    .create(RefinedInfiniStorageCrateTileEntity::new, BlockRegistryHandler.REFINED_INFINI_STORAGE_CRATE.get()).build(null));

    public static final RegistryObject<TileEntityType<ReinforcedInfiniStorageCrateTileEntity>> REINFORCED_INFINI_STORAGE_CRATE = TILES_ENTITIES
            .register("reinforced_infini_storage_crate", () -> TileEntityType.Builder
                    .create(ReinforcedInfiniStorageCrateTileEntity::new, BlockRegistryHandler.REINFORCED_INFINI_STORAGE_CRATE.get()).build(null));


}
