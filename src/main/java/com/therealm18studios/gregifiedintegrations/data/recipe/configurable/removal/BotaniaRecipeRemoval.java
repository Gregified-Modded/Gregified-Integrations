package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

//TODO: All
public class BotaniaRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.b.harderBotaniaRecipes) harderBotaniaRecipes(registry);
    }

    private static void harderBotaniaRecipes(Consumer<ResourceLocation> registry) {
//        registry.accept(new ResourceLocation("ae2wtlib:magnet_card"));
    }
}