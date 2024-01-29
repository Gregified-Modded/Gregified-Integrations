package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class AssemblyLineRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.a.harderAssemblyLinesRecipes) harderAssemblyLinesRecipes(registry);
    }

    private static void harderAssemblyLinesRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("assemblyline:autocrafter"));
        registry.accept(new ResourceLocation("assemblyline:blockbreaker"));
        registry.accept(new ResourceLocation("assemblyline:blockplacer"));
        registry.accept(new ResourceLocation("assemblyline:conveyorbelt"));
        registry.accept(new ResourceLocation("assemblyline:crate_large"));
        registry.accept(new ResourceLocation("assemblyline:crate_medium"));
        registry.accept(new ResourceLocation("assemblyline:crate_small"));
        registry.accept(new ResourceLocation("assemblyline:detector"));
        registry.accept(new ResourceLocation("assemblyline:farmer"));
        registry.accept(new ResourceLocation("assemblyline:mobgrinder"));
        registry.accept(new ResourceLocation("assemblyline:rancher"));
        registry.accept(new ResourceLocation("assemblyline:sorterbelt"));
    }
}