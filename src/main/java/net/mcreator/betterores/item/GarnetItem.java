
package net.mcreator.betterores.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GarnetItem extends Item {
	public GarnetItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
