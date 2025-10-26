package com.reggarf.mods.create_colored_chain_conveyor.ponder;

import com.reggarf.mods.create_colored_chain_conveyor.ponder.highLogistics.ConveyorScenes;
import com.reggarf.mods.create_colored_chain_conveyor.registries.CCCCBlocks;

import com.reggarf.mods.create_extra_casing.registry.CECBlocks;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.infrastructure.ponder.scenes.highLogistics.FrogAndConveyorScenes;
import com.tterrag.registrate.util.entry.ItemProviderEntry;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.minecraft.resources.ResourceLocation;

public class CCCCPonderIndex {

    public static void register(PonderSceneRegistrationHelper<ResourceLocation> helper) {

        PonderSceneRegistrationHelper<ItemProviderEntry<?>> HELPER = helper.withKeyFunction(RegistryEntry::getId);

        HELPER.forComponents(

                        CCCCBlocks.BRASS_CHAIN_CONVEYOR,
                        CCCCBlocks.COPPER_CHAIN_CONVEYOR,


                        CCCCBlocks.RED_ANDESITE_CHAIN_CONVEYOR,
                        CCCCBlocks.BLACK_ANDESITE_CHAIN_CONVEYOR,
                        CCCCBlocks.GRAY_ANDESITE_CHAIN_CONVEYOR,
                        CCCCBlocks.BLUE_ANDESITE_CHAIN_CONVEYOR,
                        CCCCBlocks.LIGHT_BLUE_ANDESITE_CHAIN_CONVEYOR,
                        CCCCBlocks.LIGHT_GRAY_ANDESITE_CHAIN_CONVEYOR,
                        CCCCBlocks.WHITE_ANDESITE_CHAIN_CONVEYOR,
                        CCCCBlocks.GREEN_ANDESITE_CHAIN_CONVEYOR,
                        CCCCBlocks.LIME_ANDESITE_CHAIN_CONVEYOR,
                        CCCCBlocks.MAGENTA_ANDESITE_CHAIN_CONVEYOR,
                        CCCCBlocks.PURPLE_ANDESITE_CHAIN_CONVEYOR,
                        CCCCBlocks.PINK_ANDESITE_CHAIN_CONVEYOR,
                        CCCCBlocks.BROWN_ANDESITE_CHAIN_CONVEYOR,
                        CCCCBlocks.YELLOW_ANDESITE_CHAIN_CONVEYOR,
                        CCCCBlocks.ORANGE_ANDESITE_CHAIN_CONVEYOR,
                        CCCCBlocks.CYAN_ANDESITE_CHAIN_CONVEYOR,

                        // --- Brass colored conveyors ---
                        CCCCBlocks.BLACK_BRASS_CHAIN_CONVEYOR,
                        CCCCBlocks.RED_BRASS_CHAIN_CONVEYOR,
                        CCCCBlocks.GRAY_BRASS_CHAIN_CONVEYOR,
                        CCCCBlocks.BLUE_BRASS_CHAIN_CONVEYOR,
                        CCCCBlocks.LIGHT_BLUE_BRASS_CHAIN_CONVEYOR,
                        CCCCBlocks.LIGHT_GRAY_BRASS_CHAIN_CONVEYOR,
                        CCCCBlocks.WHITE_BRASS_CHAIN_CONVEYOR,
                        CCCCBlocks.GREEN_BRASS_CHAIN_CONVEYOR,
                        CCCCBlocks.LIME_BRASS_CHAIN_CONVEYOR,
                        CCCCBlocks.MAGENTA_BRASS_CHAIN_CONVEYOR,
                        CCCCBlocks.PURPLE_BRASS_CHAIN_CONVEYOR,
                        CCCCBlocks.PINK_BRASS_CHAIN_CONVEYOR,
                        CCCCBlocks.BROWN_BRASS_CHAIN_CONVEYOR,
                        CCCCBlocks.YELLOW_BRASS_CHAIN_CONVEYOR,
                        CCCCBlocks.ORANGE_BRASS_CHAIN_CONVEYOR,
                        CCCCBlocks.CYAN_BRASS_CHAIN_CONVEYOR,

                        // --- Copper colored conveyors ---
                        CCCCBlocks.BLACK_COPPER_CHAIN_CONVEYOR,
                        CCCCBlocks.RED_COPPER_CHAIN_CONVEYOR,
                        CCCCBlocks.GRAY_COPPER_CHAIN_CONVEYOR,
                        CCCCBlocks.BLUE_COPPER_CHAIN_CONVEYOR,
                        CCCCBlocks.LIGHT_BLUE_COPPER_CHAIN_CONVEYOR,
                        CCCCBlocks.LIGHT_GRAY_COPPER_CHAIN_CONVEYOR,
                        CCCCBlocks.WHITE_COPPER_CHAIN_CONVEYOR,
                        CCCCBlocks.GREEN_COPPER_CHAIN_CONVEYOR,
                        CCCCBlocks.LIME_COPPER_CHAIN_CONVEYOR,
                        CCCCBlocks.MAGENTA_COPPER_CHAIN_CONVEYOR,
                        CCCCBlocks.PURPLE_COPPER_CHAIN_CONVEYOR,
                        CCCCBlocks.PINK_COPPER_CHAIN_CONVEYOR,
                        CCCCBlocks.BROWN_COPPER_CHAIN_CONVEYOR,
                        CCCCBlocks.YELLOW_COPPER_CHAIN_CONVEYOR,
                        CCCCBlocks.ORANGE_COPPER_CHAIN_CONVEYOR,
                        CCCCBlocks.CYAN_COPPER_CHAIN_CONVEYOR
                )
                .addStoryBoard("high_logistics/chain_conveyor", ConveyorScenes::conveyor)
                .addStoryBoard("high_logistics/chain_conveyor", FrogAndConveyorScenes::conveyor);

                 HELPER.forComponents(
                         AllBlocks.CHAIN_CONVEYOR,
                         CECBlocks.BLACK_CASING,
                         CECBlocks.RED_CASING,
                         CECBlocks.GRAY_CASING,
                         CECBlocks.BLUE_CASING,
                         CECBlocks.LIGHT_BLUE_CASING,
                         CECBlocks.LIGHT_GRAY_CASING,
                         CECBlocks.WHITE_CASING,
                         CECBlocks.GREEN_CASING,
                         CECBlocks.LIME_CASING,
                         CECBlocks.MAGENTA_CASING,
                         CECBlocks.PURPLE_CASING,
                         CECBlocks.PINK_CASING,
                         CECBlocks.BROWN_CASING,
                         CECBlocks.YELLOW_CASING,
                         CECBlocks.ORANGE_CASING,
                         CECBlocks.CYAN_CASING,
                         CECBlocks.RGB_CASING,
                         //BRASS
                         CECBlocks.RED_BRASS_CASING,
                         CECBlocks.GRAY_BRASS_CASING,
                         CECBlocks.BLUE_BRASS_CASING,
                         CECBlocks.LIGHT_BLUE_BRASS_CASING,
                         CECBlocks.LIGHT_GRAY_BRASS_CASING,
                         CECBlocks.WHITE_BRASS_CASING,
                         CECBlocks.GREEN_BRASS_CASING,
                         CECBlocks.LIME_BRASS_CASING,
                         CECBlocks.MAGENTA_BRASS_CASING,
                         CECBlocks.PURPLE_BRASS_CASING,
                         CECBlocks.PINK_BRASS_CASING,
                         CECBlocks.BROWN_BRASS_CASING,
                         CECBlocks.YELLOW_BRASS_CASING,
                         CECBlocks.ORANGE_BRASS_CASING,
                         CECBlocks.CYAN_BRASS_CASING,
                         CECBlocks.RGB_BRASS_CASING,


                         //COPPER

                         CECBlocks.RED_COPPER_CASING,
                         CECBlocks.GRAY_COPPER_CASING,
                         CECBlocks.BLUE_COPPER_CASING,
                         CECBlocks.LIGHT_BLUE_COPPER_CASING,
                         CECBlocks.LIGHT_GRAY_COPPER_CASING,
                         CECBlocks.WHITE_COPPER_CASING,
                         CECBlocks.GREEN_COPPER_CASING,
                         CECBlocks.LIME_COPPER_CASING,
                         CECBlocks.MAGENTA_COPPER_CASING,
                         CECBlocks.PURPLE_COPPER_CASING,
                         CECBlocks.PINK_COPPER_CASING,
                         CECBlocks.BROWN_COPPER_CASING,
                         CECBlocks.YELLOW_COPPER_CASING,
                         CECBlocks.ORANGE_COPPER_CASING,
                         CECBlocks.CYAN_COPPER_CASING,
                         CECBlocks.RGB_COPPER_CASING)
                        .addStoryBoard("high_logistics/chain_conveyor", ConveyorScenes::conveyor);
    }
}
