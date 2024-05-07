package net.clozynoii.slsb.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
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
		random = Mth.nextInt(RandomSource.create(), 1, 1);
		if (random == 1) {
			if (entity instanceof HunterNPCEntity _datEntSetS)
				_datEntSetS.getEntityData().set(HunterNPCEntity.DATA_HunterRank, "E-Rank");
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Fighter")) {
				entity.setCustomName(Component.literal("\u00A7cE-Rank Fighter"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SWORD.get());
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
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SWORD.get());
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
			if ((entity instanceof HunterNPCEntity _datEntS ? _datEntS.getEntityData().get(HunterNPCEntity.DATA_HunterClass) : "").equals("Mage")) {
				entity.setCustomName(Component.literal("\u00A76E-Rank Mage"));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SWORD.get());
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
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SWORD.get());
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
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SWORD.get());
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
					ItemStack _setstack = new ItemStack(SlsbModItems.E_RANK_SWORD.get());
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
		}
	}
}
