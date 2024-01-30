package com.therealm18studios.gregifiedintegrations.data.recipe;

import com.lowdragmc.lowdraglib.Platform;
import com.therealm18studios.gregifiedintegrations.data.recipe.configurable.addition.*;
import com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal.*;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class GIRecipes {

    public static void newInit(Consumer<FinishedRecipe> provider) {

        if (Platform.isModLoaded("ae2wtlib")) AE2WTLibRecipeAddition.init(provider);
        if (Platform.isModLoaded("ars_nouveau")) ArsNouveauRecipeAddition.init(provider);
        if (Platform.isModLoaded("biomesoplenty")) BiomesOPlentyRecipeAddition.init(provider);
        if (Platform.isModLoaded("computercraft")) CCTweakedRecipeAddition.init(provider);
        if (Platform.isModLoaded("chiselsandbits")) ChiselsAndBitsRecipeAddition.init(provider);
        if (Platform.isModLoaded("productivebees")) ProductiveBeesRecipeAddition.init(provider);
        if (Platform.isModLoaded("rechiseled")) RechiseledRecipeAddition.init(provider);
        if (Platform.isModLoaded("rechiseledcreate")) RechiseledCreateRecipeAddition.init(provider);
        if (Platform.isModLoaded("twilightforest")) TheTwilightForestRecipeAddition.init(provider);
    }
    public static void removedInit(Consumer<ResourceLocation> provider) {

        if (Platform.isModLoaded("ae2")) AppliedEnergistics2RecipeRemoval.init(provider);
        if (Platform.isModLoaded("ae2wtlib")) AE2WTLibRecipeRemoval.init(provider);
        if (Platform.isModLoaded("appbot")) AppliedBotanicsRecipeRemoval.init(provider);
        if (Platform.isModLoaded("appliedcooking")) AppliedCookingRecipeRemoval.init(provider);
        if (Platform.isModLoaded("appmek")) AppliedMekanisticsRecipeRemoval.init(provider);
        if (Platform.isModLoaded("ars_nouveau")) ArsNouveauRecipeRemoval.init(provider);
        if (Platform.isModLoaded("arseng")) ArsÉnergistiqueRecipeRemoval.init(provider);
        if (Platform.isModLoaded("assemblyline")) AssemblyLineRecipeRemoval.init(provider);
        if (Platform.isModLoaded("betterarcheology")) BetterArcheologyRecipeRemoval.init(provider);
        if (Platform.isModLoaded("biomesoplenty")) BiomesOPlentyRecipeRemoval.init(provider);
        if (Platform.isModLoaded("cccbridge")) CCCBridgeRecipeRemoval.init(provider);
        if (Platform.isModLoaded("chiselsandbits")) ChiselAndBitsRecipeRemoval.init(provider);
        if (Platform.isModLoaded("colony4cc")) MineColoniesForComputerCraftRecipeRemoval.init(provider);
        if (Platform.isModLoaded("computercraft")) CCTweakedRecipeRemoval.init(provider);
        if (Platform.isModLoaded("cookingforblockheads")) CookingForBlockheadsRecipeRemoval.init(provider);
        if (Platform.isModLoaded("mekaweapons")) MekanismWeaponsRecipeRemoval.init(provider);
        if (Platform.isModLoaded("merequester")) MERequesterRecipeRemoval.init(provider);
        if (Platform.isModLoaded("multipiston")) MultiPistonRecipeRemoval.init(provider);
        if (Platform.isModLoaded("minecolonies")) MineColoniesRecipeRemoval.init(provider);
        if (Platform.isModLoaded("productivebees")) ProductiveBeesRecipeRemoval.init(provider);
        if (Platform.isModLoaded("rechiseled")) RechiseledRecipeRemoval.init(provider);
        if (Platform.isModLoaded("rechiseledcreate")) RechiseledCreateRecipeRemoval.init(provider);
        if (Platform.isModLoaded("solarpanels")) MekanismMoreSolarPanelsRecipeRemoval.init(provider);
        if (Platform.isModLoaded("twilightforest")) TheTwilightForestRecipeRemoval.init(provider);
    }
}