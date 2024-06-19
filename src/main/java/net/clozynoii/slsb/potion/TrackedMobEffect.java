
package net.clozynoii.slsb.potion;

public class TrackedMobEffect extends MobEffect {
	public TrackedMobEffect() {
		super(MobEffectCategory.HARMFUL, -12987600);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		TrackingEffectProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}