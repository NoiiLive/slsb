
package net.clozynoii.slsb.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.clozynoii.slsb.init.SlsbModItems;

public class ERankShieldItem extends ShieldItem {
	public ERankShieldItem() {
		super(new Item.Properties().durability(250));
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(new ItemStack(SlsbModItems.MANA_CRYSTAL.get()), new ItemStack(SlsbModItems.E_RANK_ESSENCE_STONE.get())).test(repairitem);
	}
}
