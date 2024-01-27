package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.recipes.addition;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.therealm18studios.gregifiedintegrations.GI;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import cy.jdkdigital.productivebees.ProductiveBees;
import cy.jdkdigital.productivebees.datagen.recipe.provider.MixingRecipeGenerator;
import cy.jdkdigital.productivebees.init.ModBlocks;
import cy.jdkdigital.productivebees.init.ModTags;
import cy.jdkdigital.productivebees.setup.HiveType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.crafting.ConditionalRecipe;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ProductiveBeesRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        harderProductiveBeesRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipes.harderProductiveBeesRecipes) harderProductiveBeesRecipes(provider);
    }

    private static void harderProductiveBeesRecipes(Consumer<FinishedRecipe> provider){

        boolean nerfed = GIConfigHolder.INSTANCE.recipes.harderProductiveBeesRecipes;
        if (nerfed) {
            var mixingRecipeBuilder = new MixingRecipeGenerator();

            ModBlocks.HIVELIST.forEach((modid, strings) -> {
                strings.forEach((name, type) -> {
                    name = modid.equals(ProductiveBees.MODID) ? name : modid + "_" + name;
                    buildHiveRecipe(modid, name, type, provider);
                });
            });

        }
        else {

        }
    }

    private static void buildHiveRecipe(String modid, String name, HiveType type, Consumer<FinishedRecipe> consumer) {
        Block hive = ModBlocks.HIVES.get("advanced_" + name + "_beehive").get();
        ConditionalRecipe.builder()
                .addRecipe(
                        GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(hive)
                                .inputItems((Ingredient) type.planks())
                                .inputItems(Ingredient.of(ModTags.Forge.HIVES))
                                .inputItems(Ingredient.of(ModTags.Forge.HONEYCOMBS))
                                .inputFluids(GTMaterials.Oxygen.getFluid(GTValues.L))
                                .outputItems((Supplier<? extends ItemLike>) hive)
                                ::save
                )
                .build(consumer, new ResourceLocation(GI.MOD_ID, "hives/advanced_" + name + "_beehive"));
    }
}