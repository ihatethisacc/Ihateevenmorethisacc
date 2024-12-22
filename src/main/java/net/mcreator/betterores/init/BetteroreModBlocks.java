
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.betterores.block.SpinelOreBlock;
import net.mcreator.betterores.block.SpinelBlockBlock;
import net.mcreator.betterores.block.PeridotOreBlock;
import net.mcreator.betterores.block.PeridotBlockBlock;
import net.mcreator.betterores.block.PearlOreBlock;
import net.mcreator.betterores.block.PearlBlockBlock;
import net.mcreator.betterores.block.PainiteOreBlock;
import net.mcreator.betterores.block.PainiteBlockBlock;
import net.mcreator.betterores.block.OpalOreBlock;
import net.mcreator.betterores.block.OpalBlockBlock;
import net.mcreator.betterores.block.GarnetOreBlock;
import net.mcreator.betterores.block.GarnetBlockBlock;
import net.mcreator.betterores.block.DeepslateOpalBlock;
import net.mcreator.betterores.BetteroreMod;

public class BetteroreModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BetteroreMod.MODID);
	public static final RegistryObject<Block> OPAL_ORE = REGISTRY.register("opal_ore", () -> new OpalOreBlock());
	public static final RegistryObject<Block> OPAL_BLOCK = REGISTRY.register("opal_block", () -> new OpalBlockBlock());
	public static final RegistryObject<Block> PAINITE_ORE = REGISTRY.register("painite_ore", () -> new PainiteOreBlock());
	public static final RegistryObject<Block> PAINITE_BLOCK = REGISTRY.register("painite_block", () -> new PainiteBlockBlock());
	public static final RegistryObject<Block> PERIDOT_ORE = REGISTRY.register("peridot_ore", () -> new PeridotOreBlock());
	public static final RegistryObject<Block> PERIDOT_BLOCK = REGISTRY.register("peridot_block", () -> new PeridotBlockBlock());
	public static final RegistryObject<Block> GARNET_ORE = REGISTRY.register("garnet_ore", () -> new GarnetOreBlock());
	public static final RegistryObject<Block> GARNET_BLOCK = REGISTRY.register("garnet_block", () -> new GarnetBlockBlock());
	public static final RegistryObject<Block> SPINEL_ORE = REGISTRY.register("spinel_ore", () -> new SpinelOreBlock());
	public static final RegistryObject<Block> SPINEL_BLOCK = REGISTRY.register("spinel_block", () -> new SpinelBlockBlock());
	public static final RegistryObject<Block> DEEPSLATE_OPAL = REGISTRY.register("deepslate_opal", () -> new DeepslateOpalBlock());
	public static final RegistryObject<Block> PEARL_ORE = REGISTRY.register("pearl_ore", () -> new PearlOreBlock());
	public static final RegistryObject<Block> PEARL_BLOCK = REGISTRY.register("pearl_block", () -> new PearlBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
