/****************************************
		� 2015 Dank Parrot
****************************************/

package net.dankparrot.atomcraft.core.init;

import net.dankparrot.atomcraft.core.items.ItemAC;
import net.dankparrot.atomcraft.core.items.ItemDust;
import net.dankparrot.atomcraft.core.items.ItemGeigerCounter;
import net.dankparrot.atomcraft.core.items.ItemIngot;
import net.dankparrot.atomcraft.core.reference.Names;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;


public class ModItems {

	public static final ItemAC geigerCounter = new ItemGeigerCounter();
	
	// Multi-ID items
	public static final ItemAC ingot = new ItemIngot();
	public static final ItemAC dust = new ItemDust();
	
	private static void registerItem(ItemAC item)
	{
		registerItem(item, 0);
	}
	
	private static void registerItem(ItemAC item, int meta)
	{
		GameRegistry.registerItem(item, item.getName(meta));
	}
	
	public static void init()
	{
		registerItem(geigerCounter);
		registerItem(ingot, 0);
		registerItem(dust, 0);
		
		OreDictionary.registerOre("ingotUranium", new ItemStack(ingot, 1, 0));
		OreDictionary.registerOre("dustUranium", new ItemStack(dust, 1, 0));
	}
}