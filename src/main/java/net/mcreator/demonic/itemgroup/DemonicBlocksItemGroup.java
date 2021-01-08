
package net.mcreator.demonic.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.demonic.item.BloodBallItem;
import net.mcreator.demonic.DemonicModElements;

@DemonicModElements.ModElement.Tag
public class DemonicBlocksItemGroup extends DemonicModElements.ModElement {
	public DemonicBlocksItemGroup(DemonicModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdemonic_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BloodBallItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
