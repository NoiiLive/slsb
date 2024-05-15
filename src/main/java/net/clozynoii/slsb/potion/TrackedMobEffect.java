
package net.clozynoii.slsb.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.clozynoii.slsb.procedures.TrackingEffectProcedure;

public class TrackedMobEffect extends MobEffect {
	public TrackedMobEffect() {
		super(MobEffectCategory.HARMFUL, -12987600);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.tracked";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		TrackingEffectProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
