package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class AppliedMekanisticsRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.a.harderAppliedMekanisticsRecipes) harderAppliedMekanisticsRecipes(registry);
    }

    private static void harderAppliedMekanisticsRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("appmek:chemical_cell_housing"));
    }
}