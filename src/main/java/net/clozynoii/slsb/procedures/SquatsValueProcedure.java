package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

import net.clozynoii.slsb.network.SlsbModVariables;

public class SquatsValueProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Squats" + " [" + new java.text.DecimalFormat("#").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Squats) + "/100]";
	}
}