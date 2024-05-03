package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

public class ReturnPhoneRedGateProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("PhoneGateRed") == true) {
			return true;
		}
		return false;
	}
}
