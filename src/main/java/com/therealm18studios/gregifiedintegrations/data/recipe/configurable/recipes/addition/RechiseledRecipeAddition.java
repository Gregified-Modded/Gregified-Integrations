package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.recipes.addition;

import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.supermartijn642.rechiseled.ChiselItem;
import com.supermartijn642.rechiseled.Rechiseled;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

public class RechiseledRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        harderRechiseledRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipesAdditions.harderRechiseledAddRecipes) harderRechiseledRecipes(provider);
    }

    private static void harderRechiseledRecipes(Consumer<FinishedRecipe> provider) {

        boolean nerfed = GIConfigHolder.INSTANCE.recipesAdditions.harderRechiseledAddRecipes;
        if (nerfed) {
//            VanillaRecipeHelper.addShapedRecipe(provider, "chisel", new ItemStack(Rechiseled.registerItem), "sP", 'P', BlockRegistry.ARCHWOOD_PLANK);
        } else {

        }
    }
}