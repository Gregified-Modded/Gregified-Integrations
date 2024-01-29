package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class AppliedCookingRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.a.harderAppliedCookingRecipes) harderAppliedCookingRecipes(registry);
    }

    private static void harderAppliedCookingRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("appliedcooking:kitchen_station"));
    }
}