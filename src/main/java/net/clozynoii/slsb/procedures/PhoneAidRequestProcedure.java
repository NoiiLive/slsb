package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PhoneAidRequestProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
if(entity instanceof Player _player) _player.closeContainer();if (==true) {for (int index0 = 0; index0<Mth.nextInt(RandomSource.create(), 1, 3); index0++) {if (world instanceof ServerLevel _level) {
Entity entityToSpawn = SlsbModEntities.HUNTER_NPC.get().spawn(_level, BlockPos.containing(x,y,z), MobSpawnType.MOB_SUMMONED);
if (entityToSpawn != null) {
entityToSpawn.setDeltaMovement(0, 0, 0);
}
}
}}else{if (entity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal("You Cannot Request More Aid!"), true);}
}
}
