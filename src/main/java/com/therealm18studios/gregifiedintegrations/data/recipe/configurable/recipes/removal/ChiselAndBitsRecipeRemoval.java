package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.recipes.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class ChiselAndBitsRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.harderChiselAndBitsRemoveRecipes) harderChiselAndBitsRecipes(registry);
    }

    private static void harderChiselAndBitsRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("chiselsandbits:chisel_stone"));
        registry.accept(new ResourceLocation("chiselsandbits:chisel_iron"));
        registry.accept(new ResourceLocation("chiselsandbits:chisel_gold"));
        registry.accept(new ResourceLocation("chiselsandbits:chisel_diamond"));
        registry.accept(new ResourceLocation("chiselsandbits:chisel_netherite"));
    }
}