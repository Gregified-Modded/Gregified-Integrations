package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class ArsÉnergistiqueRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.a.harderArsÉnergistiqueRecipes) harderArsÉnergistiqueRecipes(registry);
    }

    private static void harderArsÉnergistiqueRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("arseng:cable_source_acceptor"));
        registry.accept(new ResourceLocation("arseng:source_acceptor"));
        registry.accept(new ResourceLocation("arseng:source_acceptor_from_part"));
        registry.accept(new ResourceLocation("arseng:source_cell_housing"));
    }
}