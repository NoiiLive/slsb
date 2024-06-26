package net.clozynoii.slsb.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.clozynoii.slsb.network.SlsbModVariables;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class SystemDifficultyProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).SystemPlayer == true) {
			{
				final Vec3 _center = new Vec3(
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:magicbeasts")))) {
							if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).PlayerMaxHealth > (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)
									+ (entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.ABSORPTION) ? _livEnt.getEffect(MobEffects.ABSORPTION).getAmplifier() : 0) * 4) {
								if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).PlayerMaxHealth
										- ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)
												+ (entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.ABSORPTION) ? _livEnt.getEffect(MobEffects.ABSORPTION).getAmplifier() : 0) * 4) >= 100) {
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal(("\u00A7a\u25C6 " + entityiterator.getDisplayName().getString() + " \u25C6")), true);
								} else if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).PlayerMaxHealth
										- ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)
												+ (entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.ABSORPTION) ? _livEnt.getEffect(MobEffects.ABSORPTION).getAmplifier() : 0) * 4) >= 15
										&& (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).PlayerMaxHealth
												- ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)
														+ (entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.ABSORPTION) ? _livEnt.getEffect(MobEffects.ABSORPTION).getAmplifier() : 0) * 4) < 40) {
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal(("\u00A7e\u25C6 " + entityiterator.getDisplayName().getString() + " \u25C6")), true);
								}
							} else if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new SlsbModVariables.PlayerVariables())).PlayerMaxHealth < (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)
											+ (entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.ABSORPTION) ? _livEnt.getEffect(MobEffects.ABSORPTION).getAmplifier() : 0) * 4) {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(("\u00A7c\u25C6 " + entityiterator.getDisplayName().getString() + " \u25C6")), true);
							}
						}
					}
				}
			}
		}
	}
}
