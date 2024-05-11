package net.clozynoii.slsb.client.gui;

public class SystemStatsMenuScreen extends AbstractContainerScreen<SystemStatsMenuMenu> {

	private final static HashMap<String, Object> guistate = SystemStatsMenuMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SystemStatsMenuScreen(SystemStatsMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("slsb:textures/screens/system_stats_menu.png");

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

		guiGraphics.blit(new ResourceLocation("slsb:textures/screens/system_stats.png"), this.leftPos + -214, this.topPos + -120, 0, 0, 427, 240, 427, 240);

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
		guiGraphics.drawString(this.font,

				SystemReturnLevelProcedure.execute(), -27, -28, -722689, false);
		guiGraphics.drawString(this.font,

				SystemReturnJobProcedure.execute(entity), 25, -28, -722689, false);
		guiGraphics.drawString(this.font,

				SystemReturnTitleProcedure.execute(), 35, -18, -722689, false);
		guiGraphics.drawString(this.font,

				SystemReturnHPProcedure.execute(entity), -55, 4, -722689, false);
		guiGraphics.drawString(this.font,

				SystemReturnMPProcedure.execute(entity), 19, 4, -722689, false);
		guiGraphics.drawString(this.font,

				SystemReturnStrengthProcedure.execute(entity), -36, 23, -722689, false);
		guiGraphics.drawString(this.font,

				SystemReturnAgilityProcedure.execute(entity), -36, 35, -722689, false);
		guiGraphics.drawString(this.font,

				SystemReturnPerceptionProcedure.execute(entity), -36, 47, -722689, false);
		guiGraphics.drawString(this.font,

				SystemReturnVitalityProcedure.execute(entity), 37, 23, -722689, false);
		guiGraphics.drawString(this.font,

				SystemReturnIntelligenceProcedure.execute(entity), 37, 35, -722689, false);
		guiGraphics.drawString(this.font,

				SystemReturnSkillPointsProcedure.execute(), 41, 47, -722689, false);
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
