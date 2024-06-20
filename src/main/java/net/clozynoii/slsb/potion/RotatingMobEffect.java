
package net.clozynoii.slsb.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.clozynoii.slsb.procedures.RotatingShotsEffectProcedure;

public class RotatingMobEffect extends MobEffect {
	public RotatingMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13518806);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RotatingShotsEffectProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
