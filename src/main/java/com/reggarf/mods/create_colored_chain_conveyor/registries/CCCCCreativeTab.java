package com.reggarf.mods.create_colored_chain_conveyor.registries;


import com.reggarf.mods.create_colored_chain_conveyor.CCCC;
import com.reggarf.mods.create_extra_casing.registry.CECBlocks;
import com.simibubi.create.AllCreativeModeTabs;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class CCCCCreativeTab {

    private static final DeferredRegister<CreativeModeTab> TAB_REGISTER =
           DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CCCC.MODID);

    public static final RegistryObject<CreativeModeTab> MAIN_TAB = TAB_REGISTER.register("create_extra_casing_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(CCCCBlocks.RED_ANDESITE_CHAIN_CONVEYOR.get()))
                    .title(Component.translatable("creativetab.create_colored_chain_conveyor_tab"))
                    .withTabsBefore(AllCreativeModeTabs.BASE_CREATIVE_TAB.getKey())
                    .displayItems((pParameters, pOutput) -> {
                        // --- Base chain conveyors ---
                        pOutput.accept(CCCCBlocks.BRASS_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.COPPER_CHAIN_CONVEYOR.get());

                        // --- Andesite colored ---
                        pOutput.accept(CCCCBlocks.BLACK_ANDESITE_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.RED_ANDESITE_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.GRAY_ANDESITE_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.BLUE_ANDESITE_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.LIGHT_BLUE_ANDESITE_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.LIGHT_GRAY_ANDESITE_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.WHITE_ANDESITE_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.GREEN_ANDESITE_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.LIME_ANDESITE_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.MAGENTA_ANDESITE_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.PURPLE_ANDESITE_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.PINK_ANDESITE_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.BROWN_ANDESITE_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.YELLOW_ANDESITE_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.ORANGE_ANDESITE_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.CYAN_ANDESITE_CHAIN_CONVEYOR.get());
//                        pOutput.accept(CCCCBlocks.RGB_ANDESITE_CHAIN_CONVEYOR.get());
//
                        // --- Brass colored ---
                        pOutput.accept(CCCCBlocks.BLACK_BRASS_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.RED_BRASS_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.GRAY_BRASS_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.BLUE_BRASS_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.LIGHT_BLUE_BRASS_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.LIGHT_GRAY_BRASS_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.WHITE_BRASS_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.GREEN_BRASS_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.LIME_BRASS_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.MAGENTA_BRASS_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.PURPLE_BRASS_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.PINK_BRASS_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.BROWN_BRASS_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.YELLOW_BRASS_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.ORANGE_BRASS_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.CYAN_BRASS_CHAIN_CONVEYOR.get());
                      //  pOutput.accept(CCCCBlocks.RGB_BRASS_CHAIN_CONVEYOR.get());

                        // --- Copper colored ---
                        pOutput.accept(CCCCBlocks.BLACK_COPPER_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.RED_COPPER_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.GRAY_COPPER_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.BLUE_COPPER_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.LIGHT_BLUE_COPPER_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.LIGHT_GRAY_COPPER_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.WHITE_COPPER_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.GREEN_COPPER_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.LIME_COPPER_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.MAGENTA_COPPER_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.PURPLE_COPPER_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.PINK_COPPER_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.BROWN_COPPER_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.YELLOW_COPPER_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.ORANGE_COPPER_CHAIN_CONVEYOR.get());
                        pOutput.accept(CCCCBlocks.CYAN_COPPER_CHAIN_CONVEYOR.get());
//                        pOutput.accept(CCCCBlocks.RGB_COPPER_CHAIN_CONVEYOR.get());

                    })
                    .build());


    public static void register(IEventBus modEventBus) {
        TAB_REGISTER.register(modEventBus);
    }
    public static CreativeModeTab getBaseTab() {
        return MAIN_TAB.get();
    }
}
