package net.clozynoii.slsb.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.clozynoii.slsb.network.SlsbModVariables;

public class MageSkills5Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCooldown5 == 0) {
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).MageType).equals("Wind")) {
				if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Wind Slice")) {
					{
						double _setval = 100;
						entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCost5 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
						WindSliceSkillUseProcedure.execute(world, x, y, z, entity);
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
									+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
									true);
					}
				}
				if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Turbulence")) {
					{
						double _setval = 100;
						entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCost5 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
						TurbulenceSkillUseProcedure.execute(world, entity);
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
									+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
									true);
					}
				}
				if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Wind Burst")) {
					{
						double _setval = 100;
						entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCost5 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
						WindBurstSkillUseProcedure.execute(entity);
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
									+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
									true);
					}
				}
				if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Wind Pull")) {
					{
						double _setval = 100;
						entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCost5 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
						WindPullSkillUseProcedure.execute(world, x, y, z, entity);
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
									+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
									true);
					}
				}
				if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Suffocation")) {
					{
						double _setval = 100;
						entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCost5 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
						SuffocationSkillUseProcedure.execute(world, x, y, z, entity);
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
									+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
									true);
					}
				}
				if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Tornado")) {
					{
						double _setval = 100;
						entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCost5 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
						TornadoSkillUseProcedure.execute(entity);
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
									+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
									true);
					}
				}
				if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Wind Barrier")) {
					{
						double _setval = 100;
						entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCost5 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
						WindBarrierSkillUseProcedure.execute(world, x, y, z, entity);
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
									+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
									true);
					}
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A7fAbility on Cooldown For \u00A7c\u00A7l"
						+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCooldown5 / 20) + " \u00A7fSeconds")), true);
		}
	}
}
