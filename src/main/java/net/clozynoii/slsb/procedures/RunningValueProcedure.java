package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

import net.clozynoii.slsb.network.SlsbModVariables;

public class RunningValueProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Running" + " [" + new java.text.DecimalFormat("#").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Running) + "/1k]";
	}
}
