package com.zonicair.infinitech.world.gen;

import com.zonicair.infinitech.InfiniTech;
import com.zonicair.infinitech.init.BlockRegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = InfiniTech.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class InfiniTechOreGen {
    /*
    Use this if you want to make a filler block type be end stone for end ore generation
    public static OreFeatureConfig.FillerBlockType END_STONE = OreFeatureConfig.FillerBlockType.create("END_STONE", "end_stone", new BlockMatcher(Blocks.END_STONE));
    */
    public static void generateOres(final BiomeLoadingEvent event){
            if(event.getCategory().equals(Biome.Category.NETHER)){

                genOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistryHandler.FIERY_INFINI_ORE.get().getDefaultState(), 5, 0, 10, 1);

            } else if(event.getCategory().equals(Biome.Category.THEEND)){

            } else {
                genOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistryHandler.INFINI_ORE.get().getDefaultState(), 5, 0, 18, 2);
                genOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistryHandler.INFINI_ORE.get().getDefaultState(), 4, 25, 75, 4);
            }

    }

    private static void genOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int count){
        settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize))
                        .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight))).square().count(count));
    }

}
