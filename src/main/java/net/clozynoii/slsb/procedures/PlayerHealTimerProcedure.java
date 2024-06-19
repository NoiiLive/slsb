package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class PlayerHealTimerProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

private static void execute(
@Nullable Event event,
Entity entity
) {
if(
entity == null
) return ;
if (>0) {}if (==0) {if (<) {if (new Object(){
public boolean checkGamemode(Entity _ent){
if(_ent instanceof ServerPlayer _serverPlayer) {
return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
} else if(_ent.level().isClientSide() && _ent instanceof Player _player) {
return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
}
return false;
}
}.checkGamemode(entity)) {}else{if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(MobEffects.REGENERATION)) {}else if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(MobEffects.HEAL)) {}else{if ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel():0)>0) {if (entity instanceof Player _player) _player.getFoodData().setSaturation((float)((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel():0)-1));}else if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel():0)>=16) {if (entity instanceof Player _player) _player.getFoodData().setFoodLevel((int)((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel():0)-1));}}}}}if (>) {}
}
}
