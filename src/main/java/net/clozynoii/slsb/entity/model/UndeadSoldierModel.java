package net.clozynoii.slsb.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.entity.UndeadSoldierEntity;

public class UndeadSoldierModel extends GeoModel<UndeadSoldierEntity> {
	@Override
	public ResourceLocation getAnimationResource(UndeadSoldierEntity entity) {
		return new ResourceLocation("slsb", "animations/undeadsoldier.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UndeadSoldierEntity entity) {
		return new ResourceLocation("slsb", "geo/undeadsoldier.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UndeadSoldierEntity entity) {
		return new ResourceLocation("slsb", "textures/entities/" + entity.getTexture() + ".png");
	}

}
