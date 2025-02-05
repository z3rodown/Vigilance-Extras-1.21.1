package net.z3rodown.vigilancextras.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.z3rodown.vigilancextras.VigilanceExtras;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> OMINOUS = registerStatusEffect("ominous",
            new Ominous(StatusEffectCategory.NEUTRAL, 0x742222));

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(VigilanceExtras.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        VigilanceExtras.LOGGER.info("Registering Mod Effects for " + VigilanceExtras.MOD_ID);
    }
}