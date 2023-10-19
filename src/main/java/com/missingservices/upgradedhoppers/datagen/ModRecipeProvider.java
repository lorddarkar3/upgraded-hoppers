package com.missingservices.upgradedhoppers.datagen;

import java.util.function.Consumer;

import com.missingservices.upgradedhoppers.block.ModBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class ModRecipeProvider extends FabricRecipeProvider {
	
	public ModRecipeProvider(FabricDataOutput output) {
		super(output);
	}
	
	private static void recipeUpgradedHopper(Consumer<RecipeJsonProvider> exporter, Item ironIngot, ItemConvertible source, Block result) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, result,1)
		.pattern("M M")
		.pattern("MHM")
		.pattern(" M ")
		.input('M', ironIngot)
		.input('H', source)
		.criterion(hasItem(source), conditionsFromItem(source))
		.offerTo(exporter, new Identifier(getRecipeName(result)));
	}

	@Override
	public void generate(Consumer<RecipeJsonProvider> exporter) {
		recipeUpgradedHopper(exporter, Items.IRON_INGOT, Items.HOPPER, ModBlocks.IRON_HOPPER);
		recipeUpgradedHopper(exporter, Items.COPPER_INGOT, ModBlocks.IRON_HOPPER, ModBlocks.COPPER_HOPPER);
		recipeUpgradedHopper(exporter, Items.GOLD_INGOT, ModBlocks.COPPER_HOPPER, ModBlocks.GOLD_HOPPER);
		recipeUpgradedHopper(exporter, Items.EMERALD, ModBlocks.GOLD_HOPPER, ModBlocks.EMERALD_HOPPER);
		recipeUpgradedHopper(exporter, Items.DIAMOND, ModBlocks.EMERALD_HOPPER, ModBlocks.DIAMOND_HOPPER);
		recipeUpgradedHopper(exporter, Items.OBSIDIAN, ModBlocks.DIAMOND_HOPPER, ModBlocks.OBSIDIAN_HOPPER);
		recipeUpgradedHopper(exporter, Items.NETHERITE_INGOT, ModBlocks.OBSIDIAN_HOPPER, ModBlocks.NETHERITE_HOPPER);
	}

}
