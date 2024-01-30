package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.addition;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import appeng.core.definitions.AEParts;
import biomesoplenty.api.block.BOPBlocks;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import de.mari_023.ae2wtlib.AE2wtlib;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

public class AppliedEnergistics2RecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        harderAE2WTLibRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipesAdditions.a.harderAE2WTLibRecipes) harderAE2WTLibRecipes(provider);
    }

    private static void harderAE2WTLibRecipes(Consumer<FinishedRecipe> provider) {

        boolean nerfed = GIConfigHolder.INSTANCE.recipesAdditions.a.harderAE2WTLibRecipes;
        if (nerfed) {
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("ae2/networking/wireless_terminal").inputItems(new ItemStack(AEParts.TERMINAL)).inputItems(new ItemStack(AEItems.WIRELESS_RECEIVER)).inputItems(new ItemStack(AEBlocks.DENSE_ENERGY_CELL)).inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Titanium), 4).inputItems(new UnificationEntry(TagPrefix.screw, GTMaterials.Titanium), 8).inputFluids(GTMaterials.SolderingAlloy.getFluid(GTValues.L / 2)).outputItems(new ItemStack(AEParts.CRAFTING_TERMINAL)).duration(300).EUt(1536).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("ae2/networking/wireless_crafting_terminal").inputItems(new ItemStack(AEParts.CRAFTING_TERMINAL)).inputItems(new ItemStack(AEItems.WIRELESS_RECEIVER)).inputItems(new ItemStack(AEBlocks.DENSE_ENERGY_CELL)).inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Titanium), 4).inputItems(new UnificationEntry(TagPrefix.screw, GTMaterials.Titanium), 8).inputFluids(GTMaterials.SolderingAlloy.getFluid(GTValues.L / 2)).outputItems(new ItemStack(AEParts.TERMINAL)).duration(300).EUt(1536).save(provider);
        } else {

        }
    }
}