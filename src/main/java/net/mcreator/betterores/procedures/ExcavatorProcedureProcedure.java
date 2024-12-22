package net.mcreator.betterores.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.betterores.init.BetteroreModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ExcavatorProcedureProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Xvalue = 0;
		double Yvalue = 0;
		double i = 0;
		double j = 0;
		String tag = "";
		tag = "mineable/pickaxe";
		if (EnchantmentHelper.getItemEnchantmentLevel(BetteroreModEnchantments.EXCAVATOR.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(BetteroreModEnchantments.EXCAVATOR.get()) == 1) {
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(4, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				i = -1;
				for (int index0 = 0; index0 < 3; index0++) {
					j = -1;
					for (int index1 = 0; index1 < 3; index1++) {
						if (i != 0 || j != 0) {
							if (entity.getXRot() > 40 || entity.getXRot() < -40) {
								if ((world.getBlockState(BlockPos.containing(x + i, y, z + j))).is(BlockTags.create(new ResourceLocation((tag).toLowerCase(java.util.Locale.ENGLISH))))) {
									{
										BlockPos _pos = BlockPos.containing(x + i, y, z + j);
										Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
										world.destroyBlock(_pos, false);
									}
								}
							} else if ((entity.getDirection()).getAxis() == Direction.Axis.Z) {
								if ((world.getBlockState(BlockPos.containing(x + i, y + j, z))).is(BlockTags.create(new ResourceLocation((tag).toLowerCase(java.util.Locale.ENGLISH))))) {
									{
										BlockPos _pos = BlockPos.containing(x + i, y + j, z);
										Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
										world.destroyBlock(_pos, false);
									}
								}
							} else if ((entity.getDirection()).getAxis() == Direction.Axis.X) {
								if ((world.getBlockState(BlockPos.containing(x, y + j, z + i))).is(BlockTags.create(new ResourceLocation((tag).toLowerCase(java.util.Locale.ENGLISH))))) {
									{
										BlockPos _pos = BlockPos.containing(x, y + j, z + i);
										Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
										world.destroyBlock(_pos, false);
									}
								}
							}
						}
						j = j + 1;
					}
					i = i + 1;
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(BetteroreModEnchantments.EXCAVATOR.get()) == 2) {
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(14, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				i = -2;
				for (int index2 = 0; index2 < 5; index2++) {
					j = -2;
					for (int index3 = 0; index3 < 5; index3++) {
						if (i != 0 || j != 0) {
							if (entity.getXRot() > 40 || entity.getXRot() < -40) {
								if ((world.getBlockState(BlockPos.containing(x + i, y, z + j))).is(BlockTags.create(new ResourceLocation((tag).toLowerCase(java.util.Locale.ENGLISH))))) {
									{
										BlockPos _pos = BlockPos.containing(x + i, y, z + j);
										Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
										world.destroyBlock(_pos, false);
									}
								}
							} else if ((entity.getDirection()).getAxis() == Direction.Axis.Z) {
								if ((world.getBlockState(BlockPos.containing(x + i, y + j, z))).is(BlockTags.create(new ResourceLocation((tag).toLowerCase(java.util.Locale.ENGLISH))))) {
									{
										BlockPos _pos = BlockPos.containing(x + i, y + j, z);
										Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
										world.destroyBlock(_pos, false);
									}
								}
							} else if ((entity.getDirection()).getAxis() == Direction.Axis.X) {
								if ((world.getBlockState(BlockPos.containing(x, y + j, z + i))).is(BlockTags.create(new ResourceLocation((tag).toLowerCase(java.util.Locale.ENGLISH))))) {
									{
										BlockPos _pos = BlockPos.containing(x, y + j, z + i);
										Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
										world.destroyBlock(_pos, false);
									}
								}
							}
						}
						j = j + 1;
					}
					i = i + 1;
				}
			}
		}
	}
}
