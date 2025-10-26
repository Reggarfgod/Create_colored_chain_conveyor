package com.reggarf.mods.create_colored_chain_conveyor.ponder;

import com.reggarf.mods.create_colored_chain_conveyor.registries.CCCCBlocks;
import com.reggarf.mods.create_extra_casing.CEC;
import com.reggarf.mods.create_extra_casing.registry.CECBlocks;
import com.simibubi.create.AllBlocks;
import com.tterrag.registrate.util.entry.RegistryEntry;

import net.createmod.catnip.platform.CatnipServices;
import net.createmod.catnip.platform.services.RegisteredObjectsHelper;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;

import static com.simibubi.create.infrastructure.ponder.AllCreatePonderTags.KINETIC_RELAYS;

public class CCCCPonderTags {

    private static ResourceLocation loc(String id) {
        return CEC.asResource(id);
    }

    public static void register(PonderTagRegistrationHelper<ResourceLocation> helper) {
        PonderTagRegistrationHelper<RegistryEntry<?>> HELPER = helper.withKeyFunction(RegistryEntry::getId);
        PonderTagRegistrationHelper<ItemLike> itemHelper = helper.withKeyFunction(
                CatnipServices.REGISTRIES::getKeyOrThrow);


        HELPER.addToTag(KINETIC_RELAYS)
                //BASE
                .add(CCCCBlocks.BRASS_CHAIN_CONVEYOR)
                .add(CCCCBlocks.COPPER_CHAIN_CONVEYOR)

                // --- Andesite colored conveyors ---
                .add(CCCCBlocks.RED_ANDESITE_CHAIN_CONVEYOR)
                .add(CCCCBlocks.BLACK_ANDESITE_CHAIN_CONVEYOR)
                .add(CCCCBlocks.GRAY_ANDESITE_CHAIN_CONVEYOR)
                .add(CCCCBlocks.BLUE_ANDESITE_CHAIN_CONVEYOR)
                .add(CCCCBlocks.LIGHT_BLUE_ANDESITE_CHAIN_CONVEYOR)
                .add(CCCCBlocks.LIGHT_GRAY_ANDESITE_CHAIN_CONVEYOR)
                .add(CCCCBlocks.WHITE_ANDESITE_CHAIN_CONVEYOR)
                .add(CCCCBlocks.GREEN_ANDESITE_CHAIN_CONVEYOR)
                .add(CCCCBlocks.LIME_ANDESITE_CHAIN_CONVEYOR)
                .add(CCCCBlocks.MAGENTA_ANDESITE_CHAIN_CONVEYOR)
                .add(CCCCBlocks.PURPLE_ANDESITE_CHAIN_CONVEYOR)
                .add(CCCCBlocks.PINK_ANDESITE_CHAIN_CONVEYOR)
                .add(CCCCBlocks.BROWN_ANDESITE_CHAIN_CONVEYOR)
                .add(CCCCBlocks.YELLOW_ANDESITE_CHAIN_CONVEYOR)
                .add(CCCCBlocks.ORANGE_ANDESITE_CHAIN_CONVEYOR)
                .add(CCCCBlocks.CYAN_ANDESITE_CHAIN_CONVEYOR)

                // --- Brass colored conveyors ---
                .add(CCCCBlocks.BLACK_BRASS_CHAIN_CONVEYOR)
                .add(CCCCBlocks.RED_BRASS_CHAIN_CONVEYOR)
                .add(CCCCBlocks.GRAY_BRASS_CHAIN_CONVEYOR)
                .add(CCCCBlocks.BLUE_BRASS_CHAIN_CONVEYOR)
                .add(CCCCBlocks.LIGHT_BLUE_BRASS_CHAIN_CONVEYOR)
                .add(CCCCBlocks.LIGHT_GRAY_BRASS_CHAIN_CONVEYOR)
                .add(CCCCBlocks.WHITE_BRASS_CHAIN_CONVEYOR)
                .add(CCCCBlocks.GREEN_BRASS_CHAIN_CONVEYOR)
                .add(CCCCBlocks.LIME_BRASS_CHAIN_CONVEYOR)
                .add(CCCCBlocks.MAGENTA_BRASS_CHAIN_CONVEYOR)
                .add(CCCCBlocks.PURPLE_BRASS_CHAIN_CONVEYOR)
                .add(CCCCBlocks.PINK_BRASS_CHAIN_CONVEYOR)
                .add(CCCCBlocks.BROWN_BRASS_CHAIN_CONVEYOR)
                .add(CCCCBlocks.YELLOW_BRASS_CHAIN_CONVEYOR)
                .add(CCCCBlocks.ORANGE_BRASS_CHAIN_CONVEYOR)
                .add(CCCCBlocks.CYAN_BRASS_CHAIN_CONVEYOR)

                // --- Copper colored conveyors ---
                .add(CCCCBlocks.BLACK_COPPER_CHAIN_CONVEYOR)
                .add(CCCCBlocks.RED_COPPER_CHAIN_CONVEYOR)
                .add(CCCCBlocks.GRAY_COPPER_CHAIN_CONVEYOR)
                .add(CCCCBlocks.BLUE_COPPER_CHAIN_CONVEYOR)
                .add(CCCCBlocks.LIGHT_BLUE_COPPER_CHAIN_CONVEYOR)
                .add(CCCCBlocks.LIGHT_GRAY_COPPER_CHAIN_CONVEYOR)
                .add(CCCCBlocks.WHITE_COPPER_CHAIN_CONVEYOR)
                .add(CCCCBlocks.GREEN_COPPER_CHAIN_CONVEYOR)
                .add(CCCCBlocks.LIME_COPPER_CHAIN_CONVEYOR)
                .add(CCCCBlocks.MAGENTA_COPPER_CHAIN_CONVEYOR)
                .add(CCCCBlocks.PURPLE_COPPER_CHAIN_CONVEYOR)
                .add(CCCCBlocks.PINK_COPPER_CHAIN_CONVEYOR)
                .add(CCCCBlocks.BROWN_COPPER_CHAIN_CONVEYOR)
                .add(CCCCBlocks.YELLOW_COPPER_CHAIN_CONVEYOR)
                .add(CCCCBlocks.ORANGE_COPPER_CHAIN_CONVEYOR)
                .add(CCCCBlocks.CYAN_COPPER_CHAIN_CONVEYOR)




                .add(AllBlocks.CHAIN_CONVEYOR)
                .add(CECBlocks.BLACK_CASING)
                .add(CECBlocks.RED_CASING)
                .add(CECBlocks.GRAY_CASING)
                .add(CECBlocks.BLUE_CASING)
                .add(CECBlocks.LIGHT_BLUE_CASING)
                .add(CECBlocks.LIGHT_GRAY_CASING)
                .add(CECBlocks.WHITE_CASING)
                .add(CECBlocks.GREEN_CASING)
                .add(CECBlocks.LIME_CASING)
                .add(CECBlocks.MAGENTA_CASING)
                .add(CECBlocks.PURPLE_CASING)
                .add(CECBlocks.PINK_CASING)
                .add(CECBlocks.BROWN_CASING)
                .add(CECBlocks.YELLOW_CASING)
                .add(CECBlocks.ORANGE_CASING)
                .add(CECBlocks.CYAN_CASING)
                .add(CECBlocks.RGB_CASING)
                //BRASS
                .add(CECBlocks.BLACK_BRASS_CASING)
                .add(CECBlocks.RED_BRASS_CASING)
                .add(CECBlocks.GRAY_BRASS_CASING)
                .add(CECBlocks.BLUE_BRASS_CASING)
                .add(CECBlocks.LIGHT_BLUE_BRASS_CASING)
                .add(CECBlocks.LIGHT_GRAY_BRASS_CASING)
                .add(CECBlocks.WHITE_BRASS_CASING)
                .add(CECBlocks.GREEN_BRASS_CASING)
                .add(CECBlocks.LIME_BRASS_CASING)
                .add(CECBlocks.MAGENTA_BRASS_CASING)
                .add(CECBlocks.PURPLE_BRASS_CASING)
                .add(CECBlocks.PINK_BRASS_CASING)
                .add(CECBlocks.BROWN_BRASS_CASING)
                .add(CECBlocks.YELLOW_BRASS_CASING)
                .add(CECBlocks.ORANGE_BRASS_CASING)
                .add(CECBlocks.CYAN_BRASS_CASING)
                .add(CECBlocks.RGB_BRASS_CASING)
                //COPPER
                .add(CECBlocks.BLACK_COPPER_CASING)
                .add(CECBlocks.RED_COPPER_CASING)
                .add(CECBlocks.GRAY_COPPER_CASING)
                .add(CECBlocks.BLUE_COPPER_CASING)
                .add(CECBlocks.LIGHT_BLUE_COPPER_CASING)
                .add(CECBlocks.LIGHT_GRAY_COPPER_CASING)
                .add(CECBlocks.WHITE_COPPER_CASING)
                .add(CECBlocks.GREEN_COPPER_CASING)
                .add(CECBlocks.LIME_COPPER_CASING)
                .add(CECBlocks.MAGENTA_COPPER_CASING)
                .add(CECBlocks.PURPLE_COPPER_CASING)
                .add(CECBlocks.PINK_COPPER_CASING)
                .add(CECBlocks.BROWN_COPPER_CASING)
                .add(CECBlocks.YELLOW_COPPER_CASING)
                .add(CECBlocks.ORANGE_COPPER_CASING)
                .add(CECBlocks.CYAN_COPPER_CASING)
                .add(CECBlocks.RGB_COPPER_CASING);
    }
}
