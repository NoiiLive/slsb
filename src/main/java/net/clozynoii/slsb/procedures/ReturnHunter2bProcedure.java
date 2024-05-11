package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
