
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wip.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.wip.item.TornadoItem;
import net.mcreator.wip.item.SkullTotemItem;
import net.mcreator.wip.item.PurpyJamItem;
import net.mcreator.wip.item.MysticSwordItem;
import net.mcreator.wip.WipMod;

public class WipModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WipMod.MODID);
	public static final RegistryObject<Item> SKULL_TOTEM = REGISTRY.register("skull_totem", () -> new SkullTotemItem());
	public static final RegistryObject<Item> TORNADO = REGISTRY.register("tornado", () -> new TornadoItem());
	public static final RegistryObject<Item> BABOON = REGISTRY.register("baboon_spawn_egg",
			() -> new ForgeSpawnEggItem(WipModEntities.BABOON, -7052516, -2090918, new Item.Properties().tab(WipModTabs.TAB_WIP)));
	public static final RegistryObject<Item> MYSTIC_SWORD = REGISTRY.register("mystic_sword", () -> new MysticSwordItem());
	public static final RegistryObject<Item> PURPY_JAM = REGISTRY.register("purpy_jam", () -> new PurpyJamItem());
}
