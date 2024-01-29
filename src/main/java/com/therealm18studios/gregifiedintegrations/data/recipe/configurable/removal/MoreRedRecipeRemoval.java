package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

//TODO: All
public class MoreRedRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.m.harderMoreRedRecipes) harderMoreRedRecipes(registry);
    }

    private static void harderMoreRedRecipes(Consumer<ResourceLocation> registry) {
//        registry.accept(new ResourceLocation("ae2wtlib:magnet_card"));
    }
}