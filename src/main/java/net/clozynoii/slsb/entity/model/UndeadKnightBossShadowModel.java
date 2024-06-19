package net.clozynoii.slsb.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.entity.UndeadKnightBossShadowEntity;

public class UndeadKnightBossShadowModel extends GeoModel<UndeadKnightBossShadowEntity> {
	@Override
	public ResourceLocation getAnimationResource(UndeadKnightBossShadowEntity entity) {
		return new ResourceLocation("slsb", "animations/undeadknight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UndeadKnightBossShadowEntity entity) {
		return new ResourceLocation("slsb", "geo/undeadknight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UndeadKnightBossShadowEntity entity) {
		return new ResourceLocation("slsb", "textures/entities/" + entity.getTexture() + ".png");
	}

}
