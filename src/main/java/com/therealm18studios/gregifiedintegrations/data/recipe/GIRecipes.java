package com.therealm18studios.gregifiedintegrations.data.recipe;

import com.lowdragmc.lowdraglib.Platform;
import com.therealm18studios.gregifiedintegrations.data.recipe.configurable.recipes.addition.*;
import com.therealm18studios.gregifiedintegrations.data.recipe.configurable.recipes.removal.*;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class GIRecipes {

    public static void newInit(Consumer<FinishedRecipe> provider) {

        if (Platform.isModLoaded("ars_nouveau")) ArsNouveauRecipeAddition.init(provider);
        if (Platform.isModLoaded("biomesoplenty")) BiomesOPlentyRecipeAddition.init(provider);
        if (Platform.isModLoaded("computercraft")) CCTweakedRecipeAddition.init(provider);
        if (Platform.isModLoaded("chiselsandbits")) ChiselAndBitsRecipeAddition.init(provider);
        if (Platform.isModLoaded("productivebees")) ProductiveBeesRecipeAddition.init(provider);
        if (Platform.isModLoaded("rechiseled")) RechiseledRecipeAddition.init(provider);
        if (Platform.isModLoaded("rechiseledcreate")) RechiseledCreateRecipeAddition.init(provider);
        if (Platform.isModLoaded("twilightforest")) TheTwilightForestRecipeAddition.init(provider);
    }
    public static void removedInit(Consumer<ResourceLocation> provider) {

        if (Platform.isModLoaded("ars_nouveau")) ArsNouveauRecipeRemoval.init(provider);
        if (Platform.isModLoaded("biomesoplenty")) BiomesOPlentyRecipeRemoval.init(provider);
        if (Platform.isModLoaded("computercraft")) CCTweakedRecipeRemoval.init(provider);
        if (Platform.isModLoaded("chiselsandbits")) ChiselAndBitsRecipeRemoval.init(provider);
        if (Platform.isModLoaded("productivebees")) ProductiveBeesRecipeRemoval.init(provider);
        if (Platform.isModLoaded("rechiseled")) RechiseledRecipeRemoval.init(provider);
        if (Platform.isModLoaded("rechiseledcreate")) RechiseledCreateRecipeRemoval.init(provider);
        if (Platform.isModLoaded("twilightforest")) TheTwilightForestRecipeRemoval.init(provider);
    }
}