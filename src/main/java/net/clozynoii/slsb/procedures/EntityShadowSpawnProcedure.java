package net.clozynoii.slsb.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.clozynoii.slsb.init.SlsbModEntities;
import net.clozynoii.slsb.entity.EntityShadowEntity;

import java.util.List;
import java.util.Comparator;

public class EntityShadowSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = SlsbModEntities.ENTITY_SHADOW.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof EntityShadowEntity) {
					if ((entityiterator instanceof EntityShadowEntity _datEntS ? _datEntS.getEntityData().get(EntityShadowEntity.DATA_MobType) : "").isEmpty()) {
						if (entityiterator instanceof EntityShadowEntity _datEntSetS)
							_datEntSetS.getEntityData().set(EntityShadowEntity.DATA_MobType, (ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString() + "_shadow"));
						if (entityiterator instanceof EntityShadowEntity _datEntSetS)
							_datEntSetS.getEntityData().set(EntityShadowEntity.DATA_MobName, (entity.getDisplayName().getString()));
					}
				}
			}
		}
	}
}
