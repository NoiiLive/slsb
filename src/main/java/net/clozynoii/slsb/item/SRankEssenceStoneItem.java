
package net.clozynoii.slsb.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class SRankEssenceStoneItem extends Item {
	public SRankEssenceStoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77Found within an \u00A7dS-Rank \u00A77magic beast, a proof of your effort."));
		list.add(Component.literal("\u00A77\u00A7oCan be sold for a decent price, or turned into armor and weapons"));
	}
}
