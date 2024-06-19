package net.clozynoii.slsb.block.renderer;

public class DoubleDungeonAltarDisplayItemRenderer extends GeoItemRenderer<DoubleDungeonAltarDisplayItem> {
	public DoubleDungeonAltarDisplayItemRenderer() {
		super(new DoubleDungeonAltarDisplayModel());
	}

	@Override
	public RenderType getRenderType(DoubleDungeonAltarDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}