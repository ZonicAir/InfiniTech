package com.zonicair.infinitech.armor;

import com.zonicair.infinitech.InfiniTech;
import com.zonicair.infinitech.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum InfiniArmorTier implements IArmorMaterial {

    //layer path is itech:infini_armor_layer_1/2
    INFINI_ARMOR_TIER(InfiniTech.MOD_ID + ":infini_armor", 40, new int[] {4, 10, 8, 5}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.5F, 0.3F, () -> {
        return Ingredient.fromItems(RegistryHandler.INFINI_INGOT.get());
    }),

    REFINED_INFINI_ARMOR_TIER(InfiniTech.MOD_ID + ":refined_infini_armor", 80, new int[] {8, 20, 16, 10}, 40, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 5.0F, 0.6F, () -> {
        return Ingredient.fromItems(RegistryHandler.REFINED_INFINI_INGOT.get());
    }),

    REINFORCED_INFINI_ARMOR_TIER(InfiniTech.MOD_ID + ":reinforced_infini_armor", 160, new int[] {16, 40, 32, 20}, 80, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.0F, 1.2F, () -> {
        return Ingredient.fromItems(RegistryHandler.REINFORCED_INFINI_INGOT.get());
    })
    ;

    //boots, leggings, chestplate, helmet
    private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairMaterial;

    InfiniArmorTier(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairMaterial = repairMaterial;
    }


    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float func_230304_f_() {
        return this.knockbackResistance;
    }
}
