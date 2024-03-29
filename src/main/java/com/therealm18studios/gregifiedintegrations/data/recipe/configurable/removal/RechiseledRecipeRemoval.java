package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class RechiseledRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.r.harderRechiseledRecipes) harderRechiseledRecipes(registry);
    }

    private static void harderRechiseledRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("rechiseled:chisel"));
    }
}