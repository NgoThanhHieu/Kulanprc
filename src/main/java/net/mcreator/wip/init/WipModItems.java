
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wip.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.wip.item.SkullTotemItem;
import net.mcreator.wip.WipMod;

public class WipModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WipMod.MODID);
	public static final RegistryObject<Item> SKULL_TOTEM = REGISTRY.register("skull_totem", () -> new SkullTotemItem());
}
