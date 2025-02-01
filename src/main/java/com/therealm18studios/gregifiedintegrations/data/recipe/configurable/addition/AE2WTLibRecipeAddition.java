package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.addition;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import appeng.core.definitions.AEParts;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import de.mari_023.ae2wtlib.AE2wtlib;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

public class AE2WTLibRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        harderAE2WTLibRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipesAdditions.a.harderAE2WTLibRecipes) harderAE2WTLibRecipes(provider);
    }

    private static void harderAE2WTLibRecipes(Consumer<FinishedRecipe> provider) {

        boolean nerfed = GIConfigHolder.INSTANCE.recipesAdditions.a.harderAE2WTLibRecipes;
        if (nerfed) {
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("ae2wtlib/magnet_card").inputItems(new ItemStack(AEItems.ADVANCED_CARD)).inputItems(new ItemStack(GTItems.ITEM_MAGNET_HV)).inputFluids(GTMaterials.SolderingAlloy.getFluid(GTValues.L / 2)).outputItems(new ItemStack(AE2wtlib.MAGNET_CARD)).duration(400).EUt(384).save(provider);
            GTRecipeTypes.ASSEMBLY_LINE_RECIPES.recipeBuilder("ae2wtlib/quantum_bridge_card").inputItems(new ItemStack(AEItems.ADVANCED_CARD)).inputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR, 8)).inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR, 8)).inputItems(new ItemStack(AEItems.LOGIC_PROCESSOR, 8)).inputItems(new ItemStack(GTItems.SENSOR_ZPM, 2)).inputItems(new ItemStack(GTItems.EMITTER_ZPM)).inputItems(new ItemStack(AEItems.SINGULARITY)).inputFluids(GTMaterials.SolderingAlloy.getFluid(GTValues.LV * 4608)).inputFluids(GTMaterials.HSSS.getFluid(GTValues.LV * 2304)).inputFluids(GTMaterials.Osmiridium.getFluid(GTValues.LV * 2304)).outputItems(new ItemStack(AE2wtlib.QUANTUM_BRIDGE_CARD)).duration(1000).EUt(98304).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("ae2wtlib/wireless_pattern_encoding_terminal").inputItems(new ItemStack(AEParts.PATTERN_ENCODING_TERMINAL)).inputItems(new ItemStack(AEItems.WIRELESS_RECEIVER)).inputItems(new ItemStack(AEBlocks.DENSE_ENERGY_CELL)).inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Titanium), 4).inputItems(new UnificationEntry(TagPrefix.screw, GTMaterials.Titanium), 8).inputFluids(GTMaterials.SolderingAlloy.getFluid(GTValues.L / 2)).outputItems(new ItemStack(AE2wtlib.PATTERN_ENCODING_TERMINAL)).duration(300).EUt(1536).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("ae2wtlib/wireless_pattern_access_terminal").inputItems(new ItemStack(AEParts.PATTERN_ACCESS_TERMINAL)).inputItems(new ItemStack(AEItems.WIRELESS_RECEIVER)).inputItems(new ItemStack(AEBlocks.DENSE_ENERGY_CELL)).inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Titanium), 4).inputItems(new UnificationEntry(TagPrefix.screw, GTMaterials.Titanium), 8).inputFluids(GTMaterials.SolderingAlloy.getFluid(GTValues.L / 2)).outputItems(new ItemStack(AE2wtlib.PATTERN_ACCESS_TERMINAL)).duration(300).EUt(1536).save(provider);
        } else {

        }
    }
}