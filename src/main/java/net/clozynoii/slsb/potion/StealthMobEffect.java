
package net.clozynoii.slsb.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.clozynoii.slsb.procedures.StealthActiveTickProcedure;

public class StealthMobEffect extends MobEffect {
	public StealthMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -11784852);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		StealthActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
