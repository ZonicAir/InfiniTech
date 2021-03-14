package com.zonicair.infinitech.world;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;

public class BiomeMaker {

    public static Biome makeInfiniForestBiome() {
        BiomeGenerationSettings.Builder generationSettings = genSettings(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG);

        WorldGenRegistries.init();
        DefaultBiomeFeatures.withCavesAndCanyons(generationSettings);
        DefaultBiomeFeatures.withOverworldOres(generationSettings);
        DefaultBiomeFeatures.withEmeraldOre(generationSettings);
        DefaultBiomeFeatures.withAllForestFlowerGeneration(generationSettings);
        DefaultBiomeFeatures.withCommonOverworldBlocks(generationSettings);
        DefaultBiomeFeatures.withStrongholdAndMineshaft(generationSettings);
        MobSpawnInfo.Builder spawnSettings = new MobSpawnInfo.Builder();
        DefaultBiomeFeatures.withPassiveMobs(spawnSettings);

        return biome(Biome.RainType.NONE, Biome.Category.FOREST, 0.01f, 0.3f, 0.6f, 0.01f,
                new BiomeAmbience.Builder().withGrassColor(0x0000FF).setWaterColor(0x00AAFF).setWaterFogColor(0x0000CC)
                        .withFoliageColor(0x0000FF).setFogColor(0x00DDFF).withSkyColor(getSkyForTemp(0.6f)),
                generationSettings, spawnSettings.build());
    }

    private static Biome biome(Biome.RainType precipitation, Biome.Category category, float depth, float scale, float temperature,
                               float downfall, BiomeAmbience.Builder effects, BiomeGenerationSettings.Builder genSettings,
                               MobSpawnInfo spawnSettings) {
        return new Biome.Builder().precipitation(precipitation).category(category).depth(depth).scale(scale)
                .temperature(temperature).downfall(downfall).setEffects(effects.build())
                .withGenerationSettings(genSettings.build()).withMobSpawnSettings(spawnSettings).build();
    }

    private static <C extends ISurfaceBuilderConfig> BiomeGenerationSettings.Builder genSettings(
            SurfaceBuilder<C> surfaceBuilder, C config) {
        return new BiomeGenerationSettings.Builder().withSurfaceBuilder(surfaceBuilder.func_242929_a(config));
    }

    private static int getSkyForTemp(float temperature) {
        float a = MathHelper.clamp(temperature / 3.0f, -1.0f, 1.0f);
        return MathHelper.hsvToRGB(0.62222224f - a * 0.05f, 0.5f + a * 0.1f, 1.0f);
    }
}
