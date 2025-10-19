package com.reggarf.mods.create_colored_chain_conveyor;

import com.reggarf.mods.create_colored_chain_conveyor.config.CCCCConfigs;
import com.reggarf.mods.create_colored_chain_conveyor.registries.CCCCBlockEntityTypes;
import com.reggarf.mods.create_colored_chain_conveyor.registries.CCCCBlocks;
import com.reggarf.mods.create_colored_chain_conveyor.registries.CCCCCreativeTab;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.item.ItemDescription;
import com.simibubi.create.foundation.item.KineticStats;
import com.simibubi.create.foundation.item.TooltipModifier;
import com.tterrag.registrate.util.RegistrateDistExecutor;
import net.createmod.catnip.lang.FontHelper;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.ItemLike;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.ArrayList;
import java.util.List;

@Mod(CCCC.MODID)
public class CCCC {

    public static final String MODID = "create_colored_chain_conveyor";
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MODID)
            .defaultCreativeTab((ResourceKey<CreativeModeTab>) null);
    public static List<ItemLike> hidedItems = new ArrayList<>();

    static {
        REGISTRATE.setTooltipModifierFactory(item -> new ItemDescription.Modifier(item, FontHelper.Palette.STANDARD_CREATE)
                .andThen(TooltipModifier.mapNull(KineticStats.create(item))));
    }
    public CCCC(IEventBus modEventBus, ModContainer container) {

        IEventBus neoForgeEventBus = NeoForge.EVENT_BUS;
        REGISTRATE.registerEventListeners(modEventBus);

        CCCCBlocks.register();
        CCCCBlockEntityTypes.register();
        CCCCCreativeTab.register(modEventBus);

        CCCCConfigs.register(ModLoadingContext.get(),container);
        RegistrateDistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> CCCCClient.onCtorClient(modEventBus));


        modEventBus.addListener(this::setup);
        modEventBus.addListener(EventPriority.LOWEST, this::gatherData);


    }

    public static ResourceLocation asResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
    public static void hideItem(ItemLike it){
        hidedItems.add(it);
    }
    private void setup(final FMLCommonSetupEvent event) {
    }

    private void gatherData(GatherDataEvent event) {
    }
}
