package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

//TODO: All
public class MultiPistonRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.m.harderMultiPistonRecipes) harderMultiPistonRecipes(registry);
    }

    private static void harderMultiPistonRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("multipiston:multiblock"));
    }
}