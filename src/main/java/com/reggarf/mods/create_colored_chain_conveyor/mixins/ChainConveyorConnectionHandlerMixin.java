package com.reggarf.mods.create_colored_chain_conveyor.mixins;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.reggarf.mods.create_colored_chain_conveyor.registries.CCCCBlocks;
import com.simibubi.create.content.kinetics.chainConveyor.ChainConveyorConnectionHandler;
import com.tterrag.registrate.util.entry.BlockEntry;

import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = ChainConveyorConnectionHandler.class, remap = false)
public class ChainConveyorConnectionHandlerMixin {

    @WrapOperation(
            method = "onItemUsedOnBlock",
            at = @At(value = "INVOKE",
                    target = "Lcom/tterrag/registrate/util/entry/BlockEntry;has(Lnet/minecraft/world/level/block/state/BlockState;)Z")
    )
    private static boolean wrapChainConveyorCheck(BlockEntry<?> instance, BlockState state, Operation<Boolean> original) {
        return original.call(instance, state) || CCCCBlocks.isColoredChainConveyor(state);
    }
}
