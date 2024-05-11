package net.clozynoii.slsb.procedures;

import net.minecraft.world.level.LevelAccessor;

public class QuestTimerProcedure {
	public static String execute(LevelAccessor world) {
		String hour = "";
		String minutes = "";
		double minutesTemp = 0;
		double hoursTemp = 0;
		hoursTemp = (world.dayTime() % 24000) / 1000 + 6;
		if (Math.round(hoursTemp) >= 24) {
			hoursTemp = hoursTemp - 24;
		}
		if (Math.round(hoursTemp) >= 10) {
			hour = "" + new java.text.DecimalFormat("##").format(Math.round(hoursTemp));
		} else if (Math.round(hoursTemp) < 10) {
			hour = "0" + new java.text.DecimalFormat("##").format(Math.round(hoursTemp));
		}
		minutesTemp = ((world.dayTime() % 24000) % 1000) / 16.66;
		if (Math.round(minutesTemp) >= 10) {
			minutes = "" + new java.text.DecimalFormat("##").format(Math.round(minutesTemp));
		} else if (Math.round(minutesTemp) < 10) {
			minutes = "0" + new java.text.DecimalFormat("##").format(Math.round(minutesTemp));
		}
		return hour + ":" + minutes;
	}
}
