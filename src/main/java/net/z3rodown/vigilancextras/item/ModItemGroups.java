package net.z3rodown.vigilancextras.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.z3rodown.vigilancextras.VigilanceExtras;
import net.z3rodown.vigilancextras.block.ModBlocks;

public class ModItemGroups {
// Registers items to show in creative menu
    public static final ItemGroup VIGILANCE_EXTRAS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(VigilanceExtras.MOD_ID, "vigilance_extras"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.UNSEEN_GLASS_BLOCK))
                    .displayName(Text.translatable("item-group.vigilance-extras"))
                    .entries((displayContext, entries) -> {
                        // Items
                        entries.add(ModItems.ENDER_SWORD);
                        // Blocks
                        entries.add(ModBlocks.UNSEEN_GLASS_BLOCK);
                        // Music Discs
                        entries.add(ModItems.ARCEUS_ARCEUS_BATTLE_MUSIC_DISC);
                        entries.add(ModItems.ARCEUS_VOLO_FINAL_MUSIC_DISC);
                        entries.add(ModItems.BW_PWT_FINAL_MUSIC_DISC);
                        entries.add(ModItems.RUBY_SAPPHIRE_GIRATINA_MUSIC_DISC);
                        entries.add(ModItems.RUBY_SAPPHIRE_RAYQUAZA_MUSIC_DISC);
                        entries.add(ModItems.RUBY_SAPPHIRE_ZINNIA_MUSIC_DISC);
                        entries.add(ModItems.ULTRA_MEWTWO_BATTLE_MUSIC_DISC);

                    }).build());

    public static void registerItemGroups() {
        VigilanceExtras.LOGGER.info("Registering Item Groups for " + VigilanceExtras.MOD_ID);
    }
}
