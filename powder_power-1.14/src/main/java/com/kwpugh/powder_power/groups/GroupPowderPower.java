package com.kwpugh.powder_power.groups;

import com.kwpugh.powder_power.lists.ItemList;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GroupPowderPower extends ItemGroup
{
	public GroupPowderPower() 
	{
		super("powder_power");
	}

	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(ItemList.blend_gemium);
	}	
}
