package net.clozynoii.slsb.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.coordinates.BlockPosArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class BreakGateCommandProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(new Object() {
				public double getX() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getX(), new Object() {
				public double getY() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getY(), new Object() {
				public double getZ() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getZ());
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("GateCloseTimer", 5);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
	}
}
