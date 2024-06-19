package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ReturnStatAgilityProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Agility < 500
				&& (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).SystemSkillPoints > 0) {
			return true;
		}
		return false;
	}
}
