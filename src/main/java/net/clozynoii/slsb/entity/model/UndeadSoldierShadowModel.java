package net.clozynoii.slsb.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.entity.UndeadSoldierShadowEntity;

public class UndeadSoldierShadowModel extends GeoModel<UndeadSoldierShadowEntity> {
	@Override
	public ResourceLocation getAnimationResource(UndeadSoldierShadowEntity entity) {
		return new ResourceLocation("slsb", "animations/undeadsoldier.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UndeadSoldierShadowEntity entity) {
		return new ResourceLocation("slsb", "geo/undeadsoldier.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UndeadSoldierShadowEntity entity) {
		return new ResourceLocation("slsb", "textures/entities/" + entity.getTexture() + ".png");
	}

}
