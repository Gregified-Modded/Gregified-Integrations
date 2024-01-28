package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.recipes.addition;

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
        if (GIConfigHolder.INSTANCE.recipesAdditions.harderBiomesOPlentyAddRecipes) harderBiomesOPlentyRecipes(provider);
    }

    private static void harderBiomesOPlentyRecipes(Consumer<FinishedRecipe> provider) {

        boolean nerfed = GIConfigHolder.INSTANCE.recipesAdditions.harderBiomesOPlentyAddRecipes;
        if (nerfed) {
            VanillaRecipeHelper.addShapedRecipe(provider, "dead_boat", new ItemStack(BOPItems.DEAD_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.DEAD_PLANKS.get()), 'S', new ItemStack(BOPBlocks.DEAD_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "dead_button", new ItemStack(BOPBlocks.DEAD_BUTTON.get(), 6), "sP", 'P', BOPBlocks.DEAD_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "dead_chest", new ItemStack(BOPBlocks.DEAD_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_DEAD, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "dead_door", new ItemStack(BOPBlocks.DEAD_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.DEAD_PLANKS.get()), 'T', new ItemStack(BOPBlocks.DEAD_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "dead_fence", new ItemStack(BOPBlocks.DEAD_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.DEAD_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "dead_fence_gate", new ItemStack(BOPBlocks.DEAD_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.DEAD_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "dead_planks", new ItemStack(BOPBlocks.DEAD_PLANKS.get(), 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_DEAD);
            VanillaRecipeHelper.addShapedRecipe(provider, "dead_pressure_plate", new ItemStack(BOPBlocks.DEAD_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.DEAD_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "dead_trapdoor", new ItemStack(BOPBlocks.DEAD_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.DEAD_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dead_door").inputItems(new ItemStack(BOPBlocks.DEAD_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.DEAD_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.DEAD_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dead_fence").inputItems(new ItemStack(BOPBlocks.DEAD_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.DEAD_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dead_fence_gate").inputItems(new ItemStack(BOPBlocks.DEAD_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.DEAD_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dead_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.DEAD_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.DEAD_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dead_sign").inputItems(new ItemStack(BOPBlocks.DEAD_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.DEAD_SIGN.get(), 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dead_stairs").inputItems(new ItemStack(BOPBlocks.DEAD_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.DEAD_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "fir_boat", new ItemStack(BOPItems.FIR_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.FIR_PLANKS.get()), 'S', new ItemStack(BOPBlocks.FIR_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "fir_button", new ItemStack(BOPBlocks.FIR_BUTTON.get(), 6), "sP", 'P', BOPBlocks.FIR_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "fir_chest", new ItemStack(BOPBlocks.FIR_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_FIR, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "fir_door", new ItemStack(BOPBlocks.FIR_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.FIR_PLANKS.get()), 'T', new ItemStack(BOPBlocks.FIR_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "fir_fence", new ItemStack(BOPBlocks.FIR_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.FIR_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "fir_fence_gate", new ItemStack(BOPBlocks.FIR_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.FIR_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "fir_planks", new ItemStack(BOPBlocks.FIR_PLANKS.get(), 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_FIR);
            VanillaRecipeHelper.addShapedRecipe(provider, "fir_pressure_plate", new ItemStack(BOPBlocks.FIR_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.FIR_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "fir_trapdoor", new ItemStack(BOPBlocks.FIR_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.FIR_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("fir_door").inputItems(new ItemStack(BOPBlocks.FIR_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.FIR_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.FIR_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("fir_fence").inputItems(new ItemStack(BOPBlocks.FIR_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.FIR_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("fir_fence_gate").inputItems(new ItemStack(BOPBlocks.FIR_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.FIR_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("fir_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.FIR_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.FIR_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("fir_sign").inputItems(new ItemStack(BOPBlocks.FIR_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.FIR_SIGN.get(), 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("fir_stairs").inputItems(new ItemStack(BOPBlocks.FIR_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.FIR_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_boat", new ItemStack(BOPItems.HELLBARK_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.HELLBARK_PLANKS.get()), 'S', new ItemStack(BOPBlocks.HELLBARK_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_button", new ItemStack(BOPBlocks.HELLBARK_BUTTON.get(), 6), "sP", 'P', BOPBlocks.HELLBARK_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_chest", new ItemStack(BOPBlocks.HELLBARK_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_HELLBARK, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_door", new ItemStack(BOPBlocks.HELLBARK_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.HELLBARK_PLANKS.get()), 'T', new ItemStack(BOPBlocks.HELLBARK_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_fence", new ItemStack(BOPBlocks.HELLBARK_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.HELLBARK_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_fence_gate", new ItemStack(BOPBlocks.HELLBARK_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.HELLBARK_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_planks", new ItemStack(BOPBlocks.HELLBARK_PLANKS.get(), 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_HELLBARK);
            VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_pressure_plate", new ItemStack(BOPBlocks.HELLBARK_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.HELLBARK_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_trapdoor", new ItemStack(BOPBlocks.HELLBARK_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.HELLBARK_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("hellbark_door").inputItems(new ItemStack(BOPBlocks.HELLBARK_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.HELLBARK_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.HELLBARK_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("hellbark_fence").inputItems(new ItemStack(BOPBlocks.HELLBARK_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.HELLBARK_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("hellbark_fence_gate").inputItems(new ItemStack(BOPBlocks.HELLBARK_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.HELLBARK_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("hellbark_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.HELLBARK_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.HELLBARK_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("hellbark_sign").inputItems(new ItemStack(BOPBlocks.HELLBARK_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.HELLBARK_SIGN.get(), 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("hellbark_stairs").inputItems(new ItemStack(BOPBlocks.HELLBARK_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.HELLBARK_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_boat", new ItemStack(BOPItems.JACARANDA_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.JACARANDA_PLANKS.get()), 'S', new ItemStack(BOPBlocks.JACARANDA_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_button", new ItemStack(BOPBlocks.JACARANDA_BUTTON.get(), 6), "sP", 'P', BOPBlocks.JACARANDA_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_chest", new ItemStack(BOPBlocks.JACARANDA_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_JACARANDA, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_door", new ItemStack(BOPBlocks.JACARANDA_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.JACARANDA_PLANKS.get()), 'T', new ItemStack(BOPBlocks.JACARANDA_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_fence", new ItemStack(BOPBlocks.JACARANDA_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.JACARANDA_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_fence_gate", new ItemStack(BOPBlocks.JACARANDA_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.JACARANDA_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_planks", new ItemStack(BOPBlocks.JACARANDA_PLANKS.get(), 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_JACARANDA);
            VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_pressure_plate", new ItemStack(BOPBlocks.JACARANDA_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.JACARANDA_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_trapdoor", new ItemStack(BOPBlocks.JACARANDA_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.JACARANDA_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("jacaranda_door").inputItems(new ItemStack(BOPBlocks.JACARANDA_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.JACARANDA_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.JACARANDA_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("jacaranda_fence").inputItems(new ItemStack(BOPBlocks.JACARANDA_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.JACARANDA_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("jacaranda_fence_gate").inputItems(new ItemStack(BOPBlocks.JACARANDA_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.JACARANDA_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("jacaranda_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.JACARANDA_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.JACARANDA_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("jacarandasign").inputItems(new ItemStack(BOPBlocks.JACARANDA_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.JACARANDA_SIGN.get(), 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("jacaranda_stairs").inputItems(new ItemStack(BOPBlocks.JACARANDA_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.JACARANDA_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "magic_boat", new ItemStack(BOPItems.MAGIC_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.MAGIC_PLANKS.get()), 'S', new ItemStack(BOPBlocks.MAGIC_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "magic_button", new ItemStack(BOPBlocks.MAGIC_BUTTON.get(), 6), "sP", 'P', BOPBlocks.MAGIC_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "magic_chest", new ItemStack(BOPBlocks.MAGIC_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_MAGIC, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "magic_door", new ItemStack(BOPBlocks.MAGIC_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.MAGIC_PLANKS.get()), 'T', new ItemStack(BOPBlocks.MAGIC_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "magic_fence", new ItemStack(BOPBlocks.MAGIC_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.MAGIC_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "magic_fence_gate", new ItemStack(BOPBlocks.MAGIC_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.MAGIC_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "magic_planks", new ItemStack(BOPBlocks.MAGIC_PLANKS.get(), 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_MAGIC);
            VanillaRecipeHelper.addShapedRecipe(provider, "magic_pressure_plate", new ItemStack(BOPBlocks.MAGIC_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.MAGIC_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "magic_trapdoor", new ItemStack(BOPBlocks.MAGIC_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.MAGIC_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("magic_door").inputItems(new ItemStack(BOPBlocks.MAGIC_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.MAGIC_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.MAGIC_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("magic_fence").inputItems(new ItemStack(BOPBlocks.MAGIC_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.MAGIC_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("magic_fence_gate").inputItems(new ItemStack(BOPBlocks.MAGIC_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.MAGIC_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("magic_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.MAGIC_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.MAGIC_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("magic_sign").inputItems(new ItemStack(BOPBlocks.MAGIC_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.MAGIC_SIGN.get(), 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("magic_stairs").inputItems(new ItemStack(BOPBlocks.MAGIC_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.MAGIC_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_boat", new ItemStack(BOPItems.MAHOGANY_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get()), 'S', new ItemStack(BOPBlocks.MAHOGANY_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_button", new ItemStack(BOPBlocks.MAHOGANY_BUTTON.get(), 6), "sP", 'P', BOPBlocks.MAHOGANY_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_chest", new ItemStack(BOPBlocks.MAHOGANY_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_MAHOGANY, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_door", new ItemStack(BOPBlocks.MAHOGANY_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get()), 'T', new ItemStack(BOPBlocks.MAHOGANY_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_fence", new ItemStack(BOPBlocks.MAHOGANY_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_fence_gate", new ItemStack(BOPBlocks.MAHOGANY_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_planks", new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get(), 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_MAHOGANY);
            VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_pressure_plate", new ItemStack(BOPBlocks.MAHOGANY_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.MAHOGANY_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_trapdoor", new ItemStack(BOPBlocks.MAHOGANY_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.MAHOGANY_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mahogany_door").inputItems(new ItemStack(BOPBlocks.MAHOGANY_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.MAHOGANY_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mahogany_fence").inputItems(new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.MAHOGANY_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mahogany_fence_gate").inputItems(new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.MAHOGANY_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mahogany_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.MAHOGANY_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.MAHOGANY_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mahogany_sign").inputItems(new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.MAHOGANY_SIGN.get(), 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mahogany_stairs").inputItems(new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.MAHOGANY_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "palm_boat", new ItemStack(BOPItems.PALM_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.PALM_PLANKS.get()), 'S', new ItemStack(BOPBlocks.PALM_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "palm_button", new ItemStack(BOPBlocks.PALM_BUTTON.get(), 6), "sP", 'P', BOPBlocks.PALM_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "palm_chest", new ItemStack(BOPBlocks.PALM_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_PALM, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "palm_door", new ItemStack(BOPBlocks.PALM_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.PALM_PLANKS.get()), 'T', new ItemStack(BOPBlocks.PALM_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "palm_fence", new ItemStack(BOPBlocks.PALM_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.PALM_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "palm_fence_gate", new ItemStack(BOPBlocks.PALM_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.PALM_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "palm_planks", new ItemStack(BOPBlocks.PALM_PLANKS.get(), 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_PALM);
            VanillaRecipeHelper.addShapedRecipe(provider, "palm_pressure_plate", new ItemStack(BOPBlocks.PALM_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.PALM_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "palm_trapdoor", new ItemStack(BOPBlocks.PALM_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.PALM_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("palm_door").inputItems(new ItemStack(BOPBlocks.PALM_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.PALM_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.PALM_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("palm_fence").inputItems(new ItemStack(BOPBlocks.PALM_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.PALM_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("palm_fence_gate").inputItems(new ItemStack(BOPBlocks.PALM_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.PALM_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("palm_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.PALM_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.PALM_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("palm_sign").inputItems(new ItemStack(BOPBlocks.PALM_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.PALM_SIGN.get(), 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("palm_stairs").inputItems(new ItemStack(BOPBlocks.PALM_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.PALM_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "redwood_boat", new ItemStack(BOPItems.REDWOOD_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.REDWOOD_PLANKS.get()), 'S', new ItemStack(BOPBlocks.REDWOOD_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "redwood_button", new ItemStack(BOPBlocks.REDWOOD_BUTTON.get(), 6), "sP", 'P', BOPBlocks.REDWOOD_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "redwood_chest", new ItemStack(BOPBlocks.REDWOOD_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_REDWOOD, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "redwood_door", new ItemStack(BOPBlocks.REDWOOD_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.REDWOOD_PLANKS.get()), 'T', new ItemStack(BOPBlocks.REDWOOD_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "redwood_fence", new ItemStack(BOPBlocks.REDWOOD_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.REDWOOD_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "redwood_fence_gate", new ItemStack(BOPBlocks.REDWOOD_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.REDWOOD_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "redwood_planks", new ItemStack(BOPBlocks.REDWOOD_PLANKS.get(), 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_REDWOOD);
            VanillaRecipeHelper.addShapedRecipe(provider, "redwood_pressure_plate", new ItemStack(BOPBlocks.REDWOOD_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.REDWOOD_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "redwood_trapdoor", new ItemStack(BOPBlocks.REDWOOD_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.REDWOOD_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("redwood_door").inputItems(new ItemStack(BOPBlocks.REDWOOD_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.REDWOOD_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.REDWOOD_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("redwood_fence").inputItems(new ItemStack(BOPBlocks.REDWOOD_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.REDWOOD_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("redwood_fence_gate").inputItems(new ItemStack(BOPBlocks.REDWOOD_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.REDWOOD_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("redwood_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.REDWOOD_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.REDWOOD_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("redwood_sign").inputItems(new ItemStack(BOPBlocks.REDWOOD_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.REDWOOD_SIGN.get(), 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("redwood_stairs").inputItems(new ItemStack(BOPBlocks.REDWOOD_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.REDWOOD_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "umbran_boat", new ItemStack(BOPItems.UMBRAN_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.UMBRAN_PLANKS.get()), 'S', new ItemStack(BOPBlocks.UMBRAN_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "umbran_button", new ItemStack(BOPBlocks.UMBRAN_BUTTON.get(), 6), "sP", 'P', BOPBlocks.UMBRAN_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "umbran_chest", new ItemStack(BOPBlocks.UMBRAN_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_UMBRAN, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "umbran_door", new ItemStack(BOPBlocks.UMBRAN_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.UMBRAN_PLANKS.get()), 'T', new ItemStack(BOPBlocks.UMBRAN_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "umbran_fence", new ItemStack(BOPBlocks.UMBRAN_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.UMBRAN_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "umbran_fence_gate", new ItemStack(BOPBlocks.UMBRAN_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.UMBRAN_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "umbran_planks", new ItemStack(BOPBlocks.UMBRAN_PLANKS.get(), 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_UMBRAN);
            VanillaRecipeHelper.addShapedRecipe(provider, "umbran_pressure_plate", new ItemStack(BOPBlocks.UMBRAN_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.UMBRAN_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "umbran_trapdoor", new ItemStack(BOPBlocks.UMBRAN_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.UMBRAN_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("umbran_door").inputItems(new ItemStack(BOPBlocks.UMBRAN_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.UMBRAN_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.UMBRAN_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("umbran_fence").inputItems(new ItemStack(BOPBlocks.UMBRAN_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.UMBRAN_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("umbran_fence_gate").inputItems(new ItemStack(BOPBlocks.UMBRAN_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.UMBRAN_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("umbran_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.UMBRAN_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.UMBRAN_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("umbran_sign").inputItems(new ItemStack(BOPBlocks.UMBRAN_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.UMBRAN_SIGN.get(), 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("umbran_stairs").inputItems(new ItemStack(BOPBlocks.UMBRAN_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.UMBRAN_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "willow_boat", new ItemStack(BOPItems.WILLOW_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.WILLOW_PLANKS.get()), 'S', new ItemStack(BOPBlocks.WILLOW_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "willow_button", new ItemStack(BOPBlocks.WILLOW_BUTTON.get(), 6), "sP", 'P', BOPBlocks.WILLOW_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "willow_chest", new ItemStack(BOPBlocks.WILLOW_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BiomesOPlenty_WILLOW, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "willow_door", new ItemStack(BOPBlocks.WILLOW_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.WILLOW_PLANKS.get()), 'T', new ItemStack(BOPBlocks.WILLOW_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "willow_fence", new ItemStack(BOPBlocks.WILLOW_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.WILLOW_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "willow_fence_gate", new ItemStack(BOPBlocks.WILLOW_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.WILLOW_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "willow_planks", new ItemStack(BOPBlocks.WILLOW_PLANKS.get(), 2), "L", 'L', BiomesOPlentyTags.ModTags.BOP_WILLOW);
            VanillaRecipeHelper.addShapedRecipe(provider, "willow_pressure_plate", new ItemStack(BOPBlocks.WILLOW_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.WILLOW_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "willow_trapdoor", new ItemStack(BOPBlocks.WILLOW_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.WILLOW_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("willow_door").inputItems(new ItemStack(BOPBlocks.WILLOW_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.WILLOW_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.WILLOW_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("willow_fence").inputItems(new ItemStack(BOPBlocks.WILLOW_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.WILLOW_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("willow_fence_gate").inputItems(new ItemStack(BOPBlocks.WILLOW_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.WILLOW_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("willow_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.WILLOW_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.WILLOW_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("willow_sign").inputItems(new ItemStack(BOPBlocks.WILLOW_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.WILLOW_SIGN.get(), 3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("willow_stairs").inputItems(new ItemStack(BOPBlocks.WILLOW_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.WILLOW_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);
        } else {

        }
        VanillaRecipeHelper.addShapedRecipe(provider, "dead_planks_saw", new ItemStack(BOPBlocks.DEAD_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_DEAD);
        VanillaRecipeHelper.addShapedRecipe(provider, "dead_fence_gate", new ItemStack(BOPBlocks.DEAD_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.DEAD_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "fir_planks_saw", new ItemStack(BOPBlocks.FIR_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_FIR);
        VanillaRecipeHelper.addShapedRecipe(provider, "fir_fence_gate", new ItemStack(BOPBlocks.FIR_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.FIR_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_planks_saw", new ItemStack(BOPBlocks.HELLBARK_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_HELLBARK);
        VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_fence_gate", new ItemStack(BOPBlocks.HELLBARK_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.HELLBARK_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_planks_saw", new ItemStack(BOPBlocks.JACARANDA_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_JACARANDA);
        VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_fence_gate", new ItemStack(BOPBlocks.JACARANDA_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.JACARANDA_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "magic_planks_saw", new ItemStack(BOPBlocks.MAGIC_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_MAGIC);
        VanillaRecipeHelper.addShapedRecipe(provider, "magic_fence_gate", new ItemStack(BOPBlocks.MAGIC_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.MAGIC_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_planks_saw", new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_MAHOGANY);
        VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_fence_gate", new ItemStack(BOPBlocks.MAHOGANY_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "palm_planks_saw", new ItemStack(BOPBlocks.PALM_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_PALM);
        VanillaRecipeHelper.addShapedRecipe(provider, "palm_fence_gate", new ItemStack(BOPBlocks.PALM_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.PALM_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "redwood_planks_saw", new ItemStack(BOPBlocks.REDWOOD_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_REDWOOD);
        VanillaRecipeHelper.addShapedRecipe(provider, "redwood_fence_gate", new ItemStack(BOPBlocks.REDWOOD_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.REDWOOD_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "umbran_planks_saw", new ItemStack(BOPBlocks.UMBRAN_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_UMBRAN);
        VanillaRecipeHelper.addShapedRecipe(provider, "umbran_fence_gate", new ItemStack(BOPBlocks.UMBRAN_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.UMBRAN_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "willow_planks_saw", new ItemStack(BOPBlocks.WILLOW_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', BiomesOPlentyTags.ModTags.BOP_WILLOW);
        VanillaRecipeHelper.addShapedRecipe(provider, "willow_fence_gate", new ItemStack(BOPBlocks.WILLOW_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.WILLOW_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
    }
}