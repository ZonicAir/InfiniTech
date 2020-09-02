package com.zonicair.infinitech.init;

import com.zonicair.infinitech.InfiniTech;
import com.zonicair.infinitech.container.InfiniStorageCrateContainer;
import com.zonicair.infinitech.container.RefinedInfiniStorageCrateContainer;
import com.zonicair.infinitech.container.ReinforcedInfiniStorageCrateContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerTypes {
    public static final DeferredRegister<ContainerType<?>> INFINI_CONTAINER_TYPES = DeferredRegister.create(ForgeRegistries.CONTAINERS, InfiniTech.MOD_ID);


    public static final RegistryObject<ContainerType<InfiniStorageCrateContainer>> INFINI_STORAGE_CRATE_CONTAINER = INFINI_CONTAINER_TYPES.register("infini_storage_crate", () -> IForgeContainerType.create(InfiniStorageCrateContainer::new));
    public static final RegistryObject<ContainerType<RefinedInfiniStorageCrateContainer>> REFINED_INFINI_STORAGE_CRATE_CONTAINER = INFINI_CONTAINER_TYPES.register("refined_infini_storage_crate", () -> IForgeContainerType.create(RefinedInfiniStorageCrateContainer::new));
    public static final RegistryObject<ContainerType<ReinforcedInfiniStorageCrateContainer>> REINFORCED_INFINI_STORAGE_CRATE_CONTAINER = INFINI_CONTAINER_TYPES.register("reinforced_infini_storage_crate", () -> IForgeContainerType.create(ReinforcedInfiniStorageCrateContainer::new));

}
