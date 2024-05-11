
package net.clozynoii.slsb.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.clozynoii.slsb.procedures.ReturnHunter4bProcedure;
import net.clozynoii.slsb.procedures.ReturnHunter4aProcedure;
import net.clozynoii.slsb.procedures.ReturnHunter3bProcedure;
import net.clozynoii.slsb.procedures.ReturnHunter3aProcedure;
import net.clozynoii.slsb.procedures.ReturnHunter2bProcedure;
import net.clozynoii.slsb.procedures.ReturnHunter2aProcedure;
import net.clozynoii.slsb.procedures.ReturnHunter1bProcedure;
import net.clozynoii.slsb.procedures.ReturnHunter1aProcedure;
import net.clozynoii.slsb.entity.HunterNPCEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class HunterNPCRenderer extends HumanoidMobRenderer<HunterNPCEntity, HumanoidModel<HunterNPCEntity>> {
	public HunterNPCRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<HunterNPCEntity, HumanoidModel<HunterNPCEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("slsb:textures/entities/hunter_1a.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, HunterNPCEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ReturnHunter1aProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<HunterNPCEntity, HumanoidModel<HunterNPCEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("slsb:textures/entities/hunter_1b.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, HunterNPCEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ReturnHunter1bProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<HunterNPCEntity, HumanoidModel<HunterNPCEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("slsb:textures/entities/hunter_2a.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, HunterNPCEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ReturnHunter2aProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<HunterNPCEntity, HumanoidModel<HunterNPCEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("slsb:textures/entities/hunter_2b.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, HunterNPCEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ReturnHunter2bProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<HunterNPCEntity, HumanoidModel<HunterNPCEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("slsb:textures/entities/hunter_3a.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, HunterNPCEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ReturnHunter3aProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<HunterNPCEntity, HumanoidModel<HunterNPCEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("slsb:textures/entities/hunter_3b.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, HunterNPCEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ReturnHunter3bProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<HunterNPCEntity, HumanoidModel<HunterNPCEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("slsb:textures/entities/hunter_4a.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, HunterNPCEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ReturnHunter4aProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<HunterNPCEntity, HumanoidModel<HunterNPCEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("slsb:textures/entities/hunter_4b.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, HunterNPCEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ReturnHunter4bProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(HunterNPCEntity entity) {
		return new ResourceLocation("slsb:textures/entities/original_steve_with_beard.png");
	}
}
