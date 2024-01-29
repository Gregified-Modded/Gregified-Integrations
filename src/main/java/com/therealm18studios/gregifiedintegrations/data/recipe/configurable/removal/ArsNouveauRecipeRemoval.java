package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class ArsNouveauRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.a.harderArsNouveauRecipes) harderArsNouveauRecipes(registry);
    }

    private static void harderArsNouveauRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("ars_nouveau:archwood_button"));
        registry.accept(new ResourceLocation("ars_nouveau:archwood_chest"));
        registry.accept(new ResourceLocation("ars_nouveau:archwood_door"));
        registry.accept(new ResourceLocation("ars_nouveau:archwood_fence"));
        registry.accept(new ResourceLocation("ars_nouveau:archwood_fence_gate"));
        registry.accept(new ResourceLocation("ars_nouveau:archwood_planks"));
        registry.accept(new ResourceLocation("ars_nouveau:archwood_pressure_plate"));
        registry.accept(new ResourceLocation("ars_nouveau:archwood_trapdoor"));
    }
}