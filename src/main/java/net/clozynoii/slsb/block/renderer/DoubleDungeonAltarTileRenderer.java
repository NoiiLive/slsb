package net.clozynoii.slsb.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.clozynoii.slsb.block.model.DoubleDungeonAltarBlockModel;
import net.clozynoii.slsb.block.entity.DoubleDungeonAltarTileEntity;

public class DoubleDungeonAltarTileRenderer extends GeoBlockRenderer<DoubleDungeonAltarTileEntity> {
	public DoubleDungeonAltarTileRenderer() {
		super(new DoubleDungeonAltarBlockModel());
	}

	@Override
	public RenderType getRenderType(DoubleDungeonAltarTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
