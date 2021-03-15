package com.zonicair.infinitech.init;

import com.zonicair.infinitech.InfiniTech;
import com.zonicair.infinitech.items.InfiniFuel;
import com.zonicair.infinitech.items.ItemBase;
import com.zonicair.infinitech.tools.InfiniToolTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ToolItemRegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InfiniTech.MOD_ID);

    //Tool Rods
    public static final RegistryObject<Item> INFINI_ROD = ITEMS.register("infini_rod", ItemBase::new);
    public static final RegistryObject<Item> REFINED_INFINI_ROD = ITEMS.register("refined_infini_rod", ItemBase::new);
    public static final RegistryObject<Item> PERPETUAL_INFINI_ROD = ITEMS.register("perpetual_infini_rod", ItemBase::new);

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

    public static final RegistryObject<SwordItem> PERPETUAL_INFINI_SWORD = ITEMS.register("perpetual_infini_sword", () ->
            new SwordItem(InfiniToolTier.PERPETUAL_INFINI, 8, -3.5F, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<PickaxeItem> PERPETUAL_INFINI_PICKAXE = ITEMS.register("perpetual_infini_pickaxe", () ->
            new PickaxeItem(InfiniToolTier.PERPETUAL_INFINI, 8, -3.5F, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<ShovelItem> PERPETUAL_INFINI_SHOVEL = ITEMS.register("perpetual_infini_shovel", () ->
            new ShovelItem(InfiniToolTier.PERPETUAL_INFINI, 8, -3.5F, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<AxeItem> PERPETUAL_INFINI_AXE = ITEMS.register("perpetual_infini_axe", () ->
            new AxeItem(InfiniToolTier.PERPETUAL_INFINI, 8, -3.5F, new Item.Properties().group(InfiniTech.TAB)));
    public static final RegistryObject<HoeItem> PERPETUAL_INFINI_HOE = ITEMS.register("perpetual_infini_hoe", () ->
            new HoeItem(InfiniToolTier.PERPETUAL_INFINI, 8, -3.5F, new Item.Properties().group(InfiniTech.TAB)));



}
