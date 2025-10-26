package com.reggarf.mods.create_colored_chain_conveyor.registries;

import com.reggarf.mods.create_colored_chain_conveyor.CCCC;
import com.reggarf.mods.create_extra_casing.CEC;
import com.simibubi.create.Create;
import com.tterrag.registrate.providers.DataGenContext;
import com.tterrag.registrate.providers.RegistrateBlockstateProvider;
import com.tterrag.registrate.providers.RegistrateItemModelProvider;
import com.tterrag.registrate.providers.RegistrateProvider;
import com.tterrag.registrate.util.nullness.NonNullBiConsumer;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ModelBuilder;
import net.minecraftforge.client.model.generators.ModelFile;


import java.util.Objects;

public class CCCCBlockStateGens {


    public static <T extends Block> NonNullBiConsumer<DataGenContext<Block, T>, RegistrateBlockstateProvider> chainConveyor(String casing) {
        return (ctx,prov)->{
            prov.simpleBlock(ctx.get(),createConveyorModel(prov,casing,false));
            texturesChainConveyor(Objects.requireNonNull(createModelInBlock(prov, "chain_conveyor/" + casing + "/wheel")).parent(new ModelFile.UncheckedModelFile("create:block/chain_conveyor/wheel")),casing);
            texturesChainConveyor(Objects.requireNonNull(createModelInBlock(prov, "chain_conveyor/" + casing + "/guard")).parent(new ModelFile.UncheckedModelFile("create:block/chain_conveyor/guard")),casing);
            texturesChainConveyor(Objects.requireNonNull(createModelInBlock(prov, "chain_conveyor/" + casing + "/shaft")).parent(new ModelFile.UncheckedModelFile("create:block/chain_conveyor/shaft")),casing);
        };
    }

    public static ModelFile createConveyorModel(RegistrateProvider prov, String casing, boolean item) {
        if (!item){
            return Objects.requireNonNull(createModelInBlock(prov, "chain_conveyor/" + casing + "/block"))
                    .parent(new ModelFile.UncheckedModelFile("create:block/chain_conveyor/block"))
                    .texture("0",getConveyorCasingTexture(casing))
                    .texture("particle",getCasingTexture(casing));
        } else {
            return texturesChainConveyor(Objects.requireNonNull(createModelInBlock(prov, "chain_conveyor/" + casing + "/item"))
                    .parent(new ModelFile.UncheckedModelFile("create:block/chain_conveyor/item")),casing);
        }
    }

    private static ModelBuilder<? extends ModelBuilder<?>> texturesChainConveyor(ModelBuilder<? extends ModelBuilder<?>> builder, String casing){
        return builder
                .texture("conveyor_casing",getConveyorCasingTexture(casing))
                .texture("conveyor_port", getConveyorPortTexture(casing))
                .texture("bullwheel", getBullWheelTexture(casing))
                .texture("particle",getCasingTexture(casing));
    }


    public static ModelBuilder<? extends ModelBuilder<?>> createModelInBlock(RegistrateProvider p, String path){
        if (p instanceof RegistrateBlockstateProvider provider)
            return provider.models()
                    .getBuilder("block/"+path);
        else if (p instanceof RegistrateItemModelProvider provider)
            return provider.getBuilder("block/"+path);
        return null;
    }

    public static boolean isValidProvider(RegistrateProvider p){
        return p instanceof RegistrateBlockstateProvider || p instanceof RegistrateItemModelProvider;
    }


    public static String getCasingTexture(String casing){
        if (casing.equals("normal")) return Create.ID+":block/andesite_casing";
        String modid = getModForCasing(casing);
        if (casing.equals("industrial_iron") || casing.equals("weathered_iron")) return modid + ":block/"+casing+"_block";
        return modid + ":block/"+casing+"_casing";
    }

    public static String getModForCasing(String casing){
        if (casing.equals("brass")
                || casing.equals("andesite")
                || casing.equals("copper")) return Create.ID;
                //andesite
        if (casing.equals("red")
                || casing.equals("white")
                || casing.equals("black")
                || casing.equals("gray")
                || casing.equals("blue")
                || casing.equals("light_blue")
                || casing.equals("light_gray")
                || casing.equals("green")
                || casing.equals("yellow")
                || casing.equals("orange")
                || casing.equals("pink")
                || casing.equals("purple")
                || casing.equals("brown")
                || casing.equals("lime")
                || casing.equals("magenta")
                || casing.equals("cyan")
                || casing.equals("rgb")
                //brass
                || casing.equals("red_brass")
                || casing.equals("white_brass")
                || casing.equals("black_brass")
                || casing.equals("gray_brass")
                || casing.equals("blue_brass")
                || casing.equals("light_blue_brass")
                || casing.equals("light_gray_brass")
                || casing.equals("green_brass")
                || casing.equals("yellow_brass")
                || casing.equals("orange_brass")
                || casing.equals("pink_brass")
                || casing.equals("purple_brass")
                || casing.equals("brown_brass")
                || casing.equals("lime_brass")
                || casing.equals("magenta_brass")
                || casing.equals("cyan_brass")
                || casing.equals("rgb_brass")
                //copper
                || casing.equals("red_copper")
                || casing.equals("white_copper")
                || casing.equals("black_copper")
                || casing.equals("gray_copper")
                || casing.equals("blue_copper")
                || casing.equals("light_blue_copper")
                || casing.equals("light_gray_copper")
                || casing.equals("green_copper")
                || casing.equals("yellow_copper")
                || casing.equals("orange_copper")
                || casing.equals("pink_copper")
                || casing.equals("purple_copper")
                || casing.equals("brown_copper")
                || casing.equals("lime_copper")
                || casing.equals("magenta_copper")
                || casing.equals("cyan_copper")
                || casing.equals("rgb_copper")) return CEC.MODID;
        return CCCC.MODID;
    }

    public static String getConveyorPortTexture(String casing) {
        if (casing.equals("normal")) return Create.ID + ":block/conveyor_port";
        return CCCC.MODID + ":block/conveyor_ports/"+casing;
    }

    public static String getConveyorCasingTexture(String casing) {
        if (casing.equals("normal")) return Create.ID + ":block/conveyor_casing";
        return CCCC.MODID + ":block/conveyor_casings/"+casing;
    }

    public static String getBullWheelTexture(String casing) {
        if (casing.equals("normal")) return Create.ID + ":block/bullwheel";
        return CCCC.MODID + ":block/bullwheels/"+casing;
    }

}
