package net.z3rodown.vigilancextras.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.z3rodown.vigilancextras.VigilanceExtras;
import net.z3rodown.vigilancextras.effect.ModEffects;

public class ModPotions {
    public static final RegistryEntry<Potion> OMINOUS_POTION = registerPotion( "ominous_potion",
        new Potion(new StatusEffectInstance(ModEffects.OMINOUS, 72000, 4)));

    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {

        return Registry.registerReference(Registries.POTION, Identifier.of(VigilanceExtras.MOD_ID, name), potion);
    }

    public static void registerPotions() {

        VigilanceExtras.LOGGER.info("Registering Mod Potions for " + VigilanceExtras.MOD_ID);
    }
}
