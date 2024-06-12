
package net.clozynoii.slsb.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.clozynoii.slsb.init.SlsbModItems;

public class ERankSwordItem extends SwordItem {
	public ERankSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
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
		}, 3, -2.4f, new Item.Properties());
	}
}
