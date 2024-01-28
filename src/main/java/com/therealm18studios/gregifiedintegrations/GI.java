package com.therealm18studios.gregifiedintegrations;

import com.therealm18studios.gregifiedintegrations.api.registries.GIRegistries;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import com.therealm18studios.gregifiedintegrations.data.GIDataGen;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Mod(GI.MOD_ID)
public class GI {
    public static final String
            MOD_ID = "tr18sgi",
            NAME = "Gregified Integration";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    public GI() {
        GI.init();
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);
    }

    public static void init() {
        GIConfigHolder.init();

        GIDataGen.init();

        GIRegistries.REGISTRATE.registerRegistrate();
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}