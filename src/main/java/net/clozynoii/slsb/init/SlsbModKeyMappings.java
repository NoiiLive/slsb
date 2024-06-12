
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.clozynoii.slsb.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.clozynoii.slsb.network.UseSkillMessage;
import net.clozynoii.slsb.network.TrainMessage;
import net.clozynoii.slsb.network.SwitchSkillMessage;
import net.clozynoii.slsb.network.SpeedToggleMessage;
import net.clozynoii.slsb.network.InfoMenuMessage;
import net.clozynoii.slsb.SlsbMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SlsbModKeyMappings {
	public static final KeyMapping USE_SKILL = new KeyMapping("key.slsb.use_skill", GLFW.GLFW_KEY_C, "key.categories.slsb") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				SlsbMod.PACKET_HANDLER.sendToServer(new UseSkillMessage(0, 0));
				UseSkillMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SWITCH_SKILL = new KeyMapping("key.slsb.switch_skill", GLFW.GLFW_KEY_X, "key.categories.slsb") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				SlsbMod.PACKET_HANDLER.sendToServer(new SwitchSkillMessage(0, 0));
				SwitchSkillMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping INFO_MENU = new KeyMapping("key.slsb.info_menu", GLFW.GLFW_KEY_G, "key.categories.slsb") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				SlsbMod.PACKET_HANDLER.sendToServer(new InfoMenuMessage(0, 0));
				InfoMenuMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SPEED_TOGGLE = new KeyMapping("key.slsb.speed_toggle", GLFW.GLFW_KEY_LEFT_SHIFT, "key.categories.slsb") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				SlsbMod.PACKET_HANDLER.sendToServer(new SpeedToggleMessage(0, 0));
				SpeedToggleMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping TRAIN = new KeyMapping("key.slsb.train", GLFW.GLFW_KEY_V, "key.categories.slsb") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				SlsbMod.PACKET_HANDLER.sendToServer(new TrainMessage(0, 0));
				TrainMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(USE_SKILL);
		event.register(SWITCH_SKILL);
		event.register(INFO_MENU);
		event.register(SPEED_TOGGLE);
		event.register(TRAIN);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				USE_SKILL.consumeClick();
				SWITCH_SKILL.consumeClick();
				INFO_MENU.consumeClick();
				SPEED_TOGGLE.consumeClick();
				TRAIN.consumeClick();
			}
		}
	}
}
