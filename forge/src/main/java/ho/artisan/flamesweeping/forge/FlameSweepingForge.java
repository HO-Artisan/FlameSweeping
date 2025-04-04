package ho.artisan.flamesweeping.forge;

import ho.artisan.flamesweeping.FlameSweeping;
import net.minecraftforge.fml.common.Mod;

@Mod(FlameSweeping.MOD_ID)
public final class FlameSweepingForge {
    public FlameSweepingForge() {
        FlameSweeping.init();
    }
}
