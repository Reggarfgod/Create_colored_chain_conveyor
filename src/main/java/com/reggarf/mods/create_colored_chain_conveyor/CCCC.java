package com.reggarf.mods.create_colored_chain_conveyor;

import com.reggarf.mods.create_colored_chain_conveyor.config.CCCCConfigs;
import com.reggarf.mods.create_colored_chain_conveyor.registries.CCCCBlockEntityTypes;
import com.reggarf.mods.create_colored_chain_conveyor.registries.CCCCBlocks;
import com.reggarf.mods.create_colored_chain_conveyor.registries.CCCCCreativeTab;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.item.ItemDescription;
import com.simibubi.create.foundation.item.KineticStats;
import com.simibubi.create.foundation.item.TooltipModifier;
import net.createmod.catnip.lang.FontHelper;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModContainer;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.ArrayList;
import java.util.List;

import static net.minecraftforge.common.MinecraftForge.EVENT_BUS;

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
    public CCCC() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;

        MinecraftForge.EVENT_BUS.register(this);
        REGISTRATE.registerEventListeners(modEventBus);

        CCCCBlocks.register();
        CCCCBlockEntityTypes.register();
        CCCCCreativeTab.register(modEventBus);

        CCCCConfigs.register(ModLoadingContext.get());
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> CCCCClient.onCtorClient(modEventBus));


        modEventBus.addListener(this::setup);
        modEventBus.addListener(EventPriority.LOWEST, this::gatherData);
    }

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MODID, path);
    }
    public static void hideItem(ItemLike it){
        hidedItems.add(it);
    }
    private void setup(final FMLCommonSetupEvent event) {
    }

    private void gatherData(GatherDataEvent event) {
    }
}
