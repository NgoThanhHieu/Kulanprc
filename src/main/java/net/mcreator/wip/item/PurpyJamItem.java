
package net.mcreator.wip.item;

import net.minecraft.network.chat.Component;

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
