package com.zonicair.infinitech.init;

import com.zonicair.infinitech.InfiniTech;
import com.zonicair.infinitech.blocks.*;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistryHandler {

    //Deferred Registries
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, InfiniTech.MOD_ID);
    public static final DeferredRegister<Item> BLOCKITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InfiniTech.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> INFINI_BLOCK = BLOCKS.register("infini_block", InfiniBlock::new);
    public static final RegistryObject<Block> REFINED_INFINI_BLOCK = BLOCKS.register("refined_infini_block", RefinedInfiniBlock::new);
    public static final RegistryObject<Block> REINFORCED_INFINI_BLOCK = BLOCKS.register("reinforced_infini_block", ReinforcedInfiniBlock::new);
    public static final RegistryObject<Block> INFINI_DIRT_BLOCK = BLOCKS.register("infini_dirt", InfiniDirt::new);
    public static final RegistryObject<Block> INFINI_GRASS_BLOCK = BLOCKS.register("infini_grass_block", InfiniGrassBlock::new);

    //Ore
    public static final RegistryObject<Block> INFINI_ORE = BLOCKS.register("infini_ore", InfiniOre::new);
    public static final RegistryObject<Block> INFINI_FUEL_ORE = BLOCKS.register("infini_fuel_ore", InfiniFuelOre::new);
    public static final RegistryObject<Block> FIERY_INFINI_ORE = BLOCKS.register("fiery_infini_ore", FieryInfiniOre::new);

    //Chests
    public static final RegistryObject<Block> INFINI_STORAGE_CRATE = BLOCKS.register("infini_storage_crate", InfiniStorageCrate::new);
    public static final RegistryObject<Block> REFINED_INFINI_STORAGE_CRATE = BLOCKS.register("refined_infini_storage_crate", RefinedInfiniStorageCrate::new);
    public static final RegistryObject<Block> REINFORCED_INFINI_STORAGE_CRATE = BLOCKS.register("reinforced_infini_storage_crate", RefinedInfiniStorageCrate::new);

    //Machines
    public static final RegistryObject<Block> INFINI_FURNACE = BLOCKS.register("infini_furnace", InfiniFurnace::new);

    //Fuel
    public static final RegistryObject<Block> INFINI_FUEL_BLOCK = BLOCKS.register("infini_fuel_block", InfiniFuelBlock::new);

    //BlockItems (Blocks)
    public static final RegistryObject<Item> INFINI_BLOCK_ITEM = BLOCKITEMS.register("infini_block",() -> new BlockItemBase(INFINI_BLOCK.get()));
    public static final RegistryObject<Item> REFINED_INFINI_BLOCK_ITEM = BLOCKITEMS.register("refined_infini_block",() -> new BlockItemBase(REFINED_INFINI_BLOCK.get()));
    public static final RegistryObject<Item> REINFORCED_INFINI_BLOCK_ITEM = BLOCKITEMS.register("reinforced_infini_block",() -> new BlockItemBase(REINFORCED_INFINI_BLOCK.get()));
    public static final RegistryObject<Item> INFINI_DIRT_BLOCK_ITEM = BLOCKITEMS.register("infini_dirt",() -> new BlockItemBase(INFINI_DIRT_BLOCK.get()));
    public static final RegistryObject<Item> INFINI_GRASS_BLOCK_ITEM = BLOCKITEMS.register("infini_grass_block",() -> new BlockItemBase(INFINI_GRASS_BLOCK.get()));


    //BlockItems(Ore)
    public static final RegistryObject<Item> INFINI_ORE_ITEM = BLOCKITEMS.register("infini_ore",() -> new BlockItemBase(INFINI_ORE.get()));
    public static final RegistryObject<Item> INFINI_FUEL_ORE_ITEM = BLOCKITEMS.register("infini_fuel_ore",() -> new BlockItemBase(INFINI_FUEL_ORE.get()));
    public static final RegistryObject<Item> FIERY_INFINI_ORE_ITEM = BLOCKITEMS.register("fiery_infini_ore",() -> new BlockItemBase(FIERY_INFINI_ORE.get()));
    //BlockItems(Chests)
    public static final RegistryObject<Item> INFINI_STORAGE_CRATE_ITEM = BLOCKITEMS.register("infini_storage_crate", () -> new BlockItemBase((INFINI_STORAGE_CRATE.get())));
    public static final RegistryObject<Item> REFINED_INFINI_STORAGE_CRATE_ITEM = BLOCKITEMS.register("refined_infini_storage_crate", () -> new BlockItemBase((REFINED_INFINI_STORAGE_CRATE.get())));
    public static final RegistryObject<Item> REINFORCED_INFINI_STORAGE_CRATE_ITEM = BLOCKITEMS.register("reinforced_infini_storage_crate", () -> new BlockItemBase((REINFORCED_INFINI_STORAGE_CRATE.get())));

    //BlockItems (Machines)
    public static final RegistryObject<Item> INFINI_FURNACE_ITEM = BLOCKITEMS.register("infini_furnace",() -> new BlockItemBase(INFINI_FURNACE.get()));

    //BlockItems (FuelBlocks)
    public static final RegistryObject<Item> INFINI_FUEL_BLOCK_ITEM = BLOCKITEMS.register("infini_fuel_block",() -> new InfiniFuelBlockItem(INFINI_FUEL_BLOCK.get()));

}
