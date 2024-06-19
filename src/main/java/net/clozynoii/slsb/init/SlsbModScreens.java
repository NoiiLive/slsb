
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.clozynoii.slsb.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.clozynoii.slsb.client.gui.SystemStatsMenuScreen;
import net.clozynoii.slsb.client.gui.SystemDailyQuestScreen;
import net.clozynoii.slsb.client.gui.HunterPhonePurchaseScreen;
import net.clozynoii.slsb.client.gui.HunterPhoneNewPriceScreen;
import net.clozynoii.slsb.client.gui.HunterPhoneClaimScreen;
import net.clozynoii.slsb.client.gui.HunterPhoneBackupScreen;
import net.clozynoii.slsb.client.gui.HunterInfoMenuScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SlsbModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(SlsbModMenus.HUNTER_INFO_MENU.get(), HunterInfoMenuScreen::new);
			MenuScreens.register(SlsbModMenus.HUNTER_PHONE_BACKUP.get(), HunterPhoneBackupScreen::new);
			MenuScreens.register(SlsbModMenus.HUNTER_PHONE_CLAIM.get(), HunterPhoneClaimScreen::new);
			MenuScreens.register(SlsbModMenus.HUNTER_PHONE_PURCHASE.get(), HunterPhonePurchaseScreen::new);
			MenuScreens.register(SlsbModMenus.HUNTER_PHONE_NEW_PRICE.get(), HunterPhoneNewPriceScreen::new);
			MenuScreens.register(SlsbModMenus.SYSTEM_DAILY_QUEST.get(), SystemDailyQuestScreen::new);
			MenuScreens.register(SlsbModMenus.SYSTEM_STATS_MENU.get(), SystemStatsMenuScreen::new);
		});
	}
}
