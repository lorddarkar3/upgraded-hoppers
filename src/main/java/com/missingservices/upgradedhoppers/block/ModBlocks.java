package com.missingservices.upgradedhoppers.block;

import com.missingservices.upgradedhoppers.UpgradedHoppers;
import com.missingservices.upgradedhoppers.classes.UpgradedHopperBlock;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
	public static final Block IRON_HOPPER = registerBlock("iron_hopper",
			new UpgradedHopperBlock(FabricBlockSettings.copyOf(Blocks.HOPPER).strength(5, 6),7));
	public static final Block COPPER_HOPPER = registerBlock("copper_hopper",
			new UpgradedHopperBlock(FabricBlockSettings.copyOf(Blocks.HOPPER).sounds(BlockSoundGroup.COPPER).strength(5, 6),6));
	public static final Block GOLD_HOPPER = registerBlock("gold_hopper",
			new UpgradedHopperBlock(FabricBlockSettings.copyOf(Blocks.HOPPER).sounds(BlockSoundGroup.METAL).strength(3, 6),5));
	public static final Block EMERALD_HOPPER = registerBlock("emerald_hopper",
			new UpgradedHopperBlock(FabricBlockSettings.copyOf(Blocks.HOPPER).sounds(BlockSoundGroup.METAL).strength(5, 6),4));
	public static final Block DIAMOND_HOPPER = registerBlock("diamond_hopper",
			new UpgradedHopperBlock(FabricBlockSettings.copyOf(Blocks.HOPPER).sounds(BlockSoundGroup.METAL).strength(5, 6),3));
	public static final Block OBSIDIAN_HOPPER = registerBlock("obsidian_hopper",
			new UpgradedHopperBlock(FabricBlockSettings.copyOf(Blocks.HOPPER).sounds(BlockSoundGroup.STONE).strength(50, 1200),2));
	public static final Block NETHERITE_HOPPER = registerBlock("netherite_hopper",
			new UpgradedHopperBlock(FabricBlockSettings.copyOf(Blocks.HOPPER).sounds(BlockSoundGroup.NETHERITE).strength(50, 1200),1));
	public static final Block BEACON_HOPPER = registerBlock("beacon_hopper",
			new UpgradedHopperBlock(FabricBlockSettings.copyOf(Blocks.HOPPER).sounds(BlockSoundGroup.GLASS).strength(3, 3),0));

	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, new Identifier(UpgradedHoppers.MOD_ID, name), block);
	}
	
	private static Item registerBlockItem(String name, Block block) {
		return Registry.register(Registries.ITEM, new Identifier(UpgradedHoppers.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
	}
	
	private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
		entries.add(IRON_HOPPER);
		entries.add(COPPER_HOPPER);
		entries.add(GOLD_HOPPER);
		entries.add(EMERALD_HOPPER);
		entries.add(DIAMOND_HOPPER);
		entries.add(OBSIDIAN_HOPPER);
		entries.add(NETHERITE_HOPPER);
		entries.add(BEACON_HOPPER);
	}
	
	public static void registerModBlocks() {
		UpgradedHoppers.LOGGER.info("Registering ModBlocks for " + UpgradedHoppers.MOD_ID);
		
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(ModBlocks::addItemsToIngredientItemGroup);
	}
}
