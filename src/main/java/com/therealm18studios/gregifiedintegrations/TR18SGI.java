package com.therealm18studios.gregifiedintegrations;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TR18SGI.MODID)
public class TR18SGI
{
    public static final String MODID = "tr18sgi";

    public TR18SGI()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
