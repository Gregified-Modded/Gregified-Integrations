package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.recipes.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class ProductiveBeesRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.harderProductiveBeesRemoveRecipes) harderProductiveBeesRecipes(registry);
    }

    private static void harderProductiveBeesRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("productivebees:nests/acacia_wood_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/bamboo_hive"));
        registry.accept(new ResourceLocation("productivebees:nests/beehive"));
        registry.accept(new ResourceLocation("productivebees:nests/birch_wood_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/bumble_bee_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/cherry_wood_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/coarse_dirt_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/dark_oak_wood_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/dragon_egg_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/end_stone_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/glowstone_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/gravel_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/jungle_wood_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/mangrove_wood_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/nether_brick_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/nether_gold_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/nether_quartz_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/oak_wood_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/obsidian_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/sand_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/slimy_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/snow_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/soul_sand_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/spruce_wood_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/stone_nest"));
        registry.accept(new ResourceLocation("productivebees:nests/sugar_cane_nest"));
    }
}