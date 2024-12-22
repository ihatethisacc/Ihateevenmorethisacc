
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.betterores.item.SpinelsArmorItem;
import net.mcreator.betterores.item.SpinelItem;
import net.mcreator.betterores.item.PinkDiamondItem;
import net.mcreator.betterores.item.PinkDiamondBowItem;
import net.mcreator.betterores.item.PeridotSwordItem;
import net.mcreator.betterores.item.PeridotShovelItem;
import net.mcreator.betterores.item.PeridotPickaxeItem;
import net.mcreator.betterores.item.PeridotItem;
import net.mcreator.betterores.item.PeridotHoeItem;
import net.mcreator.betterores.item.PeridotAxeItem;
import net.mcreator.betterores.item.PeridotArmorItem;
import net.mcreator.betterores.item.PearlItem;
import net.mcreator.betterores.item.PainitetoolsSwordItem;
import net.mcreator.betterores.item.PainitetoolsShovelItem;
import net.mcreator.betterores.item.PainitetoolsPickaxeItem;
import net.mcreator.betterores.item.PainitetoolsHoeItem;
import net.mcreator.betterores.item.PainitetoolsAxeItem;
import net.mcreator.betterores.item.PainitearmorArmorItem;
import net.mcreator.betterores.item.PainiteItem;
import net.mcreator.betterores.item.OpalarmorArmorItem;
import net.mcreator.betterores.item.OpalToolsSwordItem;
import net.mcreator.betterores.item.OpalToolsShovelItem;
import net.mcreator.betterores.item.OpalToolsPickaxeItem;
import net.mcreator.betterores.item.OpalToolsHoeItem;
import net.mcreator.betterores.item.OpalToolsAxeItem;
import net.mcreator.betterores.item.OpalItem;
import net.mcreator.betterores.item.HeanvlyItem;
import net.mcreator.betterores.item.HammerItem;
import net.mcreator.betterores.item.GarnetSwordItem;
import net.mcreator.betterores.item.GarnetShovelItem;
import net.mcreator.betterores.item.GarnetPickaxeItem;
import net.mcreator.betterores.item.GarnetItem;
import net.mcreator.betterores.item.GarnetHoeItem;
import net.mcreator.betterores.item.GarnetAxeItem;
import net.mcreator.betterores.item.GarnetArmorItem;
import net.mcreator.betterores.BetteroreMod;

public class BetteroreModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BetteroreMod.MODID);
	public static final RegistryObject<Item> OPAL = REGISTRY.register("opal", () -> new OpalItem());
	public static final RegistryObject<Item> OPAL_ORE = block(BetteroreModBlocks.OPAL_ORE);
	public static final RegistryObject<Item> OPAL_BLOCK = block(BetteroreModBlocks.OPAL_BLOCK);
	public static final RegistryObject<Item> PAINITE = REGISTRY.register("painite", () -> new PainiteItem());
	public static final RegistryObject<Item> PAINITE_ORE = block(BetteroreModBlocks.PAINITE_ORE);
	public static final RegistryObject<Item> PAINITE_BLOCK = block(BetteroreModBlocks.PAINITE_BLOCK);
	public static final RegistryObject<Item> OPAL_TOOLS_PICKAXE = REGISTRY.register("opal_tools_pickaxe", () -> new OpalToolsPickaxeItem());
	public static final RegistryObject<Item> OPAL_TOOLS_AXE = REGISTRY.register("opal_tools_axe", () -> new OpalToolsAxeItem());
	public static final RegistryObject<Item> OPAL_TOOLS_SWORD = REGISTRY.register("opal_tools_sword", () -> new OpalToolsSwordItem());
	public static final RegistryObject<Item> OPAL_TOOLS_SHOVEL = REGISTRY.register("opal_tools_shovel", () -> new OpalToolsShovelItem());
	public static final RegistryObject<Item> OPAL_TOOLS_HOE = REGISTRY.register("opal_tools_hoe", () -> new OpalToolsHoeItem());
	public static final RegistryObject<Item> OPALARMOR_ARMOR_HELMET = REGISTRY.register("opalarmor_armor_helmet", () -> new OpalarmorArmorItem.Helmet());
	public static final RegistryObject<Item> OPALARMOR_ARMOR_CHESTPLATE = REGISTRY.register("opalarmor_armor_chestplate", () -> new OpalarmorArmorItem.Chestplate());
	public static final RegistryObject<Item> OPALARMOR_ARMOR_LEGGINGS = REGISTRY.register("opalarmor_armor_leggings", () -> new OpalarmorArmorItem.Leggings());
	public static final RegistryObject<Item> OPALARMOR_ARMOR_BOOTS = REGISTRY.register("opalarmor_armor_boots", () -> new OpalarmorArmorItem.Boots());
	public static final RegistryObject<Item> PAINITEARMOR_ARMOR_HELMET = REGISTRY.register("painitearmor_armor_helmet", () -> new PainitearmorArmorItem.Helmet());
	public static final RegistryObject<Item> PAINITEARMOR_ARMOR_CHESTPLATE = REGISTRY.register("painitearmor_armor_chestplate", () -> new PainitearmorArmorItem.Chestplate());
	public static final RegistryObject<Item> PAINITEARMOR_ARMOR_LEGGINGS = REGISTRY.register("painitearmor_armor_leggings", () -> new PainitearmorArmorItem.Leggings());
	public static final RegistryObject<Item> PAINITEARMOR_ARMOR_BOOTS = REGISTRY.register("painitearmor_armor_boots", () -> new PainitearmorArmorItem.Boots());
	public static final RegistryObject<Item> PAINITETOOLS_PICKAXE = REGISTRY.register("painitetools_pickaxe", () -> new PainitetoolsPickaxeItem());
	public static final RegistryObject<Item> PAINITETOOLS_AXE = REGISTRY.register("painitetools_axe", () -> new PainitetoolsAxeItem());
	public static final RegistryObject<Item> PAINITETOOLS_SWORD = REGISTRY.register("painitetools_sword", () -> new PainitetoolsSwordItem());
	public static final RegistryObject<Item> PAINITETOOLS_SHOVEL = REGISTRY.register("painitetools_shovel", () -> new PainitetoolsShovelItem());
	public static final RegistryObject<Item> PAINITETOOLS_HOE = REGISTRY.register("painitetools_hoe", () -> new PainitetoolsHoeItem());
	public static final RegistryObject<Item> PERIDOT = REGISTRY.register("peridot", () -> new PeridotItem());
	public static final RegistryObject<Item> PERIDOT_ORE = block(BetteroreModBlocks.PERIDOT_ORE);
	public static final RegistryObject<Item> PERIDOT_BLOCK = block(BetteroreModBlocks.PERIDOT_BLOCK);
	public static final RegistryObject<Item> PERIDOT_PICKAXE = REGISTRY.register("peridot_pickaxe", () -> new PeridotPickaxeItem());
	public static final RegistryObject<Item> PERIDOT_AXE = REGISTRY.register("peridot_axe", () -> new PeridotAxeItem());
	public static final RegistryObject<Item> PERIDOT_SWORD = REGISTRY.register("peridot_sword", () -> new PeridotSwordItem());
	public static final RegistryObject<Item> PERIDOT_SHOVEL = REGISTRY.register("peridot_shovel", () -> new PeridotShovelItem());
	public static final RegistryObject<Item> PERIDOT_HOE = REGISTRY.register("peridot_hoe", () -> new PeridotHoeItem());
	public static final RegistryObject<Item> PERIDOT_ARMOR_HELMET = REGISTRY.register("peridot_armor_helmet", () -> new PeridotArmorItem.Helmet());
	public static final RegistryObject<Item> PERIDOT_ARMOR_CHESTPLATE = REGISTRY.register("peridot_armor_chestplate", () -> new PeridotArmorItem.Chestplate());
	public static final RegistryObject<Item> PERIDOT_ARMOR_LEGGINGS = REGISTRY.register("peridot_armor_leggings", () -> new PeridotArmorItem.Leggings());
	public static final RegistryObject<Item> PERIDOT_ARMOR_BOOTS = REGISTRY.register("peridot_armor_boots", () -> new PeridotArmorItem.Boots());
	public static final RegistryObject<Item> GARNET = REGISTRY.register("garnet", () -> new GarnetItem());
	public static final RegistryObject<Item> GARNET_ORE = block(BetteroreModBlocks.GARNET_ORE);
	public static final RegistryObject<Item> GARNET_BLOCK = block(BetteroreModBlocks.GARNET_BLOCK);
	public static final RegistryObject<Item> GARNET_PICKAXE = REGISTRY.register("garnet_pickaxe", () -> new GarnetPickaxeItem());
	public static final RegistryObject<Item> GARNET_AXE = REGISTRY.register("garnet_axe", () -> new GarnetAxeItem());
	public static final RegistryObject<Item> GARNET_SWORD = REGISTRY.register("garnet_sword", () -> new GarnetSwordItem());
	public static final RegistryObject<Item> GARNET_SHOVEL = REGISTRY.register("garnet_shovel", () -> new GarnetShovelItem());
	public static final RegistryObject<Item> GARNET_HOE = REGISTRY.register("garnet_hoe", () -> new GarnetHoeItem());
	public static final RegistryObject<Item> GARNET_ARMOR_HELMET = REGISTRY.register("garnet_armor_helmet", () -> new GarnetArmorItem.Helmet());
	public static final RegistryObject<Item> GARNET_ARMOR_CHESTPLATE = REGISTRY.register("garnet_armor_chestplate", () -> new GarnetArmorItem.Chestplate());
	public static final RegistryObject<Item> GARNET_ARMOR_LEGGINGS = REGISTRY.register("garnet_armor_leggings", () -> new GarnetArmorItem.Leggings());
	public static final RegistryObject<Item> GARNET_ARMOR_BOOTS = REGISTRY.register("garnet_armor_boots", () -> new GarnetArmorItem.Boots());
	public static final RegistryObject<Item> SPINEL = REGISTRY.register("spinel", () -> new SpinelItem());
	public static final RegistryObject<Item> SPINEL_ORE = block(BetteroreModBlocks.SPINEL_ORE);
	public static final RegistryObject<Item> SPINEL_BLOCK = block(BetteroreModBlocks.SPINEL_BLOCK);
	public static final RegistryObject<Item> SPINELS_ARMOR_HELMET = REGISTRY.register("spinels_armor_helmet", () -> new SpinelsArmorItem.Helmet());
	public static final RegistryObject<Item> SPINELS_ARMOR_CHESTPLATE = REGISTRY.register("spinels_armor_chestplate", () -> new SpinelsArmorItem.Chestplate());
	public static final RegistryObject<Item> SPINELS_ARMOR_LEGGINGS = REGISTRY.register("spinels_armor_leggings", () -> new SpinelsArmorItem.Leggings());
	public static final RegistryObject<Item> SPINELS_ARMOR_BOOTS = REGISTRY.register("spinels_armor_boots", () -> new SpinelsArmorItem.Boots());
	public static final RegistryObject<Item> HAMMER = REGISTRY.register("hammer", () -> new HammerItem());
	public static final RegistryObject<Item> DEEPSLATE_OPAL = block(BetteroreModBlocks.DEEPSLATE_OPAL);
	public static final RegistryObject<Item> PINK_DIAMOND = REGISTRY.register("pink_diamond", () -> new PinkDiamondItem());
	public static final RegistryObject<Item> PINK_DIAMOND_BOW = REGISTRY.register("pink_diamond_bow", () -> new PinkDiamondBowItem());
	public static final RegistryObject<Item> PEARL = REGISTRY.register("pearl", () -> new PearlItem());
	public static final RegistryObject<Item> PEARL_ORE = block(BetteroreModBlocks.PEARL_ORE);
	public static final RegistryObject<Item> PEARL_BLOCK = block(BetteroreModBlocks.PEARL_BLOCK);
	public static final RegistryObject<Item> HEANVLY_HELMET = REGISTRY.register("heanvly_helmet", () -> new HeanvlyItem.Helmet());
	public static final RegistryObject<Item> HEANVLY_BOOTS = REGISTRY.register("heanvly_boots", () -> new HeanvlyItem.Boots());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
