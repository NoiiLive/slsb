
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.clozynoii.slsb.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.clozynoii.slsb.client.renderer.WindBarrierMobRenderer;
import net.clozynoii.slsb.client.renderer.WhirlwindEntityRenderer;
import net.clozynoii.slsb.client.renderer.UndeadSoldierShadowRenderer;
import net.clozynoii.slsb.client.renderer.UndeadSoldierRenderer;
import net.clozynoii.slsb.client.renderer.UndeadKnightBossShadowRenderer;
import net.clozynoii.slsb.client.renderer.UndeadKnightBossRenderer;
import net.clozynoii.slsb.client.renderer.ManaArrowProjectileRenderer;
import net.clozynoii.slsb.client.renderer.HunterNPCRenderer;
import net.clozynoii.slsb.client.renderer.GiantRatShadowRenderer;
import net.clozynoii.slsb.client.renderer.GiantRatRenderer;
import net.clozynoii.slsb.client.renderer.GiantRatBossShadowRenderer;
import net.clozynoii.slsb.client.renderer.GiantRatBossRenderer;
import net.clozynoii.slsb.client.renderer.EssenceStoneArrowProjectileRenderer;
import net.clozynoii.slsb.client.renderer.EntityShadowRenderer;
import net.clozynoii.slsb.client.renderer.AfterImageRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SlsbModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SlsbModEntities.AFTER_IMAGE.get(), AfterImageRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.WIND_SLICE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.WIND_BARRIER_MOB.get(), WindBarrierMobRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.GIANT_RAT.get(), GiantRatRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.GIANT_RAT_BOSS.get(), GiantRatBossRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.SWORD_SLICE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.UNDEAD_SOLDIER.get(), UndeadSoldierRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.WHIRLWIND_ENTITY.get(), WhirlwindEntityRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.UNDEAD_KNIGHT_BOSS.get(), UndeadKnightBossRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.HUNTER_NPC.get(), HunterNPCRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.ESSENCE_STONE_ARROW_PROJECTILE.get(), EssenceStoneArrowProjectileRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.MANA_ARROW_PROJECTILE.get(), ManaArrowProjectileRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.GIANT_RAT_BOSS_SHADOW.get(), GiantRatBossShadowRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.UNDEAD_SOLDIER_SHADOW.get(), UndeadSoldierShadowRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.GIANT_RAT_SHADOW.get(), GiantRatShadowRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.ENTITY_SHADOW.get(), EntityShadowRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.UNDEAD_KNIGHT_BOSS_SHADOW.get(), UndeadKnightBossShadowRenderer::new);
	}
}
