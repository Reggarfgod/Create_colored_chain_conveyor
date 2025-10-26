package com.reggarf.mods.create_colored_chain_conveyor.utils;

import com.reggarf.mods.create_colored_chain_conveyor.registries.CCCCBlocks;


import com.reggarf.mods.create_extra_casing.registry.CECBlocks;
import com.simibubi.create.AllBlocks;
import com.tterrag.registrate.util.entry.BlockEntry;
import fr.iglee42.createcasing.registries.EncasedBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.fml.ModList;


import java.util.Arrays;

public enum CCCCEncasableBlocks {

    // Base
    ANDESITE(AllBlocks.ANDESITE_CASING, AllBlocks.CHAIN_CONVEYOR),
    BRASS(AllBlocks.BRASS_CASING, CCCCBlocks.BRASS_CHAIN_CONVEYOR),
    COPPER(AllBlocks.COPPER_CASING, CCCCBlocks.COPPER_CHAIN_CONVEYOR),

    BRASS_1(ModList.get().isLoaded("createcasing") ? AllBlocks.BRASS_CASING : null,
            ModList.get().isLoaded("createcasing") ? EncasedBlocks.BRASS_CHAIN_CONVEYOR : null),
    COPPER_1(ModList.get().isLoaded("createcasing") ? AllBlocks.COPPER_CASING : null,
            ModList.get().isLoaded("createcasing") ? EncasedBlocks.COPPER_CHAIN_CONVEYOR : null),
    RAILWAY_1(ModList.get().isLoaded("createcasing") ? AllBlocks.RAILWAY_CASING : null,
            ModList.get().isLoaded("createcasing") ? EncasedBlocks.RAILWAY_CHAIN_CONVEYOR : null),
    INDUSTRIAL_IRON_1(ModList.get().isLoaded("createcasing") ? AllBlocks.INDUSTRIAL_IRON_BLOCK : null,
            ModList.get().isLoaded("createcasing") ? EncasedBlocks.INDUSTRIAL_IRON_CHAIN_CONVEYOR : null),
    WEATHERED_IRON_1(ModList.get().isLoaded("createcasing") ? AllBlocks.WEATHERED_IRON_BLOCK : null,
            ModList.get().isLoaded("createcasing") ? EncasedBlocks.WEATHERED_IRON_CHAIN_CONVEYOR : null),
    REFINED_RADIANCE_1(ModList.get().isLoaded("createcasing") ? AllBlocks.REFINED_RADIANCE_CASING : null,
            ModList.get().isLoaded("createcasing") ? EncasedBlocks.REFINED_RADIANCE_CHAIN_CONVEYOR : null),
    SHADOW_STEEL_1(ModList.get().isLoaded("createcasing") ? AllBlocks.SHADOW_STEEL_CASING : null,
            ModList.get().isLoaded("createcasing") ? EncasedBlocks.SHADOW_STEEL_CHAIN_CONVEYOR : null),
    CREATIVE_1(ModList.get().isLoaded("createcasing") ? EncasedBlocks.CREATIVE_CASING : null,
            ModList.get().isLoaded("createcasing") ? EncasedBlocks.CREATIVE_CHAIN_CONVEYOR : null),

    // Andesite colored
    BLACK_ANDESITE(CECBlocks.BLACK_CASING, CCCCBlocks.BLACK_ANDESITE_CHAIN_CONVEYOR),
    RED_ANDESITE(CECBlocks.RED_CASING, CCCCBlocks.RED_ANDESITE_CHAIN_CONVEYOR),
    GRAY_ANDESITE(CECBlocks.GRAY_CASING, CCCCBlocks.GRAY_ANDESITE_CHAIN_CONVEYOR),
    BLUE_ANDESITE(CECBlocks.BLUE_CASING, CCCCBlocks.BLUE_ANDESITE_CHAIN_CONVEYOR),
    LIGHT_BLUE_ANDESITE(CECBlocks.LIGHT_BLUE_CASING, CCCCBlocks.LIGHT_BLUE_ANDESITE_CHAIN_CONVEYOR),
    LIGHT_GRAY_ANDESITE(CECBlocks.LIGHT_GRAY_CASING, CCCCBlocks.LIGHT_GRAY_ANDESITE_CHAIN_CONVEYOR),
    WHITE_ANDESITE(CECBlocks.WHITE_CASING, CCCCBlocks.WHITE_ANDESITE_CHAIN_CONVEYOR),
    GREEN_ANDESITE(CECBlocks.GREEN_CASING, CCCCBlocks.GREEN_ANDESITE_CHAIN_CONVEYOR),
    LIME_ANDESITE(CECBlocks.LIME_CASING, CCCCBlocks.LIME_ANDESITE_CHAIN_CONVEYOR),
    MAGENTA_ANDESITE(CECBlocks.MAGENTA_CASING, CCCCBlocks.MAGENTA_ANDESITE_CHAIN_CONVEYOR),
    PURPLE_ANDESITE(CECBlocks.PURPLE_CASING, CCCCBlocks.PURPLE_ANDESITE_CHAIN_CONVEYOR),
    PINK_ANDESITE(CECBlocks.PINK_CASING, CCCCBlocks.PINK_ANDESITE_CHAIN_CONVEYOR),
    BROWN_ANDESITE(CECBlocks.BROWN_CASING, CCCCBlocks.BROWN_ANDESITE_CHAIN_CONVEYOR),
    YELLOW_ANDESITE(CECBlocks.YELLOW_CASING, CCCCBlocks.YELLOW_ANDESITE_CHAIN_CONVEYOR),
    ORANGE_ANDESITE(CECBlocks.ORANGE_CASING, CCCCBlocks.ORANGE_ANDESITE_CHAIN_CONVEYOR),
    CYAN_ANDESITE(CECBlocks.CYAN_CASING, CCCCBlocks.CYAN_ANDESITE_CHAIN_CONVEYOR),
    //RGB_ANDESITE(CECBlocks.RGB_CASING, CCCCBlocks.RGB_ANDESITE_CHAIN_CONVEYOR)
    //,

    // Brass colored
    BLACK_BRASS(CECBlocks.BLACK_BRASS_CASING, CCCCBlocks.BLACK_BRASS_CHAIN_CONVEYOR),
    RED_BRASS(CECBlocks.RED_BRASS_CASING, CCCCBlocks.RED_BRASS_CHAIN_CONVEYOR),
    GRAY_BRASS(CECBlocks.GRAY_BRASS_CASING, CCCCBlocks.GRAY_BRASS_CHAIN_CONVEYOR),
    BLUE_BRASS(CECBlocks.BLUE_BRASS_CASING, CCCCBlocks.BLUE_BRASS_CHAIN_CONVEYOR),
    LIGHT_BLUE_BRASS(CECBlocks.LIGHT_BLUE_BRASS_CASING, CCCCBlocks.LIGHT_BLUE_BRASS_CHAIN_CONVEYOR),
    LIGHT_GRAY_BRASS(CECBlocks.LIGHT_GRAY_BRASS_CASING, CCCCBlocks.LIGHT_GRAY_BRASS_CHAIN_CONVEYOR),
    WHITE_BRASS(CECBlocks.WHITE_BRASS_CASING, CCCCBlocks.WHITE_BRASS_CHAIN_CONVEYOR),
    GREEN_BRASS(CECBlocks.GREEN_BRASS_CASING, CCCCBlocks.GREEN_BRASS_CHAIN_CONVEYOR),
    LIME_BRASS(CECBlocks.LIME_BRASS_CASING, CCCCBlocks.LIME_BRASS_CHAIN_CONVEYOR),
    MAGENTA_BRASS(CECBlocks.MAGENTA_BRASS_CASING, CCCCBlocks.MAGENTA_BRASS_CHAIN_CONVEYOR),
    PURPLE_BRASS(CECBlocks.PURPLE_BRASS_CASING, CCCCBlocks.PURPLE_BRASS_CHAIN_CONVEYOR),
    PINK_BRASS(CECBlocks.PINK_BRASS_CASING, CCCCBlocks.PINK_BRASS_CHAIN_CONVEYOR),
    BROWN_BRASS(CECBlocks.BROWN_BRASS_CASING, CCCCBlocks.BROWN_BRASS_CHAIN_CONVEYOR),
    YELLOW_BRASS(CECBlocks.YELLOW_BRASS_CASING, CCCCBlocks.YELLOW_BRASS_CHAIN_CONVEYOR),
    ORANGE_BRASS(CECBlocks.ORANGE_BRASS_CASING, CCCCBlocks.ORANGE_BRASS_CHAIN_CONVEYOR),
    CYAN_BRASS(CECBlocks.CYAN_BRASS_CASING, CCCCBlocks.CYAN_BRASS_CHAIN_CONVEYOR),
  //  RGB_BRASS(CECBlocks.RGB_BRASS_CASING, CCCCBlocks.RGB_BRASS_CHAIN_CONVEYOR),

    // Copper colored
    BLACK_COPPER(CECBlocks.BLACK_COPPER_CASING, CCCCBlocks.BLACK_COPPER_CHAIN_CONVEYOR),
    RED_COPPER(CECBlocks.RED_COPPER_CASING, CCCCBlocks.RED_COPPER_CHAIN_CONVEYOR),
    GRAY_COPPER(CECBlocks.GRAY_COPPER_CASING, CCCCBlocks.GRAY_COPPER_CHAIN_CONVEYOR),
    BLUE_COPPER(CECBlocks.BLUE_COPPER_CASING, CCCCBlocks.BLUE_COPPER_CHAIN_CONVEYOR),
    LIGHT_BLUE_COPPER(CECBlocks.LIGHT_BLUE_COPPER_CASING, CCCCBlocks.LIGHT_BLUE_COPPER_CHAIN_CONVEYOR),
    LIGHT_GRAY_COPPER(CECBlocks.LIGHT_GRAY_COPPER_CASING, CCCCBlocks.LIGHT_GRAY_COPPER_CHAIN_CONVEYOR),
    WHITE_COPPER(CECBlocks.WHITE_COPPER_CASING, CCCCBlocks.WHITE_COPPER_CHAIN_CONVEYOR),
    GREEN_COPPER(CECBlocks.GREEN_COPPER_CASING, CCCCBlocks.GREEN_COPPER_CHAIN_CONVEYOR),
    LIME_COPPER(CECBlocks.LIME_COPPER_CASING, CCCCBlocks.LIME_COPPER_CHAIN_CONVEYOR),
    MAGENTA_COPPER(CECBlocks.MAGENTA_COPPER_CASING, CCCCBlocks.MAGENTA_COPPER_CHAIN_CONVEYOR),
    PURPLE_COPPER(CECBlocks.PURPLE_COPPER_CASING, CCCCBlocks.PURPLE_COPPER_CHAIN_CONVEYOR),
    PINK_COPPER(CECBlocks.PINK_COPPER_CASING, CCCCBlocks.PINK_COPPER_CHAIN_CONVEYOR),
    BROWN_COPPER(CECBlocks.BROWN_COPPER_CASING, CCCCBlocks.BROWN_COPPER_CHAIN_CONVEYOR),
    YELLOW_COPPER(CECBlocks.YELLOW_COPPER_CASING, CCCCBlocks.YELLOW_COPPER_CHAIN_CONVEYOR),
    ORANGE_COPPER(CECBlocks.ORANGE_COPPER_CASING, CCCCBlocks.ORANGE_COPPER_CHAIN_CONVEYOR),
    CYAN_COPPER(CECBlocks.CYAN_COPPER_CASING, CCCCBlocks.CYAN_COPPER_CHAIN_CONVEYOR),
//    RGB_COPPER(CECBlocks.RGB_COPPER_CASING, CCCCBlocks.RGB_COPPER_CHAIN_CONVEYOR)
   ;


    private final BlockEntry<? extends Block> casing;
    private final BlockEntry<? extends Block> chainConveyor;

    CCCCEncasableBlocks(BlockEntry<? extends Block> casing, BlockEntry<? extends Block> chainConveyor) {
        this.casing = casing;
        this.chainConveyor = chainConveyor;
    }

    // ---------------------------
    // FINDERS
    // ---------------------------
    public static CCCCEncasableBlocks getBlockByCasing(BlockState casing) {
        return Arrays.stream(values())
                .filter(e -> e.casing != null && e.casing.has(casing))
                .findFirst()
                .orElse(null);
    }

    public static CCCCEncasableBlocks getBlockByCasing(Item casing) {
        return Arrays.stream(values())
                .filter(e -> e.casing != null && e.casing.is(casing))
                .findFirst()
                .orElse(null);
    }

    public static boolean hasBlocksForCasing(BlockState casing) {
        return getBlockByCasing(casing) != null;
    }

    public static boolean hasBlocksForCasing(Item casing) {
        return getBlockByCasing(casing) != null;
    }

    // ---------------------------
    // GETTERS
    // ---------------------------
    public BlockEntry<? extends Block> getCasing() {
        return casing;
    }

    public BlockEntry<? extends Block> getChainConveyor() {
        return chainConveyor;
    }

    // ---------------------------
    // CHECKERS
    // ---------------------------
    public static boolean isChainConveyor(BlockState state) {
        return Arrays.stream(values())
                .anyMatch(b -> b.getChainConveyor() != null && b.getChainConveyor().has(state));
    }

    public boolean isInSet(BlockState state) {
        return (casing != null && casing.has(state)) || (chainConveyor != null && chainConveyor.has(state));
    }
}
