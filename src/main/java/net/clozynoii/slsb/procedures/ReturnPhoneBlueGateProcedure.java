package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

public class ReturnPhoneBlueGateProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("PhoneGateRed") == false) {
			return true;
		}
		return false;
	}
}
