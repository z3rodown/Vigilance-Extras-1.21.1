package net.z3rodown.vigilancextras.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.z3rodown.vigilancextras.VigilanceExtras;
import net.z3rodown.vigilancextras.block.custom.UnseenGlassBlock;

public class ModBlocks {

    public static final Block UNSEEN_GLASS_BLOCK = registerBlock("unseen_glass_block",
            new UnseenGlassBlock(AbstractBlock.Settings.create()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.GLASS)
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .solid()
                    .nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VigilanceExtras.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(VigilanceExtras.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        VigilanceExtras.LOGGER.info("Registering Mod Blocks for " + VigilanceExtras.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.UNSEEN_GLASS_BLOCK);
        });
    }
}
