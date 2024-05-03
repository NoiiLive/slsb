package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

public class ReturnPhoneGateRankProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return entity.getPersistentData().getString("PhoneGateRank");
	}
}
