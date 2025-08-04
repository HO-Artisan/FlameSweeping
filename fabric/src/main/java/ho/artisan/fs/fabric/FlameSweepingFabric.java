package ho.artisan.fs.fabric;

import net.fabricmc.api.ModInitializer;

import ho.artisan.fs.FlameSweeping;

public final class FlameSweepingFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        FlameSweeping.init();
    }
}
