package com.reggarf.mods.create_colored_chain_conveyor.config;


import net.createmod.catnip.config.ConfigBase;

public class CCCCKinetics extends ConfigBase {

    public ConfigBool casingBlockSwappable = b(true,"casingBlockSwappable",Comments.casingBlockSwappable);
    public final CCCCStress stressValues = nested(1, CCCCStress::new, Comments.stress);
    @Override
    public String getName() {
        return "kinetics";
    }

    private static class Comments {
        static String casingBlockSwappable = "Can swap casing between block";
       static String stress = "kinetic stats of individual components";

    }
}
