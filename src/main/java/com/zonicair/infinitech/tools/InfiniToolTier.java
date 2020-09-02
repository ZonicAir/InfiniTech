package com.zonicair.infinitech.tools;

import com.zonicair.infinitech.init.ItemRegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum InfiniToolTier implements IItemTier {

    //Tool Tiers
        //Mining Tier, Durability(Uses), Efficiency, Base AttackDamage (1 + this.attackDamage + damage in item registry) , enchantability, repairMaterial
    INFINI(3, 1600, 9.0F, 4.0F, 22, () -> {
        return Ingredient.fromItems(ItemRegistryHandler.INFINI_INGOT.get());
    }),

    REFINED_INFINI(4, 3200, 15.0F, 8.0F, 33, () -> {
        return Ingredient.fromItems(ItemRegistryHandler.REFINED_INFINI_INGOT.get());
    }),

    REINFORCED_INFINI(5, 6400, 30.0F, 16.0F, 42, () -> {
        return Ingredient.fromItems(ItemRegistryHandler.REINFORCED_INFINI_INGOT.get());
    });
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    InfiniToolTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }
    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
