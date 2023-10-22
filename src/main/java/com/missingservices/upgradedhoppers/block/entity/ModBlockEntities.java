package com.missingservices.upgradedhoppers.block.entity;

import com.missingservices.upgradedhoppers.UpgradedHoppers;
import com.missingservices.upgradedhoppers.block.ModBlocks;
import com.missingservices.upgradedhoppers.classes.UpgradedHopperBlockEntity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
		public static final BlockEntityType<UpgradedHopperBlockEntity> UPGRADED_HOPPER_BLOCK_ENTITY_TYPE =
			Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(UpgradedHoppers.MOD_ID, "upgraded_hopper_be"),
				FabricBlockEntityTypeBuilder.create(UpgradedHopperBlockEntity::new,
					ModBlocks.IRON_HOPPER, ModBlocks.COPPER_HOPPER, ModBlocks.GOLD_HOPPER, ModBlocks.EMERALD_HOPPER, ModBlocks.DIAMOND_HOPPER,
						ModBlocks.OBSIDIAN_HOPPER, ModBlocks.NETHERITE_HOPPER, ModBlocks.BEACON_HOPPER).build());
	
		public static void registerBlockEntities() {
			UpgradedHoppers.LOGGER.info("Registering Block Entities for " + UpgradedHoppers.MOD_ID);
		}
}
