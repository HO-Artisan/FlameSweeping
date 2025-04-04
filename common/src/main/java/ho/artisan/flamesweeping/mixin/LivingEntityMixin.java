package ho.artisan.flamesweeping.mixin;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.EntityDamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
    @Shadow
    public abstract boolean isAlive();

    @Inject(at = @At("HEAD"), method = "hurt")
    protected void hurt(DamageSource damageSource, float f, CallbackInfoReturnable<Boolean> cir) {
        if (damageSource instanceof EntityDamageSource entityDamageSource) {
            if (entityDamageSource.getEntity() instanceof LivingEntity livingEntity) {
                int fireAspectLevel = EnchantmentHelper.getFireAspect(livingEntity);
                if (fireAspectLevel > 0 && isAlive()) {
                    ((LivingEntity)(Object)this).setSecondsOnFire(fireAspectLevel * 4);
                }
            }
        }
    }
}
