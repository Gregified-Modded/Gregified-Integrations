package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.recipes.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;
public class TheTwilightForestRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.harderTheTwilightForestRemoveRecipes) harderTheTwilightForestRecipes(registry);
    }

    private static void harderTheTwilightForestRecipes(Consumer<ResourceLocation> registry){
        registry.accept(new ResourceLocation("twilightforest:canopy_button"));
        registry.accept(new ResourceLocation("twilightforest:canopy_chest"));
        registry.accept(new ResourceLocation("twilightforest:canopy_door"));
        registry.accept(new ResourceLocation("twilightforest:canopy_fence"));
        registry.accept(new ResourceLocation("twilightforest:canopy_fence_gate"));
        registry.accept(new ResourceLocation("twilightforest:canopy_planks"));
        registry.accept(new ResourceLocation("twilightforest:canopy_pressure_plate"));
        registry.accept(new ResourceLocation("twilightforest:canopy_trapdoor"));
        registry.accept(new ResourceLocation("twilightforest:dark_button"));
        registry.accept(new ResourceLocation("twilightforest:dark_chest"));
        registry.accept(new ResourceLocation("twilightforest:dark_door"));
        registry.accept(new ResourceLocation("twilightforest:dark_fence"));
        registry.accept(new ResourceLocation("twilightforest:dark_fence_gate"));
        registry.accept(new ResourceLocation("twilightforest:dark_planks"));
        registry.accept(new ResourceLocation("twilightforest:dark_pressure_plate"));
        registry.accept(new ResourceLocation("twilightforest:dark_trapdoor"));
        registry.accept(new ResourceLocation("twilightforest:mangrove_button"));
        registry.accept(new ResourceLocation("twilightforest:mangrove_chest"));
        registry.accept(new ResourceLocation("twilightforest:mangrove_door"));
        registry.accept(new ResourceLocation("twilightforest:mangrove_fence"));
        registry.accept(new ResourceLocation("twilightforest:mangrove_fence_gate"));
        registry.accept(new ResourceLocation("twilightforest:mangrove_planks"));
        registry.accept(new ResourceLocation("twilightforest:mangrove_pressure_plate"));
        registry.accept(new ResourceLocation("twilightforest:mangrove_trapdoor"));
        registry.accept(new ResourceLocation("twilightforest:mining_button"));
        registry.accept(new ResourceLocation("twilightforest:mining_chest"));
        registry.accept(new ResourceLocation("twilightforest:mining_door"));
        registry.accept(new ResourceLocation("twilightforest:mining_fence"));
        registry.accept(new ResourceLocation("twilightforest:mining_fence_gate"));
        registry.accept(new ResourceLocation("twilightforest:mining_planks"));
        registry.accept(new ResourceLocation("twilightforest:mining_pressure_plate"));
        registry.accept(new ResourceLocation("twilightforest:mining_trapdoor"));
        registry.accept(new ResourceLocation("twilightforest:sorting_button"));
        registry.accept(new ResourceLocation("twilightforest:sorting_chest"));
        registry.accept(new ResourceLocation("twilightforest:sorting_door"));
        registry.accept(new ResourceLocation("twilightforest:sorting_fence"));
        registry.accept(new ResourceLocation("twilightforest:sorting_fence_gate"));
        registry.accept(new ResourceLocation("twilightforest:sorting_planks"));
        registry.accept(new ResourceLocation("twilightforest:sorting_pressure_plate"));
        registry.accept(new ResourceLocation("twilightforest:sorting_trapdoor"));
        registry.accept(new ResourceLocation("twilightforest:time_button"));
        registry.accept(new ResourceLocation("twilightforest:time_chest"));
        registry.accept(new ResourceLocation("twilightforest:time_door"));
        registry.accept(new ResourceLocation("twilightforest:time_fence"));
        registry.accept(new ResourceLocation("twilightforest:time_fence_gate"));
        registry.accept(new ResourceLocation("twilightforest:time_planks"));
        registry.accept(new ResourceLocation("twilightforest:time_pressure_plate"));
        registry.accept(new ResourceLocation("twilightforest:time_trapdoor"));
        registry.accept(new ResourceLocation("twilightforest:transformation_button"));
        registry.accept(new ResourceLocation("twilightforest:transformation_chest"));
        registry.accept(new ResourceLocation("twilightforest:transformation_door"));
        registry.accept(new ResourceLocation("twilightforest:transformation_fence"));
        registry.accept(new ResourceLocation("twilightforest:transformation_fence_gate"));
        registry.accept(new ResourceLocation("twilightforest:transformation_planks"));
        registry.accept(new ResourceLocation("twilightforest:transformation_pressure_plate"));
        registry.accept(new ResourceLocation("twilightforest:transformation_trapdoor"));
        registry.accept(new ResourceLocation("twilightforest:twilight_oak_button"));
        registry.accept(new ResourceLocation("twilightforest:twilight_oak_chest"));
        registry.accept(new ResourceLocation("twilightforest:twilight_oak_door"));
        registry.accept(new ResourceLocation("twilightforest:twilight_oak_fence"));
        registry.accept(new ResourceLocation("twilightforest:twilight_oak_fence_gate"));
        registry.accept(new ResourceLocation("twilightforest:twilight_oak_planks"));
        registry.accept(new ResourceLocation("twilightforest:twilight_oak_pressure_plate"));
        registry.accept(new ResourceLocation("twilightforest:twilight_oak_trapdoor"));
    }
}