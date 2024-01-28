package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.recipes.addition;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class RechiseledCreateRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        harderRechiseledCreateRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipesAdditions.harderRechiseledCreateAddRecipes) harderRechiseledCreateRecipes(provider);
    }

    private static void harderRechiseledCreateRecipes(Consumer<FinishedRecipe> provider) {

//        boolean nerfed = GIConfigHolder.INSTANCE.recipes.harderRechiseledCreateRecipes;
//        if (nerfed) {
//            VanillaRecipeHelper.addShapedRecipe(provider, "chisel", new ItemStack(Rechiseled.chisel), "sP", 'P', BlockRegistry.ARCHWOOD_PLANK);
//        } else {
//
//        }
    }
}