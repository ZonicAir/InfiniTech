package com.zonicair.infinitech.init;

import com.zonicair.infinitech.InfiniTech;
import com.zonicair.infinitech.world.BiomeMaker;
//import com.zonicair.infinitech.world.biomes.InfiniForest;
import net.minecraft.block.Blocks;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = InfiniTech.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BiomeRegistryHandler {
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, InfiniTech.MOD_ID);

    public static final RegistryObject<Biome> INFINI_FOREST = BIOMES.register("infini_forest", BiomeMaker::makeInfiniForestBiome);
    public static final RegistryKey<Biome> INFINI_FOREST_KEY = RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
            new ResourceLocation(InfiniTech.MOD_ID, "infini_forest"));


    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void biomeLoading(BiomeLoadingEvent event){
        if(event.getName().equals(INFINI_FOREST.get().getRegistryName())){
            BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(INFINI_FOREST_KEY, 50));
            BiomeDictionary.addTypes(INFINI_FOREST_KEY, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.RARE);
        }
    }

    /*public static final RegistryObject<Biome> INFINI_FOREST = BIOMES.register("infini_forest", () -> new InfiniForest(new Biome.Builder().precipitation(Biome.RainType.RAIN).downfall(0.01F).scale(.2F).temperature(0.5F)   // scale .2 depth .2
             //New Biome Ambience                         setFogColor             setMusic       setAdditionsSound  setMoodSound     setParticle        setWaterColor       setWaterFogColor       setAmbientSound     .build
            .setEffects((new BiomeAmbience.Builder().setFogColor(48383).func_235240_a_().func_235242_a_().func_235243_a_().func_235244_a_().setWaterColor(255).setWaterFogColor(25343)/*.func_235241_a_().build()))
            .surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(BlockRegistryHandler.INFINI_GRASS_BLOCK.get().getDefaultState(), BlockRegistryHandler.INFINI_DIRT_BLOCK.get().getDefaultState(), Blocks.CLAY.getDefaultState()))
            .category(Biome.Category.FOREST).downfall(0.3F).depth(.2F).parent(null)));


        */
    /*
    public static void registerBiomes(){
        registerBiome(INFINI_FOREST.get(),1, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.OVERWORLD);
    }



    private static void registerBiome(Biome biome, int weight, BiomeDictionary.Type... types){
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, weight));
        BiomeDictionary.addTypes(biome, types);

    }
    */


}


