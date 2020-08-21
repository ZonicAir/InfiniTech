package com.zonicair.infinitech.util;

import com.zonicair.infinitech.InfiniTech;
import com.zonicair.infinitech.armor.InfiniArmorTier;
import com.zonicair.infinitech.blocks.*;
import com.zonicair.infinitech.items.InfiniFuel;
import com.zonicair.infinitech.items.ItemBase;
import com.zonicair.infinitech.tools.InfiniToolTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InfiniTech.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, InfiniTech.MOD_ID);

    //Register
    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Nuggets
    public static final RegistryObject<Item> INFINI_NUGGET = ITEMS.register("infini_nugget", ItemBase::new);
    public static final RegistryObject<Item> REFINED_INFINI_NUGGET = ITEMS.register("refined_infini_nugget", ItemBase::new);
    public static final RegistryObject<Item> REINFORCED_INFINI_NUGGET = ITEMS.register("reinforced_infini_nugget", ItemBase::new);
    //Dusts
    public static final RegistryObject<Item> INFINI_DUST = ITEMS.register("infini_dust", ItemBase::new);
    public static final RegistryObject<Item> COMPRESSED_INFINI_DUST = ITEMS.register("compressed_infini_dust", ItemBase::new);
    public static final RegistryObject<Item> REFINED_INFINI_DUST = ITEMS.register("refined_infini_dust", ItemBase::new);
    public static final RegistryObject<Item> REINFORCED_INFINI_DUST = ITEMS.register("reinforced_infini_dust", ItemBase::new);
    public static final RegistryObject<Item> FIERY_INFINI_DUST = ITEMS.register("fiery_infini_dust", ItemBase::new);

    //Ingots
    public static final RegistryObject<Item> INFINI_INGOT = ITEMS.register("infini_ingot", ItemBase::new);
    public static final RegistryObject<Item> REFINED_INFINI_INGOT = ITEMS.register("refined_infini_ingot", ItemBase::new);
    public static final RegistryObject<Item> REINFORCED_INFINI_INGOT = ITEMS.register("reinforced_infini_ingot", ItemBase::new);

    //Tool Rods
    public static final RegistryObject<Item> INFINI_ROD = ITEMS.register("infini_rod", ItemBase::new);
    public static final RegistryObject<Item> REFINED_INFINI_ROD = ITEMS.register("refined_infini_rod", ItemBase::new);
    public static final RegistryObject<Item> REINFORCED_INFINI_ROD = ITEMS.register("reinforced_infini_rod", ItemBase::new);

    //Tools (Attack speed is 4 - x, where 4 is the longest
    public static final RegistryObject<SwordItem> INFINI_SWORD = ITEMS.register("infini_sword", () ->
            new SwordItem(InfiniToolTier.INFINI, 2, -2.0F, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<PickaxeItem> INFINI_PICKAXE = ITEMS.register("infini_pickaxe", () ->
            new PickaxeItem(InfiniToolTier.INFINI, 2, -2.0F, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<ShovelItem> INFINI_SHOVEL = ITEMS.register("infini_shovel", () ->
            new ShovelItem(InfiniToolTier.INFINI, 2, -2.0F, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<AxeItem> INFINI_AXE = ITEMS.register("infini_axe", () ->
            new AxeItem(InfiniToolTier.INFINI, 2, -2.0F, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<HoeItem> INFINI_HOE = ITEMS.register("infini_hoe", () ->
            new HoeItem(InfiniToolTier.INFINI, 2, -2.0F, new Item.Properties().group(InfiniTech.TAB)));


    public static final RegistryObject<SwordItem> REFINED_INFINI_SWORD = ITEMS.register("refined_infini_sword", () ->
            new SwordItem(InfiniToolTier.REFINED_INFINI, 4, -3.0F, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<PickaxeItem> REFINED_INFINI_PICKAXE = ITEMS.register("refined_infini_pickaxe", () ->
            new PickaxeItem(InfiniToolTier.REFINED_INFINI, 4, -3.0F, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<ShovelItem> REFINED_INFINI_SHOVEL = ITEMS.register("refined_infini_shovel", () ->
            new ShovelItem(InfiniToolTier.REFINED_INFINI, 4, -3.0F, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<AxeItem> REFINED_INFINI_AXE = ITEMS.register("refined_infini_axe", () ->
            new AxeItem(InfiniToolTier.REFINED_INFINI, 4, -3.0F, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<HoeItem> REFINED_INFINI_HOE = ITEMS.register("refined_infini_hoe", () ->
            new HoeItem(InfiniToolTier.REFINED_INFINI, 4, -3.0F, new Item.Properties().group(InfiniTech.TAB)));

    public static final RegistryObject<SwordItem> REINFORCED_INFINI_SWORD = ITEMS.register("reinforced_infini_sword", () ->
            new SwordItem(InfiniToolTier.REINFORCED_INFINI, 8, -3.0F, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<PickaxeItem> REINFORCED_INFINI_PICKAXE = ITEMS.register("reinforced_infini_pickaxe", () ->
            new PickaxeItem(InfiniToolTier.REINFORCED_INFINI, 8, -3.0F, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<ShovelItem> REINFORCED_INFINI_SHOVEL = ITEMS.register("reinforced_infini_shovel", () ->
            new ShovelItem(InfiniToolTier.REINFORCED_INFINI, 8, -3.0F, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<AxeItem> REINFORCED_INFINI_AXE = ITEMS.register("reinforced_infini_axe", () ->
            new AxeItem(InfiniToolTier.REINFORCED_INFINI, 8, -3.0F, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<HoeItem> REINFORCED_INFINI_HOE = ITEMS.register("reinforced_infini_hoe", () ->
            new HoeItem(InfiniToolTier.REINFORCED_INFINI, 8, -3.0F, new Item.Properties().group(InfiniTech.TAB)));

    //Armor
    public static final RegistryObject<ArmorItem> INFINI_HELMET = ITEMS.register("infini_helmet", () ->
            new ArmorItem(InfiniArmorTier.INFINI_ARMOR_TIER, EquipmentSlotType.HEAD, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<ArmorItem> INFINI_CHESTPLATE = ITEMS.register("infini_chestplate", () ->
            new ArmorItem(InfiniArmorTier.INFINI_ARMOR_TIER, EquipmentSlotType.CHEST, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<ArmorItem> INFINI_LEGGINGS = ITEMS.register("infini_leggings", () ->
            new ArmorItem(InfiniArmorTier.INFINI_ARMOR_TIER, EquipmentSlotType.LEGS, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<ArmorItem> INFINI_BOOTS = ITEMS.register("infini_boots", () ->
            new ArmorItem(InfiniArmorTier.INFINI_ARMOR_TIER, EquipmentSlotType.FEET, new Item.Properties().group(InfiniTech.TAB)));

    public static final RegistryObject<ArmorItem> REFINED_INFINI_HELMET = ITEMS.register("refined_infini_helmet", () ->
            new ArmorItem(InfiniArmorTier.REFINED_INFINI_ARMOR_TIER, EquipmentSlotType.HEAD, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<ArmorItem> REFINED_INFINI_CHESTPLATE = ITEMS.register("refined_infini_chestplate", () ->
            new ArmorItem(InfiniArmorTier.REFINED_INFINI_ARMOR_TIER, EquipmentSlotType.CHEST, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<ArmorItem> REFINED_INFINI_LEGGINGS = ITEMS.register("refined_infini_leggings", () ->
            new ArmorItem(InfiniArmorTier.REFINED_INFINI_ARMOR_TIER, EquipmentSlotType.LEGS, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<ArmorItem> REFINED_INFINI_BOOTS = ITEMS.register("refined_infini_boots", () ->
            new ArmorItem(InfiniArmorTier.REFINED_INFINI_ARMOR_TIER, EquipmentSlotType.FEET, new Item.Properties().group(InfiniTech.TAB)));

    public static final RegistryObject<ArmorItem> REINFORCED_INFINI_HELMET = ITEMS.register("reinforced_infini_helmet", () ->
            new ArmorItem(InfiniArmorTier.REINFORCED_INFINI_ARMOR_TIER, EquipmentSlotType.HEAD, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<ArmorItem> REINFORCED_INFINI_CHESTPLATE = ITEMS.register("reinforced_infini_chestplate", () ->
            new ArmorItem(InfiniArmorTier.REINFORCED_INFINI_ARMOR_TIER, EquipmentSlotType.CHEST, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<ArmorItem> REINFORCED_INFINI_LEGGINGS = ITEMS.register("reinforced_infini_leggings", () ->
            new ArmorItem(InfiniArmorTier.REINFORCED_INFINI_ARMOR_TIER, EquipmentSlotType.LEGS, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<ArmorItem> REINFORCED_INFINI_BOOTS = ITEMS.register("reinforced_infini_boots", () ->
            new ArmorItem(InfiniArmorTier.REINFORCED_INFINI_ARMOR_TIER, EquipmentSlotType.FEET, new Item.Properties().group(InfiniTech.TAB)));
    //Fuel
    public static final RegistryObject<Item> INFINI_FUEL = ITEMS.register("infini_fuel", () ->
            new InfiniFuel(new Item.Properties().group(InfiniTech.TAB)));

    //Blocks
    public static final RegistryObject<Block> INFINI_BLOCK = BLOCKS.register("infini_block", InfiniBlock::new);
    public static final RegistryObject<Block> INFINI_ORE = BLOCKS.register("infini_ore", InfiniOre::new);
    public static final RegistryObject<Block> FIERY_INFINI_ORE = BLOCKS.register("fiery_infini_ore", InfiniOre::new);
    public static final RegistryObject<Block> REFINED_INFINI_BLOCK = BLOCKS.register("refined_infini_block", RefinedInfiniBlock::new);
    public static final RegistryObject<Block> REINFORCED_INFINI_BLOCK = BLOCKS.register("reinforced_infini_block", ReinforcedInfiniBlock::new);

    //Machines
    public static final RegistryObject<Block> INFINI_FURNACE = BLOCKS.register("infini_furnace", InfiniFurnace::new);


    //BlockItems (Blocks)
    public static final RegistryObject<Item> INFINI_BLOCK_ITEM = ITEMS.register("infini_block",() -> new BlockItemBase(INFINI_BLOCK.get()));
    public static final RegistryObject<Item> INFINI_ORE_ITEM = ITEMS.register("infini_ore",() -> new BlockItemBase(INFINI_ORE.get()));
    public static final RegistryObject<Item> FIERY_INFINI_ORE_ITEM = ITEMS.register("fiery_infini_ore",() -> new BlockItemBase(FIERY_INFINI_ORE.get()));
    public static final RegistryObject<Item> REFINED_INFINI_BLOCK_ITEM = ITEMS.register("refined_infini_block",() -> new BlockItemBase(REFINED_INFINI_BLOCK.get()));
    public static final RegistryObject<Item> REINFORCED_INFINI_BLOCK_ITEM = ITEMS.register("reinforced_infini_block",() -> new BlockItemBase(REINFORCED_INFINI_BLOCK.get()));

    //BlockItems (Machines)
    public static final RegistryObject<Item> INFINI_FURNACE_ITEM = ITEMS.register("infini_furnace",() -> new BlockItemBase(INFINI_FURNACE.get()));


}


