package net.clozynoii.slsb.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class TesterWhitelistProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String whitelist = "";
		whitelist = "Dev clozy_3 NoiiLive Mindlesshas234 Yvorxe Theadesy ShadowSideX2 OpeLoverONG bug9787 enzyo112 LocalSnake_ Marylotl ActuallyFrogdog DistrustAki Quokkar JTFire2320 ShadowStar4343 RamenTaken CatProtector24 blamesora Ferdex Ninfro 4NIlx JiimJosty Ninjamaster2451 saika71 stewyRobin75588 Dragon_king4567 T0bi33 Ayaanzahid_ayaan cchandie ilaysim eren10y POKE_theboxcats Azj12365 Rai0n_ 6cccc TheSpaceManMike JEROME231 BotyRoty Mr_Garlicc zenitsu_agatsumaishere Wolfieplayz1115 ThomasWayne3355 MagicPuppy84 vin_jo ImNotHURAGAN _tarrabah RedRabbitPlayz GreaterDevouror Ditto_Guy Bode97 vampricboss Ducky_Ben ehhmazing1290 TheDILFMaster69 raiden102 Void_Asriel MyNameIsName1213 Sukunasglazer";
		if (!(whitelist).toLowerCase().contains((entity.getDisplayName().getString()).toLowerCase())) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("kick " + entity.getDisplayName().getString() + " Not Whitelisted!"));
		}
	}
}
