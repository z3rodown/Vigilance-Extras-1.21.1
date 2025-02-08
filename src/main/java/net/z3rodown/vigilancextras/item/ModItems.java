package net.z3rodown.vigilancextras.item;

import net.z3rodown.vigilancextras.VigilanceExtras;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.z3rodown.vigilancextras.sound.ModSounds;

public class ModItems {

    public static final Item ARCEUS_VOLO_FINAL_MUSIC_DISC = registerItem("arceus_volo_final_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.ARCEUS_VOLO_FINAL_KEY).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VigilanceExtras.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VigilanceExtras.LOGGER.info("Registering Mod Items for " + VigilanceExtras.MOD_ID);

    }
}