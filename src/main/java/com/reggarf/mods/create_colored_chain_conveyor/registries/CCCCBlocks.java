package com.reggarf.mods.create_colored_chain_conveyor.registries;

import com.reggarf.mods.create_colored_chain_conveyor.CCCC;
import com.reggarf.mods.create_colored_chain_conveyor.config.CCCCStress;
import com.reggarf.mods.create_colored_chain_conveyor.blocks.colored.CCCCChainConveyorBlock;
import com.reggarf.mods.create_extra_casing.CEC;
import com.reggarf.mods.create_extra_casing.registry.CECBlocks;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.Create;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.providers.RegistrateRecipeProvider;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;


import static com.reggarf.mods.create_colored_chain_conveyor.CCCC.REGISTRATE;
import static com.reggarf.mods.create_colored_chain_conveyor.registries.CCCCBlockStateGens.chainConveyor;
import static com.reggarf.mods.create_colored_chain_conveyor.registries.CCCCBlockStateGens.createConveyorModel;
import static com.simibubi.create.foundation.data.TagGen.axeOrPickaxe;

public class CCCCBlocks {
    static {
        REGISTRATE.setCreativeTab(CCCCCreativeTab.MAIN_TAB);
    }

    //public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, CCCC.MODID);

    // --- Base Material Variants ---
    public static final BlockEntry<CCCCChainConveyorBlock> BRASS_CHAIN_CONVEYOR = createChainConveyor("brass");
    public static final BlockEntry<CCCCChainConveyorBlock> COPPER_CHAIN_CONVEYOR = createChainConveyor("copper");

    // --- Colored Variants for ANDESITE ---
    public static final BlockEntry<CCCCChainConveyorBlock> BLACK_ANDESITE_CHAIN_CONVEYOR = createChainConveyor("black");
    public static final BlockEntry<CCCCChainConveyorBlock> RED_ANDESITE_CHAIN_CONVEYOR = createChainConveyor("red");
    public static final BlockEntry<CCCCChainConveyorBlock> GRAY_ANDESITE_CHAIN_CONVEYOR = createChainConveyor("gray");
    public static final BlockEntry<CCCCChainConveyorBlock> BLUE_ANDESITE_CHAIN_CONVEYOR = createChainConveyor("blue");
    public static final BlockEntry<CCCCChainConveyorBlock> LIGHT_BLUE_ANDESITE_CHAIN_CONVEYOR = createChainConveyor("light_blue");
    public static final BlockEntry<CCCCChainConveyorBlock> LIGHT_GRAY_ANDESITE_CHAIN_CONVEYOR = createChainConveyor("light_gray");
    public static final BlockEntry<CCCCChainConveyorBlock> WHITE_ANDESITE_CHAIN_CONVEYOR = createChainConveyor("white");
    public static final BlockEntry<CCCCChainConveyorBlock> GREEN_ANDESITE_CHAIN_CONVEYOR = createChainConveyor("green");
    public static final BlockEntry<CCCCChainConveyorBlock> LIME_ANDESITE_CHAIN_CONVEYOR = createChainConveyor("lime");
    public static final BlockEntry<CCCCChainConveyorBlock> MAGENTA_ANDESITE_CHAIN_CONVEYOR = createChainConveyor("magenta");
    public static final BlockEntry<CCCCChainConveyorBlock> PURPLE_ANDESITE_CHAIN_CONVEYOR = createChainConveyor("purple");
    public static final BlockEntry<CCCCChainConveyorBlock> PINK_ANDESITE_CHAIN_CONVEYOR = createChainConveyor("pink");
    public static final BlockEntry<CCCCChainConveyorBlock> BROWN_ANDESITE_CHAIN_CONVEYOR = createChainConveyor("brown");
    public static final BlockEntry<CCCCChainConveyorBlock> YELLOW_ANDESITE_CHAIN_CONVEYOR = createChainConveyor("yellow");
    public static final BlockEntry<CCCCChainConveyorBlock> ORANGE_ANDESITE_CHAIN_CONVEYOR = createChainConveyor("orange");
    public static final BlockEntry<CCCCChainConveyorBlock> CYAN_ANDESITE_CHAIN_CONVEYOR = createChainConveyor("cyan");
   // public static final BlockEntry<CCCCChainConveyorBlock> RGB_ANDESITE_CHAIN_CONVEYOR = createChainConveyor("rgb");

    // --- Colored Variants for BRASS ---
    public static final BlockEntry<CCCCChainConveyorBlock> BLACK_BRASS_CHAIN_CONVEYOR = createChainConveyor("black_brass");
    public static final BlockEntry<CCCCChainConveyorBlock> RED_BRASS_CHAIN_CONVEYOR = createChainConveyor("red_brass");
    public static final BlockEntry<CCCCChainConveyorBlock> GRAY_BRASS_CHAIN_CONVEYOR = createChainConveyor("gray_brass");
    public static final BlockEntry<CCCCChainConveyorBlock> BLUE_BRASS_CHAIN_CONVEYOR = createChainConveyor("blue_brass");
    public static final BlockEntry<CCCCChainConveyorBlock> LIGHT_BLUE_BRASS_CHAIN_CONVEYOR = createChainConveyor("light_blue_brass");
    public static final BlockEntry<CCCCChainConveyorBlock> LIGHT_GRAY_BRASS_CHAIN_CONVEYOR = createChainConveyor("light_gray_brass");
    public static final BlockEntry<CCCCChainConveyorBlock> WHITE_BRASS_CHAIN_CONVEYOR = createChainConveyor("white_brass");
    public static final BlockEntry<CCCCChainConveyorBlock> GREEN_BRASS_CHAIN_CONVEYOR = createChainConveyor("green_brass");
    public static final BlockEntry<CCCCChainConveyorBlock> LIME_BRASS_CHAIN_CONVEYOR = createChainConveyor("lime_brass");
    public static final BlockEntry<CCCCChainConveyorBlock> MAGENTA_BRASS_CHAIN_CONVEYOR = createChainConveyor("magenta_brass");
    public static final BlockEntry<CCCCChainConveyorBlock> PURPLE_BRASS_CHAIN_CONVEYOR = createChainConveyor("purple_brass");
    public static final BlockEntry<CCCCChainConveyorBlock> PINK_BRASS_CHAIN_CONVEYOR = createChainConveyor("pink_brass");
    public static final BlockEntry<CCCCChainConveyorBlock> BROWN_BRASS_CHAIN_CONVEYOR = createChainConveyor("brown_brass");
    public static final BlockEntry<CCCCChainConveyorBlock> YELLOW_BRASS_CHAIN_CONVEYOR = createChainConveyor("yellow_brass");
    public static final BlockEntry<CCCCChainConveyorBlock> ORANGE_BRASS_CHAIN_CONVEYOR = createChainConveyor("orange_brass");
    public static final BlockEntry<CCCCChainConveyorBlock> CYAN_BRASS_CHAIN_CONVEYOR = createChainConveyor("cyan_brass");
    //public static final BlockEntry<CCCCChainConveyorBlock> RGB_BRASS_CHAIN_CONVEYOR = createChainConveyor("rgb_brass");

    // --- Colored Variants for COPPER ---
    public static final BlockEntry<CCCCChainConveyorBlock> BLACK_COPPER_CHAIN_CONVEYOR = createChainConveyor("black_copper");
    public static final BlockEntry<CCCCChainConveyorBlock> RED_COPPER_CHAIN_CONVEYOR = createChainConveyor("red_copper");
    public static final BlockEntry<CCCCChainConveyorBlock> GRAY_COPPER_CHAIN_CONVEYOR = createChainConveyor("gray_copper");
    public static final BlockEntry<CCCCChainConveyorBlock> BLUE_COPPER_CHAIN_CONVEYOR = createChainConveyor("blue_copper");
    public static final BlockEntry<CCCCChainConveyorBlock> LIGHT_BLUE_COPPER_CHAIN_CONVEYOR = createChainConveyor("light_blue_copper");
    public static final BlockEntry<CCCCChainConveyorBlock> LIGHT_GRAY_COPPER_CHAIN_CONVEYOR = createChainConveyor("light_gray_copper");
    public static final BlockEntry<CCCCChainConveyorBlock> WHITE_COPPER_CHAIN_CONVEYOR = createChainConveyor("white_copper");
    public static final BlockEntry<CCCCChainConveyorBlock> GREEN_COPPER_CHAIN_CONVEYOR = createChainConveyor("green_copper");
    public static final BlockEntry<CCCCChainConveyorBlock> LIME_COPPER_CHAIN_CONVEYOR = createChainConveyor("lime_copper");
    public static final BlockEntry<CCCCChainConveyorBlock> MAGENTA_COPPER_CHAIN_CONVEYOR = createChainConveyor("magenta_copper");
    public static final BlockEntry<CCCCChainConveyorBlock> PURPLE_COPPER_CHAIN_CONVEYOR = createChainConveyor("purple_copper");
    public static final BlockEntry<CCCCChainConveyorBlock> PINK_COPPER_CHAIN_CONVEYOR = createChainConveyor("pink_copper");
    public static final BlockEntry<CCCCChainConveyorBlock> BROWN_COPPER_CHAIN_CONVEYOR = createChainConveyor("brown_copper");
    public static final BlockEntry<CCCCChainConveyorBlock> YELLOW_COPPER_CHAIN_CONVEYOR = createChainConveyor("yellow_copper");
    public static final BlockEntry<CCCCChainConveyorBlock> ORANGE_COPPER_CHAIN_CONVEYOR = createChainConveyor("orange_copper");
    public static final BlockEntry<CCCCChainConveyorBlock> CYAN_COPPER_CHAIN_CONVEYOR = createChainConveyor("cyan_copper");
//    public static final BlockEntry<CCCCChainConveyorBlock> RGB_COPPER_CHAIN_CONVEYOR = createChainConveyor("rgb_copper");


    // --- Methods ---
    public static BlockEntry<CCCCChainConveyorBlock> createChainConveyor(String name) {
        return REGISTRATE.block(name + "_chain_conveyor", CCCCChainConveyorBlock::new)

                // --- Block properties ---
                .initialProperties(SharedProperties::stone)
                .properties(p -> p.noOcclusion().mapColor(MapColor.PODZOL))
                .transform(axeOrPickaxe())
                .transform(CCCCStress.setImpact(1))

                // --- Blockstate & Model ---
                .blockstate(chainConveyor(name))
                .item()
                .model((c, p) -> p.getBuilder(c.getName())
                        .parent(createConveyorModel(p, name, true)))
                .build()

                // --- Crafting Recipe ---
                .recipe((c, p) -> {
                    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, c.get(), 2)
                            .define('A', AllBlocks.LARGE_COGWHEEL.get())
                            .define('C', getCasingItem(name))
                            .pattern(" C ")
                            .pattern("CAC")
                            .pattern(" C ")
                            .unlockedBy("has_large_cogwheel",
                                    RegistrateRecipeProvider.has(AllBlocks.LARGE_COGWHEEL.get()))
                            .save(p);
                })

                // --- Register Block ---
                .register();
    }

    /**
     * Returns the correct casing item for a given chain conveyor variant.
     */
    private static ItemLike getCasingItem(String casing) {
        String modid = CCCCBlockStateGens.getModForCasing(casing);

        // Base Create casings
        if (modid.equals(Create.ID)) {
            return switch (casing) {
                case "brass" -> AllBlocks.BRASS_CASING.get();
                case "copper" -> AllBlocks.COPPER_CASING.get();
                case "andesite" -> AllBlocks.ANDESITE_CASING.get();
                default -> AllBlocks.ANDESITE_CASING.get();
            };
        }

        // Create Extra Casing (CEC)
        if (modid.equals(CEC.MODID)) {
            return switch (casing) {
                case "black" -> CECBlocks.BLACK_CASING.get();
                case "red" -> CECBlocks.RED_CASING.get();
                case "gray" -> CECBlocks.GRAY_CASING.get();
                case "blue" -> CECBlocks.BLUE_CASING.get();
                case "light_blue" -> CECBlocks.LIGHT_BLUE_CASING.get();
                case "light_gray" -> CECBlocks.LIGHT_GRAY_CASING.get();
                case "white" -> CECBlocks.WHITE_CASING.get();
                case "green" -> CECBlocks.GREEN_CASING.get();
                case "lime" -> CECBlocks.LIME_CASING.get();
                case "magenta" -> CECBlocks.MAGENTA_CASING.get();
                case "purple" -> CECBlocks.PURPLE_CASING.get();
                case "pink" -> CECBlocks.PINK_CASING.get();
                case "brown" -> CECBlocks.BROWN_CASING.get();
                case "yellow" -> CECBlocks.YELLOW_CASING.get();
                case "orange" -> CECBlocks.ORANGE_CASING.get();
                case "cyan" -> CECBlocks.CYAN_CASING.get();
                case "black_brass" -> CECBlocks.BLACK_BRASS_CASING.get();
                case "red_brass" -> CECBlocks.RED_BRASS_CASING.get();
                case "gray_brass" -> CECBlocks.GRAY_BRASS_CASING.get();
                case "blue_brass" -> CECBlocks.BLUE_BRASS_CASING.get();
                case "light_blue_brass" -> CECBlocks.LIGHT_BLUE_BRASS_CASING.get();
                case "light_gray_brass" -> CECBlocks.LIGHT_GRAY_BRASS_CASING.get();
                case "white_brass" -> CECBlocks.WHITE_BRASS_CASING.get();
                case "green_brass" -> CECBlocks.GREEN_BRASS_CASING.get();
                case "lime_brass" -> CECBlocks.LIME_BRASS_CASING.get();
                case "magenta_brass" -> CECBlocks.MAGENTA_BRASS_CASING.get();
                case "purple_brass" -> CECBlocks.PURPLE_BRASS_CASING.get();
                case "pink_brass" -> CECBlocks.PINK_BRASS_CASING.get();
                case "brown_brass" -> CECBlocks.BROWN_BRASS_CASING.get();
                case "yellow_brass" -> CECBlocks.YELLOW_BRASS_CASING.get();
                case "orange_brass" -> CECBlocks.ORANGE_BRASS_CASING.get();
                case "cyan_brass" -> CECBlocks.CYAN_BRASS_CASING.get();
                case "black_copper" -> CECBlocks.BLACK_COPPER_CASING.get();
                case "red_copper" -> CECBlocks.RED_COPPER_CASING.get();
                case "gray_copper" -> CECBlocks.GRAY_COPPER_CASING.get();
                case "blue_copper" -> CECBlocks.BLUE_COPPER_CASING.get();
                case "light_blue_copper" -> CECBlocks.LIGHT_BLUE_COPPER_CASING.get();
                case "light_gray_copper" -> CECBlocks.LIGHT_GRAY_COPPER_CASING.get();
                case "white_copper" -> CECBlocks.WHITE_COPPER_CASING.get();
                case "green_copper" -> CECBlocks.GREEN_COPPER_CASING.get();
                case "lime_copper" -> CECBlocks.LIME_COPPER_CASING.get();
                case "magenta_copper" -> CECBlocks.MAGENTA_COPPER_CASING.get();
                case "purple_copper" -> CECBlocks.PURPLE_COPPER_CASING.get();
                case "pink_copper" -> CECBlocks.PINK_COPPER_CASING.get();
                case "brown_copper" -> CECBlocks.BROWN_COPPER_CASING.get();
                case "yellow_copper" -> CECBlocks.YELLOW_COPPER_CASING.get();
                case "orange_copper" -> CECBlocks.ORANGE_COPPER_CASING.get();
                case "cyan_copper" -> CECBlocks.CYAN_COPPER_CASING.get();

                default -> CECBlocks.GRAY_CASING.get();
            };
        }

        // Fallback: your mod's default casing
        return CCCCBlocks.BRASS_CHAIN_CONVEYOR.get();
    }


    public static void register() {
        // trigger class loading
    }

    public static boolean isColoredChainConveyor(BlockState state) {
        return AllBlocks.CHAIN_CONVEYOR.has(state)
                || BRASS_CHAIN_CONVEYOR.has(state)
                || COPPER_CHAIN_CONVEYOR.has(state)

                // --- ANDESITE COLORS ---
                || BLACK_ANDESITE_CHAIN_CONVEYOR.has(state)
                || RED_ANDESITE_CHAIN_CONVEYOR.has(state)
                || GRAY_ANDESITE_CHAIN_CONVEYOR.has(state)
                || BLUE_ANDESITE_CHAIN_CONVEYOR.has(state)
                || LIGHT_BLUE_ANDESITE_CHAIN_CONVEYOR.has(state)
                || LIGHT_GRAY_ANDESITE_CHAIN_CONVEYOR.has(state)
                || WHITE_ANDESITE_CHAIN_CONVEYOR.has(state)
                || GREEN_ANDESITE_CHAIN_CONVEYOR.has(state)
                || LIME_ANDESITE_CHAIN_CONVEYOR.has(state)
                || MAGENTA_ANDESITE_CHAIN_CONVEYOR.has(state)
                || PURPLE_ANDESITE_CHAIN_CONVEYOR.has(state)
                || PINK_ANDESITE_CHAIN_CONVEYOR.has(state)
                || BROWN_ANDESITE_CHAIN_CONVEYOR.has(state)
                || YELLOW_ANDESITE_CHAIN_CONVEYOR.has(state)
                || ORANGE_ANDESITE_CHAIN_CONVEYOR.has(state)
                || CYAN_ANDESITE_CHAIN_CONVEYOR.has(state)
               // || RGB_ANDESITE_CHAIN_CONVEYOR.has(state)

                // --- BRASS COLORS ---
                || BLACK_BRASS_CHAIN_CONVEYOR.has(state)
                || RED_BRASS_CHAIN_CONVEYOR.has(state)
                || GRAY_BRASS_CHAIN_CONVEYOR.has(state)
                || BLUE_BRASS_CHAIN_CONVEYOR.has(state)
                || LIGHT_BLUE_BRASS_CHAIN_CONVEYOR.has(state)
                || LIGHT_GRAY_BRASS_CHAIN_CONVEYOR.has(state)
                || WHITE_BRASS_CHAIN_CONVEYOR.has(state)
                || GREEN_BRASS_CHAIN_CONVEYOR.has(state)
                || LIME_BRASS_CHAIN_CONVEYOR.has(state)
                || MAGENTA_BRASS_CHAIN_CONVEYOR.has(state)
                || PURPLE_BRASS_CHAIN_CONVEYOR.has(state)
                || PINK_BRASS_CHAIN_CONVEYOR.has(state)
                || BROWN_BRASS_CHAIN_CONVEYOR.has(state)
                || YELLOW_BRASS_CHAIN_CONVEYOR.has(state)
                || ORANGE_BRASS_CHAIN_CONVEYOR.has(state)
                || CYAN_BRASS_CHAIN_CONVEYOR.has(state)
               // || RGB_BRASS_CHAIN_CONVEYOR.has(state);

                // --- COPPER COLORS ---
                || BLACK_COPPER_CHAIN_CONVEYOR.has(state)
                || RED_COPPER_CHAIN_CONVEYOR.has(state)
                || GRAY_COPPER_CHAIN_CONVEYOR.has(state)
                || BLUE_COPPER_CHAIN_CONVEYOR.has(state)
                || LIGHT_BLUE_COPPER_CHAIN_CONVEYOR.has(state)
                || LIGHT_GRAY_COPPER_CHAIN_CONVEYOR.has(state)
                || WHITE_COPPER_CHAIN_CONVEYOR.has(state)
                || GREEN_COPPER_CHAIN_CONVEYOR.has(state)
                || LIME_COPPER_CHAIN_CONVEYOR.has(state)
                || MAGENTA_COPPER_CHAIN_CONVEYOR.has(state)
                || PURPLE_COPPER_CHAIN_CONVEYOR.has(state)
                || PINK_COPPER_CHAIN_CONVEYOR.has(state)
                || BROWN_COPPER_CHAIN_CONVEYOR.has(state)
                || YELLOW_COPPER_CHAIN_CONVEYOR.has(state)
                || ORANGE_COPPER_CHAIN_CONVEYOR.has(state)
                || CYAN_COPPER_CHAIN_CONVEYOR.has(state);
                //|| RGB_COPPER_CHAIN_CONVEYOR.has(state);
    }
    public static Component getBlockName(BlockState state) {
        // Check if it’s a colored conveyor
        if (isColoredChainConveyor(state)) {
            return Component.translatable("block.create_colored_chain_conveyor.colored_chain_conveyor");
        }
        // fallback
        return state.getBlock().getName();
    }
}
