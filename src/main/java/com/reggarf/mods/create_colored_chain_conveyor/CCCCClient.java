package com.reggarf.mods.create_colored_chain_conveyor;


import com.reggarf.mods.create_colored_chain_conveyor.ponder.CCCCPonderPlugin;
import com.reggarf.mods.create_colored_chain_conveyor.registries.CCCCPartialModels;
import net.createmod.ponder.foundation.PonderIndex;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static net.minecraftforge.common.MinecraftForge.EVENT_BUS;

public class CCCCClient {

    public static void onCtorClient(IEventBus modEventBus) {

        modEventBus.addListener(CCCCClient::clientInit);
        modEventBus.addListener(CCCCClient::onRegisterAdditionalModels);
    }
    public static void clientInit(final FMLClientSetupEvent event) {
        CCCCPartialModels.init();
        PonderIndex.addPlugin(new CCCCPonderPlugin());
    }
    public static void onRegisterAdditionalModels(ModelEvent.RegisterAdditional event){
        CCCCPartialModels.ALL_ENCASED_MODELS.forEach(m->event.register(m.modelLocation()));
    }
}