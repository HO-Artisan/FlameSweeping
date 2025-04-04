package ho.artisan.flamesweeping.fabric;

import ho.artisan.flamesweeping.FlameSweeping;
import net.fabricmc.api.ModInitializer;

public final class FlameSweepingFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        FlameSweeping.init();
    }
}
