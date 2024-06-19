package net.clozynoii.slsb.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class GiantRatBossShadowModel extends GeoModel<GiantRatBossShadowEntity> {
	@Override
	public ResourceLocation getAnimationResource(GiantRatBossShadowEntity entity) {
		return new ResourceLocation("slsb", "animations/kingrat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GiantRatBossShadowEntity entity) {
		return new ResourceLocation("slsb", "geo/kingrat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GiantRatBossShadowEntity entity) {
		return new ResourceLocation("slsb", "textures/entities/" + entity.getTexture() + ".png");
	}

}