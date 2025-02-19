package net.z3rodown.vigilancextras.item;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.util.Rarity;
import net.z3rodown.vigilancextras.VigilanceExtras;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.z3rodown.vigilancextras.item.custom.EnderSword;
import net.z3rodown.vigilancextras.sound.ModSounds;

public class ModItems {

    public static final Item ARCEUS_ARCEUS_BATTLE_MUSIC_DISC = registerItem("arceus_arceus_battle_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.ARCEUS_ARCEUS_BATTLE_KEY).maxCount(1)));

    public static final Item ARCEUS_VOLO_FINAL_MUSIC_DISC = registerItem("arceus_volo_final_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.ARCEUS_VOLO_FINAL_KEY).maxCount(1)));

    public static final Item BW_PWT_FINAL_MUSIC_DISC = registerItem("bw_pwt_final_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.BW_PWT_FINAL_KEY).maxCount(1)));

    public static final Item RUBY_SAPPHIRE_GIRATINA_MUSIC_DISC = registerItem("ruby_sapphire_giratina_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.RUBY_SAPPHIRE_GIRATINA_KEY).maxCount(1)));

    public static final Item RUBY_SAPPHIRE_RAYQUAZA_MUSIC_DISC = registerItem("ruby_sapphire_rayquaza_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.RUBY_SAPPHIRE_RAYQUAZA_KEY).maxCount(1)));

    public static final Item RUBY_SAPPHIRE_ZINNIA_MUSIC_DISC = registerItem("ruby_sapphire_zinnia_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.RUBY_SAPPHIRE_ZINNIA_KEY).maxCount(1)));

    public static final Item ULTRA_MEWTWO_BATTLE_MUSIC_DISC = registerItem("ultra_mewtwo_battle_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.ULTRA_MEWTWO_BATTLE_KEY).maxCount(1)));

    public static final Item ENDER_SWORD = registerItem("ender_sword",
    new EnderSword(new Item.Settings()
            .rarity(Rarity.EPIC)
            .fireproof()
            .maxDamage(750)
            .maxCount(1)
            .component(DataComponentTypes.TOOL, EnderSword.createToolComponent())
            .attributeModifiers(EnderSword.createAttributeModifiers())
    ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VigilanceExtras.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VigilanceExtras.LOGGER.info("Registering Mod Items for " + VigilanceExtras.MOD_ID);

    }
}