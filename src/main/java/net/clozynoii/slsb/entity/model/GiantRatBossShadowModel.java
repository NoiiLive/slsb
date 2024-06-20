package net.clozynoii.slsb.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.entity.GiantRatBossShadowEntity;

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
