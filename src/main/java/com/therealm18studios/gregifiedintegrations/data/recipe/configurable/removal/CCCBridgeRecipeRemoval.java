package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class CCCBridgeRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.c.harderCCCBridgeRecipes) harderCCCBridgeRecipes(registry);
    }

    private static void harderCCCBridgeRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("cccbridge:animatronic_block"));
        registry.accept(new ResourceLocation("cccbridge:redrouter_block"));
        registry.accept(new ResourceLocation("cccbridge:scroller_block"));
        registry.accept(new ResourceLocation("cccbridge:source_block"));
        registry.accept(new ResourceLocation("cccbridge:to_source_block"));
        registry.accept(new ResourceLocation("cccbridge:to_target_block"));
    }
}