
package net.clozynoii.slsb.client.renderer;

public class EntityShadowRenderer extends HumanoidMobRenderer<EntityShadowEntity, HumanoidModel<EntityShadowEntity>> {

	public EntityShadowRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(EntityShadowEntity entity) {
		return new ResourceLocation("slsb:textures/entities/a2i2e_layer_2.png");
	}

}
