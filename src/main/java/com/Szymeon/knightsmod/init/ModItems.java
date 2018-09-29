package com.Szymeon.knightsmod.init;

import com.Szymeon.knightsmod.item.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder("km")
public class ModItems 
{
	public static final Item MUTANT_BONE = new ItemBase("mutantbone");
}
