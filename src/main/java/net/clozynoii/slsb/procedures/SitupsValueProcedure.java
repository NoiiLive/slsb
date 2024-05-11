package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

import net.clozynoii.slsb.network.SlsbModVariables;

public class SitupsValueProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Sit-ups" + " [" + new java.text.DecimalFormat("#").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Situps) + "/100]";
	}
}
