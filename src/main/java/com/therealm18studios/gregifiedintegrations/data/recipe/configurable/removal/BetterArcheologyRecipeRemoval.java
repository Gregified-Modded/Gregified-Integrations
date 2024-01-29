package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class BetterArcheologyRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.b.harderBetterArcheologyRecipes) harderBetterArcheologyRecipes(registry);
    }

    private static void harderBetterArcheologyRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("betterarcheology:archeology_table"));
        registry.accept(new ResourceLocation("betterarcheology:chicken_fossil"));
        registry.accept(new ResourceLocation("betterarcheology:cracked_mud_brick_slabs"));
        registry.accept(new ResourceLocation("betterarcheology:cracked_mud_brick_slabs_stonecutting"));
        registry.accept(new ResourceLocation("betterarcheology:cracked_mud_brick_stairs"));
        registry.accept(new ResourceLocation("betterarcheology:cracked_mud_brick_stairs_stonecutting"));
        registry.accept(new ResourceLocation("betterarcheology:cracked_mud_brick"));
        registry.accept(new ResourceLocation("betterarcheology:creeper_fossil"));
        registry.accept(new ResourceLocation("betterarcheology:diamond_brush"));
        registry.accept(new ResourceLocation("betterarcheology:guardian_fossil"));
        registry.accept(new ResourceLocation("betterarcheology:iron_brush"));
        registry.accept(new ResourceLocation("betterarcheology:ocelot_fossil"));
        registry.accept(new ResourceLocation("betterarcheology:rotten_door"));
        registry.accept(new ResourceLocation("betterarcheology:rotten_fence"));
        registry.accept(new ResourceLocation("betterarcheology:rotten_fence_gate"));
        registry.accept(new ResourceLocation("betterarcheology:rotten_slabs"));
        registry.accept(new ResourceLocation("betterarcheology:rotten_stairs"));
        registry.accept(new ResourceLocation("betterarcheology:rotten_trapdoor"));
        registry.accept(new ResourceLocation("betterarcheology:sheep_fossil"));
        registry.accept(new ResourceLocation("betterarcheology:unidentified_artifact"));
        registry.accept(new ResourceLocation("betterarcheology:villager_fossil"));
        registry.accept(new ResourceLocation("betterarcheology:wolf_fossil"));
    }
}