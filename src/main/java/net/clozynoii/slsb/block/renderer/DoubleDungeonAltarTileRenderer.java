package net.clozynoii.slsb.block.renderer;

public class DoubleDungeonAltarTileRenderer extends GeoBlockRenderer<DoubleDungeonAltarTileEntity> {
	public DoubleDungeonAltarTileRenderer() {
		super(new DoubleDungeonAltarBlockModel());
	}

	@Override
	public RenderType getRenderType(DoubleDungeonAltarTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}