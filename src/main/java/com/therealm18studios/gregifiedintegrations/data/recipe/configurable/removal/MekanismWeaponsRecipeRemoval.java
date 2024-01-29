package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class MekanismWeaponsRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.m.harderMekanismWeaponsRecipes) harderMekanismWeaponsRecipes(registry);
    }

    private static void harderMekanismWeaponsRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("mekaeapons:bow_limb"));
        registry.accept(new ResourceLocation("mekaeapons:bow_riser"));
        registry.accept(new ResourceLocation("mekaeapons:katana_blade"));
        registry.accept(new ResourceLocation("mekaeapons:magnetizer"));
        registry.accept(new ResourceLocation("mekaeapons:mekabow"));
        registry.accept(new ResourceLocation("mekaeapons:mekatana"));
        registry.accept(new ResourceLocation("mekaeapons:modular_arrowenergy_unit"));
        registry.accept(new ResourceLocation("mekaeapons:modular_arrowvelocity_unit"));
        registry.accept(new ResourceLocation("mekaeapons:modular_autofire_unit"));
        registry.accept(new ResourceLocation("mekaeapons:modular_drawspeed_unit"));
        registry.accept(new ResourceLocation("mekaeapons:modular_gravity_dampener_unit"));
    }
}