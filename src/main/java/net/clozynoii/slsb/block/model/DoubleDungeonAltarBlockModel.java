package net.clozynoii.slsb.block.model;

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
	public ResourceLocation getTextureResource(DoubleDungeonAltarTileEntity animatable) {
		return new ResourceLocation("slsb", "textures/block/altartexture.png");
	}
}