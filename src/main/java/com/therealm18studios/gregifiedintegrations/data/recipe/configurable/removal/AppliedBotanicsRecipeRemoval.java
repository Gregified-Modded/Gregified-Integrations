package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class AppliedBotanicsRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.a.harderAppliedBotanicsRecipes) harderAppliedBotanicsRecipes(registry);
    }

    private static void harderAppliedBotanicsRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("appbot:fluix_mana_pool"));
        registry.accept(new ResourceLocation("appbot:mana_cell_housing"));
    }
}