package net.z3rodown.vigilancextras.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.village.raid.Raid;
import net.minecraft.world.Difficulty;

public class Ominous extends StatusEffect {
    public Ominous(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof ServerPlayerEntity serverPlayerEntity && !serverPlayerEntity.isSpectator()) {
            ServerWorld serverWorld = serverPlayerEntity.getServerWorld();
            if (serverWorld.getDifficulty() != Difficulty.PEACEFUL && serverWorld.isNearOccupiedPointOfInterest(serverPlayerEntity.getBlockPos())) {
                Raid raid = serverWorld.getRaidAt(serverPlayerEntity.getBlockPos());
                if (raid == null || raid.getBadOmenLevel() < raid.getMaxAcceptableBadOmenLevel()) {
                    serverPlayerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.RAID_OMEN, 600, amplifier));
                    serverPlayerEntity.setStartRaidPos(serverPlayerEntity.getBlockPos());
                    return false;
                }
            }
        }

        return super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
