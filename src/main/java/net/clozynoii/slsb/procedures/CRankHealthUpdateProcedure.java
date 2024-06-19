package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

public class CRankHealthUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 99999999, 124, false, false));
	}
}
