package net.clozynoii.slsb.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.clozynoii.slsb.init.SlsbModItems;
import net.clozynoii.slsb.entity.HunterNPCEntity;

public class HunterNPCOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 40, 9, true, true));
		if (entity instanceof HunterNPCEntity _datEntSetI)
			_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Skin, Mth.nextInt(RandomSource.create(), 1, 8));
		random = Mth.nextInt(RandomSource.create(), 1, 6);
		if (random == 1) {
			if (entity instanceof HunterNPCEntity _datEntSetS)
				_datEntSetS.getEntityData().set(HunterNPCEntity.DATA_HunterClass, "Fighter");
		} else if (random == 2) {
			if (entity instanceof HunterNPCEntity _datEntSetS)
				_datEntSetS.getEntityData().set(HunterNPCEntity.DATA_HunterClass, "Assassin");
		} else if (random == 3) {
			if (entity instanceof HunterNPCEntity _datEntSetS)
				_datEntSetS.getEntityData().set(HunterNPCEntity.DATA_HunterClass, "Mage");
		} else if (random == 4) {
			if (entity instanceof HunterNPCEntity _datEntSetS)
				_datEntSetS.getEntityData().set(HunterNPCEntity.DATA_HunterClass, "Healer");
		} else if (random == 5) {
			if (entity instanceof HunterNPCEntity _datEntSetS)
				_datEntSetS.getEntityData().set(HunterNPCEntity.DATA_HunterClass, "Ranger");
		} else if (random == 6) {
			if (entity instanceof HunterNPCEntity _datEntSetS)
				_datEntSetS.getEntityData().set(HunterNPCEntity.DATA_HunterClass, "Tanker");
		}
		random = Mth.nextInt(RandomSource.create(), 1, 6);
		if (random == 1) {
			if (entity instanceof HunterNPCEntity _datEntSetI)
				_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Strength, Mth.nextInt(RandomSource.create(), 5, 15));
			if (entity instanceof HunterNPCEntity _datEntSetI)
				_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Vitality, Mth.nextInt(RandomSource.create(), 5, 15));
			if (entity instanceof HunterNPCEntity _datEntSetI)
				_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Agility, Mth.nextInt(RandomSource.create(), 5, 15));
			if (entity instanceof HunterNPCEntity _datEntSetS)
				_datEntSetS.getEntityData().set(HunterNPCEntity.DATA_HunterRank, "E-Rank");
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Fighter")) {
				entity.setCustomName(Component.literal("\u00A7cE-Rank Fighter"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SWORD.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Assassin")) {
				entity.setCustomName(Component.literal("\u00A79E-Rank Assassin"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_DAGGER.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_DAGGER.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Mage")) {
				entity.setCustomName(Component.literal("\u00A76E-Rank Mage"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_STAFF.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Healer")) {
				entity.setCustomName(Component.literal("\u00A7aE-Rank Healer"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SPELL_BOOK.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Ranger")) {
				entity.setCustomName(Component.literal("\u00A72E-Rank Ranger"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_BOW.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Tanker")) {
				entity.setCustomName(Component.literal("\u00A7eE-Rank Tanker"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_AXE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SHIELD.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(3, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_HELMET.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_HELMET.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_BOOTS.get()));
					}
				}
			}
		}
		if (random == 2) {
			if (entity instanceof HunterNPCEntity _datEntSetI)
				_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Strength, Mth.nextInt(RandomSource.create(), 25, 40));
			if (entity instanceof HunterNPCEntity _datEntSetI)
				_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Vitality, Mth.nextInt(RandomSource.create(), 25, 40));
			if (entity instanceof HunterNPCEntity _datEntSetI)
				_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Agility, Mth.nextInt(RandomSource.create(), 25, 40));
			if (entity instanceof HunterNPCEntity _datEntSetS)
				_datEntSetS.getEntityData().set(HunterNPCEntity.DATA_HunterRank, "D-Rank");
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Fighter")) {
				entity.setCustomName(Component.literal("\u00A7cD-Rank Fighter"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SWORD.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Assassin")) {
				entity.setCustomName(Component.literal("\u00A79D-Rank Assassin"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_DAGGER.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_DAGGER.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Mage")) {
				entity.setCustomName(Component.literal("\u00A76D-Rank Mage"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_STAFF.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Healer")) {
				entity.setCustomName(Component.literal("\u00A7aD-Rank Healer"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SPELL_BOOK.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Ranger")) {
				entity.setCustomName(Component.literal("\u00A72D-Rank Ranger"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_BOW.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Tanker")) {
				entity.setCustomName(Component.literal("\u00A7eD-Rank Tanker"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_AXE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SHIELD.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(3, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_HELMET.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_HELMET.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_BOOTS.get()));
					}
				}
			}
		}
		if (random == 3) {
			if (entity instanceof HunterNPCEntity _datEntSetI)
				_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Strength, Mth.nextInt(RandomSource.create(), 50, 75));
			if (entity instanceof HunterNPCEntity _datEntSetI)
				_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Vitality, Mth.nextInt(RandomSource.create(), 50, 75));
			if (entity instanceof HunterNPCEntity _datEntSetI)
				_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Agility, Mth.nextInt(RandomSource.create(), 50, 75));
			if (entity instanceof HunterNPCEntity _datEntSetS)
				_datEntSetS.getEntityData().set(HunterNPCEntity.DATA_HunterRank, "C-Rank");
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Fighter")) {
				entity.setCustomName(Component.literal("\u00A7cC-Rank Fighter"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SWORD.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Assassin")) {
				entity.setCustomName(Component.literal("\u00A79C-Rank Assassin"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_DAGGER.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_DAGGER.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Mage")) {
				entity.setCustomName(Component.literal("\u00A76C-Rank Mage"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_STAFF.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Healer")) {
				entity.setCustomName(Component.literal("\u00A7aC-Rank Healer"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SPELL_BOOK.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Ranger")) {
				entity.setCustomName(Component.literal("\u00A72C-Rank Ranger"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_BOW.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Tanker")) {
				entity.setCustomName(Component.literal("\u00A7eC-Rank Tanker"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_AXE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SHIELD.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(3, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_HELMET.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_HELMET.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_BOOTS.get()));
					}
				}
			}
		}
		if (random == 4) {
			if (entity instanceof HunterNPCEntity _datEntSetI)
				_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Strength, Mth.nextInt(RandomSource.create(), 80, 100));
			if (entity instanceof HunterNPCEntity _datEntSetI)
				_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Vitality, Mth.nextInt(RandomSource.create(), 80, 100));
			if (entity instanceof HunterNPCEntity _datEntSetI)
				_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Agility, Mth.nextInt(RandomSource.create(), 80, 100));
			if (entity instanceof HunterNPCEntity _datEntSetS)
				_datEntSetS.getEntityData().set(HunterNPCEntity.DATA_HunterRank, "B-Rank");
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Fighter")) {
				entity.setCustomName(Component.literal("\u00A7cB-Rank Fighter"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SWORD.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Assassin")) {
				entity.setCustomName(Component.literal("\u00A79B-Rank Assassin"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_DAGGER.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_DAGGER.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Mage")) {
				entity.setCustomName(Component.literal("\u00A76B-Rank Mage"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_STAFF.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Healer")) {
				entity.setCustomName(Component.literal("\u00A7aB-Rank Healer"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SPELL_BOOK.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Ranger")) {
				entity.setCustomName(Component.literal("\u00A72B-Rank Ranger"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_BOW.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Tanker")) {
				entity.setCustomName(Component.literal("\u00A7eB-Rank Tanker"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_AXE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SHIELD.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(3, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_HELMET.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_HELMET.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_BOOTS.get()));
					}
				}
			}
		}
		if (random == 5) {
			if (entity instanceof HunterNPCEntity _datEntSetI)
				_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Strength, Mth.nextInt(RandomSource.create(), 150, 200));
			if (entity instanceof HunterNPCEntity _datEntSetI)
				_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Vitality, Mth.nextInt(RandomSource.create(), 150, 200));
			if (entity instanceof HunterNPCEntity _datEntSetI)
				_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Agility, Mth.nextInt(RandomSource.create(), 150, 200));
			if (entity instanceof HunterNPCEntity _datEntSetS)
				_datEntSetS.getEntityData().set(HunterNPCEntity.DATA_HunterRank, "A-Rank");
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Fighter")) {
				entity.setCustomName(Component.literal("\u00A7cA-Rank Fighter"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SWORD.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Assassin")) {
				entity.setCustomName(Component.literal("\u00A79A-Rank Assassin"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_DAGGER.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_DAGGER.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Mage")) {
				entity.setCustomName(Component.literal("\u00A76A-Rank Mage"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_STAFF.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Healer")) {
				entity.setCustomName(Component.literal("\u00A7aA-Rank Healer"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SPELL_BOOK.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Ranger")) {
				entity.setCustomName(Component.literal("\u00A72A-Rank Ranger"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_BOW.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Tanker")) {
				entity.setCustomName(Component.literal("\u00A7eA-Rank Tanker"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_AXE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SHIELD.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(3, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_HELMET.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_HELMET.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_BOOTS.get()));
					}
				}
			}
		}
		if (random == 6) {
			if (entity instanceof HunterNPCEntity _datEntSetI)
				_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Strength, Mth.nextInt(RandomSource.create(), 250, 350));
			if (entity instanceof HunterNPCEntity _datEntSetI)
				_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Vitality, Mth.nextInt(RandomSource.create(), 250, 350));
			if (entity instanceof HunterNPCEntity _datEntSetI)
				_datEntSetI.getEntityData().set(HunterNPCEntity.DATA_Agility, Mth.nextInt(RandomSource.create(), 250, 350));
			if (entity instanceof HunterNPCEntity _datEntSetS)
				_datEntSetS.getEntityData().set(HunterNPCEntity.DATA_HunterRank, "S-Rank");
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Fighter")) {
				entity.setCustomName(Component.literal("\u00A7cS-Rank Fighter"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SWORD.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Assassin")) {
				entity.setCustomName(Component.literal("\u00A79S-Rank Assassin"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_DAGGER.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_DAGGER.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Mage")) {
				entity.setCustomName(Component.literal("\u00A76S-Rank Mage"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_STAFF.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Healer")) {
				entity.setCustomName(Component.literal("\u00A7aS-Rank Healer"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SPELL_BOOK.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Ranger")) {
				entity.setCustomName(Component.literal("\u00A72S-Rank Ranger"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_BOW.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_ARMOR_BOOTS.get()));
					}
				}
			}
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Tanker")) {
				entity.setCustomName(Component.literal("\u00A7eS-Rank Tanker"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_AXE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SHIELD.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(3, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_HELMET.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_HELMET.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SlsbModItems.E_RANK_TANKER_ARMOR_BOOTS.get()));
					}
				}
			}
		}
	}
}
