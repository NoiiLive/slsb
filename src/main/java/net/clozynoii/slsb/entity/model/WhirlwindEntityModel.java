package net.clozynoii.slsb.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.entity.WhirlwindEntityEntity;

public class WhirlwindEntityModel extends GeoModel<WhirlwindEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(WhirlwindEntityEntity entity) {
		return new ResourceLocation("slsb", "animations/whirlwind.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WhirlwindEntityEntity entity) {
		return new ResourceLocation("slsb", "geo/whirlwind.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WhirlwindEntityEntity entity) {
		return new ResourceLocation("slsb", "textures/entities/" + entity.getTexture() + ".png");
	}

}
