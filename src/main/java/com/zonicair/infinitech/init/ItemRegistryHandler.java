package com.zonicair.infinitech.init;

import com.zonicair.infinitech.InfiniTech;
import com.zonicair.infinitech.armor.InfiniArmorTier;
import com.zonicair.infinitech.items.InfiniFuel;
import com.zonicair.infinitech.items.ItemBase;
import com.zonicair.infinitech.tools.InfiniToolTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistryHandler {
    //Look in net.minecraft:client:extra:1.16.x to find block jsons, crafting jsons, etc.


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InfiniTech.MOD_ID);


    //Nuggets
    public static final RegistryObject<Item> INFINI_NUGGET = ITEMS.register("infini_nugget", ItemBase::new);
    public static final RegistryObject<Item> REFINED_INFINI_NUGGET = ITEMS.register("refined_infini_nugget", ItemBase::new);
    public static final RegistryObject<Item> PERPETUAL_INFINI_NUGGET = ITEMS.register("perpetual_infini_nugget", ItemBase::new);
    //Dusts
    public static final RegistryObject<Item> INFINI_DUST = ITEMS.register("infini_dust", ItemBase::new);
    public static final RegistryObject<Item> COMPRESSED_INFINI_DUST = ITEMS.register("compressed_infini_dust", ItemBase::new);
    public static final RegistryObject<Item> REFINED_INFINI_DUST = ITEMS.register("refined_infini_dust", ItemBase::new);
    public static final RegistryObject<Item> PERPETUAL_INFINI_DUST = ITEMS.register("perpetual_infini_dust", ItemBase::new);
    public static final RegistryObject<Item> FIERY_INFINI_DUST = ITEMS.register("fiery_infini_dust", ItemBase::new);
    //Ingots
    public static final RegistryObject<Item> INFINI_INGOT = ITEMS.register("infini_ingot", ItemBase::new);
    public static final RegistryObject<Item> REFINED_INFINI_INGOT = ITEMS.register("refined_infini_ingot", ItemBase::new);
    public static final RegistryObject<Item> PERPETUAL_INFINI_INGOT = ITEMS.register("perpetual_infini_ingot", ItemBase::new);
    //Fuel
    public static final RegistryObject<Item> INFINI_FUEL = ITEMS.register("infini_fuel", () ->
            new InfiniFuel(new Item.Properties().group(InfiniTech.TAB)));



}


