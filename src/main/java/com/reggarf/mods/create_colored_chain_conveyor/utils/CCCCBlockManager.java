package com.reggarf.mods.create_colored_chain_conveyor.utils;

import com.reggarf.mods.create_colored_chain_conveyor.CCCC;
import com.reggarf.mods.create_colored_chain_conveyor.config.CCCCConfigs;
import com.simibubi.create.content.kinetics.base.HorizontalKineticBlock;
import com.simibubi.create.content.kinetics.base.RotatedPillarKineticBlock;

import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

import static com.simibubi.create.content.kinetics.base.HorizontalKineticBlock.HORIZONTAL_FACING;
import static com.simibubi.create.content.kinetics.base.RotatedPillarKineticBlock.AXIS;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.GAME,modid = CCCC.MODID)
public class CCCCBlockManager {

    @SubscribeEvent
    public static <T extends Comparable<T>> void onRightClick(PlayerInteractEvent.RightClickBlock event){
        Level level = event.getEntity().level();
        if (event.getItemStack().isEmpty()) return;
        if (level.getBlockState(event.getPos()).isAir()) return;
        BlockState state = level.getBlockState(event.getPos());
        if (CCCCEncasableBlocks.hasBlocksForCasing(event.getItemStack().getItem()) && CCCCConfigs.common().kinetics.casingBlockSwappable.get()) {
            CCCCEncasableBlocks casingSet = CCCCEncasableBlocks.getBlockByCasing(event.getItemStack().getItem());
            if (casingSet.isInSet(state)) return;
            if (CCCCEncasableBlocks.isChainConveyor(state)) {
                changeBlock(event, state, level, casingSet.getChainConveyor().getDefaultState());
            }
        }

    }

    private static void changeBlock(PlayerInteractEvent.RightClickBlock event,BlockState state,Level level,BlockState newBlock){
        level.setBlockAndUpdate(event.getPos(), newBlock);
        level.levelEvent(2001, event.getPos(), Block.getId(newBlock));
        event.setCancellationResult(InteractionResult.SUCCESS);
        event.setCanceled(true);
    }

    private static void changeHorizontalDirectionBlock(PlayerInteractEvent.RightClickBlock event,BlockState state,Level level,BlockState newBlock){
        if (!(state.getBlock() instanceof HorizontalKineticBlock))return;
        Direction facing = state.getValue(HORIZONTAL_FACING);
        changeBlock(event,state,level,newBlock.setValue(HORIZONTAL_FACING,facing));
    }

    private static void changeAxisBlock(PlayerInteractEvent.RightClickBlock event,BlockState state,Level level,BlockState newBlock){
        if (!(state.getBlock() instanceof RotatedPillarKineticBlock))return;
        Direction.Axis axis = state.getValue(AXIS);
        changeBlock(event,state,level,newBlock.setValue(AXIS,axis));
    }


}
