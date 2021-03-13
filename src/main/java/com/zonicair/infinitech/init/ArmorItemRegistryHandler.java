package com.zonicair.infinitech.init;

import com.zonicair.infinitech.InfiniTech;
import com.zonicair.infinitech.armor.InfiniArmorTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ArmorItemRegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InfiniTech.MOD_ID);

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

    public static final RegistryObject<ArmorItem> PERPETUAL_INFINI_HELMET = ITEMS.register("perpetual_infini_helmet", () ->
            new ArmorItem(InfiniArmorTier.PERPETUAL_INFINI_ARMOR_TIER, EquipmentSlotType.HEAD, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<ArmorItem> PERPETUAL_INFINI_CHESTPLATE = ITEMS.register("perpetual_infini_chestplate", () ->
            new ArmorItem(InfiniArmorTier.PERPETUAL_INFINI_ARMOR_TIER, EquipmentSlotType.CHEST, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<ArmorItem> PERPETUAL_INFINI_LEGGINGS = ITEMS.register("perpetual_infini_leggings", () ->
            new ArmorItem(InfiniArmorTier.PERPETUAL_INFINI_ARMOR_TIER, EquipmentSlotType.LEGS, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<ArmorItem> PERPETUAL_INFINI_BOOTS = ITEMS.register("perpetual_infini_boots", () ->
            new ArmorItem(InfiniArmorTier.PERPETUAL_INFINI_ARMOR_TIER, EquipmentSlotType.FEET, new Item.Properties().group(InfiniTech.TAB)));

}
