package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

public class ReturnPhoneGateCostProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##").format(entity.getPersistentData().getDouble("PhoneGatePrice")) + " \u20A9";
	}
}
