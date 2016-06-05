package me.cjpoll.morerecipes;

import me.cjpoll.morerecipes.items.ItemKey;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid=MoreRecipes.MOD_ID, version = MoreRecipes.VERSION)
public class MoreRecipes
{
	public static final String MOD_ID = "morerecipes";
	public static final String VERSION = "0.0.1-alpha";
	public static Item key = null;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("Pre-Init Phase");

		key = new ItemKey();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		System.out.println("Init Phase");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		if (event.getSide() == Side.CLIENT)
		{
			 RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

			 renderItem.getItemModelMesher().register(key, 0, new ModelResourceLocation(ItemKey.registrationName, "inventory"));
		}
	}
}
