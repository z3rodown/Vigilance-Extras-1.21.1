package net.z3rodown.vigilancextras.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.z3rodown.vigilancextras.block.ModBlocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.z3rodown.vigilancextras.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.UNSEEN_GLASS_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ENDER_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModBlocks.UNSEEN_GLASS_BLOCK.asItem(), Models.GENERATED);

        itemModelGenerator.register(ModItems.ARCEUS_ARCEUS_BATTLE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARCEUS_VOLO_FINAL_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BW_PWT_FINAL_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_SAPPHIRE_GIRATINA_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_SAPPHIRE_RAYQUAZA_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_SAPPHIRE_ZINNIA_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ULTRA_MEWTWO_BATTLE_MUSIC_DISC, Models.GENERATED);

    }
}