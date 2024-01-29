package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class MineColoniesForComputerCraftRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.m.harderMineColoniesForComputerCraftRecipes) harderMineColoniesForComputerCraftRecipes(registry);
    }

    private static void harderMineColoniesForComputerCraftRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("colony4cc:colony_peripheral"));
        registry.accept(new ResourceLocation("colony4cc:colony_wireless_advanced"));
        registry.accept(new ResourceLocation("colony4cc:colony_wireless_normal"));
    }
}