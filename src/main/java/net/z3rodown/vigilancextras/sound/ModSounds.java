package net.z3rodown.vigilancextras.sound;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.z3rodown.vigilancextras.VigilanceExtras;

public class ModSounds {

    // Sweetboy442
    public static final SoundEvent ARCEUS_ARCEUS_BATTLE = registerSoundEvent("arceus_arceus_battle");
    public static final RegistryKey<JukeboxSong> ARCEUS_ARCEUS_BATTLE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(VigilanceExtras.MOD_ID, "arceus_arceus_battle"));
    // ActionAlt
    public static final SoundEvent ARCEUS_VOLO_FINAL = registerSoundEvent("arceus_volo_final");
    public static final RegistryKey<JukeboxSong> ARCEUS_VOLO_FINAL_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(VigilanceExtras.MOD_ID, "arceus_volo_final"));
    // SandvichIsDone
    public static final SoundEvent BW_PWT_FINAL = registerSoundEvent("bw_pwt_final");
    public static final RegistryKey<JukeboxSong> BW_PWT_FINAL_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(VigilanceExtras.MOD_ID, "bw_pwt_final"));
    // Cynthalynn
    public static final SoundEvent BW_THE_DREAMYARD = registerSoundEvent("bw_the_dreamyard");
    public static final RegistryKey<JukeboxSong> BW_THE_DREAMYARD_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(VigilanceExtras.MOD_ID, "bw_the_dreamyard"));
    // ActionAlt2
    public static final SoundEvent RUBY_SAPPHIRE_GIRATINA = registerSoundEvent("ruby_sapphire_giratina");
    public static final RegistryKey<JukeboxSong> RUBY_SAPPHIRE_GIRATINA_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(VigilanceExtras.MOD_ID, "ruby_sapphire_giratina"));
    // Sweetboy442
    public static final SoundEvent RUBY_SAPPHIRE_RAYQUAZA = registerSoundEvent("ruby_sapphire_rayquaza");
    public static final RegistryKey<JukeboxSong> RUBY_SAPPHIRE_RAYQUAZA_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(VigilanceExtras.MOD_ID, "ruby_sapphire_rayquaza"));
    // Bladegames135
    public static final SoundEvent RUBY_SAPPHIRE_ZINNIA = registerSoundEvent("ruby_sapphire_zinnia");
    public static final RegistryKey<JukeboxSong> RUBY_SAPPHIRE_ZINNIA_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(VigilanceExtras.MOD_ID, "ruby_sapphire_zinnia"));
    // TG_Meliodas
    public static final SoundEvent ULTRA_MEWTWO_BATTLE = registerSoundEvent("ultra_mewtwo_battle");
    public static final RegistryKey<JukeboxSong> ULTRA_MEWTWO_BATTLE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(VigilanceExtras.MOD_ID, "ultra_mewtwo_battle"));
    // NeoNacho122
    public static final SoundEvent XY_GYM_BATTLE = registerSoundEvent("xy_gym_battle");
    public static final RegistryKey<JukeboxSong> XY_GYM_BATTLE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(VigilanceExtras.MOD_ID, "xy_gym_battle"));

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(VigilanceExtras.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        VigilanceExtras.LOGGER.info("Registering Mod Sounds for " + VigilanceExtras.MOD_ID);
    }
}
