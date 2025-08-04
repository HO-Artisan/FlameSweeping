package ho.artisan.fs.mixin;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class EntityHurtMixin {
    @Shadow public abstract boolean isAlive();

    @Inject(method = "damage", at = @At(value = "HEAD"))
    void damage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        Entity entity = source.getAttacker();
        if (entity instanceof PlayerEntity player) {
            int k = EnchantmentHelper.getFireAspect(player);
            if (k > 0 && this.isAlive()) {
                ((Entity)(Object)this).setOnFireFor(k * 4);
            }
        }
    }
}
