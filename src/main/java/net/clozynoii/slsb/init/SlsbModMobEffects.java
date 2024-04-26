
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.clozynoii.slsb.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.clozynoii.slsb.potion.WindPullActiveMobEffect;
import net.clozynoii.slsb.potion.WindBurstActiveMobEffect;
import net.clozynoii.slsb.potion.WhirlwindMobEffect;
import net.clozynoii.slsb.potion.TurbulenceMobEffect;
import net.clozynoii.slsb.potion.SuffocationActiveMobEffect;
import net.clozynoii.slsb.potion.StealthMobEffect;
import net.clozynoii.slsb.potion.ReinforcementMobEffect;
import net.clozynoii.slsb.potion.RalliedMobEffect;
import net.clozynoii.slsb.potion.PredictionMobEffect;
import net.clozynoii.slsb.potion.OverwhelmedMobEffect;
import net.clozynoii.slsb.potion.HealingAuraMobEffect;
import net.clozynoii.slsb.potion.GuardianMobEffect;
import net.clozynoii.slsb.potion.FinalStandMobEffect;
import net.clozynoii.slsb.potion.EvadeMobEffect;
import net.clozynoii.slsb.potion.DisguiseMobEffect;
import net.clozynoii.slsb.potion.CollapseMobEffect;
import net.clozynoii.slsb.potion.ClearMindMobEffect;
import net.clozynoii.slsb.potion.ChargedMobEffect;
import net.clozynoii.slsb.potion.BerserkerMobEffect;
import net.clozynoii.slsb.potion.BashMobEffect;
import net.clozynoii.slsb.SlsbMod;

public class SlsbModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SlsbMod.MODID);
	public static final RegistryObject<MobEffect> HEALING_AURA = REGISTRY.register("healing_aura", () -> new HealingAuraMobEffect());
	public static final RegistryObject<MobEffect> STEALTH = REGISTRY.register("stealth", () -> new StealthMobEffect());
	public static final RegistryObject<MobEffect> EVADE = REGISTRY.register("evade", () -> new EvadeMobEffect());
	public static final RegistryObject<MobEffect> DISGUISE = REGISTRY.register("disguise", () -> new DisguiseMobEffect());
	public static final RegistryObject<MobEffect> REINFORCEMENT = REGISTRY.register("reinforcement", () -> new ReinforcementMobEffect());
	public static final RegistryObject<MobEffect> COLLAPSE = REGISTRY.register("collapse", () -> new CollapseMobEffect());
	public static final RegistryObject<MobEffect> CHARGED = REGISTRY.register("charged", () -> new ChargedMobEffect());
	public static final RegistryObject<MobEffect> BASH = REGISTRY.register("bash", () -> new BashMobEffect());
	public static final RegistryObject<MobEffect> WIND_PULL_ACTIVE = REGISTRY.register("wind_pull_active", () -> new WindPullActiveMobEffect());
	public static final RegistryObject<MobEffect> WIND_BURST_ACTIVE = REGISTRY.register("wind_burst_active", () -> new WindBurstActiveMobEffect());
	public static final RegistryObject<MobEffect> SUFFOCATION_ACTIVE = REGISTRY.register("suffocation_active", () -> new SuffocationActiveMobEffect());
	public static final RegistryObject<MobEffect> TURBULENCE = REGISTRY.register("turbulence", () -> new TurbulenceMobEffect());
	public static final RegistryObject<MobEffect> RALLIED = REGISTRY.register("rallied", () -> new RalliedMobEffect());
	public static final RegistryObject<MobEffect> FINAL_STAND = REGISTRY.register("final_stand", () -> new FinalStandMobEffect());
	public static final RegistryObject<MobEffect> GUARDIAN = REGISTRY.register("guardian", () -> new GuardianMobEffect());
	public static final RegistryObject<MobEffect> OVERWHELMED = REGISTRY.register("overwhelmed", () -> new OverwhelmedMobEffect());
	public static final RegistryObject<MobEffect> CLEAR_MIND = REGISTRY.register("clear_mind", () -> new ClearMindMobEffect());
	public static final RegistryObject<MobEffect> BERSERKER = REGISTRY.register("berserker", () -> new BerserkerMobEffect());
	public static final RegistryObject<MobEffect> WHIRLWIND = REGISTRY.register("whirlwind", () -> new WhirlwindMobEffect());
	public static final RegistryObject<MobEffect> PREDICTION = REGISTRY.register("prediction", () -> new PredictionMobEffect());
}
