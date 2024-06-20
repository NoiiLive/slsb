package net.clozynoii.slsb.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.block.display.DoubleDungeonAltarDisplayItem;

public class DoubleDungeonAltarDisplayModel extends GeoModel<DoubleDungeonAltarDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DoubleDungeonAltarDisplayItem animatable) {
		return new ResourceLocation("slsb", "animations/dungeonaltar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DoubleDungeonAltarDisplayItem animatable) {
		return new ResourceLocation("slsb", "geo/dungeonaltar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DoubleDungeonAltarDisplayItem entity) {
		return new ResourceLocation("slsb", "textures/block/altartexture.png");
	}
}
