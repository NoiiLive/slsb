package net.clozynoii.slsb.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.clozynoii.slsb.block.model.DoubleDungeonAltarDisplayModel;
import net.clozynoii.slsb.block.display.DoubleDungeonAltarDisplayItem;

public class DoubleDungeonAltarDisplayItemRenderer extends GeoItemRenderer<DoubleDungeonAltarDisplayItem> {
	public DoubleDungeonAltarDisplayItemRenderer() {
		super(new DoubleDungeonAltarDisplayModel());
	}

	@Override
	public RenderType getRenderType(DoubleDungeonAltarDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
