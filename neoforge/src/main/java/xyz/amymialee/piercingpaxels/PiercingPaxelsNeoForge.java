package xyz.amymialee.piercingpaxels;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;

@Mod(PiercingPaxels.MOD_ID)
public final class PiercingPaxelsNeoForge {
    public PiercingPaxelsNeoForge() {
        PiercingPaxels.init();
        if (FMLEnvironment.dist == Dist.CLIENT) {
            PiercingPaxelsClient.init();
        }
    }
}
