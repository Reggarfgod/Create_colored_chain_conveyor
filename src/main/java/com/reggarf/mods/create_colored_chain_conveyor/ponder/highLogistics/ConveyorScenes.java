package com.reggarf.mods.create_colored_chain_conveyor.ponder.highLogistics;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.reggarf.mods.create_colored_chain_conveyor.registries.CCCCBlocks;
import com.reggarf.mods.create_extra_casing.registry.CECBlocks;
import com.simibubi.create.AllItems;
import com.simibubi.create.content.kinetics.chainConveyor.ChainConveyorBlockEntity;
import com.simibubi.create.foundation.ponder.CreateSceneBuilder;
import net.createmod.catnip.math.AngleHelper;
import net.createmod.catnip.math.Pointing;
import net.createmod.ponder.api.element.ElementLink;
import net.createmod.ponder.api.element.ParrotPose;
import net.createmod.ponder.api.element.WorldSectionElement;
import net.createmod.ponder.api.level.PonderLevel;
import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;
import net.createmod.ponder.api.scene.Selection;
import net.createmod.ponder.foundation.element.ParrotElementImpl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;

import java.util.function.Supplier;

public class ConveyorScenes {

    public static void conveyor(SceneBuilder builder, SceneBuildingUtil util) {
        CreateSceneBuilder scene = new CreateSceneBuilder(builder);
        scene.title("chain_conveyor", "Relaying rotational force using Chain Conveyors");
        scene.configureBasePlate(0, 0, 9);
        scene.scaleSceneView(.75f);
        scene.setSceneOffsetY(-1);
        scene.world().showSection(util.select().layer(0), Direction.UP);

        Selection pole = util.select().fromTo(1, 1, 6, 1, 3, 6);
        Selection cogs = util.select().position(8, 1, 2);
        Selection cogs2 = util.select().fromTo(7, 1, 1, 7, 3, 1);

        BlockPos conv1 = util.grid().at(7, 4, 1);
        BlockPos conv2 = util.grid().at(1, 4, 7);
        BlockPos conv3 = util.grid().at(1, 2, 4);
        BlockPos conv4 = util.grid().at(7, 4, 7);

        connection(builder, conv1, conv2, false);
        connection(builder, conv1, conv3, false);
        connection(builder, conv1, conv4, false);

        Selection conv1S = util.select().position(conv1);
        Selection conv2S = util.select().position(conv2);

        scene.world().setKineticSpeed(conv2S, 0);

        scene.idle(5);
        scene.world().showSection(cogs, Direction.EAST);
        scene.idle(5);
        scene.world().showSection(cogs2, Direction.DOWN);
        scene.idle(5);
        scene.world().showSection(conv1S, Direction.DOWN);
        ElementLink<WorldSectionElement> poleE = scene.world().showIndependentSection(pole, Direction.DOWN);
        scene.world().moveSection(poleE, util.vector().of(0, 0, 1), 0);
        scene.idle(5);
        scene.world().showSection(conv2S, Direction.DOWN);
        scene.idle(20);

        // === Encasing conveyors with red casing ===
        ItemStack redCasingItem = new ItemStack(CECBlocks.RED_CASING.get().asItem());

        // conv1
        scene.overlay().showControls(util.vector().topOf(conv1), Pointing.DOWN, 60).rightClick().withItem(redCasingItem);
        scene.world().replaceBlocks(util.select().position(conv1),
                CCCCBlocks.RED_ANDESITE_CHAIN_CONVEYOR.get().defaultBlockState(), false);
        scene.idle(10);

        // Add encasing text for conv1
        scene.overlay().showText(60)
                .text("Encasing the chain conveyor with a Extra Casing")
                .attachKeyFrame()
                .placeNearTarget()
                .pointAt(util.vector().topOf(conv1));
        scene.idle(50);

        // conv2
        scene.overlay().showControls(util.vector().topOf(conv2), Pointing.DOWN, 60).rightClick().withItem(redCasingItem);
        scene.world().replaceBlocks(util.select().position(conv2),
                CCCCBlocks.RED_ANDESITE_CHAIN_CONVEYOR.get().defaultBlockState(), false);
        scene.idle(10);

        // Add encasing text for conv2
        scene.overlay().showText(60)
                .text("You can encase multiple conveyors to match your factory's style")
                .attachKeyFrame()
                .placeNearTarget()
                .pointAt(util.vector().topOf(conv2));
        scene.idle(50);
    }

    private static void connection(SceneBuilder builder, BlockPos p1, BlockPos p2, boolean connect) {
        builder.world().modifyBlockEntity(p1, ChainConveyorBlockEntity.class, be -> {
            if (connect)
                be.connections.add(p2.subtract(p1));
            else
                be.connections.remove(p2.subtract(p1));
        });
        builder.world().modifyBlockEntity(p2, ChainConveyorBlockEntity.class, be -> {
            if (connect)
                be.connections.add(p1.subtract(p2));
            else
                be.connections.remove(p1.subtract(p2));
        });
    }

    public static class ChainConveyorParrotElement extends ParrotElementImpl {

        private ItemEntity wrench;

        public ChainConveyorParrotElement(Vec3 location, Supplier<? extends ParrotPose> pose) {
            super(location, pose);
        }

        @Override
        protected void renderLast(PonderLevel world, MultiBufferSource buffer, GuiGraphics graphics, float fade,
                                  float pt) {
            PoseStack poseStack = graphics.pose();
            EntityRenderDispatcher entityrenderermanager = Minecraft.getInstance().getEntityRenderDispatcher();

            if (entity == null) {
                entity = pose.create(world);
                entity.setYRot(entity.yRotO = 180);
            }

            if (wrench == null) {
                wrench = new ItemEntity(world, 0, 0, 0, AllItems.WRENCH.asStack());
                wrench.setYRot(wrench.yRotO = 180);
            }

            double lx = Mth.lerp(pt, entity.xo, entity.getX());
            double ly = Mth.lerp(pt, entity.yo, entity.getY());
            double lz = Mth.lerp(pt, entity.zo, entity.getZ());
            float angle = AngleHelper.angleLerp(pt, entity.yRotO, entity.getYRot());

            poseStack.pushPose();
            poseStack.translate(location.x, location.y, location.z);
            poseStack.translate(lx, ly, lz);
            poseStack.mulPose(Axis.YP.rotationDegrees(angle));

            poseStack.translate(0, 1.5f, 0);
            poseStack.mulPose(Axis.ZP.rotationDegrees(Mth.sin((world.scene.getCurrentTime() + pt) * 0.2f) * 10));
            poseStack.translate(0, -1.5f, 0);

            poseStack.pushPose();
            poseStack.mulPose(Axis.YP.rotationDegrees(90));
            poseStack.mulPose(Axis.XP.rotationDegrees(90));
            poseStack.mulPose(Axis.ZP.rotationDegrees(90));
            poseStack.scale(1.5f, 1.5f, 1.5f);
            poseStack.translate(-0.1, 0.2, -0.6);
            BakedModel bakedmodel = Minecraft.getInstance().getItemRenderer()
                    .getModel(wrench.getItem(), world, (LivingEntity) null, 0);
            Minecraft.getInstance().getItemRenderer()
                    .render(wrench.getItem(), ItemDisplayContext.GROUND, false, poseStack, buffer,
                            lightCoordsFromFade(fade), OverlayTexture.NO_OVERLAY, bakedmodel);
            poseStack.popPose();

            entity.flapSpeed = 2;
            entityrenderermanager.render(entity, 0, 0, 0, 0, pt, poseStack, buffer, lightCoordsFromFade(fade));
            poseStack.popPose();
        }
    }
}
