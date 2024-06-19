package net.clozynoii.slsb.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.clozynoii.slsb.world.inventory.SystemDailyQuestMenu;
import net.clozynoii.slsb.procedures.SquatsValueProcedure;
import net.clozynoii.slsb.procedures.SitupsValueProcedure;
import net.clozynoii.slsb.procedures.RunningValueProcedure;
import net.clozynoii.slsb.procedures.QuestTimerProcedure;
import net.clozynoii.slsb.procedures.PushupsValueProcedure;
import net.clozynoii.slsb.network.SystemDailyQuestButtonMessage;
import net.clozynoii.slsb.SlsbMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SystemDailyQuestScreen extends AbstractContainerScreen<SystemDailyQuestMenu> {
	private final static HashMap<String, Object> guistate = SystemDailyQuestMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_button_stats;
	ImageButton imagebutton_button_complete_h;

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
		if (mouseX > leftPos + 106 && mouseX < leftPos + 132 && mouseY > topPos + -102 && mouseY < topPos + -76)
			guiGraphics.renderTooltip(font, Component.translatable("gui.slsb.system_daily_quest.tooltip_stat_menu"), mouseX, mouseY);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.slsb.system_daily_quest.label_daily_quest_strength_training"), -28, -58, -722689, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.slsb.system_daily_quest.label_strength_training_has_arrived"), -43, -48, -722689, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.slsb.system_daily_quest.label_has_arrived"), -29, -38, -722689, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.slsb.system_daily_quest.label_ssnssbsslgoal"), -12, -23, -1, false);
		guiGraphics.drawString(this.font,

				PushupsValueProcedure.execute(entity), -48, -3, -722689, false);
		guiGraphics.drawString(this.font,

				SitupsValueProcedure.execute(entity), -48, 14, -722689, false);
		guiGraphics.drawString(this.font,

				SquatsValueProcedure.execute(entity), -48, 32, -722689, false);
		guiGraphics.drawString(this.font,

				RunningValueProcedure.execute(entity), -48, 50, -722689, false);
		guiGraphics.drawString(this.font,

				QuestTimerProcedure.execute(world), -12, 70, -722689, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_button_stats = new ImageButton(this.leftPos + 105, this.topPos + -103, 28, 28, 0, 0, 28, new ResourceLocation("slsb:textures/screens/atlas/imagebutton_button_stats.png"), 28, 56, e -> {
			if (true) {
				SlsbMod.PACKET_HANDLER.sendToServer(new SystemDailyQuestButtonMessage(0, x, y, z));
				SystemDailyQuestButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_stats", imagebutton_button_stats);
		this.addRenderableWidget(imagebutton_button_stats);
		imagebutton_button_complete_h = new ImageButton(this.leftPos + 45, this.topPos + 67, 16, 16, 0, 0, 16, new ResourceLocation("slsb:textures/screens/atlas/imagebutton_button_complete_h.png"), 16, 32, e -> {
			if (ReturnQuestCompleteProcedure.execute()) {
				SlsbMod.PACKET_HANDLER.sendToServer(new SystemDailyQuestButtonMessage(1, x, y, z));
				SystemDailyQuestButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnQuestCompleteProcedure.execute())
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button_complete_h", imagebutton_button_complete_h);
		this.addRenderableWidget(imagebutton_button_complete_h);
	}
}
