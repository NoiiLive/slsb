package net.clozynoii.slsb.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.entity.GiantRatShadowEntity;

public class GiantRatShadowModel extends GeoModel<GiantRatShadowEntity> {
	@Override
	public ResourceLocation getAnimationResource(GiantRatShadowEntity entity) {
		return new ResourceLocation("slsb", "animations/largerat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GiantRatShadowEntity entity) {
		return new ResourceLocation("slsb", "geo/largerat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GiantRatShadowEntity entity) {
		return new ResourceLocation("slsb", "textures/entities/" + entity.getTexture() + ".png");
	}

}
