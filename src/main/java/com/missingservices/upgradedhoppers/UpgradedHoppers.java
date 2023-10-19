package com.missingservices.upgradedhoppers;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.missingservices.upgradedhoppers.block.ModBlocks;
import com.missingservices.upgradedhoppers.block.entity.ModBlockEntities;
import com.missingservices.upgradedhoppers.item.ModItems;

public class UpgradedHoppers implements ModInitializer {
    public static final String MOD_ID = "upgraded-hoppers";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
	}
}