package com.reggarf.mods.create_colored_chain_conveyor.blocks.colored;

import com.reggarf.mods.create_colored_chain_conveyor.registries.CCCCBlockEntityTypes;
import com.simibubi.create.content.kinetics.chainConveyor.ChainConveyorBlock;
import com.simibubi.create.content.kinetics.chainConveyor.ChainConveyorBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class CCCCChainConveyorBlock extends ChainConveyorBlock {
    public CCCCChainConveyorBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntityType<? extends ChainConveyorBlockEntity> getBlockEntityType() {
        return CCCCBlockEntityTypes.COLORED_CHAIN_CONVEYOR.get();
    }
}
