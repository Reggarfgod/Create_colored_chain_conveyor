package com.reggarf.mods.create_colored_chain_conveyor.ponder;




import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.minecraft.resources.ResourceLocation;

import static com.reggarf.mods.create_colored_chain_conveyor.CCCC.MODID;

public class CCCCPonderPlugin implements PonderPlugin {
    @Override
    public String getModId() {
        return MODID;
    }

    @Override
    public void registerScenes(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        CCCCPonderIndex.register(helper);
    }

    @Override
    public void registerTags(PonderTagRegistrationHelper<ResourceLocation> helper) {
        CCCCPonderTags.register(helper);
    }
}
