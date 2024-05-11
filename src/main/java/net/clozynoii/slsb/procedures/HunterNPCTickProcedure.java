package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HunterNPCTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double STR = 0;
		double VIT = 0;
		double AGL = 0;
		double VIT2 = 0;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(SlsbModMobEffects.NP_CCOOLDOWN.get()))) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				if (Math.random() < 0.05) {
					if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Ranger")) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new EssenceStoneArrowProjectileEntity(SlsbModEntities.DELETED_MOD_ELEMENT.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, (float) (5 + (entity instanceof HunterNPCEntity _datEntI ? _datEntI.getEntityData().get(HunterNPCEntity.DATA_Strength) : 0) * 0.2), 1);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, (float) 0.2);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(SlsbModMobEffects.NP_CCOOLDOWN.get(), 25, 0, false, false));
					}
				}
				if (Math.random() < 0.005) {
					if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Healer")) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:dust 0 1 0 2 ^0 ^0 ^0 6 0.2 6 0 35");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(MobEffects.REGENERATION))) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 35, 3, false, true));
								}
							}
						}
					}
				}
				if (Math.random() < 0.009) {
					if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Assassin")) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(SlsbModMobEffects.EVADE.get(), 70, 0, false, true));
					}
				}
				if (Math.random() < 0.005) {
					if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Assassin")) {
						entity.getPersistentData().putBoolean("singletarget", false);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, 0.1, 2, 0.1, 0);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = SlsbModEntities.AFTER_IMAGE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
										_toTame.tame(_owner);
								}
							}
						}
						{
							final Vec3 _center = new Vec3(
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entity.getPersistentData().getBoolean("singletarget") == false) {
									if (!(entity == entityiterator) && !(entityiterator instanceof AfterImageEntity)) {
										entity.getPersistentData().putBoolean("singletarget", true);
										{
											Entity _ent = entity;
											_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
										}
										if (entity instanceof LivingEntity _entity)
											_entity.swing(InteractionHand.MAIN_HAND, true);
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()),
														ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker_fangs.attack")), SoundSource.NEUTRAL, 1, 1);
											} else {
												_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker_fangs.attack")),
														SoundSource.NEUTRAL, 1, 1, false);
											}
										}
										SlsbMod.queueServerWork(3, () -> {
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.SWEEP_ATTACK, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 3, 0.1, 2, 0.1, 0);
											world.levelEvent(2001, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), Block.getId(Blocks.REDSTONE_BLOCK.defaultBlockState()));
											entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK), entity), 10);
										});
									}
								}
							}
						}
					}
				}
			}
		}
		STR = (entity instanceof HunterNPCEntity _datEntI ? _datEntI.getEntityData().get(HunterNPCEntity.DATA_Strength) : 0) * 0.42;
		AGL = (entity instanceof HunterNPCEntity _datEntI ? _datEntI.getEntityData().get(HunterNPCEntity.DATA_Agility) : 0) * 0.0005;
		VIT = (entity instanceof HunterNPCEntity _datEntI ? _datEntI.getEntityData().get(HunterNPCEntity.DATA_Vitality) : 0) * 2.8;
		VIT2 = (entity instanceof HunterNPCEntity _datEntI ? _datEntI.getEntityData().get(HunterNPCEntity.DATA_Vitality) : 0) * 0.285;
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).setBaseValue(Math.round(3 + STR));
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).setBaseValue(Math.round(20 + VIT));
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).setBaseValue((0.3 + AGL));
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).setBaseValue(Math.round(0 + VIT2));
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR_TOUGHNESS).setBaseValue(Math.round(0 + VIT2));
		if (entity.getStepHeight() < 1) {
			entity.setMaxUpStep(1);
		}
		if ((entity instanceof HunterNPCEntity _datEntI ? _datEntI.getEntityData().get(HunterNPCEntity.DATA_Vitality) : 0) >= 100
				&& (entity instanceof HunterNPCEntity _datEntI ? _datEntI.getEntityData().get(HunterNPCEntity.DATA_Vitality) : 0) < 200) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 0, false, false));
		}
		if ((entity instanceof HunterNPCEntity _datEntI ? _datEntI.getEntityData().get(HunterNPCEntity.DATA_Vitality) : 0) >= 200
				&& (entity instanceof HunterNPCEntity _datEntI ? _datEntI.getEntityData().get(HunterNPCEntity.DATA_Vitality) : 0) < 350) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, false, false));
		}
		if ((entity instanceof HunterNPCEntity _datEntI ? _datEntI.getEntityData().get(HunterNPCEntity.DATA_Vitality) : 0) >= 350) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, false, false));
		}
	}
}
