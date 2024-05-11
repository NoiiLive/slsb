
package net.clozynoii.slsb.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class ERankDaggerItem extends SwordItem {
	public ERankDaggerItem() {
		super(new Tier() {
			public int getUses() {
				return 200;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SlsbModItems.MANA_CRYSTAL.get()), new ItemStack(SlsbModItems.E_RANK_ESSENCE_STONE.get()));
			}
		}, 3, -1.6f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
