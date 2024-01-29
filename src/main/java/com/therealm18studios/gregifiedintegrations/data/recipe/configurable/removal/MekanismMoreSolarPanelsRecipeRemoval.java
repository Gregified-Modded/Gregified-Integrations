package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

//TODO: All
public class MekanismMoreSolarPanelsRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.m.harderMekanismMoreSolarPanelsRecipes) harderMekanismMoreSolarPanelsRecipes(registry);
    }

    private static void harderMekanismMoreSolarPanelsRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("solarpanels:advanced_solar_panel"));
        registry.accept(new ResourceLocation("solarpanels:carbone_solar_element"));
        registry.accept(new ResourceLocation("solarpanels:hybrid_solar_panel"));
        registry.accept(new ResourceLocation("solarpanels:improved_energy_tablet"));
        registry.accept(new ResourceLocation("solarpanels:improved_hybrid_solar_element"));
        registry.accept(new ResourceLocation("solarpanels:light_absorbing_energy_tablet"));
        registry.accept(new ResourceLocation("solarpanels:light_absorbing_solar_element"));
        registry.accept(new ResourceLocation("solarpanels:light_absorbing_solar_panel"));
        registry.accept(new ResourceLocation("solarpanels:photonic_energy_tablet"));
        registry.accept(new ResourceLocation("solarpanels:photonic_solar_element"));
        registry.accept(new ResourceLocation("solarpanels:photonic_solar_panel"));
        registry.accept(new ResourceLocation("solarpanels:quantum_energy_tablet"));
        registry.accept(new ResourceLocation("solarpanels:quantum_solar_element"));
        registry.accept(new ResourceLocation("solarpanels:quantum_solar_panel"));
        registry.accept(new ResourceLocation("solarpanels:singular_energy_tablet"));
        registry.accept(new ResourceLocation("solarpanels:singular_solar_element"));
        registry.accept(new ResourceLocation("solarpanels:singular_solar_panel"));
        registry.accept(new ResourceLocation("solarpanels:spectral_energy_tablet"));
        registry.accept(new ResourceLocation("solarpanels:spectral_solar_element"));
        registry.accept(new ResourceLocation("solarpanels:spectral_solar_panel"));
        registry.accept(new ResourceLocation("solarpanels:ultimate_hybrid_solar_panel"));
    }
}