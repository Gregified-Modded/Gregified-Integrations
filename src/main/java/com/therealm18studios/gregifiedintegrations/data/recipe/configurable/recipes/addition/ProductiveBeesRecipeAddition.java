package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.recipes.addition;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class ProductiveBeesRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        harderProductiveBeesRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipesAdditions.harderProductiveBeesAddRecipes) harderProductiveBeesRecipes(provider);
    }

    private static void harderProductiveBeesRecipes(Consumer<FinishedRecipe> provider) {

//        boolean nerfed = GIConfigHolder.INSTANCE.recipesAdditions.harderProductiveAddBeesRecipes;
//        if (nerfed) {
//            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("cherry_wood_nest").inputItems(new ItemStack(Blocks.CHERRY_LOG,6)).inputItems(new ItemStack(Blocks.CHERRY_WOOD,6)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.L / 9)).outputItems((Supplier<? extends ItemLike>) new FakeIngredient("productivebees:cherry_wood_nest")).duration(400).EUt(4).save(provider);
//        } else {
//
//        }
    }
}