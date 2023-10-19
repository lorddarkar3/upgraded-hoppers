package com.missingservices.upgradedhoppers.item;

import com.missingservices.upgradedhoppers.UpgradedHoppers;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	//public static final Item TEMP = registerItem("temp", new Item(new FabricItemSettings()));
	
	private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
		//entries.add(TEMP);
	}
	
	public static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(UpgradedHoppers.MOD_ID, name), item);
	}

	public static void registerModItems() {
		UpgradedHoppers.LOGGER.info("Registering Mod Items for " + UpgradedHoppers.MOD_ID);
		
		//ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(ModItems::addItemsToIngredientItemGroup);
	}
}
