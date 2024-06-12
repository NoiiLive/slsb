package net.clozynoii.slsb.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.clozynoii.slsb.network.SlsbModVariables;

public class ShadowListProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		String entitytype = "";
		String entityname = "";
		String convert = "";
		String position = "";
		String convert2 = "";
		double list = 0;
		list = 1;
		convert = (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).ShadowStorage;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7d\u00A7lList of Shadows"), false);
		for (int index0 = 0; index0 < (int) (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).ShadowAmount; index0++) {
			convert2 = new Object() {
				private String split(String text, String space, int index) {
					String s = text.split(space)[index];
					return s;
				}
			}.split(convert, "\u00B6", (int) 0);
			entitytype = new Object() {
				private String split(String text, String space, int index) {
					String s = text.split(space)[index];
					return s;
				}
			}.split(convert2, "\u00A4", (int) 0);
			entityname = new Object() {
				private String split(String text, String space, int index) {
					String s = text.split(space)[index];
					return s;
				}
			}.split(convert2, "\u00A4", (int) 1);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("##").format(list) + " : " + entityname)), false);
			convert = convert.replace(convert2 + "\u00B6", " ");
			list = list + 1;
		}
	}
}
