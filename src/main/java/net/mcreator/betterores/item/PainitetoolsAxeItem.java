
package net.mcreator.betterores.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.betterores.init.BetteroreModItems;

public class PainitetoolsAxeItem extends AxeItem {
	public PainitetoolsAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2168;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 42;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BetteroreModItems.PAINITE.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
