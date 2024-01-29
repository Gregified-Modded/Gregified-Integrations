package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class MERequesterRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.m.harderMERequesterRecipes) harderMERequesterRecipes(registry);
    }

    private static void harderMERequesterRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("merequester:requester"));
        registry.accept(new ResourceLocation("merequester:requester_terminal"));
    }
}