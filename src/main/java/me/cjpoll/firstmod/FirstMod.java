package me.cjpoll.firstmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid=FirstMod.MOD_ID, version = FirstMod.VERSION)
public class FirstMod
{
	public static final String MOD_ID = "firstmod";
	public static final String VERSION = "0.0.1-alpha";

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		System.out.println("This is my first mod!");
	}
}
