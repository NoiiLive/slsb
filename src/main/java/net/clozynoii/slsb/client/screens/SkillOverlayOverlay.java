
package net.clozynoii.slsb.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.clozynoii.slsb.procedures.SkillDisplayProcedure;
import net.clozynoii.slsb.procedures.SkillDisplayConditionProcedure;
import net.clozynoii.slsb.procedures.ReturnOverlayActivateProcedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySlots5Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySlots4Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySlots3Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySlots2Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySlots1Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySelected5Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySelected4Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySelected3Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySelected2Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySelected1Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilityCooldown5Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilityCooldown4Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilityCooldown3Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilityCooldown2Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilityCooldown1Procedure;
import net.clozynoii.slsb.procedures.ManaOverlayProcedure;
import net.clozynoii.slsb.procedures.ManaDisplayConditionProcedure;
import net.clozynoii.slsb.procedures.ManaBar9Procedure;
import net.clozynoii.slsb.procedures.ManaBar8Procedure;
import net.clozynoii.slsb.procedures.ManaBar7Procedure;
import net.clozynoii.slsb.procedures.ManaBar6Procedure;
import net.clozynoii.slsb.procedures.ManaBar5Procedure;
import net.clozynoii.slsb.procedures.ManaBar4Procedure;
import net.clozynoii.slsb.procedures.ManaBar3Procedure;
import net.clozynoii.slsb.procedures.ManaBar2Procedure;
import net.clozynoii.slsb.procedures.ManaBar1Procedure;
import net.clozynoii.slsb.procedures.ManaBar15Procedure;
import net.clozynoii.slsb.procedures.ManaBar14Procedure;
import net.clozynoii.slsb.procedures.ManaBar13Procedure;
import net.clozynoii.slsb.procedures.ManaBar12Procedure;
import net.clozynoii.slsb.procedures.ManaBar11Procedure;
import net.clozynoii.slsb.procedures.ManaBar10Procedure;
import net.clozynoii.slsb.procedures.CostOverlayProcedure;
import net.clozynoii.slsb.procedures.CostDisplayConditionProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class SkillOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (ReturnOverlayActivateProcedure.execute(entity)) {
			if (ReturnOverlayActivateProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay.png"), 5, 5, 0, 0, 154, 42, 154, 42);
			}
			if (ReturnAbilitySlots1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_slots_1.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ReturnAbilitySlots2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_slots_2.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ReturnAbilitySlots3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_slots_3.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ReturnAbilitySlots4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_slots_4.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ReturnAbilitySlots5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_slots_5.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_1.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_2.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_3.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_4.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_5.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_6.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_7.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_8.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_9.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_10.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar11Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_11.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar12Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_12.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar13Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_13.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar14Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_14.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar15Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_15.png"), 12, 11, 0, 0, 140, 36, 140, 36);
			}
			if (ReturnAbilitySelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_select_1.png"), 40, 19, 0, 0, 26, 26, 26, 26);
			}
			if (ReturnAbilitySelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_select_other.png"), 59, 19, 0, 0, 26, 26, 26, 26);
			}
			if (ReturnAbilitySelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_select_other.png"), 78, 19, 0, 0, 26, 26, 26, 26);
			}
			if (ReturnAbilitySelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_select_other.png"), 97, 19, 0, 0, 26, 26, 26, 26);
			}
			if (ReturnAbilitySelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_select_other.png"), 116, 19, 0, 0, 26, 26, 26, 26);
			}
			if (ReturnAbilityCooldown1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_lock.png"), 45, 23, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityCooldown2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_lock.png"), 64, 23, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityCooldown3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_lock.png"), 83, 23, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityCooldown4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_lock.png"), 102, 23, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityCooldown5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_lock.png"), 121, 23, 0, 0, 16, 16, 16, 16);
			}
			if (HealthBar1Procedure.execute()) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_health_1.png"), 5, 5, 0, 0, 154, 42, 154, 42);
			}
			if (HealthBar2Procedure.execute()) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_health_2.png"), 5, 5, 0, 0, 154, 42, 154, 42);
			}
			if (HealthBar3Procedure.execute()) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_health_3.png"), 5, 5, 0, 0, 154, 42, 154, 42);
			}
			if (HealthBar4Procedure.execute()) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_health_4.png"), 5, 5, 0, 0, 154, 42, 154, 42);
			}
			if (HealthBar5Procedure.execute()) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_health_5.png"), 5, 5, 0, 0, 154, 42, 154, 42);
			}
			if (HealthBar6Procedure.execute()) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_health_6.png"), 5, 5, 0, 0, 154, 42, 154, 42);
			}
			if (HealthBar7Procedure.execute()) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_health_7.png"), 5, 5, 0, 0, 154, 42, 154, 42);
			}
			if (HealthBar8Procedure.execute()) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_health_8.png"), 5, 5, 0, 0, 154, 42, 154, 42);
			}
			if (HealthBar9Procedure.execute()) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_health_9.png"), 5, 5, 0, 0, 154, 42, 154, 42);
			}
			if (HealthBar10Procedure.execute()) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_health_10.png"), 5, 5, 0, 0, 154, 42, 154, 42);
			}
			if (HealthBar11Procedure.execute()) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_health_11.png"), 5, 5, 0, 0, 154, 42, 154, 42);
			}
			if (HealthBar12Procedure.execute()) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_health_12.png"), 5, 5, 0, 0, 154, 42, 154, 42);
			}
			if (HealthBar13Procedure.execute()) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_health_13.png"), 5, 5, 0, 0, 154, 42, 154, 42);
			}
			if (HealthBar14Procedure.execute()) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_health_14.png"), 5, 5, 0, 0, 154, 42, 154, 42);
			}
			if (SkillDisplayConditionProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						SkillDisplayProcedure.execute(entity), 8, 48, -1, false);
			if (ManaDisplayConditionProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						ManaOverlayProcedure.execute(entity), 159, 22, -1, false);
			if (CostDisplayConditionProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						CostOverlayProcedure.execute(entity), 8, 60, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					HealthOverlayProcedure.execute(), 159, 9, -1, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
