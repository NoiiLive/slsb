package net.clozynoii.slsb.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.clozynoii.slsb.world.inventory.SystemDailyQuestMenu;
import net.clozynoii.slsb.procedures.SquatsValueProcedure;
import net.clozynoii.slsb.procedures.SitupsValueProcedure;
import net.clozynoii.slsb.procedures.RunningValueProcedure;
import net.clozynoii.slsb.procedures.PushupsValueProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SystemDailyQuestScreen extends AbstractContainerScreen<SystemDailyQuestMenu> {
	private final static HashMap<String, Object> guistate = SystemDailyQuestMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SystemDailyQuestScreen(SystemDailyQuestMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("slsb:textures/screens/system_daily_quest.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("slsb:textures/screens/system_quest.png"), this.leftPos + -213, this.topPos + -121, 0, 0, 427, 240, 427, 240);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.slsb.system_daily_quest.label_daily_quest_strength_training"), -28, -58, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.slsb.system_daily_quest.label_strength_training_has_arrived"), -43, -48, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.slsb.system_daily_quest.label_has_arrived"), -29, -38, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.slsb.system_daily_quest.label_ssnssbsslgoal"), -26, -23, -1, false);
		guiGraphics.drawString(this.font,

				PushupsValueProcedure.execute(entity), -37, -4, -1, false);
		guiGraphics.drawString(this.font,

				SitupsValueProcedure.execute(entity), -37, 14, -1, false);
		guiGraphics.drawString(this.font,

				SquatsValueProcedure.execute(entity), -37, 32, -1, false);
		guiGraphics.drawString(this.font,

				RunningValueProcedure.execute(entity), -37, 50, -1, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
