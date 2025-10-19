package com.reggarf.mods.create_colored_chain_conveyor.compat.rei;


import com.reggarf.mods.create_colored_chain_conveyor.CCCC;
import me.shedaniel.rei.api.client.entry.filtering.base.BasicFilteringRule;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import me.shedaniel.rei.forge.REIPluginClient;

@REIPluginClient
public class ReiPlugin implements REIClientPlugin {

    @Override
    public void registerBasicEntryFiltering(BasicFilteringRule<?> rule) {
        CCCC.hidedItems.forEach(i->rule.hide(EntryIngredients.of(i)));
    }

}
