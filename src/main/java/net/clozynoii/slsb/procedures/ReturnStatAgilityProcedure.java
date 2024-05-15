package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

import net.clozynoii.slsb.network.SlsbModVariables;

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
