package xyz.dankparrot.atomcraft.items;

import java.util.List;

import xyz.dankparrot.atomcraft.reference.EnumOreType;
import xyz.dankparrot.atomcraft.reference.Names;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemDust extends ItemAC {
	
	public ItemDust()
	{
		super(Names.Items.DUST);
		this.setHasSubtypes(true);
	}
	
	@Override
	public String getName(int meta)
	{
		return EnumOreType.fromMeta(meta).getName() + "_" + this.getName();
		// Format: uranium_dust
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + "." + EnumOreType.fromMeta(stack.getItemDamage()).getName();
		// Format: item.dust.uranium
	}

	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, List subItems) {
	    subItems.add(new ItemStack(itemIn, 1, 0));
	}


}
