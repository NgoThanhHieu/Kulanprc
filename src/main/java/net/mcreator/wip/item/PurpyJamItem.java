
package net.mcreator.wip.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.wip.init.WipModTabs;
import net.mcreator.wip.init.WipModSounds;

public class PurpyJamItem extends RecordItem {
	public PurpyJamItem() {
		super(0, WipModSounds.REGISTRY.get(new ResourceLocation("wip:purpy_jam")),
				new Item.Properties().tab(WipModTabs.TAB_WIP).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
