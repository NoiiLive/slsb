package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

import net.clozynoii.slsb.network.SlsbModVariables;

public class HealthOverlayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A7f\u00A7l[\u00A7c" + new java.text.DecimalFormat("#").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).PlayerHealth) + "\u00A7f\u00A7l]";
	}
}
