package net.clozynoii.slsb.client.renderer;

import com.mojang.math.Axis;

public class ManaArrowProjectileRenderer extends EntityRenderer<ManaArrowProjectileEntity> {

	private static final ResourceLocation texture = new ResourceLocation("slsb:textures/entities/manaarrowtexture.png");

	private final ModelCustomArrow model;

	public ManaArrowProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new ModelCustomArrow(context.bakeLayer(ModelCustomArrow.LAYER_LOCATION));
	}

	@Override
	public void render(ManaArrowProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(ManaArrowProjectileEntity entity) {
		return texture;
	}

}
