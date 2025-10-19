package com.reggarf.mods.create_colored_chain_conveyor.registries;

import com.reggarf.mods.create_colored_chain_conveyor.blockEntity.renderers.CCCCChainConveyorRenderer;
import com.reggarf.mods.create_colored_chain_conveyor.blockEntity.visuals.CCCCChainConveyorVisual;
import com.simibubi.create.content.kinetics.chainConveyor.ChainConveyorBlockEntity;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

import static com.reggarf.mods.create_colored_chain_conveyor.CCCC.REGISTRATE;

public class CCCCBlockEntityTypes {

    public static final BlockEntityEntry<ChainConveyorBlockEntity> CHAIN_CONVEYOR = REGISTRATE
            .blockEntity("colored_chain_conveyor", ChainConveyorBlockEntity::new)
            .visual(() -> CCCCChainConveyorVisual::new)
            .validBlocks(
                    // Base conveyors
                    CCCCBlocks.BRASS_CHAIN_CONVEYOR,
                    CCCCBlocks.COPPER_CHAIN_CONVEYOR,

                    // Andesite colored
                    CCCCBlocks.BLACK_ANDESITE_CHAIN_CONVEYOR,
                    CCCCBlocks.RED_ANDESITE_CHAIN_CONVEYOR,
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
                    //CCCCBlocks.RGB_ANDESITE_CHAIN_CONVEYOR,

                    // Brass colored
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
                    //CCCCBlocks.RGB_BRASS_CHAIN_CONVEYOR

                    // Copper colored
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
//                    CCCCBlocks.RGB_COPPER_CHAIN_CONVEYOR
            )
            .renderer(() -> CCCCChainConveyorRenderer::new)
            .register();

    public static void register() {}
}
