
package net.clozynoii.slsb.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.clozynoii.slsb.init.SlsbModItems;

import java.util.List;

public class ERankShieldItem extends ShieldItem {
	public ERankShieldItem() {
		super(new Item.Properties().durability(10000));
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(new ItemStack(SlsbModItems.MANA_CRYSTAL.get()), new ItemStack(SlsbModItems.E_RANK_ESSENCE_STONE.get())).test(repairitem);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
