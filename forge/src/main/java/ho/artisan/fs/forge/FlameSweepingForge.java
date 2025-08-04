package ho.artisan.fs.forge;

import net.minecraftforge.fml.common.Mod;

import ho.artisan.fs.FlameSweeping;

@Mod(FlameSweeping.MOD_ID)
public final class FlameSweepingForge {
    public FlameSweepingForge() {
        // Run our common setup.
        FlameSweeping.init();
    }
}
