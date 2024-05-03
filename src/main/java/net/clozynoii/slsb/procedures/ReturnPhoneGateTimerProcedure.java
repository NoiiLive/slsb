package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

public class ReturnPhoneGateTimerProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Closes: " + new java.text.DecimalFormat("##.#").format(entity.getPersistentData().getDouble("PhoneGateTimer") / 24000) + "d";
	}
}
