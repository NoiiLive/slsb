
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.clozynoii.slsb.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.clozynoii.slsb.client.model.ModelJinwooShoes;
import net.clozynoii.slsb.client.model.ModelJinwooPants;
import net.clozynoii.slsb.client.model.ModelJinwooJacket;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SlsbModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelJinwooShoes.LAYER_LOCATION, ModelJinwooShoes::createBodyLayer);
		event.registerLayerDefinition(ModelJinwooPants.LAYER_LOCATION, ModelJinwooPants::createBodyLayer);
		event.registerLayerDefinition(ModelJinwooJacket.LAYER_LOCATION, ModelJinwooJacket::createBodyLayer);
	}
}
