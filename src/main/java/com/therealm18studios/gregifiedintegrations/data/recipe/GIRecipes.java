package com.therealm18studios.gregifiedintegrations.data.recipe;

import com.therealm18studios.gregifiedintegrations.data.recipe.configurable.recipes.addition.*;
import com.therealm18studios.gregifiedintegrations.data.recipe.configurable.recipes.removal.*;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class GIRecipes {

    public static void newInit(Consumer<FinishedRecipe> provider) {

        ArsNouveauRecipeAddition.init(provider);
        BiomesOPlentyRecipeAddition.init(provider);
        CCTweakedRecipeAddition.init(provider);
        ProductiveBeesRecipeAddition.init(provider);
        TheTwilightForestRecipeAddition.init(provider);
    }
    public static void removedInit(Consumer<ResourceLocation> provider) {

        ArsNouveauRecipeRemoval.init(provider);
        BiomesOPlentyRecipeRemoval.init(provider);
        CCTweakedRecipeRemoval.init(provider);
        ProductiveBeesRecipeRemoval.init(provider);
        TheTwilightForestRecipeRemoval.init(provider);
    }
}