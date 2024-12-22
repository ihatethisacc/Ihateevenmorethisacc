
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterores.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.betterores.BetteroreMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetteroreModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetteroreMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(BetteroreModBlocks.OPAL_ORE.get().asItem());
			tabData.accept(BetteroreModBlocks.OPAL_BLOCK.get().asItem());
			tabData.accept(BetteroreModBlocks.PAINITE_ORE.get().asItem());
			tabData.accept(BetteroreModBlocks.PAINITE_BLOCK.get().asItem());
			tabData.accept(BetteroreModBlocks.PERIDOT_ORE.get().asItem());
			tabData.accept(BetteroreModBlocks.PERIDOT_BLOCK.get().asItem());
			tabData.accept(BetteroreModBlocks.GARNET_ORE.get().asItem());
			tabData.accept(BetteroreModBlocks.GARNET_BLOCK.get().asItem());
			tabData.accept(BetteroreModBlocks.SPINEL_ORE.get().asItem());
			tabData.accept(BetteroreModBlocks.SPINEL_BLOCK.get().asItem());
			tabData.accept(BetteroreModBlocks.DEEPSLATE_OPAL.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {

			tabData.accept(BetteroreModItems.OPAL_TOOLS_SWORD.get());
			tabData.accept(BetteroreModItems.OPALARMOR_ARMOR_HELMET.get());
			tabData.accept(BetteroreModItems.OPALARMOR_ARMOR_CHESTPLATE.get());
			tabData.accept(BetteroreModItems.OPALARMOR_ARMOR_LEGGINGS.get());
			tabData.accept(BetteroreModItems.OPALARMOR_ARMOR_BOOTS.get());
			tabData.accept(BetteroreModItems.PAINITEARMOR_ARMOR_HELMET.get());
			tabData.accept(BetteroreModItems.PAINITEARMOR_ARMOR_CHESTPLATE.get());
			tabData.accept(BetteroreModItems.PAINITEARMOR_ARMOR_LEGGINGS.get());
			tabData.accept(BetteroreModItems.PAINITEARMOR_ARMOR_BOOTS.get());
			tabData.accept(BetteroreModItems.PAINITETOOLS_SWORD.get());
			tabData.accept(BetteroreModItems.PERIDOT_SWORD.get());
			tabData.accept(BetteroreModItems.PERIDOT_ARMOR_HELMET.get());
			tabData.accept(BetteroreModItems.PERIDOT_ARMOR_CHESTPLATE.get());
			tabData.accept(BetteroreModItems.PERIDOT_ARMOR_LEGGINGS.get());
			tabData.accept(BetteroreModItems.PERIDOT_ARMOR_BOOTS.get());
			tabData.accept(BetteroreModItems.GARNET_SWORD.get());
			tabData.accept(BetteroreModItems.GARNET_ARMOR_HELMET.get());
			tabData.accept(BetteroreModItems.GARNET_ARMOR_CHESTPLATE.get());
			tabData.accept(BetteroreModItems.GARNET_ARMOR_LEGGINGS.get());
			tabData.accept(BetteroreModItems.GARNET_ARMOR_BOOTS.get());
			tabData.accept(BetteroreModItems.SPINELS_ARMOR_HELMET.get());
			tabData.accept(BetteroreModItems.SPINELS_ARMOR_CHESTPLATE.get());
			tabData.accept(BetteroreModItems.SPINELS_ARMOR_LEGGINGS.get());
			tabData.accept(BetteroreModItems.SPINELS_ARMOR_BOOTS.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(BetteroreModItems.OPAL.get());
			tabData.accept(BetteroreModItems.PAINITE.get());
			tabData.accept(BetteroreModItems.PERIDOT.get());
			tabData.accept(BetteroreModItems.GARNET.get());
			tabData.accept(BetteroreModItems.SPINEL.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(BetteroreModItems.OPAL_TOOLS_PICKAXE.get());
			tabData.accept(BetteroreModItems.OPAL_TOOLS_AXE.get());
			tabData.accept(BetteroreModItems.OPAL_TOOLS_SHOVEL.get());
			tabData.accept(BetteroreModItems.OPAL_TOOLS_HOE.get());
			tabData.accept(BetteroreModItems.PAINITETOOLS_PICKAXE.get());
			tabData.accept(BetteroreModItems.PAINITETOOLS_AXE.get());
			tabData.accept(BetteroreModItems.PAINITETOOLS_SHOVEL.get());
			tabData.accept(BetteroreModItems.PAINITETOOLS_HOE.get());
			tabData.accept(BetteroreModItems.PERIDOT_PICKAXE.get());
			tabData.accept(BetteroreModItems.PERIDOT_AXE.get());
			tabData.accept(BetteroreModItems.PERIDOT_SHOVEL.get());
			tabData.accept(BetteroreModItems.PERIDOT_HOE.get());
			tabData.accept(BetteroreModItems.GARNET_PICKAXE.get());
			tabData.accept(BetteroreModItems.GARNET_AXE.get());
			tabData.accept(BetteroreModItems.GARNET_SHOVEL.get());
			tabData.accept(BetteroreModItems.GARNET_HOE.get());
			tabData.accept(BetteroreModItems.HAMMER.get());

		}
	}
}
