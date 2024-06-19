package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class PlayerTrueHealthProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player || entity instanceof ServerPlayer) {
			SlsbMod.LOGGER.info((new java.text.DecimalFormat("##").format()));
		}
	}
}
