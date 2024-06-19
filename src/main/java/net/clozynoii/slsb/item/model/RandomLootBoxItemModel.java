package net.clozynoii.slsb.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.item.RandomLootBoxItem;

public class RandomLootBoxItemModel extends GeoModel<RandomLootBoxItem> {
	@Override
	public ResourceLocation getAnimationResource(RandomLootBoxItem animatable) {
		return new ResourceLocation("slsb", "animations/randomlootbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RandomLootBoxItem animatable) {
		return new ResourceLocation("slsb", "geo/randomlootbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RandomLootBoxItem animatable) {
		return new ResourceLocation("slsb", "textures/item/lootboxtexture.png");
	}
}
