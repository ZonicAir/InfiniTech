package com.zonicair.infinitech.util;

import com.zonicair.infinitech.InfiniTech;
import com.zonicair.infinitech.client.gui.InfiniStorageCrateScreen;
import com.zonicair.infinitech.client.gui.RefinedInfiniStorageCrateScreen;
import com.zonicair.infinitech.client.gui.PerpetualInfiniStorageCrateScreen;
import com.zonicair.infinitech.init.ContainerTypes;
import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = InfiniTech.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event){
        ScreenManager.registerFactory(ContainerTypes.INFINI_STORAGE_CRATE_CONTAINER.get(), InfiniStorageCrateScreen::new);
        ScreenManager.registerFactory(ContainerTypes.REFINED_INFINI_STORAGE_CRATE_CONTAINER.get(), RefinedInfiniStorageCrateScreen::new);
        ScreenManager.registerFactory(ContainerTypes.PERPETUAL_INFINI_STORAGE_CRATE_CONTAINER.get(), PerpetualInfiniStorageCrateScreen::new);

    }
}
