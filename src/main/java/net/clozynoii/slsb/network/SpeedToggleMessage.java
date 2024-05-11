
package net.clozynoii.slsb.network;

import net.clozynoii.slsb.SlsbMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SpeedToggleMessage {

	int type, pressedms;

	public SpeedToggleMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public SpeedToggleMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(SpeedToggleMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(SpeedToggleMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;

		if (type == 0) {

			SpeedToggleButtonProcedure.execute(entity);
		}

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		SlsbMod.addNetworkMessage(SpeedToggleMessage.class, SpeedToggleMessage::buffer, SpeedToggleMessage::new, SpeedToggleMessage::handler);
	}

}
