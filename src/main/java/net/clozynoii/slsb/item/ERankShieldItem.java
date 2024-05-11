
package net.clozynoii.slsb.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class ERankShieldItem extends ShieldItem {
	public ERankShieldItem() {
		super(new Item.Properties().durability(250));
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
