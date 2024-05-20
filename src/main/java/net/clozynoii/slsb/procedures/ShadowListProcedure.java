package net.clozynoii.slsb.procedures;

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
			convert2 = (convert).split("\u00B6")[0];
			entitytype = (convert2).split("\u00A4")[0];
			entityname = (convert2).split("\u00A4")[1];
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("##").format(list) + " : " + entityname)), false);
			convert = convert.replace(convert2 + "\u00B6", " ");
			list = list + 1;
		}
	}
}
