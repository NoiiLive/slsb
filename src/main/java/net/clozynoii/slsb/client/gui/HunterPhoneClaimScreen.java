package net.clozynoii.slsb.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.clozynoii.slsb.world.inventory.HunterPhoneClaimMenu;
import net.clozynoii.slsb.procedures.ReturnPhoneRedGateProcedure;
import net.clozynoii.slsb.procedures.ReturnPhoneGateTimerProcedure;
import net.clozynoii.slsb.procedures.ReturnPhoneGateRankProcedure;
import net.clozynoii.slsb.procedures.ReturnPhoneBlueGateProcedure;
import net.clozynoii.slsb.network.HunterPhoneClaimButtonMessage;
import net.clozynoii.slsb.SlsbMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HunterPhoneClaimScreen extends AbstractContainerScreen<HunterPhoneClaimMenu> {
	private final static HashMap<String, Object> guistate = HunterPhoneClaimMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox GatePrice;
	Button button_claim;

	public HunterPhoneClaimScreen(HunterPhoneClaimMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("slsb:textures/screens/hunter_phone_claim.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		GatePrice.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("slsb:textures/screens/phone_claimgate.png"), this.leftPos + -214, this.topPos + -120, 0, 0, 427, 240, 427, 240);

		if (ReturnPhoneRedGateProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("slsb:textures/screens/redgate.png"), this.leftPos + -51, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnPhoneBlueGateProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("slsb:textures/screens/bluegate.png"), this.leftPos + -51, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (GatePrice.isFocused())
			return GatePrice.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		GatePrice.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				ReturnPhoneGateRankProcedure.execute(entity), -13, -50, -6710887, false);
		guiGraphics.drawString(this.font,

				ReturnPhoneGateTimerProcedure.execute(entity), -13, -38, -6710887, false);
	}

	@Override
	public void init() {
		super.init();
		GatePrice = new EditBox(this.font, this.leftPos + -54, this.topPos + -3, 107, 18, Component.translatable("gui.slsb.hunter_phone_claim.GatePrice")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.slsb.hunter_phone_claim.GatePrice").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.slsb.hunter_phone_claim.GatePrice").getString());
				else
					setSuggestion(null);
			}
		};
		GatePrice.setSuggestion(Component.translatable("gui.slsb.hunter_phone_claim.GatePrice").getString());
		GatePrice.setMaxLength(32767);
		guistate.put("text:GatePrice", GatePrice);
		this.addWidget(this.GatePrice);
		button_claim = Button.builder(Component.translatable("gui.slsb.hunter_phone_claim.button_claim"), e -> {
			if (true) {
				SlsbMod.PACKET_HANDLER.sendToServer(new HunterPhoneClaimButtonMessage(0, x, y, z));
				HunterPhoneClaimButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -25, this.topPos + 31, 51, 20).build();
		guistate.put("button:button_claim", button_claim);
		this.addRenderableWidget(button_claim);
	}
}
