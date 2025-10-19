package com.reggarf.mods.create_colored_chain_conveyor.config;


import net.createmod.catnip.config.ConfigBase;

public class CCCCCommon extends ConfigBase {

    public final CCCCKinetics kinetics = nested(0, CCCCKinetics::new,Comments.kinetics);


    @Override
    public String getName() {
        return "common";
    }

    private static class Comments {
        static String kinetics = "Modify CCCC blocks comportements";

    }
}
