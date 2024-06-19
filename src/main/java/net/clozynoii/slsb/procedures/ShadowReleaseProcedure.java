package net.clozynoii.slsb.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import net.clozynoii.slsb.network.SlsbModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class ShadowReleaseProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		String convert = "";
		String entitytype = "";
		String entityname = "";
		if (DoubleArgumentType.getDouble(arguments, "position") <= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).ShadowAmount) {
			convert = new Object() {
				private String split(String text, String space, int index) {
					String s = text.split(space)[index];
					return s;
				}
			}.split(((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).ShadowStorage), "\u00B6",
					(int) (Mth.nextInt(RandomSource.create(), (int) (DoubleArgumentType.getDouble(arguments, "position") - 1), (int) (DoubleArgumentType.getDouble(arguments, "position") - 1))));
			entityname = new Object() {
				private String split(String text, String space, int index) {
					String s = text.split(space)[index];
					return s;
				}
			}.split(convert, "\u00A4", (int) 1);
			{
				String _setval = ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).ShadowStorage).replace(convert + "\u00B6", "");
				entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ShadowStorage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).ShadowAmount - 1;
				entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ShadowAmount = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A7dSuccessfully Released " + entityname)), false);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal((new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).ShadowAmount) + "/10")), true);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Invalid Shadow Position!"), false);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Use /slsb shadow list"), false);
		}
	}
}
