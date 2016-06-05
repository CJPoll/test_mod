package me.cjpoll.firstmod;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid=FirstMod.MOD_ID, version = FirstMod.VERSION)
public class FirstMod
{
	public static final String MOD_ID = "firstmod";
	public static final String VERSION = "0.0.1-alpha";

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		ItemStack sword = new ItemStack(Items.DIAMOND_SWORD);
		sword.addEnchantment(Enchantment.getEnchantmentByLocation("minecraft:sharpness"), 1);

		GameRegistry.addShapelessRecipe(sword, Blocks.LOG, Blocks.DIRT);

		GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 64),
				Blocks.DIRT);
	}
}
