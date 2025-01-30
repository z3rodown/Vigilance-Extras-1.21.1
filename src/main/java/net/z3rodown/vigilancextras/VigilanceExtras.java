package net.z3rodown.vigilancextras;

import net.fabricmc.api.ModInitializer;

import net.z3rodown.vigilancextras.block.ModBlocks;
import net.z3rodown.vigilancextras.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VigilanceExtras implements ModInitializer {
	public static final String MOD_ID = "vigilance-extras";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();
	}
}