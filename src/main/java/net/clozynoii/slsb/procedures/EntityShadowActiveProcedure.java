package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

public class EntityShadowActiveProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player) {
					if (((entityiterator.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Shadow Monarch")) {
						{
							Entity _ent = entityiterator;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
												_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												("particle dust 0.45 0.86 1 1 " + entity.getX() + " " + (entity.getY() + 1) + " " + entity.getZ() + " 0.25 0.25 0.25 0.1 5 normal @s"));
							}
						}
						{
							Entity _ent = entityiterator;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
												_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												("particle dust 0 0 0 1 " + entity.getX() + " " + (entity.getY() + 1) + " " + entity.getZ() + " 0.25 0.25 0.25 0.1 5 normal @s"));
							}
						}
					}
				}
			}
		}
	}
}
