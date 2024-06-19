package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ShadowDeathProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (entityiterator == (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)) {
				if (entityiterator instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("##").format() + "/10")), true);
			}
		}
	}
}
