package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.addition;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import cy.jdkdigital.productivebees.init.ModBlocks;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class ProductiveBeesRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        harderProductiveBeesRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipesAdditions.harderProductiveBeesAddRecipes) harderProductiveBeesRecipes(provider);
    }

    private static void harderProductiveBeesRecipes(Consumer<FinishedRecipe> provider) {

        boolean nerfed = GIConfigHolder.INSTANCE.recipesAdditions.harderProductiveBeesAddRecipes;
        if (nerfed) {
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/acacia_wood_nest").inputItems(new ItemStack(Blocks.ACACIA_WOOD,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.ACACIA_WOOD_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/bamboo_nest").inputItems(new ItemStack(Blocks.BAMBOO_BLOCK,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.BAMBOO_HIVE).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/beehive_nest").inputItems(new ItemStack(Blocks.BEEHIVE,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(Blocks.BEE_NEST.asItem()).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/birch_wood_nest").inputItems(new ItemStack(Blocks.BIRCH_WOOD,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.BIRCH_WOOD_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/bumble_bee_nest").inputItems(new ItemStack(Blocks.BEE_NEST,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.BUMBLE_BEE_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/cherry_wood_nest").inputItems(new ItemStack(Blocks.CHERRY_WOOD,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.CHERRY_WOOD_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/coarse_dirt_nest").inputItems(new ItemStack(Blocks.COARSE_DIRT,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.COARSE_DIRT_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/dark_oak_wood_nest").inputItems(new ItemStack(Blocks.DARK_OAK_WOOD,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.DARK_OAK_WOOD_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/dragon_egg_nest").inputItems(new ItemStack(Blocks.DRAGON_EGG,1)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.DRAGON_EGG_HIVE).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/end_stone_nest").inputItems(new ItemStack(Blocks.END_STONE,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.END_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/glowstone_nest").inputItems(new ItemStack(Blocks.GLOWSTONE,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.GLOWSTONE_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/gravel_nest").inputItems(new ItemStack(Blocks.GRAVEL,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.GRAVEL_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/jungle_wood_nest").inputItems(new ItemStack(Blocks.JUNGLE_WOOD,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.JUNGLE_WOOD_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/mangrove_wood_nest").inputItems(new ItemStack(Blocks.MANGROVE_WOOD,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.MANGROVE_WOOD_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/nether_brick_nest").inputItems(new ItemStack(Blocks.NETHER_BRICKS,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.NETHER_BRICK_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/nether_gold_nest").inputItems(new ItemStack(Blocks.NETHER_GOLD_ORE,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.NETHER_GOLD_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/nether_quartz_nest").inputItems(new ItemStack(Blocks.NETHER_QUARTZ_ORE,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.NETHER_QUARTZ_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/oak_wood_nest").inputItems(new ItemStack(Blocks.OAK_WOOD,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.OAK_WOOD_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/obsidian_nest").inputItems(new ItemStack(Blocks.OBSIDIAN,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.OBSIDIAN_PILLAR_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/sand_nest").inputItems(new ItemStack(Blocks.SAND,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.SAND_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/slimy_nest").inputItems(new ItemStack(Blocks.SLIME_BLOCK,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.SLIMY_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/snow_nest").inputItems(new ItemStack(Blocks.SNOW_BLOCK,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.SNOW_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/soul_sand_nest").inputItems(new ItemStack(Blocks.SOUL_SAND,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.SOUL_SAND_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/spruce_nest").inputItems(new ItemStack(Blocks.SPRUCE_WOOD,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.SPRUCE_WOOD_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/stone_nest").inputItems(new ItemStack(Blocks.STONE,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.STONE_NEST).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("nests/sugar_cane_nest").inputItems(new ItemStack(Blocks.SUGAR_CANE,64)).inputFluids(GTMaterials.Oxygen.getFluid(GTValues.LV * 1000)).outputItems(ModBlocks.SUGAR_CANE_NEST).duration(400).EUt(4).save(provider);
        } else {

        }
    }
}