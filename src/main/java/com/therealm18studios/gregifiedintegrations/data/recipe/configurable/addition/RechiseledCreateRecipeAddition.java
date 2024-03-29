package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.addition;

import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.supermartijn642.rechiseled.Rechiseled;
import com.supermartijn642.rechiseled.create.RechiseledCreate;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import com.therealm18studios.gregifiedintegrations.data.tags.GregTechCEuTags;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

public class RechiseledCreateRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        harderRechiseledCreateRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipesAdditions.r.harderRechiseledCreateRecipes) harderRechiseledCreateRecipes(provider);
    }

    private static void harderRechiseledCreateRecipes(Consumer<FinishedRecipe> provider) {

        boolean nerfed = GIConfigHolder.INSTANCE.recipesAdditions.r.harderRechiseledCreateRecipes;
        if (nerfed) {
            VanillaRecipeHelper.addShapedRecipe(provider, "rechiseledcreate/mechanical_chisel", new ItemStack(RechiseledCreate.mechanical_chisel), "ABC", "DED", 'A', GTItems.CONVEYOR_MODULE_LV, 'B', GTBlocks.MACHINE_CASING_LV, 'C', GTItems.ELECTRIC_MOTOR_LV, 'D', GregTechCEuTags.ModTags.GTCEU_CIRCUITS_LV, 'E', Rechiseled.chisel);
        } else {

        }
    }
}