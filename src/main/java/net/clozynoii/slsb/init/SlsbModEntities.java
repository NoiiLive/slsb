
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.clozynoii.slsb.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.clozynoii.slsb.entity.WindSliceProjectileEntity;
import net.clozynoii.slsb.entity.WindBarrierMobEntity;
import net.clozynoii.slsb.entity.WhirlwindEntityEntity;
import net.clozynoii.slsb.entity.UndeadSoldierShadowEntity;
import net.clozynoii.slsb.entity.UndeadSoldierEntity;
import net.clozynoii.slsb.entity.UndeadKnightBossShadowEntity;
import net.clozynoii.slsb.entity.UndeadKnightBossEntity;
import net.clozynoii.slsb.entity.SwordSliceProjectileEntity;
import net.clozynoii.slsb.entity.ManaArrowProjectileEntity;
import net.clozynoii.slsb.entity.HunterNPCEntity;
import net.clozynoii.slsb.entity.GiantRatShadowEntity;
import net.clozynoii.slsb.entity.GiantRatEntity;
import net.clozynoii.slsb.entity.GiantRatBossShadowEntity;
import net.clozynoii.slsb.entity.GiantRatBossEntity;
import net.clozynoii.slsb.entity.EssenceStoneArrowProjectileEntity;
import net.clozynoii.slsb.entity.EntityShadowEntity;
import net.clozynoii.slsb.entity.AfterImageEntity;
import net.clozynoii.slsb.SlsbMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlsbModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SlsbMod.MODID);
	public static final RegistryObject<EntityType<AfterImageEntity>> AFTER_IMAGE = register("after_image", EntityType.Builder.<AfterImageEntity>of(AfterImageEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(AfterImageEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WindSliceProjectileEntity>> WIND_SLICE_PROJECTILE = register("wind_slice_projectile", EntityType.Builder.<WindSliceProjectileEntity>of(WindSliceProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(WindSliceProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WindBarrierMobEntity>> WIND_BARRIER_MOB = register("wind_barrier_mob", EntityType.Builder.<WindBarrierMobEntity>of(WindBarrierMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WindBarrierMobEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GiantRatEntity>> GIANT_RAT = register("giant_rat",
			EntityType.Builder.<GiantRatEntity>of(GiantRatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GiantRatEntity::new)

					.sized(1.5f, 1f));
	public static final RegistryObject<EntityType<GiantRatBossEntity>> GIANT_RAT_BOSS = register("giant_rat_boss",
			EntityType.Builder.<GiantRatBossEntity>of(GiantRatBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GiantRatBossEntity::new)

					.sized(1.7f, 1.2f));
	public static final RegistryObject<EntityType<SwordSliceProjectileEntity>> SWORD_SLICE_PROJECTILE = register("sword_slice_projectile", EntityType.Builder.<SwordSliceProjectileEntity>of(SwordSliceProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(SwordSliceProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<UndeadSoldierEntity>> UNDEAD_SOLDIER = register("undead_soldier",
			EntityType.Builder.<UndeadSoldierEntity>of(UndeadSoldierEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UndeadSoldierEntity::new)

					.sized(0.6f, 2.2f));
	public static final RegistryObject<EntityType<WhirlwindEntityEntity>> WHIRLWIND_ENTITY = register("whirlwind_entity", EntityType.Builder.<WhirlwindEntityEntity>of(WhirlwindEntityEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WhirlwindEntityEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UndeadKnightBossEntity>> UNDEAD_KNIGHT_BOSS = register("undead_knight_boss",
			EntityType.Builder.<UndeadKnightBossEntity>of(UndeadKnightBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UndeadKnightBossEntity::new)

					.sized(0.8f, 2.4f));
	public static final RegistryObject<EntityType<HunterNPCEntity>> HUNTER_NPC = register("hunter_npc",
			EntityType.Builder.<HunterNPCEntity>of(HunterNPCEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HunterNPCEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EssenceStoneArrowProjectileEntity>> ESSENCE_STONE_ARROW_PROJECTILE = register("essence_stone_arrow_projectile",
			EntityType.Builder.<EssenceStoneArrowProjectileEntity>of(EssenceStoneArrowProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(EssenceStoneArrowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ManaArrowProjectileEntity>> MANA_ARROW_PROJECTILE = register("mana_arrow_projectile", EntityType.Builder.<ManaArrowProjectileEntity>of(ManaArrowProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ManaArrowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GiantRatBossShadowEntity>> GIANT_RAT_BOSS_SHADOW = register("giant_rat_boss_shadow",
			EntityType.Builder.<GiantRatBossShadowEntity>of(GiantRatBossShadowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GiantRatBossShadowEntity::new)

					.sized(1.7f, 1.2f));
	public static final RegistryObject<EntityType<UndeadSoldierShadowEntity>> UNDEAD_SOLDIER_SHADOW = register("undead_soldier_shadow",
			EntityType.Builder.<UndeadSoldierShadowEntity>of(UndeadSoldierShadowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UndeadSoldierShadowEntity::new)

					.sized(0.6f, 2.2f));
	public static final RegistryObject<EntityType<GiantRatShadowEntity>> GIANT_RAT_SHADOW = register("giant_rat_shadow",
			EntityType.Builder.<GiantRatShadowEntity>of(GiantRatShadowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GiantRatShadowEntity::new)

					.sized(1.5f, 1f));
	public static final RegistryObject<EntityType<EntityShadowEntity>> ENTITY_SHADOW = register("entity_shadow", EntityType.Builder.<EntityShadowEntity>of(EntityShadowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EntityShadowEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UndeadKnightBossShadowEntity>> UNDEAD_KNIGHT_BOSS_SHADOW = register("undead_knight_boss_shadow",
			EntityType.Builder.<UndeadKnightBossShadowEntity>of(UndeadKnightBossShadowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(UndeadKnightBossShadowEntity::new)

					.sized(0.8f, 2.4f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			AfterImageEntity.init();
			WindBarrierMobEntity.init();
			GiantRatEntity.init();
			GiantRatBossEntity.init();
			UndeadSoldierEntity.init();
			WhirlwindEntityEntity.init();
			UndeadKnightBossEntity.init();
			HunterNPCEntity.init();
			GiantRatBossShadowEntity.init();
			UndeadSoldierShadowEntity.init();
			GiantRatShadowEntity.init();
			EntityShadowEntity.init();
			UndeadKnightBossShadowEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(AFTER_IMAGE.get(), AfterImageEntity.createAttributes().build());
		event.put(WIND_BARRIER_MOB.get(), WindBarrierMobEntity.createAttributes().build());
		event.put(GIANT_RAT.get(), GiantRatEntity.createAttributes().build());
		event.put(GIANT_RAT_BOSS.get(), GiantRatBossEntity.createAttributes().build());
		event.put(UNDEAD_SOLDIER.get(), UndeadSoldierEntity.createAttributes().build());
		event.put(WHIRLWIND_ENTITY.get(), WhirlwindEntityEntity.createAttributes().build());
		event.put(UNDEAD_KNIGHT_BOSS.get(), UndeadKnightBossEntity.createAttributes().build());
		event.put(HUNTER_NPC.get(), HunterNPCEntity.createAttributes().build());
		event.put(GIANT_RAT_BOSS_SHADOW.get(), GiantRatBossShadowEntity.createAttributes().build());
		event.put(UNDEAD_SOLDIER_SHADOW.get(), UndeadSoldierShadowEntity.createAttributes().build());
		event.put(GIANT_RAT_SHADOW.get(), GiantRatShadowEntity.createAttributes().build());
		event.put(ENTITY_SHADOW.get(), EntityShadowEntity.createAttributes().build());
		event.put(UNDEAD_KNIGHT_BOSS_SHADOW.get(), UndeadKnightBossShadowEntity.createAttributes().build());
	}
}
