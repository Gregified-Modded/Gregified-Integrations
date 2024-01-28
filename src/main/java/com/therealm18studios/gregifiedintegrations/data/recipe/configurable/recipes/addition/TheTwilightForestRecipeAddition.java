package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.recipes.addition;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import com.therealm18studios.gregifiedintegrations.data.tags.ForgeTags;
import com.therealm18studios.gregifiedintegrations.data.tags.TheTwilightForestTags;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import twilightforest.init.TFBlocks;
import twilightforest.init.TFItems;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.ULV;
import static com.gregtechceu.gtceu.api.GTValues.VA;

public class TheTwilightForestRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        harderTheTwilightForestRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipes.harderTheTwilightForestRecipes) harderTheTwilightForestRecipes(provider);
    }

    private static void harderTheTwilightForestRecipes(Consumer<FinishedRecipe> provider) {

        boolean nerfed = GIConfigHolder.INSTANCE.recipes.harderTheTwilightForestRecipes;
        if (nerfed) {
            VanillaRecipeHelper.addShapedRecipe(provider, "canopy_boat", new ItemStack(TFItems.CANOPY_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(TFBlocks.CANOPY_PLANKS.get()), 'S', new ItemStack(TFBlocks.CANOPY_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "canopy_button", new ItemStack(TFBlocks.CANOPY_BUTTON.get(), 6), "sP", 'P', TFBlocks.CANOPY_PLANKS.get());
            VanillaRecipeHelper.addShapedRecipe(provider, "canopy_chest", new ItemStack(TFBlocks.CANOPY_CHEST.get()), "FFF", "FCF", "FFF", 'F', TheTwilightForestTags.ModTags.TTF_CANOPY, 'C', ForgeTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "canopy_door", new ItemStack(TFBlocks.CANOPY_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(TFBlocks.CANOPY_PLANKS.get()), 'T', new ItemStack(TFBlocks.CANOPY_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "canopy_fence", new ItemStack(TFBlocks.CANOPY_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(TFBlocks.CANOPY_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "canopy_fence_gate", new ItemStack(TFBlocks.CANOPY_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.CANOPY_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "canopy_planks", new ItemStack(TFBlocks.CANOPY_PLANKS.get(), 2), "L", 'L', TheTwilightForestTags.ModTags.TTF_CANOPY);
            VanillaRecipeHelper.addShapedRecipe(provider, "canopy_pressure_plate", new ItemStack(TFBlocks.CANOPY_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', TFBlocks.CANOPY_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "canopy_trapdoor", new ItemStack(TFBlocks.CANOPY_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(TFBlocks.CANOPY_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("canopy_door").inputItems(new ItemStack(TFBlocks.CANOPY_TRAPDOOR.get())).inputItems(new ItemStack(TFBlocks.CANOPY_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.CANOPY_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("canopy_fence").inputItems(new ItemStack(TFBlocks.CANOPY_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.CANOPY_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("canopy_fence_gate").inputItems(new ItemStack(TFBlocks.CANOPY_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(TFBlocks.CANOPY_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("canopy_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(TFBlocks.CANOPY_SLAB.get(), 2)).outputItems(new ItemStack(TFBlocks.CANOPY_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("canopy_sign").inputItems(new ItemStack(TFBlocks.CANOPY_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(TFBlocks.CANOPY_SIGN.get(), 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("canopy_stairs").inputItems(new ItemStack(TFBlocks.CANOPY_PLANKS.get(), 6)).outputItems(new ItemStack(TFBlocks.CANOPY_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "dark_boat", new ItemStack(TFItems.DARK_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(TFBlocks.DARK_PLANKS.get()), 'S', new ItemStack(TFBlocks.DARK_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "dark_button", new ItemStack(TFBlocks.DARK_BUTTON.get(), 6), "sP", 'P', TFBlocks.DARK_PLANKS.get());
            VanillaRecipeHelper.addShapedRecipe(provider, "dark_chest", new ItemStack(TFBlocks.DARK_CHEST.get()), "FFF", "FCF", "FFF", 'F', TheTwilightForestTags.ModTags.TTF_DARK, 'C', ForgeTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "dark_door", new ItemStack(TFBlocks.DARK_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(TFBlocks.DARK_PLANKS.get()), 'T', new ItemStack(TFBlocks.DARK_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "dark_fence", new ItemStack(TFBlocks.DARK_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(TFBlocks.DARK_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "dark_fence_gate", new ItemStack(TFBlocks.DARK_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.DARK_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "dark_planks", new ItemStack(TFBlocks.DARK_PLANKS.get(), 2), "L", 'L', TheTwilightForestTags.ModTags.TTF_DARK);
            VanillaRecipeHelper.addShapedRecipe(provider, "dark_pressure_plate", new ItemStack(TFBlocks.DARK_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', TFBlocks.DARK_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "dark_trapdoor", new ItemStack(TFBlocks.DARK_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(TFBlocks.DARK_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dark_door").inputItems(new ItemStack(TFBlocks.DARK_TRAPDOOR.get())).inputItems(new ItemStack(TFBlocks.DARK_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.DARK_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dark_fence").inputItems(new ItemStack(TFBlocks.DARK_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.DARK_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dark_fence_gate").inputItems(new ItemStack(TFBlocks.DARK_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(TFBlocks.DARK_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dark_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(TFBlocks.DARK_SLAB.get(), 2)).outputItems(new ItemStack(TFBlocks.DARK_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dark_sign").inputItems(new ItemStack(TFBlocks.DARK_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(TFBlocks.DARK_SIGN.get(), 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dark_stairs").inputItems(new ItemStack(TFBlocks.DARK_PLANKS.get(), 6)).outputItems(new ItemStack(TFBlocks.DARK_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_boat", new ItemStack(TFItems.MANGROVE_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(TFBlocks.MANGROVE_PLANKS.get()), 'S', new ItemStack(TFBlocks.MANGROVE_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_button", new ItemStack(TFBlocks.MANGROVE_BUTTON.get(), 6), "sP", 'P', TFBlocks.MANGROVE_PLANKS.get());
            VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_chest", new ItemStack(TFBlocks.MANGROVE_CHEST.get()), "FFF", "FCF", "FFF", 'F', TheTwilightForestTags.ModTags.TTF_MANGROVE, 'C', ForgeTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_door", new ItemStack(TFBlocks.MANGROVE_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(TFBlocks.MANGROVE_PLANKS.get()), 'T', new ItemStack(TFBlocks.MANGROVE_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_fence", new ItemStack(TFBlocks.MANGROVE_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(TFBlocks.MANGROVE_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_fence_gate", new ItemStack(TFBlocks.MANGROVE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.MANGROVE_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_planks", new ItemStack(TFBlocks.MANGROVE_PLANKS.get(), 2), "L", 'L', TheTwilightForestTags.ModTags.TTF_MANGROVE);
            VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_pressure_plate", new ItemStack(TFBlocks.MANGROVE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', TFBlocks.MANGROVE_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_trapdoor", new ItemStack(TFBlocks.MANGROVE_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(TFBlocks.MANGROVE_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mangrove_door").inputItems(new ItemStack(TFBlocks.MANGROVE_TRAPDOOR.get())).inputItems(new ItemStack(TFBlocks.MANGROVE_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.MANGROVE_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mangrove_fence").inputItems(new ItemStack(TFBlocks.MANGROVE_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.MANGROVE_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mangrove_fence_gate").inputItems(new ItemStack(TFBlocks.MANGROVE_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(TFBlocks.MANGROVE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mangrove_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(TFBlocks.MANGROVE_SLAB.get(), 2)).outputItems(new ItemStack(TFBlocks.MANGROVE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mangrove_sign").inputItems(new ItemStack(TFBlocks.MANGROVE_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(TFBlocks.MANGROVE_SIGN.get(), 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mangrove_stairs").inputItems(new ItemStack(TFBlocks.MANGROVE_PLANKS.get(), 6)).outputItems(new ItemStack(TFBlocks.MANGROVE_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "mining_boat", new ItemStack(TFItems.MINING_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(TFBlocks.MINING_PLANKS.get()), 'S', new ItemStack(TFBlocks.MINING_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "mining_button", new ItemStack(TFBlocks.MINING_BUTTON.get(), 6), "sP", 'P', TFBlocks.MINING_PLANKS.get());
            VanillaRecipeHelper.addShapedRecipe(provider, "mining_chest", new ItemStack(TFBlocks.MINING_CHEST.get()), "FFF", "FCF", "FFF", 'F', TheTwilightForestTags.ModTags.TTF_MINING, 'C', ForgeTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "mining_door", new ItemStack(TFBlocks.MINING_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(TFBlocks.MINING_PLANKS.get()), 'T', new ItemStack(TFBlocks.MINING_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "mining_fence", new ItemStack(TFBlocks.MINING_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(TFBlocks.MINING_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "mining_fence_gate", new ItemStack(TFBlocks.MINING_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.MINING_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "mining_planks", new ItemStack(TFBlocks.MINING_PLANKS.get(), 2), "L", 'L', TheTwilightForestTags.ModTags.TTF_MINING);
            VanillaRecipeHelper.addShapedRecipe(provider, "mining_pressure_plate", new ItemStack(TFBlocks.MINING_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', TFBlocks.MINING_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "mining_trapdoor", new ItemStack(TFBlocks.MINING_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(TFBlocks.MINING_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mining_door").inputItems(new ItemStack(TFBlocks.MINING_TRAPDOOR.get())).inputItems(new ItemStack(TFBlocks.MINING_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.MINING_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mining_fence").inputItems(new ItemStack(TFBlocks.MINING_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.MINING_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mining_fence_gate").inputItems(new ItemStack(TFBlocks.MINING_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(TFBlocks.MINING_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mining_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(TFBlocks.MINING_SLAB.get(), 2)).outputItems(new ItemStack(TFBlocks.MINING_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mining_sign").inputItems(new ItemStack(TFBlocks.MINING_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(TFBlocks.MINING_SIGN.get(), 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mining_stairs").inputItems(new ItemStack(TFBlocks.MINING_PLANKS.get(), 6)).outputItems(new ItemStack(TFBlocks.MINING_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "sorting_boat", new ItemStack(TFItems.SORTING_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(TFBlocks.SORTING_PLANKS.get()), 'S', new ItemStack(TFBlocks.SORTING_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "sorting_button", new ItemStack(TFBlocks.SORTING_BUTTON.get(), 6), "sP", 'P', TFBlocks.SORTING_PLANKS.get());
            VanillaRecipeHelper.addShapedRecipe(provider, "sorting_chest", new ItemStack(TFBlocks.SORTING_CHEST.get()), "FFF", "FCF", "FFF", 'F', TheTwilightForestTags.ModTags.TTF_SORTING, 'C', ForgeTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "sorting_door", new ItemStack(TFBlocks.SORTING_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(TFBlocks.SORTING_PLANKS.get()), 'T', new ItemStack(TFBlocks.SORTING_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "sorting_fence", new ItemStack(TFBlocks.SORTING_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(TFBlocks.SORTING_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "sorting_fence_gate", new ItemStack(TFBlocks.SORTING_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.SORTING_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "sorting_planks", new ItemStack(TFBlocks.SORTING_PLANKS.get(), 2), "L", 'L', TheTwilightForestTags.ModTags.TTF_SORTING);
            VanillaRecipeHelper.addShapedRecipe(provider, "sorting_pressure_plate", new ItemStack(TFBlocks.SORTING_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', TFBlocks.SORTING_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "sorting_trapdoor", new ItemStack(TFBlocks.SORTING_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(TFBlocks.SORTING_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("sorting_door").inputItems(new ItemStack(TFBlocks.SORTING_TRAPDOOR.get())).inputItems(new ItemStack(TFBlocks.SORTING_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.SORTING_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("sorting_fence").inputItems(new ItemStack(TFBlocks.SORTING_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.SORTING_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("sorting_fence_gate").inputItems(new ItemStack(TFBlocks.SORTING_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(TFBlocks.SORTING_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("sorting_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(TFBlocks.SORTING_SLAB.get(), 2)).outputItems(new ItemStack(TFBlocks.SORTING_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("sorting_sign").inputItems(new ItemStack(TFBlocks.SORTING_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(TFBlocks.SORTING_SIGN.get(), 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("sorting_stairs").inputItems(new ItemStack(TFBlocks.SORTING_PLANKS.get(), 6)).outputItems(new ItemStack(TFBlocks.SORTING_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "time_boat", new ItemStack(TFItems.TIME_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(TFBlocks.TIME_PLANKS.get()), 'S', new ItemStack(TFBlocks.TIME_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "time_button", new ItemStack(TFBlocks.TIME_BUTTON.get(), 6), "sP", 'P', TFBlocks.TIME_PLANKS.get());
            VanillaRecipeHelper.addShapedRecipe(provider, "time_chest", new ItemStack(TFBlocks.TIME_CHEST.get()), "FFF", "FCF", "FFF", 'F', TheTwilightForestTags.ModTags.TTF_TIME, 'C', ForgeTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "time_door", new ItemStack(TFBlocks.TIME_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(TFBlocks.TIME_PLANKS.get()), 'T', new ItemStack(TFBlocks.TIME_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "time_fence", new ItemStack(TFBlocks.TIME_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(TFBlocks.TIME_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "time_fence_gate", new ItemStack(TFBlocks.TIME_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.TIME_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "time_planks", new ItemStack(TFBlocks.TIME_PLANKS.get(), 2), "L", 'L', TheTwilightForestTags.ModTags.TTF_TIME);
            VanillaRecipeHelper.addShapedRecipe(provider, "time_pressure_plate", new ItemStack(TFBlocks.TIME_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', TFBlocks.TIME_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "time_trapdoor", new ItemStack(TFBlocks.TIME_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(TFBlocks.TIME_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("time_door").inputItems(new ItemStack(TFBlocks.TIME_TRAPDOOR.get())).inputItems(new ItemStack(TFBlocks.TIME_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.TIME_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("time_fence").inputItems(new ItemStack(TFBlocks.TIME_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.TIME_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("time_fence_gate").inputItems(new ItemStack(TFBlocks.TIME_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(TFBlocks.TIME_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("time_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(TFBlocks.TIME_SLAB.get(), 2)).outputItems(new ItemStack(TFBlocks.TIME_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("time_sign").inputItems(new ItemStack(TFBlocks.TIME_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(TFBlocks.TIME_SIGN.get(), 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("time_stairs").inputItems(new ItemStack(TFBlocks.TIME_PLANKS.get(), 6)).outputItems(new ItemStack(TFBlocks.TIME_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "transformation_boat", new ItemStack(TFItems.TRANSFORMATION_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get()), 'S', new ItemStack(TFBlocks.TRANSFORMATION_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "transformation_button", new ItemStack(TFBlocks.TRANSFORMATION_BUTTON.get(), 6), "sP", 'P', TFBlocks.TRANSFORMATION_PLANKS.get());
            VanillaRecipeHelper.addShapedRecipe(provider, "transformation_chest", new ItemStack(TFBlocks.TRANSFORMATION_CHEST.get()), "FFF", "FCF", "FFF", 'F', TheTwilightForestTags.ModTags.TTF_TRANSFORMATION, 'C', ForgeTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "transformation_door", new ItemStack(TFBlocks.TRANSFORMATION_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get()), 'T', new ItemStack(TFBlocks.TRANSFORMATION_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "transformation_fence", new ItemStack(TFBlocks.TRANSFORMATION_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "transformation_fence_gate", new ItemStack(TFBlocks.TRANSFORMATION_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "transformation_planks", new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get(), 2), "L", 'L', TheTwilightForestTags.ModTags.TTF_TRANSFORMATION);
            VanillaRecipeHelper.addShapedRecipe(provider, "transformation_pressure_plate", new ItemStack(TFBlocks.TRANSFORMATION_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', TFBlocks.TRANSFORMATION_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "transformation_trapdoor", new ItemStack(TFBlocks.TRANSFORMATION_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(TFBlocks.TRANSFORMATION_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("transformation_door").inputItems(new ItemStack(TFBlocks.TRANSFORMATION_TRAPDOOR.get())).inputItems(new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.TRANSFORMATION_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("transformation_fence").inputItems(new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.TRANSFORMATION_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("transformation_fence_gate").inputItems(new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(TFBlocks.TRANSFORMATION_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("transformation_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(TFBlocks.TRANSFORMATION_SLAB.get(), 2)).outputItems(new ItemStack(TFBlocks.TRANSFORMATION_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("transformation_sign").inputItems(new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(TFBlocks.TRANSFORMATION_SIGN.get(), 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("transformation_stairs").inputItems(new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get(), 6)).outputItems(new ItemStack(TFBlocks.TRANSFORMATION_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_boat", new ItemStack(TFItems.TWILIGHT_OAK_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get()), 'S', new ItemStack(TFBlocks.TWILIGHT_OAK_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_button", new ItemStack(TFBlocks.TWILIGHT_OAK_BUTTON.get(), 6), "sP", 'P', TFBlocks.TWILIGHT_OAK_PLANKS.get());
            VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_chest", new ItemStack(TFBlocks.TWILIGHT_OAK_CHEST.get()), "FFF", "FCF", "FFF", 'F', TheTwilightForestTags.ModTags.TTF_TWILIGHT_OAK, 'C', ForgeTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_door", new ItemStack(TFBlocks.TWILIGHT_OAK_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get()), 'T', new ItemStack(TFBlocks.TWILIGHT_OAK_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_fence", new ItemStack(TFBlocks.TWILIGHT_OAK_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_fence_gate", new ItemStack(TFBlocks.TWILIGHT_OAK_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_planks", new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get(), 2), "L", 'L', TheTwilightForestTags.ModTags.TTF_TWILIGHT_OAK);
            VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_pressure_plate", new ItemStack(TFBlocks.TWILIGHT_OAK_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', TFBlocks.TWILIGHT_OAK_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_trapdoor", new ItemStack(TFBlocks.TWILIGHT_OAK_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(TFBlocks.TWILIGHT_OAK_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("twilight_oak_door").inputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_TRAPDOOR.get())).inputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("twilight_oak_fence").inputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("twilight_oak_fence_gate").inputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("twilight_oak_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_SLAB.get(), 2)).outputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("twilight_oak_sign").inputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_SIGN.get(), 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("twilight_oak_stairs").inputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get(), 6)).outputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);
        } else {

        }
        VanillaRecipeHelper.addShapedRecipe(provider, "canopy_planks_saw", new ItemStack(TFBlocks.CANOPY_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', TheTwilightForestTags.ModTags.TTF_CANOPY);
        VanillaRecipeHelper.addShapedRecipe(provider, "canopy_fence_gate", new ItemStack(TFBlocks.CANOPY_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.CANOPY_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "dark_planks_saw", new ItemStack(TFBlocks.DARK_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', TheTwilightForestTags.ModTags.TTF_DARK);
        VanillaRecipeHelper.addShapedRecipe(provider, "dark_fence_gate", new ItemStack(TFBlocks.DARK_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.DARK_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_planks_saw", new ItemStack(TFBlocks.MANGROVE_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', TheTwilightForestTags.ModTags.TTF_MANGROVE);
        VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_fence_gate", new ItemStack(TFBlocks.MANGROVE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.MANGROVE_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "mining_planks_saw", new ItemStack(TFBlocks.MINING_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', TheTwilightForestTags.ModTags.TTF_MINING);
        VanillaRecipeHelper.addShapedRecipe(provider, "mining_fence_gate", new ItemStack(TFBlocks.MINING_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.MINING_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "sorting_planks_saw", new ItemStack(TFBlocks.SORTING_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', TheTwilightForestTags.ModTags.TTF_SORTING);
        VanillaRecipeHelper.addShapedRecipe(provider, "sorting_fence_gate", new ItemStack(TFBlocks.SORTING_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.SORTING_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "time_planks_saw", new ItemStack(TFBlocks.TIME_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', TheTwilightForestTags.ModTags.TTF_TIME);
        VanillaRecipeHelper.addShapedRecipe(provider, "time_fence_gate", new ItemStack(TFBlocks.TIME_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.TIME_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "transformation_planks_saw", new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', TheTwilightForestTags.ModTags.TTF_TRANSFORMATION);
        VanillaRecipeHelper.addShapedRecipe(provider, "transformation_fence_gate", new ItemStack(TFBlocks.TRANSFORMATION_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_planks_saw", new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', TheTwilightForestTags.ModTags.TTF_TWILIGHT_OAK);
        VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_fence_gate", new ItemStack(TFBlocks.TWILIGHT_OAK_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
    }
}