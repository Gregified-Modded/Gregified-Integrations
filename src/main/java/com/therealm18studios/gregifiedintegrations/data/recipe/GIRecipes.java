package com.therealm18studios.gregifiedintegrations.data.recipe;

import com.therealm18studios.gregifiedintegrations.data.recipe.configurable.GIRecipeAddition;
import com.therealm18studios.gregifiedintegrations.data.recipe.configurable.GIRecipeRemoval;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class GIRecipes {

    public static void newInit(Consumer<FinishedRecipe> provider) {
        GIRecipeAddition.init(provider);
    }
    public static void removedInit(Consumer<ResourceLocation> provider) {
        GIRecipeRemoval.init(provider);
    }
}