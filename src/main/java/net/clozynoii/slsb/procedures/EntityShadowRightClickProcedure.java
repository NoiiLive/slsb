package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

public class EntityShadowRightClickProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity,
Entity sourceentity
) {
if(
entity == null ||
sourceentity == null
) return ;
if (((sourceentity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Shadow Monarch")) {if (sourceentity.isShiftKeyDown()) {if(!entity.level().isClientSide()) entity.discard();if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")),
SoundSource.HOSTILE, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")),
SoundSource.HOSTILE, 1, 1, false);
}
}
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.SMOKE, x, y, z, 35, 0.5, 0.5, 0.5, 0.1);if (sourceentity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal("Shadow Released"), true);}else{if ((entity instanceof EntityShadowEntity _datEntI ?
_datEntI.getEntityData().get(EntityShadowEntity.DATA_Attempts) : 0)<3) {if (Math.random()<=0.5) {if (<10) {if(!entity.level().isClientSide()) entity.discard();if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")),
SoundSource.PLAYERS, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")),
SoundSource.PLAYERS, 1, 1, false);
}
}
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.SMOKE, x, y, z, 35, 0.5, 0.5, 0.5, 0.1);if (sourceentity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal(("\u00A7aShadow Extraction Successful: "+new java.text.DecimalFormat("##").format()+"/10")), true);SlsbMod.LOGGER.info();}else{if (sourceentity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal("Maximum Shadows"), true);}}else{if (entity instanceof EntityShadowEntity _datEntSetI)
_datEntSetI.getEntityData().set(EntityShadowEntity.DATA_Attempts, (int)((entity instanceof EntityShadowEntity _datEntI ?
_datEntI.getEntityData().get(EntityShadowEntity.DATA_Attempts) : 0)+1));if ((entity instanceof EntityShadowEntity _datEntI ?
_datEntI.getEntityData().get(EntityShadowEntity.DATA_Attempts) : 0)==3) {if(!entity.level().isClientSide()) entity.discard();if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")),
SoundSource.HOSTILE, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")),
SoundSource.HOSTILE, 1, 1, false);
}
}
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.SMOKE, x, y, z, 35, 0.5, 0.5, 0.5, 0.1);if (sourceentity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal("\u00A74Shadow Extraction Failed"), true);}else{if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.SMOKE, x, y, z, 35, 0.5, 0.5, 0.5, 0.1);if (sourceentity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal(("\u00A7cShadow Extraction "+(entity instanceof EntityShadowEntity _datEntI ?
_datEntI.getEntityData().get(EntityShadowEntity.DATA_Attempts) : 0)+"/3")), true);if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.ambient")),
SoundSource.HOSTILE, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.ambient")),
SoundSource.HOSTILE, 1, 1, false);
}
}
}}}}}
}
}
