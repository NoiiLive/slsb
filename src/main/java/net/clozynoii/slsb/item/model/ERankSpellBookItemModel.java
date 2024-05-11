package net.clozynoii.slsb.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.item.ERankSpellBookItem;

public class ERankSpellBookItemModel extends GeoModel<ERankSpellBookItem> {
	@Override
	public ResourceLocation getAnimationResource(ERankSpellBookItem animatable) {
		return new ResourceLocation("slsb", "animations/erankspellbook.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ERankSpellBookItem animatable) {
		return new ResourceLocation("slsb", "geo/erankspellbook.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ERankSpellBookItem animatable) {
		return new ResourceLocation("slsb", "textures/item/erankspellbooktexture.png");
	}
}
