package net.clozynoii.slsb.procedures;

import net.minecraft.world.item.Items;
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

public class HunterNPCOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double cooldown = 0;
		boolean singletarget = false;
		entity.getPersistentData().putDouble("randomclass", (Mth.nextInt(RandomSource.create(), 1, 6)));
		if (entity.getPersistentData().getDouble("randomclass") == 1) {
			entity.getPersistentData().putString("Class", "Fighter");
			entity.setCustomName(Component.literal("\u00A7cFighter Hunter"));
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
		} else if (entity.getPersistentData().getDouble("randomclass") == 2) {
			entity.getPersistentData().putString("Class", "Assassin");
			entity.setCustomName(Component.literal("\u00A79Assassin Hunter"));
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.IRON_SWORD);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (entity.getPersistentData().getDouble("randomclass") == 3) {
			entity.getPersistentData().putString("Class", "Mage");
			entity.setCustomName(Component.literal("\u00A76Mage Hunter"));
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.STICK);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (entity.getPersistentData().getDouble("randomclass") == 4) {
			entity.getPersistentData().putString("Class", "Healer");
			entity.setCustomName(Component.literal("\u00A7aHealer Hunter"));
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.BLAZE_ROD);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (entity.getPersistentData().getDouble("randomclass") == 5) {
			entity.getPersistentData().putString("Class", "Ranger");
			entity.setCustomName(Component.literal("\u00A72Ranger Hunter"));
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.BOW);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (entity.getPersistentData().getDouble("randomclass") == 6) {
			entity.getPersistentData().putString("Class", "Tanker");
			entity.setCustomName(Component.literal("\u00A7eTanker Hunter"));
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.IRON_AXE);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}
