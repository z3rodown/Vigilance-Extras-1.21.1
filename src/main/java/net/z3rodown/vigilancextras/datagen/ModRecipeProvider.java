package net.z3rodown.vigilancextras.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.z3rodown.vigilancextras.block.ModBlocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // Unseen Glass Block recipe using 4 glass and an amethyst block making 6
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.UNSEEN_GLASS_BLOCK, 6)
                .pattern(" g ")
                .pattern("gAg")
                .pattern(" g ")
                .input('g', Blocks.GLASS)
                .input('A', Blocks.AMETHYST_BLOCK)
                .criterion(hasItem(Blocks.GLASS), conditionsFromItem(Blocks.GLASS))
                .offerTo(exporter);

//        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.OMINOUS_BOTTLE, 1)
//                .input(Items.OMINOUS_BOTTLE, 2)
//                .criterion(hasItem(Items.OMINOUS_BOTTLE), conditionsFromItem(Items.OMINOUS_BOTTLE))
//                .offerTo(exporter);
    }
}
