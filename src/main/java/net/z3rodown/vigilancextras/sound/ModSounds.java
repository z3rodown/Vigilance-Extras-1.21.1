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

    public static final SoundEvent ARCEUS_VOLO_FINAL = registerSoundEvent("arceus_volo_final");
    public static final RegistryKey<JukeboxSong> ARCEUS_VOLO_FINAL_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(VigilanceExtras.MOD_ID, "arceus_volo_final"));

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(VigilanceExtras.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        VigilanceExtras.LOGGER.info("Registering Mod Sounds for " + VigilanceExtras.MOD_ID);
    }
}
