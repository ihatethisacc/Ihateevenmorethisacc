
package net.mcreator.betterores.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.betterores.init.BetteroreModItems;

public class OpalToolsSwordItem extends SwordItem {
	public OpalToolsSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 754;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 10f;
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
		}, 3, -2.4f, new Item.Properties());
	}
}
