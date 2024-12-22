
package net.mcreator.betterores.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.betterores.init.BetteroreModItems;

public class OpalToolsAxeItem extends AxeItem {
	public OpalToolsAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 754;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 13.5f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 31;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BetteroreModItems.OPAL.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
