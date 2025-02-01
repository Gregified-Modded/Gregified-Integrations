package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.addition;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.item.BOPItems;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import com.therealm18studios.gregifiedintegrations.data.tags.BiomesOPlentyTags;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.ULV;
import static com.gregtechceu.gtceu.api.GTValues.VA;

public class BiomesOPlentyRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        harderBiomesOPlentyRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipesAdditions.b.harderBiomesOPlentyRecipes) harderBiomesOPlentyRecipes(provider);
    }

    private static void harderBiomesOPlentyRecipes(Consumer<FinishedRecipe> provider) {

        boolean nerfed = GIConfigHolder.INSTANCE.recipesAdditions.b.harderBiomesOPlentyRecipes;
        if (nerfed) {
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/dead_boat", new ItemStack(BOPItems.DEAD_BOAT), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.DEAD_PLANKS), 'S', new ItemStack(BOPBlocks.DEAD_SLAB), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/dead_button", new ItemStack(BOPBlocks.DEAD_BUTTON, 6), "sP", 'P', BOPBlocks.DEAD_PLANKS);
//            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/dead_chest", new ItemStack(BOPBlocks.DEAD_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_DEAD, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/dead_door", new ItemStack(BOPBlocks.DEAD_DOOR), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.DEAD_PLANKS), 'T', new ItemStack(BOPBlocks.DEAD_TRAPDOOR), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/dead_fence", new ItemStack(BOPBlocks.DEAD_FENCE), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.DEAD_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/dead_fence_gate", new ItemStack(BOPBlocks.DEAD_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.DEAD_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/dead_planks", new ItemStack(BOPBlocks.DEAD_PLANKS, 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_DEAD);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/dead_pressure_plate", new ItemStack(BOPBlocks.DEAD_PRESSURE_PLATE, 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.DEAD_SLAB.asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/dead_trapdoor", new ItemStack(BOPBlocks.DEAD_TRAPDOOR), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.DEAD_SLAB), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/dead_door").inputItems(new ItemStack(BOPBlocks.DEAD_TRAPDOOR)).inputItems(new ItemStack(BOPBlocks.DEAD_PLANKS, 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.DEAD_DOOR)).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/dead_fence").inputItems(new ItemStack(BOPBlocks.DEAD_PLANKS)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.DEAD_FENCE)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/dead_fence_gate").inputItems(new ItemStack(BOPBlocks.DEAD_PLANKS, 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.DEAD_FENCE_GATE)).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/dead_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.DEAD_SLAB, 2)).outputItems(new ItemStack(BOPBlocks.DEAD_PRESSURE_PLATE, 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/dead_sign").inputItems(new ItemStack(BOPBlocks.DEAD_PLANKS, 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.DEAD_SIGN, 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/dead_stairs").inputItems(new ItemStack(BOPBlocks.DEAD_PLANKS, 6)).outputItems(new ItemStack(BOPBlocks.DEAD_STAIRS)).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/fir_boat", new ItemStack(BOPItems.FIR_BOAT), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.FIR_PLANKS), 'S', new ItemStack(BOPBlocks.FIR_SLAB), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/fir_button", new ItemStack(BOPBlocks.FIR_BUTTON, 6), "sP", 'P', BOPBlocks.FIR_PLANKS);
//            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/fir_chest", new ItemStack(BOPBlocks.FIR_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_FIR, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/fir_door", new ItemStack(BOPBlocks.FIR_DOOR), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.FIR_PLANKS), 'T', new ItemStack(BOPBlocks.FIR_TRAPDOOR), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/fir_fence", new ItemStack(BOPBlocks.FIR_FENCE), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.FIR_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/fir_fence_gate", new ItemStack(BOPBlocks.FIR_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.FIR_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/fir_planks", new ItemStack(BOPBlocks.FIR_PLANKS, 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_FIR);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/fir_pressure_plate", new ItemStack(BOPBlocks.FIR_PRESSURE_PLATE, 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.FIR_SLAB.asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/fir_trapdoor", new ItemStack(BOPBlocks.FIR_TRAPDOOR), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.FIR_SLAB), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/fir_door").inputItems(new ItemStack(BOPBlocks.FIR_TRAPDOOR)).inputItems(new ItemStack(BOPBlocks.FIR_PLANKS, 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.FIR_DOOR)).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/fir_fence").inputItems(new ItemStack(BOPBlocks.FIR_PLANKS)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.FIR_FENCE)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/fir_fence_gate").inputItems(new ItemStack(BOPBlocks.FIR_PLANKS, 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.FIR_FENCE_GATE)).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/fir_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.FIR_SLAB, 2)).outputItems(new ItemStack(BOPBlocks.FIR_PRESSURE_PLATE, 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/fir_sign").inputItems(new ItemStack(BOPBlocks.FIR_PLANKS, 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.FIR_SIGN, 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/fir_stairs").inputItems(new ItemStack(BOPBlocks.FIR_PLANKS, 6)).outputItems(new ItemStack(BOPBlocks.FIR_STAIRS)).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/hellbark_boat", new ItemStack(BOPItems.HELLBARK_BOAT), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.HELLBARK_PLANKS), 'S', new ItemStack(BOPBlocks.HELLBARK_SLAB), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/hellbark_button", new ItemStack(BOPBlocks.HELLBARK_BUTTON, 6), "sP", 'P', BOPBlocks.HELLBARK_PLANKS);
//            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/hellbark_chest", new ItemStack(BOPBlocks.HELLBARK_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_HELLBARK, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/hellbark_door", new ItemStack(BOPBlocks.HELLBARK_DOOR), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.HELLBARK_PLANKS), 'T', new ItemStack(BOPBlocks.HELLBARK_TRAPDOOR), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/hellbark_fence", new ItemStack(BOPBlocks.HELLBARK_FENCE), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.HELLBARK_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/hellbark_fence_gate", new ItemStack(BOPBlocks.HELLBARK_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.HELLBARK_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/hellbark_planks", new ItemStack(BOPBlocks.HELLBARK_PLANKS, 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_HELLBARK);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/hellbark_pressure_plate", new ItemStack(BOPBlocks.HELLBARK_PRESSURE_PLATE, 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.HELLBARK_SLAB.asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/hellbark_trapdoor", new ItemStack(BOPBlocks.HELLBARK_TRAPDOOR), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.HELLBARK_SLAB), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/hellbark_door").inputItems(new ItemStack(BOPBlocks.HELLBARK_TRAPDOOR)).inputItems(new ItemStack(BOPBlocks.HELLBARK_PLANKS, 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.HELLBARK_DOOR)).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/hellbark_fence").inputItems(new ItemStack(BOPBlocks.HELLBARK_PLANKS)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.HELLBARK_FENCE)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/hellbark_fence_gate").inputItems(new ItemStack(BOPBlocks.HELLBARK_PLANKS, 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.HELLBARK_FENCE_GATE)).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/hellbark_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.HELLBARK_SLAB, 2)).outputItems(new ItemStack(BOPBlocks.HELLBARK_PRESSURE_PLATE, 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/hellbark_sign").inputItems(new ItemStack(BOPBlocks.HELLBARK_PLANKS, 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.HELLBARK_SIGN, 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/hellbark_stairs").inputItems(new ItemStack(BOPBlocks.HELLBARK_PLANKS, 6)).outputItems(new ItemStack(BOPBlocks.HELLBARK_STAIRS)).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/jacaranda_boat", new ItemStack(BOPItems.JACARANDA_BOAT), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.JACARANDA_PLANKS), 'S', new ItemStack(BOPBlocks.JACARANDA_SLAB), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/jacaranda_button", new ItemStack(BOPBlocks.JACARANDA_BUTTON, 6), "sP", 'P', BOPBlocks.JACARANDA_PLANKS);
//            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/jacaranda_chest", new ItemStack(BOPBlocks.JACARANDA_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_JACARANDA, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/jacaranda_door", new ItemStack(BOPBlocks.JACARANDA_DOOR), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.JACARANDA_PLANKS), 'T', new ItemStack(BOPBlocks.JACARANDA_TRAPDOOR), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/jacaranda_fence", new ItemStack(BOPBlocks.JACARANDA_FENCE), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.JACARANDA_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/jacaranda_fence_gate", new ItemStack(BOPBlocks.JACARANDA_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.JACARANDA_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/jacaranda_planks", new ItemStack(BOPBlocks.JACARANDA_PLANKS, 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_JACARANDA);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/jacaranda_pressure_plate", new ItemStack(BOPBlocks.JACARANDA_PRESSURE_PLATE, 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.JACARANDA_SLAB.asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/jacaranda_trapdoor", new ItemStack(BOPBlocks.JACARANDA_TRAPDOOR), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.JACARANDA_SLAB), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/jacaranda_door").inputItems(new ItemStack(BOPBlocks.JACARANDA_TRAPDOOR)).inputItems(new ItemStack(BOPBlocks.JACARANDA_PLANKS, 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.JACARANDA_DOOR)).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/jacaranda_fence").inputItems(new ItemStack(BOPBlocks.JACARANDA_PLANKS)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.JACARANDA_FENCE)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/jacaranda_fence_gate").inputItems(new ItemStack(BOPBlocks.JACARANDA_PLANKS, 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.JACARANDA_FENCE_GATE)).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/jacaranda_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.JACARANDA_SLAB, 2)).outputItems(new ItemStack(BOPBlocks.JACARANDA_PRESSURE_PLATE, 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/jacarandasign").inputItems(new ItemStack(BOPBlocks.JACARANDA_PLANKS, 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.JACARANDA_SIGN, 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/jacaranda_stairs").inputItems(new ItemStack(BOPBlocks.JACARANDA_PLANKS, 6)).outputItems(new ItemStack(BOPBlocks.JACARANDA_STAIRS)).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/magic_boat", new ItemStack(BOPItems.MAGIC_BOAT), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.MAGIC_PLANKS), 'S', new ItemStack(BOPBlocks.MAGIC_SLAB), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/magic_button", new ItemStack(BOPBlocks.MAGIC_BUTTON, 6), "sP", 'P', BOPBlocks.MAGIC_PLANKS);
//            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/magic_chest", new ItemStack(BOPBlocks.MAGIC_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_MAGIC, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/magic_door", new ItemStack(BOPBlocks.MAGIC_DOOR), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.MAGIC_PLANKS), 'T', new ItemStack(BOPBlocks.MAGIC_TRAPDOOR), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/magic_fence", new ItemStack(BOPBlocks.MAGIC_FENCE), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.MAGIC_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/magic_fence_gate", new ItemStack(BOPBlocks.MAGIC_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.MAGIC_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/magic_planks", new ItemStack(BOPBlocks.MAGIC_PLANKS, 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_MAGIC);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/magic_pressure_plate", new ItemStack(BOPBlocks.MAGIC_PRESSURE_PLATE, 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.MAGIC_SLAB.asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/magic_trapdoor", new ItemStack(BOPBlocks.MAGIC_TRAPDOOR), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.MAGIC_SLAB), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/magic_door").inputItems(new ItemStack(BOPBlocks.MAGIC_TRAPDOOR)).inputItems(new ItemStack(BOPBlocks.MAGIC_PLANKS, 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.MAGIC_DOOR)).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/magic_fence").inputItems(new ItemStack(BOPBlocks.MAGIC_PLANKS)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.MAGIC_FENCE)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/magic_fence_gate").inputItems(new ItemStack(BOPBlocks.MAGIC_PLANKS, 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.MAGIC_FENCE_GATE)).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/magic_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.MAGIC_SLAB, 2)).outputItems(new ItemStack(BOPBlocks.MAGIC_PRESSURE_PLATE, 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/magic_sign").inputItems(new ItemStack(BOPBlocks.MAGIC_PLANKS, 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.MAGIC_SIGN, 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/magic_stairs").inputItems(new ItemStack(BOPBlocks.MAGIC_PLANKS, 6)).outputItems(new ItemStack(BOPBlocks.MAGIC_STAIRS)).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/mahogany_boat", new ItemStack(BOPItems.MAHOGANY_BOAT), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.MAHOGANY_PLANKS), 'S', new ItemStack(BOPBlocks.MAHOGANY_SLAB), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/mahogany_button", new ItemStack(BOPBlocks.MAHOGANY_BUTTON, 6), "sP", 'P', BOPBlocks.MAHOGANY_PLANKS);
//            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/mahogany_chest", new ItemStack(BOPBlocks.MAHOGANY_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_MAHOGANY, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/mahogany_door", new ItemStack(BOPBlocks.MAHOGANY_DOOR), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.MAHOGANY_PLANKS), 'T', new ItemStack(BOPBlocks.MAHOGANY_TRAPDOOR), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/mahogany_fence", new ItemStack(BOPBlocks.MAHOGANY_FENCE), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.MAHOGANY_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/mahogany_fence_gate", new ItemStack(BOPBlocks.MAHOGANY_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.MAHOGANY_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/mahogany_planks", new ItemStack(BOPBlocks.MAHOGANY_PLANKS, 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_MAHOGANY);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/mahogany_pressure_plate", new ItemStack(BOPBlocks.MAHOGANY_PRESSURE_PLATE, 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.MAHOGANY_SLAB.asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/mahogany_trapdoor", new ItemStack(BOPBlocks.MAHOGANY_TRAPDOOR), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.MAHOGANY_SLAB), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/mahogany_door").inputItems(new ItemStack(BOPBlocks.MAHOGANY_TRAPDOOR)).inputItems(new ItemStack(BOPBlocks.MAHOGANY_PLANKS, 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.MAHOGANY_DOOR)).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/mahogany_fence").inputItems(new ItemStack(BOPBlocks.MAHOGANY_PLANKS)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.MAHOGANY_FENCE)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/mahogany_fence_gate").inputItems(new ItemStack(BOPBlocks.MAHOGANY_PLANKS, 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.MAHOGANY_FENCE_GATE)).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/mahogany_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.MAHOGANY_SLAB, 2)).outputItems(new ItemStack(BOPBlocks.MAHOGANY_PRESSURE_PLATE, 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/mahogany_sign").inputItems(new ItemStack(BOPBlocks.MAHOGANY_PLANKS, 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.MAHOGANY_SIGN, 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/mahogany_stairs").inputItems(new ItemStack(BOPBlocks.MAHOGANY_PLANKS, 6)).outputItems(new ItemStack(BOPBlocks.MAHOGANY_STAIRS)).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/palm_boat", new ItemStack(BOPItems.PALM_BOAT), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.PALM_PLANKS), 'S', new ItemStack(BOPBlocks.PALM_SLAB), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/palm_button", new ItemStack(BOPBlocks.PALM_BUTTON, 6), "sP", 'P', BOPBlocks.PALM_PLANKS);
//            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/palm_chest", new ItemStack(BOPBlocks.PALM_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_PALM, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/palm_door", new ItemStack(BOPBlocks.PALM_DOOR), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.PALM_PLANKS), 'T', new ItemStack(BOPBlocks.PALM_TRAPDOOR), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/palm_fence", new ItemStack(BOPBlocks.PALM_FENCE), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.PALM_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/palm_fence_gate", new ItemStack(BOPBlocks.PALM_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.PALM_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/palm_planks", new ItemStack(BOPBlocks.PALM_PLANKS, 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_PALM);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/palm_pressure_plate", new ItemStack(BOPBlocks.PALM_PRESSURE_PLATE, 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.PALM_SLAB.asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/palm_trapdoor", new ItemStack(BOPBlocks.PALM_TRAPDOOR), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.PALM_SLAB), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/palm_door").inputItems(new ItemStack(BOPBlocks.PALM_TRAPDOOR)).inputItems(new ItemStack(BOPBlocks.PALM_PLANKS, 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.PALM_DOOR)).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/palm_fence").inputItems(new ItemStack(BOPBlocks.PALM_PLANKS)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.PALM_FENCE)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/palm_fence_gate").inputItems(new ItemStack(BOPBlocks.PALM_PLANKS, 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.PALM_FENCE_GATE)).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/palm_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.PALM_SLAB, 2)).outputItems(new ItemStack(BOPBlocks.PALM_PRESSURE_PLATE, 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/palm_sign").inputItems(new ItemStack(BOPBlocks.PALM_PLANKS, 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.PALM_SIGN, 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/palm_stairs").inputItems(new ItemStack(BOPBlocks.PALM_PLANKS, 6)).outputItems(new ItemStack(BOPBlocks.PALM_STAIRS)).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/redwood_boat", new ItemStack(BOPItems.REDWOOD_BOAT), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.REDWOOD_PLANKS), 'S', new ItemStack(BOPBlocks.REDWOOD_SLAB), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/redwood_button", new ItemStack(BOPBlocks.REDWOOD_BUTTON, 6), "sP", 'P', BOPBlocks.REDWOOD_PLANKS);
//            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/redwood_chest", new ItemStack(BOPBlocks.REDWOOD_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_REDWOOD, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/redwood_door", new ItemStack(BOPBlocks.REDWOOD_DOOR), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.REDWOOD_PLANKS), 'T', new ItemStack(BOPBlocks.REDWOOD_TRAPDOOR), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/redwood_fence", new ItemStack(BOPBlocks.REDWOOD_FENCE), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.REDWOOD_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/redwood_fence_gate", new ItemStack(BOPBlocks.REDWOOD_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.REDWOOD_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/redwood_planks", new ItemStack(BOPBlocks.REDWOOD_PLANKS, 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_REDWOOD);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/redwood_pressure_plate", new ItemStack(BOPBlocks.REDWOOD_PRESSURE_PLATE, 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.REDWOOD_SLAB.asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/redwood_trapdoor", new ItemStack(BOPBlocks.REDWOOD_TRAPDOOR), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.REDWOOD_SLAB), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/redwood_door").inputItems(new ItemStack(BOPBlocks.REDWOOD_TRAPDOOR)).inputItems(new ItemStack(BOPBlocks.REDWOOD_PLANKS, 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.REDWOOD_DOOR)).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/redwood_fence").inputItems(new ItemStack(BOPBlocks.REDWOOD_PLANKS)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.REDWOOD_FENCE)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/redwood_fence_gate").inputItems(new ItemStack(BOPBlocks.REDWOOD_PLANKS, 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.REDWOOD_FENCE_GATE)).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/redwood_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.REDWOOD_SLAB, 2)).outputItems(new ItemStack(BOPBlocks.REDWOOD_PRESSURE_PLATE, 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/redwood_sign").inputItems(new ItemStack(BOPBlocks.REDWOOD_PLANKS, 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.REDWOOD_SIGN, 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/redwood_stairs").inputItems(new ItemStack(BOPBlocks.REDWOOD_PLANKS, 6)).outputItems(new ItemStack(BOPBlocks.REDWOOD_STAIRS)).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/umbran_boat", new ItemStack(BOPItems.UMBRAN_BOAT), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.UMBRAN_PLANKS), 'S', new ItemStack(BOPBlocks.UMBRAN_SLAB), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/umbran_button", new ItemStack(BOPBlocks.UMBRAN_BUTTON, 6), "sP", 'P', BOPBlocks.UMBRAN_PLANKS);
//            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/umbran_chest", new ItemStack(BOPBlocks.UMBRAN_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_UMBRAN, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/umbran_door", new ItemStack(BOPBlocks.UMBRAN_DOOR), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.UMBRAN_PLANKS), 'T', new ItemStack(BOPBlocks.UMBRAN_TRAPDOOR), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/umbran_fence", new ItemStack(BOPBlocks.UMBRAN_FENCE), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.UMBRAN_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/umbran_fence_gate", new ItemStack(BOPBlocks.UMBRAN_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.UMBRAN_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/umbran_planks", new ItemStack(BOPBlocks.UMBRAN_PLANKS, 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_UMBRAN);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/umbran_pressure_plate", new ItemStack(BOPBlocks.UMBRAN_PRESSURE_PLATE, 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.UMBRAN_SLAB.asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/umbran_trapdoor", new ItemStack(BOPBlocks.UMBRAN_TRAPDOOR), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.UMBRAN_SLAB), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/umbran_door").inputItems(new ItemStack(BOPBlocks.UMBRAN_TRAPDOOR)).inputItems(new ItemStack(BOPBlocks.UMBRAN_PLANKS, 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.UMBRAN_DOOR)).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/umbran_fence").inputItems(new ItemStack(BOPBlocks.UMBRAN_PLANKS)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.UMBRAN_FENCE)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/umbran_fence_gate").inputItems(new ItemStack(BOPBlocks.UMBRAN_PLANKS, 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.UMBRAN_FENCE_GATE)).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/umbran_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.UMBRAN_SLAB, 2)).outputItems(new ItemStack(BOPBlocks.UMBRAN_PRESSURE_PLATE, 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/umbran_sign").inputItems(new ItemStack(BOPBlocks.UMBRAN_PLANKS, 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.UMBRAN_SIGN, 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/umbran_stairs").inputItems(new ItemStack(BOPBlocks.UMBRAN_PLANKS, 6)).outputItems(new ItemStack(BOPBlocks.UMBRAN_STAIRS)).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/willow_boat", new ItemStack(BOPItems.WILLOW_BOAT), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.WILLOW_PLANKS), 'S', new ItemStack(BOPBlocks.WILLOW_SLAB), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/willow_button", new ItemStack(BOPBlocks.WILLOW_BUTTON, 6), "sP", 'P', BOPBlocks.WILLOW_PLANKS);
//            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/willow_chest", new ItemStack(BOPBlocks.WILLOW_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_WILLOW, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/willow_door", new ItemStack(BOPBlocks.WILLOW_DOOR), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.WILLOW_PLANKS), 'T', new ItemStack(BOPBlocks.WILLOW_TRAPDOOR), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/willow_fence", new ItemStack(BOPBlocks.WILLOW_FENCE), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.WILLOW_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/willow_fence_gate", new ItemStack(BOPBlocks.WILLOW_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.WILLOW_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/willow_planks", new ItemStack(BOPBlocks.WILLOW_PLANKS, 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_WILLOW);
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/willow_pressure_plate", new ItemStack(BOPBlocks.WILLOW_PRESSURE_PLATE, 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.WILLOW_SLAB.asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/willow_trapdoor", new ItemStack(BOPBlocks.WILLOW_TRAPDOOR), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.WILLOW_SLAB), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/willow_door").inputItems(new ItemStack(BOPBlocks.WILLOW_TRAPDOOR)).inputItems(new ItemStack(BOPBlocks.WILLOW_PLANKS, 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.WILLOW_DOOR)).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/willow_fence").inputItems(new ItemStack(BOPBlocks.WILLOW_PLANKS)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.WILLOW_FENCE)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/willow_fence_gate").inputItems(new ItemStack(BOPBlocks.WILLOW_PLANKS, 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.WILLOW_FENCE_GATE)).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/willow_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.WILLOW_SLAB, 2)).outputItems(new ItemStack(BOPBlocks.WILLOW_PRESSURE_PLATE, 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/willow_sign").inputItems(new ItemStack(BOPBlocks.WILLOW_PLANKS, 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.WILLOW_SIGN, 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("biomesoplenty/willow_stairs").inputItems(new ItemStack(BOPBlocks.WILLOW_PLANKS, 6)).outputItems(new ItemStack(BOPBlocks.WILLOW_STAIRS)).circuitMeta(7).duration(100).EUt(1).save(provider);
        } else {

        }
        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/dead_planks_saw", new ItemStack(BOPBlocks.DEAD_PLANKS, nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_DEAD);
        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/dead_fence_gate", new ItemStack(BOPBlocks.DEAD_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.DEAD_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/fir_planks_saw", new ItemStack(BOPBlocks.FIR_PLANKS, nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_FIR);
        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/fir_fence_gate", new ItemStack(BOPBlocks.FIR_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.FIR_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/hellbark_planks_saw", new ItemStack(BOPBlocks.HELLBARK_PLANKS, nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_HELLBARK);
        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/hellbark_fence_gate", new ItemStack(BOPBlocks.HELLBARK_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.HELLBARK_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/jacaranda_planks_saw", new ItemStack(BOPBlocks.JACARANDA_PLANKS, nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_JACARANDA);
        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/jacaranda_fence_gate", new ItemStack(BOPBlocks.JACARANDA_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.JACARANDA_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/magic_planks_saw", new ItemStack(BOPBlocks.MAGIC_PLANKS, nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_MAGIC);
        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/magic_fence_gate", new ItemStack(BOPBlocks.MAGIC_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.MAGIC_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/mahogany_planks_saw", new ItemStack(BOPBlocks.MAHOGANY_PLANKS, nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_MAHOGANY);
        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/mahogany_fence_gate", new ItemStack(BOPBlocks.MAHOGANY_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.MAHOGANY_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/palm_planks_saw", new ItemStack(BOPBlocks.PALM_PLANKS, nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_PALM);
        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/palm_fence_gate", new ItemStack(BOPBlocks.PALM_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.PALM_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/redwood_planks_saw", new ItemStack(BOPBlocks.REDWOOD_PLANKS, nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_REDWOOD);
        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/redwood_fence_gate", new ItemStack(BOPBlocks.REDWOOD_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.REDWOOD_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/umbran_planks_saw", new ItemStack(BOPBlocks.UMBRAN_PLANKS, nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_UMBRAN);
        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/umbran_fence_gate", new ItemStack(BOPBlocks.UMBRAN_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.UMBRAN_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/willow_planks_saw", new ItemStack(BOPBlocks.WILLOW_PLANKS, nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_WILLOW);
        VanillaRecipeHelper.addShapedRecipe(provider, "biomesoplenty/willow_fence_gate", new ItemStack(BOPBlocks.WILLOW_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.WILLOW_PLANKS), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
    }
}