package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.recipes.addition;

import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.supermartijn642.rechiseled.create.RechiseledCreate;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

public class RechiseledCreateRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        harderRechiseledCreateRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipesAdditions.harderRechiseledCreateAddRecipes) harderRechiseledCreateRecipes(provider);
    }

    private static void harderRechiseledCreateRecipes(Consumer<FinishedRecipe> provider) {

        boolean nerfed = GIConfigHolder.INSTANCE.recipesAdditions.harderRechiseledCreateAddRecipes;
        if (nerfed) {
//            VanillaRecipeHelper.addShapedRecipe(provider, "chisel", new ItemStack(RechiseledCreate.mechanical_chisel.getClass().get()), "sP", 'P', BlockRegistry.ARCHWOOD_PLANK);
        } else {

        }
    }
}