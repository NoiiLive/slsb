package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ERankBowUseProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean singleitem = false;
		singleitem = false;
		{
			AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(_iitemhandlerref::set);
			if (_iitemhandlerref.get() != null) {
				for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
					ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
					if (singleitem == false) {
						if (itemstackiterator.getItem() == SlsbModItems.ESSENCE_STONE_ARROW.get()) {
							singleitem = true;
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
											AbstractArrow entityToSpawn = new EssenceStoneArrowProjectileEntity(SlsbModEntities.ESSENCE_STONE_ARROW_PROJECTILE.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setPierceLevel(piercing);
											entityToSpawn.setCritArrow(true);
											entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, (float) (5 + Math.round((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Strength * 0.8)), 1,
											(byte) 0.1);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, (float) 0.2);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = itemstackiterator;
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
						if (itemstackiterator.getItem() == SlsbModItems.MANA_ARROW.get()) {
							singleitem = true;
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
											AbstractArrow entityToSpawn = new ManaArrowProjectileEntity(SlsbModEntities.MANA_ARROW_PROJECTILE.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setPierceLevel(piercing);
											entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, (float) (8 + Math.round((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Strength * 0.82)), 1,
											(byte) 0.1);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, (float) 0.2);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = itemstackiterator;
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
					}
				}
			}
		}
	}
}
