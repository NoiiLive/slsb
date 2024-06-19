
package net.clozynoii.slsb.command;

@Mod.EventBusSubscriber
public class SLSBCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("slsb")

				.then(Commands.literal("shadow").then(Commands.literal("list").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();

					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();

					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);

					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					ShadowListProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("release").then(Commands.argument("position", DoubleArgumentType.doubleArg()).executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();

					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();

					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);

					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					ShadowReleaseProcedure.execute(arguments, entity);
					return 0;
				})))));
	}

}
