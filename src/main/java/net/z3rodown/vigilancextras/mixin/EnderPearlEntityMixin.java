package net.z3rodown.vigilancextras.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.item.ItemStack;
import net.z3rodown.vigilancextras.item.ModItems;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Debug(export = true)
@Mixin(EnderPearlEntity.class)
public class EnderPearlEntityMixin {

    @Redirect(method  = "onCollision",
        at = @At(value = "INVOKE",
                target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/entity/damage/DamageSource;F)Z"))

        public boolean entity(Entity instance, DamageSource source, float amount) {
        if (instance instanceof PlayerEntity player) {
            ItemStack mainHandStack = player.getMainHandStack();

            if (mainHandStack.isOf(ModItems.ENDER_SWORD)) {
                return false;
            }
        }
        return instance.damage(source, amount);
    }
}