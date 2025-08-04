package ho.artisan.fs.mixin;

import net.minecraft.enchantment.FireAspectEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FireAspectEnchantment.class)
public class FireAspectMixin {

    @Inject(method = "getMaxLevel", at = @At(value = "HEAD"), cancellable = true)
    void maxLevel(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(5);
    }
}
