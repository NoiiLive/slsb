package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ManaArrowTrailProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"particle dust 0.23 0.78 0.89 1 ~ ~1 ~ 0.1 0.1 0.1 0.1 1");
	}
}
