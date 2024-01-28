package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.recipes.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class BiomesOPlentyRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.harderBiomesOPlentyRemoveRecipes) harderBiomesOPlentyRecipes(registry);
    }

    private static void harderBiomesOPlentyRecipes(Consumer<ResourceLocation> registry){
        registry.accept(new ResourceLocation("biomesoplenty:dead_button"));
        registry.accept(new ResourceLocation("biomesoplenty:dead_chest"));
        registry.accept(new ResourceLocation("biomesoplenty:dead_door"));
        registry.accept(new ResourceLocation("biomesoplenty:dead_fence"));
        registry.accept(new ResourceLocation("biomesoplenty:dead_fence_gate"));
        registry.accept(new ResourceLocation("biomesoplenty:dead_planks"));
        registry.accept(new ResourceLocation("biomesoplenty:dead_pressure_plate"));
        registry.accept(new ResourceLocation("biomesoplenty:dead_trapdoor"));
        registry.accept(new ResourceLocation("biomesoplenty:fir_button"));
        registry.accept(new ResourceLocation("biomesoplenty:fir_chest"));
        registry.accept(new ResourceLocation("biomesoplenty:fir_door"));
        registry.accept(new ResourceLocation("biomesoplenty:fir_fence"));
        registry.accept(new ResourceLocation("biomesoplenty:fir_fence_gate"));
        registry.accept(new ResourceLocation("biomesoplenty:fir_planks"));
        registry.accept(new ResourceLocation("biomesoplenty:fir_pressure_plate"));
        registry.accept(new ResourceLocation("biomesoplenty:fir_trapdoor"));
        registry.accept(new ResourceLocation("biomesoplenty:hellbark_button"));
        registry.accept(new ResourceLocation("biomesoplenty:hellbark_chest"));
        registry.accept(new ResourceLocation("biomesoplenty:hellbark_door"));
        registry.accept(new ResourceLocation("biomesoplenty:hellbark_fence"));
        registry.accept(new ResourceLocation("biomesoplenty:hellbark_fence_gate"));
        registry.accept(new ResourceLocation("biomesoplenty:hellbark_planks"));
        registry.accept(new ResourceLocation("biomesoplenty:hellbark_pressure_plate"));
        registry.accept(new ResourceLocation("biomesoplenty:hellbark_trapdoor"));
        registry.accept(new ResourceLocation("biomesoplenty:jacaranda_button"));
        registry.accept(new ResourceLocation("biomesoplenty:jacaranda_chest"));
        registry.accept(new ResourceLocation("biomesoplenty:jacaranda_door"));
        registry.accept(new ResourceLocation("biomesoplenty:jacaranda_fence"));
        registry.accept(new ResourceLocation("biomesoplenty:jacaranda_fence_gate"));
        registry.accept(new ResourceLocation("biomesoplenty:jacaranda_planks"));
        registry.accept(new ResourceLocation("biomesoplenty:jacaranda_pressure_plate"));
        registry.accept(new ResourceLocation("biomesoplenty:jacaranda_trapdoor"));
        registry.accept(new ResourceLocation("biomesoplenty:magic_button"));
        registry.accept(new ResourceLocation("biomesoplenty:magic_chest"));
        registry.accept(new ResourceLocation("biomesoplenty:magic_door"));
        registry.accept(new ResourceLocation("biomesoplenty:magic_fence"));
        registry.accept(new ResourceLocation("biomesoplenty:magic_fence_gate"));
        registry.accept(new ResourceLocation("biomesoplenty:magic_planks"));
        registry.accept(new ResourceLocation("biomesoplenty:magic_pressure_plate"));
        registry.accept(new ResourceLocation("biomesoplenty:magic_trapdoor"));
        registry.accept(new ResourceLocation("biomesoplenty:mahogany_button"));
        registry.accept(new ResourceLocation("biomesoplenty:mahogany_chest"));
        registry.accept(new ResourceLocation("biomesoplenty:mahogany_door"));
        registry.accept(new ResourceLocation("biomesoplenty:mahogany_fence"));
        registry.accept(new ResourceLocation("biomesoplenty:mahogany_fence_gate"));
        registry.accept(new ResourceLocation("biomesoplenty:mahogany_planks"));
        registry.accept(new ResourceLocation("biomesoplenty:mahogany_pressure_plate"));
        registry.accept(new ResourceLocation("biomesoplenty:mahogany_trapdoor"));
        registry.accept(new ResourceLocation("biomesoplenty:palm_button"));
        registry.accept(new ResourceLocation("biomesoplenty:palm_chest"));
        registry.accept(new ResourceLocation("biomesoplenty:palm_door"));
        registry.accept(new ResourceLocation("biomesoplenty:palm_fence"));
        registry.accept(new ResourceLocation("biomesoplenty:palm_fence_gate"));
        registry.accept(new ResourceLocation("biomesoplenty:palm_planks"));
        registry.accept(new ResourceLocation("biomesoplenty:palm_pressure_plate"));
        registry.accept(new ResourceLocation("biomesoplenty:palm_trapdoor"));
        registry.accept(new ResourceLocation("biomesoplenty:redwood_button"));
        registry.accept(new ResourceLocation("biomesoplenty:redwood_chest"));
        registry.accept(new ResourceLocation("biomesoplenty:redwood_door"));
        registry.accept(new ResourceLocation("biomesoplenty:redwood_fence"));
        registry.accept(new ResourceLocation("biomesoplenty:redwood_fence_gate"));
        registry.accept(new ResourceLocation("biomesoplenty:redwood_planks"));
        registry.accept(new ResourceLocation("biomesoplenty:redwood_pressure_plate"));
        registry.accept(new ResourceLocation("biomesoplenty:redwood_trapdoor"));
        registry.accept(new ResourceLocation("biomesoplenty:umbran_button"));
        registry.accept(new ResourceLocation("biomesoplenty:umbran_chest"));
        registry.accept(new ResourceLocation("biomesoplenty:umbran_door"));
        registry.accept(new ResourceLocation("biomesoplenty:umbran_fence"));
        registry.accept(new ResourceLocation("biomesoplenty:umbran_fence_gate"));
        registry.accept(new ResourceLocation("biomesoplenty:umbran_planks"));
        registry.accept(new ResourceLocation("biomesoplenty:umbran_pressure_plate"));
        registry.accept(new ResourceLocation("biomesoplenty:umbran_trapdoor"));
        registry.accept(new ResourceLocation("biomesoplenty:willow_button"));
        registry.accept(new ResourceLocation("biomesoplenty:willow_chest"));
        registry.accept(new ResourceLocation("biomesoplenty:willow_door"));
        registry.accept(new ResourceLocation("biomesoplenty:willow_fence"));
        registry.accept(new ResourceLocation("biomesoplenty:willow_fence_gate"));
        registry.accept(new ResourceLocation("biomesoplenty:willow_planks"));
        registry.accept(new ResourceLocation("biomesoplenty:willow_pressure_plate"));
        registry.accept(new ResourceLocation("biomesoplenty:willow_trapdoor"));
    }
}