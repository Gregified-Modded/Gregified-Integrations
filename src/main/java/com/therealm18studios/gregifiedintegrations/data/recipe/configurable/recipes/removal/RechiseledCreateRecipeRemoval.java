package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.recipes.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class RechiseledCreateRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.harderRechiseledCreateRemoveRecipes) harderRechiseledCreateRecipes(registry);
    }

    private static void harderRechiseledCreateRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("rechiseledcreate:mechanical_chisel"));
    }
}