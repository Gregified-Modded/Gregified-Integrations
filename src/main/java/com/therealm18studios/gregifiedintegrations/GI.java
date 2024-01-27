package com.therealm18studios.gregifiedintegrations;

import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialRegistryEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.PostMaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.config.ConfigHolder;
import com.therealm18studios.gregifiedintegrations.api.registries.GIRegistries;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import com.therealm18studios.gregifiedintegrations.data.GIDataGen;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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
    public static MaterialRegistry MATERIAL_REGISTRY;

    public GI() {
        GI.init();
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);
    }

    public static void init() {
        ConfigHolder.init(); // Forcefully init GT config because fabric doesn't allow dependents to load after dependencies
        GIConfigHolder.init();

        GIDataGen.init();

        GIRegistries.REGISTRATE.registerRegistrate();
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    @SubscribeEvent
    public void registerClientReloadListeners(RegisterClientReloadListenersEvent event) {
    }

    @SubscribeEvent
    public void registerMaterialRegistry(MaterialRegistryEvent event) {
    }

    @SubscribeEvent
    public void registerMaterials(MaterialEvent event) {
    }

    @SubscribeEvent
    public void modifyMaterials(PostMaterialEvent event) {
    }
}