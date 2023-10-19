package com.missingservices.upgradedhoppers;

import com.missingservices.upgradedhoppers.datagen.ModBlockTagProvider;
import com.missingservices.upgradedhoppers.datagen.ModItemTagProvider;
import com.missingservices.upgradedhoppers.datagen.ModLootTableProvider;
import com.missingservices.upgradedhoppers.datagen.ModModelProvider;
import com.missingservices.upgradedhoppers.datagen.ModRecipeProvider;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class UpgradedHoppersDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
