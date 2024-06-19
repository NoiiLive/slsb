
package net.clozynoii.slsb.potion;

public class RotatingMobEffect extends MobEffect {
	public RotatingMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13518806);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RotatingShotsEffectProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}