
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.betterores.enchantment.ExcavatorEnchantment;
import net.mcreator.betterores.BetteroreMod;

public class BetteroreModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, BetteroreMod.MODID);
	public static final RegistryObject<Enchantment> EXCAVATOR = REGISTRY.register("excavator", () -> new ExcavatorEnchantment());
}
