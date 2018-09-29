package com.Szymeon.knightsmod.client;

import java.util.Arrays;

import com.Szymeon.knightsmod.init.ModItems;
import com.Szymeon.knightsmod.item.ItemBase;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;

@Mod.EventBusSubscriber(modid = "km")
public class ClientEventSubscriber 
{
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(
				new Item()
				);
	}
}