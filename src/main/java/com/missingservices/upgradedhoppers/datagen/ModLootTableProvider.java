package com.missingservices.upgradedhoppers.datagen;

import com.missingservices.upgradedhoppers.block.ModBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

	public ModLootTableProvider(FabricDataOutput dataOutput) {
		super(dataOutput);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void generate() {
		addDrop(ModBlocks.IRON_HOPPER);
		addDrop(ModBlocks.COPPER_HOPPER);
		addDrop(ModBlocks.GOLD_HOPPER);
		addDrop(ModBlocks.EMERALD_HOPPER);
		addDrop(ModBlocks.DIAMOND_HOPPER);
		addDrop(ModBlocks.OBSIDIAN_HOPPER);
		addDrop(ModBlocks.NETHERITE_HOPPER);
		addDrop(ModBlocks.BEACON_HOPPER);
	}

}
