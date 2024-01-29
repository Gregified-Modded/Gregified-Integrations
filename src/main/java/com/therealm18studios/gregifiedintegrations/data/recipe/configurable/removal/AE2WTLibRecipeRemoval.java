package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class AE2WTLibRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.a.harderAE2WTLibRecipes) harderAE2WTLibRecipes(registry);
    }

    private static void harderAE2WTLibRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("ae2wtlib:magnet_card"));
        registry.accept(new ResourceLocation("ae2wtlib:quantum_bridge_card"));
        registry.accept(new ResourceLocation("ae2wtlib:pattern_accesss/wireless_pattern_access_terminal"));
        registry.accept(new ResourceLocation("ae2wtlib:pattern_encoding/upgrade_wireless_pattern_eencoding_terminal"));
        registry.accept(new ResourceLocation("ae2wtlib:pattern_encoding/wireless_pattern_encoding_terminal"));
    }
}