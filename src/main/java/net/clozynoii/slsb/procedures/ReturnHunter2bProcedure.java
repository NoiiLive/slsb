package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

import net.clozynoii.slsb.entity.HunterNPCEntity;

public class ReturnHunter2bProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof HunterNPCEntity _datEntI ? _datEntI.getEntityData().get(HunterNPCEntity.DATA_Skin) : 0) == 4) {
			return true;
		}
		return false;
	}
}
