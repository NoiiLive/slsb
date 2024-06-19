package net.clozynoii.slsb.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.clozynoii.slsb.network.SlsbModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StatEffectsProcedure {
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
double STR = 0;double AGL = 0;double VIT = 0;double VIT2 = 0;double INTL = 0;double divide = 0;
STR = (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new SlsbModVariables.PlayerVariables())).Strength*1.998;AGL = (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new SlsbModVariables.PlayerVariables())).Agility*0.0004;VIT = (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new SlsbModVariables.PlayerVariables())).Vitality*19.96;VIT2 = (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new SlsbModVariables.PlayerVariables())).Vitality*0.5;INTL = (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new SlsbModVariables.PlayerVariables())).Intelligence*200;if (!((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new SlsbModVariables.PlayerVariables())).Rank).isEmpty()) {((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).setBaseValue(Math.round(1+STR));((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).setBaseValue(Math.round(0+VIT2));((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR_TOUGHNESS).setBaseValue(Math.round(0+VIT2));divide = / 20;if (entity instanceof LivingEntity _entity) _entity.setHealth((float)((/ )*20));if(entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,10,99, false, false));if (entity.getStepHeight()<1) {entity.setMaxUpStep(1);}if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new SlsbModVariables.PlayerVariables())).SystemPlayer==true) {{
double _setval = INTL;
entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.ManaMax = _setval;
capability.syncPlayerVariables(entity);
});
}
}if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new SlsbModVariables.PlayerVariables())).SpeedToggle==true) {if (entity.isSprinting()) {if (entity.getPersistentData().getDouble("SpeedIncrease")<AGL) {entity.getPersistentData().putDouble("SpeedIncrease", (entity.getPersistentData().getDouble("SpeedIncrease")+0.005));}if (entity.getPersistentData().getDouble("SpeedIncrease")>AGL) {entity.getPersistentData().putDouble("SpeedIncrease", AGL);}entity.getPersistentData().putDouble("SpeedCD", 10);}else{if (entity.getPersistentData().getDouble("SpeedCD")==0) {if (entity.getPersistentData().getDouble("SpeedIncrease")>0) {entity.getPersistentData().putDouble("SpeedIncrease", (entity.getPersistentData().getDouble("SpeedIncrease")-0.01));}if (entity.getPersistentData().getDouble("SpeedIncrease")<0) {entity.getPersistentData().putDouble("SpeedIncrease", 0);}}}((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).setBaseValue((0.1+entity.getPersistentData().getDouble("SpeedIncrease")));}else{((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).setBaseValue(0.1);}}else{((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).setBaseValue(1);((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).setBaseValue(0.1);((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).setBaseValue(0);((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR_TOUGHNESS).setBaseValue(0);}if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Shadow Monarch")) {entity.getPersistentData().putString("class", "shadowmonarch");}else{entity.getPersistentData().putString("class", "");}
}
}
