package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

//TODO: All
public class MEGACellsRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.m.harderMEGACellsRecipes) harderMEGACellsRecipes(registry);
    }

    private static void harderMEGACellsRecipes(Consumer<ResourceLocation> registry) {
//        registry.accept(new ResourceLocation("ae2wtlib:magnet_card"));
    }
}