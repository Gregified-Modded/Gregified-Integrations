package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.addition;

import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.supermartijn642.rechiseled.Rechiseled;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

public class RechiseledRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        harderRechiseledRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipesAdditions.r.harderRechiseledRecipes) harderRechiseledRecipes(provider);
    }

    private static void harderRechiseledRecipes(Consumer<FinishedRecipe> provider) {

        boolean nerfed = GIConfigHolder.INSTANCE.recipesAdditions.r.harderRechiseledRecipes;
        if (nerfed) {
            VanillaRecipeHelper.addShapedRecipe(provider, "rechiseled/chisel", new ItemStack(Rechiseled.chisel), " P", "S ", 'P', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.WroughtIron), 'S', Items.STICK);
        } else {

        }
    }
}