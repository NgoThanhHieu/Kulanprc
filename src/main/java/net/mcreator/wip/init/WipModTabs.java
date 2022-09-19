
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wip.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class WipModTabs {
	public static CreativeModeTab TAB_WIP;

	public static void load() {
		TAB_WIP = new CreativeModeTab("tabwip") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WipModItems.SKULL_TOTEM.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
