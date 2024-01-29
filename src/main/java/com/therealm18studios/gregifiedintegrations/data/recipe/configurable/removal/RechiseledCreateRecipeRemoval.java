package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class RechiseledCreateRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.r.harderRechiseledCreateRecipes) harderRechiseledCreateRecipes(registry);
    }

    private static void harderRechiseledCreateRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("rechiseledcreate:mechanical_chisel"));
    }
}