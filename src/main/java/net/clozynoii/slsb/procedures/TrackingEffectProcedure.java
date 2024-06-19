package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

public class TrackingEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 10, 0, false, false));
	}
}
