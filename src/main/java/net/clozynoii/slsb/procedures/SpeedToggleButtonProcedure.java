package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SpeedToggleButtonProcedure {
public static void execute(
Entity entity
) {
if(
entity == null
) return ;
boolean gate = false;
gate = false;if (entity.getPersistentData().getDouble("ToggleShift")==0) {if (gate==false) {entity.getPersistentData().putDouble("ToggleShift", 5);gate = true;}}if (entity.getPersistentData().getDouble("ToggleShift")>0) {if (gate==false) {if (==true) {if (entity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal("- Speed Disabled -"), true);entity.getPersistentData().putDouble("ToggleShift", 0);gate = true;}else if (==false) {if (entity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal("- Speed Enabled -"), true);entity.getPersistentData().putDouble("ToggleShift", 0);gate = true;}}}
}
}
