package net.z3rodown.vigilancextras;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.z3rodown.vigilancextras.block.ModBlocks;
import net.z3rodown.vigilancextras.effect.ModEffects;
import net.z3rodown.vigilancextras.item.ModItemGroups;
import net.z3rodown.vigilancextras.item.ModItems;
import net.z3rodown.vigilancextras.potion.ModPotions;
import net.z3rodown.vigilancextras.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VigilanceExtras implements ModInitializer {
	public static final String MOD_ID = "vigilance-extras";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups(); // Registers Item Groups for creative menu

		ModPotions.registerPotions(); // Register Potions
		ModEffects.registerEffects(); // Register Effects

		ModSounds.registerSounds(); // Register Sounds and Music

		ModItems.registerModItems(); // Registers Items under ModItems.class
		ModBlocks.registerModBlocks(); // Registers Blocks under ModBlocks.class

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder ->
				builder.registerPotionRecipe(Potions.WATER, Items.EMERALD, ModPotions.OMINOUS_POTION));
	}
}