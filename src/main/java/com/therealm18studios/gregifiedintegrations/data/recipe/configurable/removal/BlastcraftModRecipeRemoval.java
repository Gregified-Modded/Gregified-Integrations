package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

//TODO: All
public class BlastcraftModRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.b.harderBlastcraftModRecipes) harderBlastcraftModRecipes(registry);
    }

    private static void harderBlastcraftModRecipes(Consumer<ResourceLocation> registry) {
//        registry.accept(new ResourceLocation("ae2wtlib:magnet_card"));
    }
}