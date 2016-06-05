package me.cjpoll.morerecipes.items;

import me.cjpoll.morerecipes.MoreRecipes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemKey extends Item
{
	public static String key = "dungeon_key";
	public static String registrationName = MoreRecipes.MOD_ID + ":" + key;

	private String unlocalizedName = MoreRecipes.MOD_ID + "_" + key;

	public ItemKey() {
		GameRegistry.registerItem(this, this.key);
		setUnlocalizedName(unlocalizedName);
		setCreativeTab(CreativeTabs.MISC);
	}
}
