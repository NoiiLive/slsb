package net.clozynoii.slsb.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.block.entity.DoubleDungeonAltarTileEntity;

public class DoubleDungeonAltarBlockModel extends GeoModel<DoubleDungeonAltarTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DoubleDungeonAltarTileEntity animatable) {
		return new ResourceLocation("slsb", "animations/dungeonaltar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DoubleDungeonAltarTileEntity animatable) {
		return new ResourceLocation("slsb", "geo/dungeonaltar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DoubleDungeonAltarTileEntity entity) {
		return new ResourceLocation("slsb", "textures/block/altartexture.png");
	}
}
