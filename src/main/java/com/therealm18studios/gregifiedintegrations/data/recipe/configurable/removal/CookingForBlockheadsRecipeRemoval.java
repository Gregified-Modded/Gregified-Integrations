package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class CookingForBlockheadsRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.c.harderCookingForBlockheadsRecipes) harderCookingForBlockheadsRecipes(registry);
    }

    private static void harderCookingForBlockheadsRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("cookingforblockheads:black_kitchen_floor"));
        registry.accept(new ResourceLocation("cookingforblockheads:blue_kitchen_floor"));
        registry.accept(new ResourceLocation("cookingforblockheads:brown_kitchen_floor"));
        registry.accept(new ResourceLocation("cookingforblockheads:cooking_table"));
        registry.accept(new ResourceLocation("cookingforblockheads:crafting_book"));
        registry.accept(new ResourceLocation("cookingforblockheads:cyan_kitchen_floor"));
        registry.accept(new ResourceLocation("cookingforblockheads:fridge"));
        registry.accept(new ResourceLocation("cookingforblockheads:fruit_basket"));
        registry.accept(new ResourceLocation("cookingforblockheads:gray_kitchen_floor"));
        registry.accept(new ResourceLocation("cookingforblockheads:green_kitchen_floor"));
        registry.accept(new ResourceLocation("cookingforblockheads:hanging_corner"));
        registry.accept(new ResourceLocation("cookingforblockheads:heating_unit"));
        registry.accept(new ResourceLocation("cookingforblockheads:ice_unit"));
        registry.accept(new ResourceLocation("cookingforblockheads:kitchen_cabinet"));
        registry.accept(new ResourceLocation("cookingforblockheads:kitchen_corner"));
        registry.accept(new ResourceLocation("cookingforblockheads:kitchen_counter"));
        registry.accept(new ResourceLocation("cookingforblockheads:kitchen_floor"));
        registry.accept(new ResourceLocation("cookingforblockheads:kitchen_floor_concrete"));
        registry.accept(new ResourceLocation("cookingforblockheads:light_blue_kitchen_floor"));
        registry.accept(new ResourceLocation("cookingforblockheads:light_gray_kitchen_floor"));
        registry.accept(new ResourceLocation("cookingforblockheads:lime_kitchen_floor"));
        registry.accept(new ResourceLocation("cookingforblockheads:magenta_kitchen_floor"));
        registry.accept(new ResourceLocation("cookingforblockheads:milk_jar"));
        registry.accept(new ResourceLocation("cookingforblockheads:no_filter_edition"));
        registry.accept(new ResourceLocation("cookingforblockheads:orange_kitchen_floor"));
        registry.accept(new ResourceLocation("cookingforblockheads:oven"));
        registry.accept(new ResourceLocation("cookingforblockheads:pink_kitchen_floor"));
        registry.accept(new ResourceLocation("cookingforblockheads:preservation_chamber"));
        registry.accept(new ResourceLocation("cookingforblockheads:purple_kitchen_floor"));
        registry.accept(new ResourceLocation("cookingforblockheads:recipe_book_smelting"));
        registry.accept(new ResourceLocation("cookingforblockheads:recipe_book_smelting_from_nofilter"));
        registry.accept(new ResourceLocation("cookingforblockheads:red_kitchen_floor"));
        registry.accept(new ResourceLocation("cookingforblockheads:sink"));
        registry.accept(new ResourceLocation("cookingforblockheads:spice_rack"));
        registry.accept(new ResourceLocation("cookingforblockheads:toaster"));
        registry.accept(new ResourceLocation("cookingforblockheads:tool_rack"));
        registry.accept(new ResourceLocation("cookingforblockheads:yellow_kitchen_floor"));
    }
}