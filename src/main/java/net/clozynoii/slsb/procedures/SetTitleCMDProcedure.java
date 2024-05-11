package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.MessageArgument;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.clozynoii.slsb.network.SlsbModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class SetTitleCMDProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		{
			String _setval = (new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "title").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage();
			(new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "name");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SystemTitle = _setval;
				capability.syncPlayerVariables((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "name");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()));
			});
		}
	}
}
