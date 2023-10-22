package com.missingservices.upgradedhoppers.datagen;

import java.util.concurrent.CompletableFuture;

import com.missingservices.upgradedhoppers.block.ModBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.registry.tag.BlockTags;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

	public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void configure(WrapperLookup arg) {
		getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
		.add(ModBlocks.IRON_HOPPER)
		.add(ModBlocks.COPPER_HOPPER)
		.add(ModBlocks.GOLD_HOPPER)
		.add(ModBlocks.EMERALD_HOPPER)
		.add(ModBlocks.DIAMOND_HOPPER)
		.add(ModBlocks.OBSIDIAN_HOPPER)
		.add(ModBlocks.NETHERITE_HOPPER)
		.add(ModBlocks.BEACON_HOPPER);
		
		getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
		.add(ModBlocks.COPPER_HOPPER)
		.add(ModBlocks.IRON_HOPPER);
		
		getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
		.add(ModBlocks.GOLD_HOPPER)
		.add(ModBlocks.EMERALD_HOPPER)
		.add(ModBlocks.DIAMOND_HOPPER);
		
		getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
		.add(ModBlocks.OBSIDIAN_HOPPER)
		.add(ModBlocks.NETHERITE_HOPPER);
	}

}
