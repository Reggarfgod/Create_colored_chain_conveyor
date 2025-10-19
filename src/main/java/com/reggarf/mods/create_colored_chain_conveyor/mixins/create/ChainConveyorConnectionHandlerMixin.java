package com.reggarf.mods.create_colored_chain_conveyor.mixins.create;

import com.reggarf.mods.create_colored_chain_conveyor.registries.CCCCBlocks;
import com.simibubi.create.content.kinetics.chainConveyor.ChainConveyorConnectionHandler;
import com.tterrag.registrate.util.entry.BlockEntry;

import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = ChainConveyorConnectionHandler.class,remap = false)
public class ChainConveyorConnectionHandlerMixin {

    @Redirect(method = "onItemUsedOnBlock" , at = @At(value = "INVOKE", target = "Lcom/tterrag/registrate/util/entry/BlockEntry;has(Lnet/minecraft/world/level/block/state/BlockState;)Z"))
    private static boolean encased$newTypes(BlockEntry<?> instance, BlockState state){
        return CCCCBlocks.isChainConveyor(state);
    }

}
