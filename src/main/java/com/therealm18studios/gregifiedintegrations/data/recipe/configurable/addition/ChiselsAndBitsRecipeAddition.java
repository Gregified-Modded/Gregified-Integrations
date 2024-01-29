package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.addition;


import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import mod.chiselsandbits.registrars.ModItems;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

public class ChiselsAndBitsRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        harderChiselAndBitsRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipesAdditions.c.harderChiselAndBitsRecipes) harderChiselAndBitsRecipes(provider);
    }

    private static void harderChiselAndBitsRecipes(Consumer<FinishedRecipe> provider) {

        boolean nerfed = GIConfigHolder.INSTANCE.recipesAdditions.c.harderChiselAndBitsRecipes;
        if (nerfed) {
            VanillaRecipeHelper.addShapedRecipe(provider, "chiselsandbits/chisel_stone", new ItemStack(ModItems.ITEM_CHISEL_STONE.get()), " T", "S ", 'T', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.rodLong, GTMaterials.Potin));
            VanillaRecipeHelper.addShapedRecipe(provider, "chiselsandbits/chisel_iron", new ItemStack(ModItems.ITEM_CHISEL_IRON.get()), " T", "S ", 'T', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.IronMagnetic), 'S', new UnificationEntry(TagPrefix.rodLong, GTMaterials.Potin));
            VanillaRecipeHelper.addShapedRecipe(provider, "chiselsandbits/chisel_gold", new ItemStack(ModItems.ITEM_CHISEL_GOLD.get()), " T", "S ", 'T', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.RoseGold), 'S', new UnificationEntry(TagPrefix.rodLong, GTMaterials.Potin));
            VanillaRecipeHelper.addShapedRecipe(provider, "chiselsandbits/chisel_diamond", new ItemStack(ModItems.ITEM_CHISEL_DIAMOND.get()), " T", "S ", 'T', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.HastelloyC276), 'S', new UnificationEntry(TagPrefix.rodLong, GTMaterials.Potin));
            VanillaRecipeHelper.addShapedRecipe(provider, "chiselsandbits/chisel_netherite", new ItemStack(ModItems.ITEM_CHISEL_NETHERITE.get()), " T", "S ", 'T', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.NaquadahEnriched), 'S', new UnificationEntry(TagPrefix.rodLong, GTMaterials.Cupronickel));
        }
        else {

        }
    }
}