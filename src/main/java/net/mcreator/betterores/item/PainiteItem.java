
package net.mcreator.betterores.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PainiteItem extends Item {
	public PainiteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
