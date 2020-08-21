package com.zonicair.infinitech.world.gen;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.zonicair.infinitech.InfiniTech;
import com.zonicair.infinitech.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = InfiniTech.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class InfiniTechOreGen {
    /*
    Use this if you want to make a filler block type be end stone for end ore generation
    public static OreFeatureConfig.FillerBlockType END_STONE = OreFeatureConfig.FillerBlockType.create("END_STONE", "end_stone", new BlockMatcher(Blocks.END_STONE));
    */
    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event){
        for(Biome biome : ForgeRegistries.BIOMES){
            if(biome.getCategory() == Biome.Category.NETHER){
                genOre(biome, 1, 1, 0, 10, OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.FIERY_INFINI_ORE.get().getDefaultState(), 1);
            } else if(biome.getCategory() == Biome.Category.THEEND){

            } else {
                genOre(biome, 1, 1, 0, 18, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.INFINI_ORE.get().getDefaultState(), 2);
            }
        }
    }

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockState, int size){
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockState, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }

}
