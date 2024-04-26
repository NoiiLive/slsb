
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.clozynoii.slsb.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.SlsbMod;

public class SlsbModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SlsbMod.MODID);
	public static final RegistryObject<SoundEvent> CAVE_SOUND = REGISTRY.register("cave_sound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("slsb", "cave_sound")));
}
