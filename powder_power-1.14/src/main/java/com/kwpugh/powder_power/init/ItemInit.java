package com.kwpugh.powder_power.init;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.items.ArmorMaterialList;
import com.kwpugh.powder_power.items.HammerAlchemist;
import com.kwpugh.powder_power.items.MotarPestle;
import com.kwpugh.powder_power.items.ToolMaterialList;
import com.kwpugh.powder_power.lists.ItemList;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ItemInit
{
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents
	{
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event)
		{
			event.getRegistry().registerAll
			(				
				ItemList.hammer_alchemist = new HammerAlchemist(ItemTier.DIAMOND, 0, 0, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("hammer_alchemist")),
				ItemList.motar_pestle = new MotarPestle(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)).setRegistryName(location("motar_pestle")),
				
				
				ItemList.powder_iron = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_iron")),	
				ItemList.powder_redstone = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_redstone")),
				ItemList.powder_obsidian = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_obsidian")),
				ItemList.blend_redium = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("blend_redium")),
				
				
				ItemList.powder_end_pearl = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_end_pearl")),
				ItemList.powder_gold = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_gold")),
				ItemList.powder_lapis = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_lapis")),
				ItemList.blend_lapium = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("blend_lapium")),
				
				
				ItemList.powder_diamond = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_diamond")),
				ItemList.powder_emerald = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_emerald")),
				ItemList.blend_gemium = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("blend_gemium")),
				
				
				ItemList.blend_trilium = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("blend_trilium")),
				
				
				ItemList.ingot_redium = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("ingot_redium")),
				ItemList.ingot_lapium = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("ingot_lapium")),
				ItemList.gem_gemium = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("gem_gemium")),
				ItemList.ingot_trilium = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("ingot_trilium")),
				
				
				ItemList.armor_redium_head = new ArmorItem(ArmorMaterialList.redium, EquipmentSlotType.HEAD, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_redium_head")),
				ItemList.armor_redium_body = new ArmorItem(ArmorMaterialList.redium, EquipmentSlotType.CHEST, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_redium_body")),
				ItemList.armor_redium_leggings = new ArmorItem(ArmorMaterialList.redium, EquipmentSlotType.LEGS, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_redium_leggings")),
				ItemList.armor_redium_boots = new ArmorItem(ArmorMaterialList.redium, EquipmentSlotType.FEET, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_redium_boots")),
				
				
				ItemList.armor_lapium_head = new ArmorItem(ArmorMaterialList.lapium, EquipmentSlotType.HEAD, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_lapium_head")),
				ItemList.armor_lapium_body = new ArmorItem(ArmorMaterialList.lapium, EquipmentSlotType.CHEST, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_lapium_body")),
				ItemList.armor_lapium_leggings = new ArmorItem(ArmorMaterialList.lapium, EquipmentSlotType.LEGS, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_lapium_leggings")),
				ItemList.armor_lapium_boots = new ArmorItem(ArmorMaterialList.lapium, EquipmentSlotType.FEET, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_lapium_boots")),
				
				
				ItemList.armor_gemium_head = new ArmorItem(ArmorMaterialList.gemium, EquipmentSlotType.HEAD, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_gemium_head")),
				ItemList.armor_gemium_body = new ArmorItem(ArmorMaterialList.gemium, EquipmentSlotType.CHEST, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_gemium_body")),
				ItemList.armor_gemium_leggings = new ArmorItem(ArmorMaterialList.gemium, EquipmentSlotType.LEGS, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_gemium_leggings")),
				ItemList.armor_gemium_boots = new ArmorItem(ArmorMaterialList.gemium, EquipmentSlotType.FEET, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_gemium_boots")),
				
				
				
				ItemList.armor_trilium_head = new ArmorItem(ArmorMaterialList.trilium, EquipmentSlotType.HEAD, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_trilium_head")),
				ItemList.armor_trilium_body = new ArmorItem(ArmorMaterialList.trilium, EquipmentSlotType.CHEST, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_trilium_body")),
				ItemList.armor_trilium_leggings = new ArmorItem(ArmorMaterialList.trilium, EquipmentSlotType.LEGS, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_trilium_leggings")),
				ItemList.armor_trilium_boots = new ArmorItem(ArmorMaterialList.trilium, EquipmentSlotType.FEET, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_trilium_boots")),

				
				ItemList.sword_redium = new SwordItem(ToolMaterialList.redium, 1, 0.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("sword_redium")),
				ItemList.pickaxe_redium = new PickaxeItem(ToolMaterialList.redium, -6, 0.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("pickaxe_redium")),
				ItemList.axe_redium = new AxeItem(ToolMaterialList.redium, -6, 0.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("axe_redium")),
				ItemList.shovel_redium = new ShovelItem(ToolMaterialList.redium, -6, 0.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("shovel_redium")),
				
				
				ItemList.sword_lapium = new SwordItem(ToolMaterialList.lapium, 1, 0.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("sword_lapium")),
				ItemList.pickaxe_lapium = new PickaxeItem(ToolMaterialList.lapium, -6, 0.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("pickaxe_lapium")),
				ItemList.axe_lapium = new AxeItem(ToolMaterialList.lapium, -6, 0.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("axe_lapium")),
				ItemList.shovel_lapium = new ShovelItem(ToolMaterialList.lapium, -6, 0.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("shovel_lapium")),

				
				ItemList.sword_gemium = new SwordItem(ToolMaterialList.gemium, 2, 0.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("sword_gemium")),
				ItemList.pickaxe_gemium = new PickaxeItem(ToolMaterialList.gemium, -8, 0.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("pickaxe_gemium")),
				ItemList.axe_gemium = new AxeItem(ToolMaterialList.gemium, -8, 0.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("axe_gemium")),
				ItemList.shovel_gemium = new ShovelItem(ToolMaterialList.gemium, -8, 0.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("shovel_gemium")),
				
				
				ItemList.sword_trilium = new SwordItem(ToolMaterialList.trilium, 3, 0.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("sword_trilium")),
				ItemList.pickaxe_trilium = new PickaxeItem(ToolMaterialList.trilium, -9, 0.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("pickaxe_trilium")),
				ItemList.axe_trilium = new AxeItem(ToolMaterialList.trilium, -9, 0.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("axe_trilium")),
				ItemList.shovel_trilium = new ShovelItem(ToolMaterialList.trilium, -9, 0.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("shovel_trilium"))
				
			);		
			PowderPower.logger.info("PowderPower: Items registered.");
		}
		
		private static ResourceLocation location(String name)
		{
			return new ResourceLocation(PowderPower.modid, name);
		}
	}
}
