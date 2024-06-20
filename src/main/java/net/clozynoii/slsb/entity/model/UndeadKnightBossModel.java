package net.clozynoii.slsb.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.entity.UndeadKnightBossEntity;

public class UndeadKnightBossModel extends GeoModel<UndeadKnightBossEntity> {
	@Override
	public ResourceLocation getAnimationResource(UndeadKnightBossEntity entity) {
		return new ResourceLocation("slsb", "animations/undeadknight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UndeadKnightBossEntity entity) {
		return new ResourceLocation("slsb", "geo/undeadknight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UndeadKnightBossEntity entity) {
		return new ResourceLocation("slsb", "textures/entities/" + entity.getTexture() + ".png");
	}

}
