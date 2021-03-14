package com.zonicair.infinitech;

import com.zonicair.infinitech.init.*;
import com.zonicair.infinitech.world.gen.InfiniTechOreGen;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(InfiniTech.MOD_ID)
//@Mod.EventBusSubscriber(modid = InfiniTech.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class InfiniTech
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "itech";

    public InfiniTech() {
        IEventBus event = FMLJavaModLoadingContext.get().getModEventBus();
        event.addListener(this::setup);

        ItemRegistryHandler.ITEMS.register(event);
        ArmorItemRegistryHandler.ITEMS.register(event);
        ToolItemRegistryHandler.ITEMS.register(event);
        BlockRegistryHandler.BLOCKITEMS.register(event);
        BlockRegistryHandler.BLOCKS.register(event);
        InfiniTileEntityTypes.TILES_ENTITIES.register(event);
        ContainerTypes.INFINI_CONTAINER_TYPES.register(event);
        BiomeRegistryHandler.BIOMES.register(event);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, BiomeRegistryHandler::biomeLoading);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, InfiniTechOreGen::generateOres);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    public static final ItemGroup TAB = new ItemGroup("infiniTechTab") {
        @Override
        public ItemStack createIcon(){
            return new ItemStack(ItemRegistryHandler.INFINI_DUST.get());
         }
    };
}
