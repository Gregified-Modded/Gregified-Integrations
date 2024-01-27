package com.therealm18studios.gregifiedintegrations.data.recipe.configurable;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.item.BOPItems;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.hollingsworth.arsnouveau.setup.registry.BlockRegistry;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import com.therealm18studios.gregifiedintegrations.data.tags.GIModTags;
import dan200.computercraft.shared.ModRegistry;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import twilightforest.init.TFBlocks;
import twilightforest.init.TFItems;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.ULV;
import static com.gregtechceu.gtceu.api.GTValues.VA;

public class GIRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        harderArsNouveauRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipes.harderArsNouveauRecipes) harderArsNouveauRecipes(provider);
        harderBiomesOPlentyRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipes.harderBiomesOPlentyRecipes) harderBiomesOPlentyRecipes(provider);
        harderCCTweakedRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipes.harderCCTweakedRecipes) harderCCTweakedRecipes(provider);
//        harderProductiveBeesRecipes(provider);
//        if (TR18SGIConfigHolder.INSTANCE.recipes.harderProductiveBeesRecipes) harderProductiveBeesRecipes(provider);
        harderTheTwilightForestRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipes.harderTheTwilightForestRecipes) harderTheTwilightForestRecipes(provider);
    }

    private static void harderArsNouveauRecipes(Consumer<FinishedRecipe> provider){

        boolean nerfed = GIConfigHolder.INSTANCE.recipes.harderArsNouveauRecipes;
        if (nerfed) {
            VanillaRecipeHelper.addShapedRecipe(provider, "archwood_button", new ItemStack(BlockRegistry.ARCHWOOD_BUTTON, 6), "sP", 'P', BlockRegistry.ARCHWOOD_PLANK);
            VanillaRecipeHelper.addShapedRecipe(provider, "archwood_chest", new ItemStack(BlockRegistry.ARCHWOOD_CHEST), "FFF","FCF","FFF", 'F', GIModTags.ModTags.ARSNOUVEAU_ARCHWOOD, 'C', GIModTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "archwood_door", new ItemStack(BlockRegistry.ARCHWOOD_DOOR), "PTd", "PRS", "PPs", 'P', new ItemStack(BlockRegistry.ARCHWOOD_PLANK), 'T', new ItemStack(BlockRegistry.ARCHWOOD_TRAPDOOR), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "archwood_fence", new ItemStack(BlockRegistry.ARCHWOOD_FENCE), "PSP", "PSP", "PSP", 'P', new ItemStack(BlockRegistry.ARCHWOOD_PLANK), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "archwood_fence_gate", new ItemStack(BlockRegistry.ARCHWOOD_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BlockRegistry.ARCHWOOD_PLANK), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "archwood_planks", new ItemStack(BlockRegistry.ARCHWOOD_PLANK, 2), "L", 'L', GIModTags.ModTags.ARSNOUVEAU_ARCHWOOD);
            VanillaRecipeHelper.addShapedRecipe(provider, "archwood_pressure_plate", new ItemStack(BlockRegistry.ARCHWOOD_PPlate, 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BlockRegistry.ARCHWOOD_SLABS, 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "archwood_trapdoor", new ItemStack(BlockRegistry.ARCHWOOD_TRAPDOOR), "SRS", "RRR", "SRS", 'S', new ItemStack(BlockRegistry.ARCHWOOD_SLABS), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("archwood_door").inputItems(new ItemStack(BlockRegistry.ARCHWOOD_TRAPDOOR)).inputItems(new ItemStack(BlockRegistry.ARCHWOOD_PLANK, 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BlockRegistry.ARCHWOOD_DOOR)).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("archwood_fence").inputItems(new ItemStack(BlockRegistry.ARCHWOOD_PLANK)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BlockRegistry.ARCHWOOD_FENCE)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("archwood_fence_gate").inputItems(new ItemStack(BlockRegistry.ARCHWOOD_PLANK, 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BlockRegistry.ARCHWOOD_FENCE_GATE)).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("archwood_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BlockRegistry.ARCHWOOD_SLABS, 2)).outputItems(new ItemStack(BlockRegistry.ARCHWOOD_PPlate, 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("archwood_stairs").inputItems(new ItemStack(BlockRegistry.ARCHWOOD_PLANK, 6)).outputItems(new ItemStack(BlockRegistry.ARCHWOOD_STAIRS)).circuitMeta(7).duration(100).EUt(1).save(provider);

        }
        else {

        }
        VanillaRecipeHelper.addShapedRecipe(provider, "archwood_planks_saw", new ItemStack(BlockRegistry.ARCHWOOD_PLANK, nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.ARSNOUVEAU_ARCHWOOD);
        VanillaRecipeHelper.addShapedRecipe(provider, "archwood_fence_gate", new ItemStack(BlockRegistry.ARCHWOOD_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BlockRegistry.ARCHWOOD_PLANK), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
    }

    private static void harderBiomesOPlentyRecipes(Consumer<FinishedRecipe> provider){

        boolean nerfed = GIConfigHolder.INSTANCE.recipes.harderBiomesOPlentyRecipes;
        if (nerfed) {
            VanillaRecipeHelper.addShapedRecipe(provider, "dead_boat", new ItemStack(BOPItems.DEAD_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.DEAD_PLANKS.get()), 'S', new ItemStack(BOPBlocks.DEAD_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "dead_button", new ItemStack(BOPBlocks.DEAD_BUTTON.get(), 6), "sP", 'P', BOPBlocks.DEAD_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "dead_chest", new ItemStack(BOPBlocks.DEAD_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BOP_DEAD, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "dead_door", new ItemStack(BOPBlocks.DEAD_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.DEAD_PLANKS.get()), 'T', new ItemStack(BOPBlocks.DEAD_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "dead_fence", new ItemStack(BOPBlocks.DEAD_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.DEAD_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "dead_fence_gate", new ItemStack(BOPBlocks.DEAD_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.DEAD_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "dead_planks", new ItemStack(BOPBlocks.DEAD_PLANKS.get(), 2), "L", 'L', GIModTags.ModTags.BOP_DEAD);
            VanillaRecipeHelper.addShapedRecipe(provider, "dead_pressure_plate", new ItemStack(BOPBlocks.DEAD_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.DEAD_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "dead_trapdoor", new ItemStack(BOPBlocks.DEAD_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.DEAD_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dead_door").inputItems(new ItemStack(BOPBlocks.DEAD_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.DEAD_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.DEAD_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dead_fence").inputItems(new ItemStack(BOPBlocks.DEAD_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.DEAD_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dead_fence_gate").inputItems(new ItemStack(BOPBlocks.DEAD_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.DEAD_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dead_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.DEAD_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.DEAD_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dead_sign").inputItems(new ItemStack(BOPBlocks.DEAD_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.DEAD_SIGN.get(),3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dead_stairs").inputItems(new ItemStack(BOPBlocks.DEAD_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.DEAD_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "fir_boat", new ItemStack(BOPItems.FIR_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.FIR_PLANKS.get()), 'S', new ItemStack(BOPBlocks.FIR_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "fir_button", new ItemStack(BOPBlocks.FIR_BUTTON.get(), 6), "sP", 'P', BOPBlocks.FIR_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "fir_chest", new ItemStack(BOPBlocks.FIR_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BOP_FIR, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "fir_door", new ItemStack(BOPBlocks.FIR_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.FIR_PLANKS.get()), 'T', new ItemStack(BOPBlocks.FIR_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "fir_fence", new ItemStack(BOPBlocks.FIR_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.FIR_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "fir_fence_gate", new ItemStack(BOPBlocks.FIR_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.FIR_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "fir_planks", new ItemStack(BOPBlocks.FIR_PLANKS.get(), 2), "L", 'L', GIModTags.ModTags.BOP_FIR);
            VanillaRecipeHelper.addShapedRecipe(provider, "fir_pressure_plate", new ItemStack(BOPBlocks.FIR_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.FIR_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "fir_trapdoor", new ItemStack(BOPBlocks.FIR_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.FIR_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("fir_door").inputItems(new ItemStack(BOPBlocks.FIR_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.FIR_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.FIR_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("fir_fence").inputItems(new ItemStack(BOPBlocks.FIR_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.FIR_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("fir_fence_gate").inputItems(new ItemStack(BOPBlocks.FIR_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.FIR_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("fir_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.FIR_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.FIR_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("fir_sign").inputItems(new ItemStack(BOPBlocks.FIR_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.FIR_SIGN.get(),3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("fir_stairs").inputItems(new ItemStack(BOPBlocks.FIR_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.FIR_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_boat", new ItemStack(BOPItems.HELLBARK_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.HELLBARK_PLANKS.get()), 'S', new ItemStack(BOPBlocks.HELLBARK_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_button", new ItemStack(BOPBlocks.HELLBARK_BUTTON.get(), 6), "sP", 'P', BOPBlocks.HELLBARK_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_chest", new ItemStack(BOPBlocks.HELLBARK_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BOP_HELLBARK, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_door", new ItemStack(BOPBlocks.HELLBARK_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.HELLBARK_PLANKS.get()), 'T', new ItemStack(BOPBlocks.HELLBARK_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_fence", new ItemStack(BOPBlocks.HELLBARK_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.HELLBARK_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_fence_gate", new ItemStack(BOPBlocks.HELLBARK_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.HELLBARK_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_planks", new ItemStack(BOPBlocks.HELLBARK_PLANKS.get(), 2), "L", 'L', GIModTags.ModTags.BOP_HELLBARK);
            VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_pressure_plate", new ItemStack(BOPBlocks.HELLBARK_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.HELLBARK_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_trapdoor", new ItemStack(BOPBlocks.HELLBARK_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.HELLBARK_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("hellbark_door").inputItems(new ItemStack(BOPBlocks.HELLBARK_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.HELLBARK_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.HELLBARK_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("hellbark_fence").inputItems(new ItemStack(BOPBlocks.HELLBARK_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.HELLBARK_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("hellbark_fence_gate").inputItems(new ItemStack(BOPBlocks.HELLBARK_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.HELLBARK_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("hellbark_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.HELLBARK_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.HELLBARK_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("hellbark_sign").inputItems(new ItemStack(BOPBlocks.HELLBARK_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.HELLBARK_SIGN.get(),3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("hellbark_stairs").inputItems(new ItemStack(BOPBlocks.HELLBARK_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.HELLBARK_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_boat", new ItemStack(BOPItems.JACARANDA_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.JACARANDA_PLANKS.get()), 'S', new ItemStack(BOPBlocks.JACARANDA_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_button", new ItemStack(BOPBlocks.JACARANDA_BUTTON.get(), 6), "sP", 'P', BOPBlocks.JACARANDA_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_chest", new ItemStack(BOPBlocks.JACARANDA_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BOP_JACARANDA, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_door", new ItemStack(BOPBlocks.JACARANDA_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.JACARANDA_PLANKS.get()), 'T', new ItemStack(BOPBlocks.JACARANDA_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_fence", new ItemStack(BOPBlocks.JACARANDA_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.JACARANDA_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_fence_gate", new ItemStack(BOPBlocks.JACARANDA_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.JACARANDA_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_planks", new ItemStack(BOPBlocks.JACARANDA_PLANKS.get(), 2), "L", 'L', GIModTags.ModTags.BOP_JACARANDA);
            VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_pressure_plate", new ItemStack(BOPBlocks.JACARANDA_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.JACARANDA_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_trapdoor", new ItemStack(BOPBlocks.JACARANDA_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.JACARANDA_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("jacaranda_door").inputItems(new ItemStack(BOPBlocks.JACARANDA_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.JACARANDA_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.JACARANDA_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("jacaranda_fence").inputItems(new ItemStack(BOPBlocks.JACARANDA_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.JACARANDA_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("jacaranda_fence_gate").inputItems(new ItemStack(BOPBlocks.JACARANDA_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.JACARANDA_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("jacaranda_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.JACARANDA_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.JACARANDA_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("jacarandasign").inputItems(new ItemStack(BOPBlocks.JACARANDA_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.JACARANDA_SIGN.get(),3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("jacaranda_stairs").inputItems(new ItemStack(BOPBlocks.JACARANDA_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.JACARANDA_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "magic_boat", new ItemStack(BOPItems.MAGIC_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.MAGIC_PLANKS.get()), 'S', new ItemStack(BOPBlocks.MAGIC_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "magic_button", new ItemStack(BOPBlocks.MAGIC_BUTTON.get(), 6), "sP", 'P', BOPBlocks.MAGIC_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "magic_chest", new ItemStack(BOPBlocks.MAGIC_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BOP_MAGIC, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "magic_door", new ItemStack(BOPBlocks.MAGIC_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.MAGIC_PLANKS.get()), 'T', new ItemStack(BOPBlocks.MAGIC_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "magic_fence", new ItemStack(BOPBlocks.MAGIC_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.MAGIC_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "magic_fence_gate", new ItemStack(BOPBlocks.MAGIC_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.MAGIC_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "magic_planks", new ItemStack(BOPBlocks.MAGIC_PLANKS.get(), 2), "L", 'L', GIModTags.ModTags.BOP_MAGIC);
            VanillaRecipeHelper.addShapedRecipe(provider, "magic_pressure_plate", new ItemStack(BOPBlocks.MAGIC_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.MAGIC_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "magic_trapdoor", new ItemStack(BOPBlocks.MAGIC_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.MAGIC_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("magic_door").inputItems(new ItemStack(BOPBlocks.MAGIC_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.MAGIC_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.MAGIC_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("magic_fence").inputItems(new ItemStack(BOPBlocks.MAGIC_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.MAGIC_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("magic_fence_gate").inputItems(new ItemStack(BOPBlocks.MAGIC_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.MAGIC_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("magic_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.MAGIC_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.MAGIC_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("magic_sign").inputItems(new ItemStack(BOPBlocks.MAGIC_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.MAGIC_SIGN.get(),3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("magic_stairs").inputItems(new ItemStack(BOPBlocks.MAGIC_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.MAGIC_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_boat", new ItemStack(BOPItems.MAHOGANY_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get()), 'S', new ItemStack(BOPBlocks.MAHOGANY_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_button", new ItemStack(BOPBlocks.MAHOGANY_BUTTON.get(), 6), "sP", 'P', BOPBlocks.MAHOGANY_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_chest", new ItemStack(BOPBlocks.MAHOGANY_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BOP_MAHOGANY, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_door", new ItemStack(BOPBlocks.MAHOGANY_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get()), 'T', new ItemStack(BOPBlocks.MAHOGANY_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_fence", new ItemStack(BOPBlocks.MAHOGANY_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_fence_gate", new ItemStack(BOPBlocks.MAHOGANY_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_planks", new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get(), 2), "L", 'L', GIModTags.ModTags.BOP_MAHOGANY);
            VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_pressure_plate", new ItemStack(BOPBlocks.MAHOGANY_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.MAHOGANY_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_trapdoor", new ItemStack(BOPBlocks.MAHOGANY_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.MAHOGANY_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mahogany_door").inputItems(new ItemStack(BOPBlocks.MAHOGANY_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.MAHOGANY_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mahogany_fence").inputItems(new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.MAHOGANY_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mahogany_fence_gate").inputItems(new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.MAHOGANY_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mahogany_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.MAHOGANY_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.MAHOGANY_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mahogany_sign").inputItems(new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.MAHOGANY_SIGN.get(),3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mahogany_stairs").inputItems(new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.MAHOGANY_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "palm_boat", new ItemStack(BOPItems.PALM_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.PALM_PLANKS.get()), 'S', new ItemStack(BOPBlocks.PALM_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "palm_button", new ItemStack(BOPBlocks.PALM_BUTTON.get(), 6), "sP", 'P', BOPBlocks.PALM_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "palm_chest", new ItemStack(BOPBlocks.PALM_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BOP_PALM, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "palm_door", new ItemStack(BOPBlocks.PALM_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.PALM_PLANKS.get()), 'T', new ItemStack(BOPBlocks.PALM_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "palm_fence", new ItemStack(BOPBlocks.PALM_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.PALM_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "palm_fence_gate", new ItemStack(BOPBlocks.PALM_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.PALM_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "palm_planks", new ItemStack(BOPBlocks.PALM_PLANKS.get(), 2), "L", 'L', GIModTags.ModTags.BOP_PALM);
            VanillaRecipeHelper.addShapedRecipe(provider, "palm_pressure_plate", new ItemStack(BOPBlocks.PALM_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.PALM_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "palm_trapdoor", new ItemStack(BOPBlocks.PALM_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.PALM_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("palm_door").inputItems(new ItemStack(BOPBlocks.PALM_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.PALM_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.PALM_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("palm_fence").inputItems(new ItemStack(BOPBlocks.PALM_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.PALM_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("palm_fence_gate").inputItems(new ItemStack(BOPBlocks.PALM_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.PALM_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("palm_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.PALM_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.PALM_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("palm_sign").inputItems(new ItemStack(BOPBlocks.PALM_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.PALM_SIGN.get(),3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("palm_stairs").inputItems(new ItemStack(BOPBlocks.PALM_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.PALM_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "redwood_boat", new ItemStack(BOPItems.REDWOOD_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.REDWOOD_PLANKS.get()), 'S', new ItemStack(BOPBlocks.REDWOOD_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "redwood_button", new ItemStack(BOPBlocks.REDWOOD_BUTTON.get(), 6), "sP", 'P', BOPBlocks.REDWOOD_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "redwood_chest", new ItemStack(BOPBlocks.REDWOOD_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BOP_REDWOOD, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "redwood_door", new ItemStack(BOPBlocks.REDWOOD_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.REDWOOD_PLANKS.get()), 'T', new ItemStack(BOPBlocks.REDWOOD_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "redwood_fence", new ItemStack(BOPBlocks.REDWOOD_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.REDWOOD_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "redwood_fence_gate", new ItemStack(BOPBlocks.REDWOOD_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.REDWOOD_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "redwood_planks", new ItemStack(BOPBlocks.REDWOOD_PLANKS.get(), 2), "L", 'L', GIModTags.ModTags.BOP_REDWOOD);
            VanillaRecipeHelper.addShapedRecipe(provider, "redwood_pressure_plate", new ItemStack(BOPBlocks.REDWOOD_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.REDWOOD_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "redwood_trapdoor", new ItemStack(BOPBlocks.REDWOOD_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.REDWOOD_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("redwood_door").inputItems(new ItemStack(BOPBlocks.REDWOOD_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.REDWOOD_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.REDWOOD_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("redwood_fence").inputItems(new ItemStack(BOPBlocks.REDWOOD_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.REDWOOD_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("redwood_fence_gate").inputItems(new ItemStack(BOPBlocks.REDWOOD_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.REDWOOD_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("redwood_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.REDWOOD_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.REDWOOD_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("redwood_sign").inputItems(new ItemStack(BOPBlocks.REDWOOD_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.REDWOOD_SIGN.get(),3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("redwood_stairs").inputItems(new ItemStack(BOPBlocks.REDWOOD_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.REDWOOD_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "umbran_boat", new ItemStack(BOPItems.UMBRAN_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.UMBRAN_PLANKS.get()), 'S', new ItemStack(BOPBlocks.UMBRAN_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "umbran_button", new ItemStack(BOPBlocks.UMBRAN_BUTTON.get(), 6), "sP", 'P', BOPBlocks.UMBRAN_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "umbran_chest", new ItemStack(BOPBlocks.UMBRAN_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BOP_UMBRAN, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "umbran_door", new ItemStack(BOPBlocks.UMBRAN_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.UMBRAN_PLANKS.get()), 'T', new ItemStack(BOPBlocks.UMBRAN_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "umbran_fence", new ItemStack(BOPBlocks.UMBRAN_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.UMBRAN_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "umbran_fence_gate", new ItemStack(BOPBlocks.UMBRAN_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.UMBRAN_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "umbran_planks", new ItemStack(BOPBlocks.UMBRAN_PLANKS.get(), 2), "L", 'L', GIModTags.ModTags.BOP_UMBRAN);
            VanillaRecipeHelper.addShapedRecipe(provider, "umbran_pressure_plate", new ItemStack(BOPBlocks.UMBRAN_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.UMBRAN_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "umbran_trapdoor", new ItemStack(BOPBlocks.UMBRAN_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.UMBRAN_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("umbran_door").inputItems(new ItemStack(BOPBlocks.UMBRAN_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.UMBRAN_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.UMBRAN_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("umbran_fence").inputItems(new ItemStack(BOPBlocks.UMBRAN_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.UMBRAN_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("umbran_fence_gate").inputItems(new ItemStack(BOPBlocks.UMBRAN_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.UMBRAN_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("umbran_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.UMBRAN_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.UMBRAN_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("umbran_sign").inputItems(new ItemStack(BOPBlocks.UMBRAN_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.UMBRAN_SIGN.get(),3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("umbran_stairs").inputItems(new ItemStack(BOPBlocks.UMBRAN_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.UMBRAN_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "willow_boat", new ItemStack(BOPItems.WILLOW_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(BOPBlocks.WILLOW_PLANKS.get()), 'S', new ItemStack(BOPBlocks.WILLOW_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "willow_button", new ItemStack(BOPBlocks.WILLOW_BUTTON.get(), 6), "sP", 'P', BOPBlocks.WILLOW_PLANKS.get());
//            VanillaRecipeHelper.addShapedRecipe(provider, "willow_chest", new ItemStack(BOPBlocks.WILLOW_CHEST), "FFF","FCF","FFF", 'F', TR18SGIModTags.Blocks.BOP_WILLOW, 'C', TR18SGIModTags.Blocks.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "willow_door", new ItemStack(BOPBlocks.WILLOW_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(BOPBlocks.WILLOW_PLANKS.get()), 'T', new ItemStack(BOPBlocks.WILLOW_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "willow_fence", new ItemStack(BOPBlocks.WILLOW_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(BOPBlocks.WILLOW_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "willow_fence_gate", new ItemStack(BOPBlocks.WILLOW_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.WILLOW_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "willow_planks", new ItemStack(BOPBlocks.WILLOW_PLANKS.get(), 2), "L", 'L', GIModTags.ModTags.BOP_WILLOW);
            VanillaRecipeHelper.addShapedRecipe(provider, "willow_pressure_plate", new ItemStack(BOPBlocks.WILLOW_PRESSURE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BOPBlocks.WILLOW_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "willow_trapdoor", new ItemStack(BOPBlocks.WILLOW_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(BOPBlocks.WILLOW_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("willow_door").inputItems(new ItemStack(BOPBlocks.WILLOW_TRAPDOOR.get())).inputItems(new ItemStack(BOPBlocks.WILLOW_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.WILLOW_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("willow_fence").inputItems(new ItemStack(BOPBlocks.WILLOW_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BOPBlocks.WILLOW_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("willow_fence_gate").inputItems(new ItemStack(BOPBlocks.WILLOW_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BOPBlocks.WILLOW_FENCE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("willow_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BOPBlocks.WILLOW_SLAB.get(), 2)).outputItems(new ItemStack(BOPBlocks.WILLOW_PRESSURE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("willow_sign").inputItems(new ItemStack(BOPBlocks.WILLOW_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(BOPBlocks.WILLOW_SIGN.get(),3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("willow_stairs").inputItems(new ItemStack(BOPBlocks.WILLOW_PLANKS.get(), 6)).outputItems(new ItemStack(BOPBlocks.WILLOW_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);
        }
        else {

        }
        VanillaRecipeHelper.addShapedRecipe(provider, "dead_planks_saw", new ItemStack(BOPBlocks.DEAD_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.BOP_DEAD);
        VanillaRecipeHelper.addShapedRecipe(provider, "dead_fence_gate", new ItemStack(BOPBlocks.DEAD_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.DEAD_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "fir_planks_saw", new ItemStack(BOPBlocks.FIR_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.BOP_FIR);
        VanillaRecipeHelper.addShapedRecipe(provider, "fir_fence_gate", new ItemStack(BOPBlocks.FIR_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.FIR_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_planks_saw", new ItemStack(BOPBlocks.HELLBARK_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.BOP_HELLBARK);
        VanillaRecipeHelper.addShapedRecipe(provider, "hellbark_fence_gate", new ItemStack(BOPBlocks.HELLBARK_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.HELLBARK_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_planks_saw", new ItemStack(BOPBlocks.JACARANDA_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.BOP_JACARANDA);
        VanillaRecipeHelper.addShapedRecipe(provider, "jacaranda_fence_gate", new ItemStack(BOPBlocks.JACARANDA_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.JACARANDA_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "magic_planks_saw", new ItemStack(BOPBlocks.MAGIC_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.BOP_MAGIC);
        VanillaRecipeHelper.addShapedRecipe(provider, "magic_fence_gate", new ItemStack(BOPBlocks.MAGIC_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.MAGIC_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_planks_saw", new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.BOP_MAHOGANY);
        VanillaRecipeHelper.addShapedRecipe(provider, "mahogany_fence_gate", new ItemStack(BOPBlocks.MAHOGANY_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "palm_planks_saw", new ItemStack(BOPBlocks.PALM_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.BOP_PALM);
        VanillaRecipeHelper.addShapedRecipe(provider, "palm_fence_gate", new ItemStack(BOPBlocks.PALM_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.PALM_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "redwood_planks_saw", new ItemStack(BOPBlocks.REDWOOD_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.BOP_REDWOOD);
        VanillaRecipeHelper.addShapedRecipe(provider, "redwood_fence_gate", new ItemStack(BOPBlocks.REDWOOD_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.REDWOOD_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "umbran_planks_saw", new ItemStack(BOPBlocks.UMBRAN_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.BOP_UMBRAN);
        VanillaRecipeHelper.addShapedRecipe(provider, "umbran_fence_gate", new ItemStack(BOPBlocks.UMBRAN_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.UMBRAN_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "willow_planks_saw", new ItemStack(BOPBlocks.WILLOW_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.BOP_WILLOW);
        VanillaRecipeHelper.addShapedRecipe(provider, "willow_fence_gate", new ItemStack(BOPBlocks.WILLOW_FENCE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(BOPBlocks.WILLOW_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
    }

    private static void harderCCTweakedRecipes(Consumer<FinishedRecipe> provider){

        boolean nerfed = GIConfigHolder.INSTANCE.recipes.harderCCTweakedRecipes;
        if (nerfed) {
            VanillaRecipeHelper.addShapedRecipe(provider, "cable", new ItemStack(ModRegistry.Items.CABLE.get(), 4), "CCC","CPC", "CCC", 'P', new UnificationEntry(TagPrefix.wireFine, GTMaterials.RedAlloy), 'C', GTItems.CARBON_FIBER_PLATE);
            VanillaRecipeHelper.addShapedRecipe(provider, "computer_advanced", new ItemStack(ModRegistry.Blocks.COMPUTER_ADVANCED.get()), "PCP","PMP", "SCS", 'P', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TantalumCarbide), 'C', GIModTags.ModTags.GTCEU_CIRCUITS_ZPM, 'S', GTItems.TOOL_DATA_ORB.asStack(), 'M', GTItems.COVER_MACHINE_CONTROLLER.asStack());
            VanillaRecipeHelper.addShapedRecipe(provider, "computer_normal", new ItemStack(ModRegistry.Blocks.COMPUTER_NORMAL.get()), "PCP","PMP", "SCS", 'P', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.BlackSteel), 'C', GIModTags.ModTags.GTCEU_CIRCUITS_IV, 'S', GTItems.TOOL_DATA_STICK.asStack(), 'M', GTItems.COVER_MACHINE_CONTROLLER.asStack());
            VanillaRecipeHelper.addShapedRecipe(provider, "disk_drive", new ItemStack(ModRegistry.Blocks.DISK_DRIVE.get()), "CCC","CPC", "CCC", 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.BlackSteel), 'P', GIModTags.ModTags.GTCEU_CIRCUITS_LUV);
            VanillaRecipeHelper.addShapedRecipe(provider, "monitor_advanced", new ItemStack(ModRegistry.Blocks.MONITOR_ADVANCED.get()), "CCC","CPC", "CCC", 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TantalumCarbide), 'P', GTItems.COVER_MACHINE_CONTROLLER.asStack());
            VanillaRecipeHelper.addShapedRecipe(provider, "monitor_normal", new ItemStack(ModRegistry.Blocks.MONITOR_NORMAL.get()), "CCC","CPC", "CCC", 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.BlackSteel), 'P', GTItems.COVER_MACHINE_CONTROLLER.asStack());
            VanillaRecipeHelper.addShapedRecipe(provider, "new_pocket_computer_advanced", new ItemStack(ModRegistry.Items.POCKET_COMPUTER_ADVANCED.get()), "CPC","CMC", "CSC", 'P', GTItems.TOOL_DATA_ORB.asStack(), 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TantalumCarbide), 'S', GIModTags.ModTags.GTCEU_CIRCUITS_ZPM, 'M', GTItems.COVER_MACHINE_CONTROLLER.asStack());
            VanillaRecipeHelper.addShapedRecipe(provider, "new_pocket_computer_normal", new ItemStack(ModRegistry.Items.POCKET_COMPUTER_NORMAL.get()), "CPC","CMC", "CSC", 'P', GTItems.TOOL_DATA_STICK.asStack(), 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.BlackSteel), 'S', GIModTags.ModTags.GTCEU_CIRCUITS_IV, 'M', GTItems.COVER_MACHINE_CONTROLLER.asStack());
            VanillaRecipeHelper.addShapedRecipe(provider, "printer", new ItemStack(ModRegistry.Blocks.PRINTER.get()), "CMC","CPC", "CPC", 'M', GTItems.COVER_MACHINE_CONTROLLER.asStack(), 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.BlackSteel), 'P', GIModTags.ModTags.GTCEU_CIRCUITS_IV);
            VanillaRecipeHelper.addShapedRecipe(provider, "new_speaker", new ItemStack(ModRegistry.Blocks.SPEAKER.get()), "CMC","CPC", "CPC", 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.BlackSteel), 'M', Blocks.NOTE_BLOCK, 'P', GIModTags.ModTags.GTCEU_CIRCUITS_IV);
            VanillaRecipeHelper.addShapedRecipe(provider, "new_turtle_advanced", new ItemStack(ModRegistry.Blocks.TURTLE_ADVANCED.get()), "PCP","TMT", "SCS", 'M', GTItems.COVER_MACHINE_CONTROLLER.asStack(),'S', GTItems.TOOL_DATA_ORB.asStack(), 'P', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TantalumCarbide), 'C', GIModTags.ModTags.GTCEU_CIRCUITS_ZPM, 'T', GIModTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "new_turtle_normal", new ItemStack(ModRegistry.Blocks.TURTLE_NORMAL.get()), "PCP","TMT", "SCS", 'M', GTItems.COVER_MACHINE_CONTROLLER.asStack(),'S', GTItems.TOOL_DATA_STICK.asStack(), 'P', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.BlackSteel), 'C', GIModTags.ModTags.GTCEU_CIRCUITS_IV, 'T', GIModTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "wired_modem", new ItemStack(ModRegistry.Blocks.CABLE.get()), "CCC","CPC", "CCC", 'P', new UnificationEntry(TagPrefix.wireFine, GTMaterials.RedAlloy), 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Tungsten));
            VanillaRecipeHelper.addShapedRecipe(provider, "wireless_modem_advanced", new ItemStack(ModRegistry.Blocks.WIRELESS_MODEM_ADVANCED.get()), "CCC","CPC", "CCC", 'P', Items.ENDER_EYE, 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TantalumCarbide));
            VanillaRecipeHelper.addShapedRecipe(provider, "wireless_modem_normal", new ItemStack(ModRegistry.Blocks.WIRELESS_MODEM_NORMAL.get()), "CCC","CPC", "CCC", 'P', Items.ENDER_EYE, 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Tungsten));

        }
        else {

        }
    }

    private static void harderTheTwilightForestRecipes(Consumer<FinishedRecipe> provider){

        boolean nerfed = GIConfigHolder.INSTANCE.recipes.harderTheTwilightForestRecipes;
        if (nerfed) {
            VanillaRecipeHelper.addShapedRecipe(provider, "canopy_boat", new ItemStack(TFItems.CANOPY_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(TFBlocks.CANOPY_PLANKS.get()), 'S', new ItemStack(TFBlocks.CANOPY_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "canopy_button", new ItemStack(TFBlocks.CANOPY_BUTTON.get(), 6), "sP", 'P', TFBlocks.CANOPY_PLANKS.get());
            VanillaRecipeHelper.addShapedRecipe(provider, "canopy_chest", new ItemStack(TFBlocks.CANOPY_CHEST.get()), "FFF","FCF","FFF", 'F', GIModTags.ModTags.TTF_CANOPY, 'C', GIModTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "canopy_door", new ItemStack(TFBlocks.CANOPY_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(TFBlocks.CANOPY_PLANKS.get()), 'T', new ItemStack(TFBlocks.CANOPY_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "canopy_fence", new ItemStack(TFBlocks.CANOPY_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(TFBlocks.CANOPY_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "canopy_fence_gate", new ItemStack(TFBlocks.CANOPY_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.CANOPY_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "canopy_planks", new ItemStack(TFBlocks.CANOPY_PLANKS.get(), 2), "L", 'L', GIModTags.ModTags.TTF_CANOPY);
            VanillaRecipeHelper.addShapedRecipe(provider, "canopy_pressure_plate", new ItemStack(TFBlocks.CANOPY_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', TFBlocks.CANOPY_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "canopy_trapdoor", new ItemStack(TFBlocks.CANOPY_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(TFBlocks.CANOPY_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("canopy_door").inputItems(new ItemStack(TFBlocks.CANOPY_TRAPDOOR.get())).inputItems(new ItemStack(TFBlocks.CANOPY_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.CANOPY_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("canopy_fence").inputItems(new ItemStack(TFBlocks.CANOPY_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.CANOPY_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("canopy_fence_gate").inputItems(new ItemStack(TFBlocks.CANOPY_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(TFBlocks.CANOPY_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("canopy_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(TFBlocks.CANOPY_SLAB.get(), 2)).outputItems(new ItemStack(TFBlocks.CANOPY_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("canopy_sign").inputItems(new ItemStack(TFBlocks.CANOPY_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(TFBlocks.CANOPY_SIGN.get(),3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("canopy_stairs").inputItems(new ItemStack(TFBlocks.CANOPY_PLANKS.get(), 6)).outputItems(new ItemStack(TFBlocks.CANOPY_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "dark_boat", new ItemStack(TFItems.DARK_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(TFBlocks.DARK_PLANKS.get()), 'S', new ItemStack(TFBlocks.DARK_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "dark_button", new ItemStack(TFBlocks.DARK_BUTTON.get(), 6), "sP", 'P', TFBlocks.DARK_PLANKS.get());
            VanillaRecipeHelper.addShapedRecipe(provider, "dark_chest", new ItemStack(TFBlocks.DARK_CHEST.get()), "FFF","FCF","FFF", 'F', GIModTags.ModTags.TTF_DARK, 'C', GIModTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "dark_door", new ItemStack(TFBlocks.DARK_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(TFBlocks.DARK_PLANKS.get()), 'T', new ItemStack(TFBlocks.DARK_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "dark_fence", new ItemStack(TFBlocks.DARK_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(TFBlocks.DARK_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "dark_fence_gate", new ItemStack(TFBlocks.DARK_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.DARK_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "dark_planks", new ItemStack(TFBlocks.DARK_PLANKS.get(), 2), "L", 'L', GIModTags.ModTags.TTF_DARK);
            VanillaRecipeHelper.addShapedRecipe(provider, "dark_pressure_plate", new ItemStack(TFBlocks.DARK_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', TFBlocks.DARK_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "dark_trapdoor", new ItemStack(TFBlocks.DARK_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(TFBlocks.DARK_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dark_door").inputItems(new ItemStack(TFBlocks.DARK_TRAPDOOR.get())).inputItems(new ItemStack(TFBlocks.DARK_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.DARK_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dark_fence").inputItems(new ItemStack(TFBlocks.DARK_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.DARK_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dark_fence_gate").inputItems(new ItemStack(TFBlocks.DARK_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(TFBlocks.DARK_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dark_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(TFBlocks.DARK_SLAB.get(), 2)).outputItems(new ItemStack(TFBlocks.DARK_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dark_sign").inputItems(new ItemStack(TFBlocks.DARK_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(TFBlocks.DARK_SIGN.get(),3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("dark_stairs").inputItems(new ItemStack(TFBlocks.DARK_PLANKS.get(), 6)).outputItems(new ItemStack(TFBlocks.DARK_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_boat", new ItemStack(TFItems.MANGROVE_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(TFBlocks.MANGROVE_PLANKS.get()), 'S', new ItemStack(TFBlocks.MANGROVE_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_button", new ItemStack(TFBlocks.MANGROVE_BUTTON.get(), 6), "sP", 'P', TFBlocks.MANGROVE_PLANKS.get());
            VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_chest", new ItemStack(TFBlocks.MANGROVE_CHEST.get()), "FFF","FCF","FFF", 'F', GIModTags.ModTags.TTF_MANGROVE, 'C', GIModTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_door", new ItemStack(TFBlocks.MANGROVE_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(TFBlocks.MANGROVE_PLANKS.get()), 'T', new ItemStack(TFBlocks.MANGROVE_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_fence", new ItemStack(TFBlocks.MANGROVE_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(TFBlocks.MANGROVE_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_fence_gate", new ItemStack(TFBlocks.MANGROVE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.MANGROVE_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_planks", new ItemStack(TFBlocks.MANGROVE_PLANKS.get(), 2), "L", 'L', GIModTags.ModTags.TTF_MANGROVE);
            VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_pressure_plate", new ItemStack(TFBlocks.MANGROVE_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', TFBlocks.MANGROVE_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_trapdoor", new ItemStack(TFBlocks.MANGROVE_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(TFBlocks.MANGROVE_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mangrove_door").inputItems(new ItemStack(TFBlocks.MANGROVE_TRAPDOOR.get())).inputItems(new ItemStack(TFBlocks.MANGROVE_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.MANGROVE_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mangrove_fence").inputItems(new ItemStack(TFBlocks.MANGROVE_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.MANGROVE_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mangrove_fence_gate").inputItems(new ItemStack(TFBlocks.MANGROVE_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(TFBlocks.MANGROVE_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mangrove_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(TFBlocks.MANGROVE_SLAB.get(), 2)).outputItems(new ItemStack(TFBlocks.MANGROVE_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mangrove_sign").inputItems(new ItemStack(TFBlocks.MANGROVE_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(TFBlocks.MANGROVE_SIGN.get(),3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mangrove_stairs").inputItems(new ItemStack(TFBlocks.MANGROVE_PLANKS.get(), 6)).outputItems(new ItemStack(TFBlocks.MANGROVE_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "mining_boat", new ItemStack(TFItems.MINING_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(TFBlocks.MINING_PLANKS.get()), 'S', new ItemStack(TFBlocks.MINING_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "mining_button", new ItemStack(TFBlocks.MINING_BUTTON.get(), 6), "sP", 'P', TFBlocks.MINING_PLANKS.get());
            VanillaRecipeHelper.addShapedRecipe(provider, "mining_chest", new ItemStack(TFBlocks.MINING_CHEST.get()), "FFF","FCF","FFF", 'F', GIModTags.ModTags.TTF_MINING, 'C', GIModTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "mining_door", new ItemStack(TFBlocks.MINING_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(TFBlocks.MINING_PLANKS.get()), 'T', new ItemStack(TFBlocks.MINING_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "mining_fence", new ItemStack(TFBlocks.MINING_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(TFBlocks.MINING_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "mining_fence_gate", new ItemStack(TFBlocks.MINING_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.MINING_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "mining_planks", new ItemStack(TFBlocks.MINING_PLANKS.get(), 2), "L", 'L', GIModTags.ModTags.TTF_MINING);
            VanillaRecipeHelper.addShapedRecipe(provider, "mining_pressure_plate", new ItemStack(TFBlocks.MINING_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', TFBlocks.MINING_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "mining_trapdoor", new ItemStack(TFBlocks.MINING_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(TFBlocks.MINING_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mining_door").inputItems(new ItemStack(TFBlocks.MINING_TRAPDOOR.get())).inputItems(new ItemStack(TFBlocks.MINING_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.MINING_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mining_fence").inputItems(new ItemStack(TFBlocks.MINING_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.MINING_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mining_fence_gate").inputItems(new ItemStack(TFBlocks.MINING_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(TFBlocks.MINING_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mining_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(TFBlocks.MINING_SLAB.get(), 2)).outputItems(new ItemStack(TFBlocks.MINING_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mining_sign").inputItems(new ItemStack(TFBlocks.MINING_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(TFBlocks.MINING_SIGN.get(),3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mining_stairs").inputItems(new ItemStack(TFBlocks.MINING_PLANKS.get(), 6)).outputItems(new ItemStack(TFBlocks.MINING_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "sorting_boat", new ItemStack(TFItems.SORTING_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(TFBlocks.SORTING_PLANKS.get()), 'S', new ItemStack(TFBlocks.SORTING_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "sorting_button", new ItemStack(TFBlocks.SORTING_BUTTON.get(), 6), "sP", 'P', TFBlocks.SORTING_PLANKS.get());
            VanillaRecipeHelper.addShapedRecipe(provider, "sorting_chest", new ItemStack(TFBlocks.SORTING_CHEST.get()), "FFF","FCF","FFF", 'F', GIModTags.ModTags.TTF_SORTING, 'C', GIModTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "sorting_door", new ItemStack(TFBlocks.SORTING_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(TFBlocks.SORTING_PLANKS.get()), 'T', new ItemStack(TFBlocks.SORTING_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "sorting_fence", new ItemStack(TFBlocks.SORTING_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(TFBlocks.SORTING_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "sorting_fence_gate", new ItemStack(TFBlocks.SORTING_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.SORTING_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "sorting_planks", new ItemStack(TFBlocks.SORTING_PLANKS.get(), 2), "L", 'L', GIModTags.ModTags.TTF_SORTING);
            VanillaRecipeHelper.addShapedRecipe(provider, "sorting_pressure_plate", new ItemStack(TFBlocks.SORTING_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', TFBlocks.SORTING_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "sorting_trapdoor", new ItemStack(TFBlocks.SORTING_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(TFBlocks.SORTING_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("sorting_door").inputItems(new ItemStack(TFBlocks.SORTING_TRAPDOOR.get())).inputItems(new ItemStack(TFBlocks.SORTING_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.SORTING_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("sorting_fence").inputItems(new ItemStack(TFBlocks.SORTING_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.SORTING_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("sorting_fence_gate").inputItems(new ItemStack(TFBlocks.SORTING_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(TFBlocks.SORTING_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("sorting_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(TFBlocks.SORTING_SLAB.get(), 2)).outputItems(new ItemStack(TFBlocks.SORTING_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("sorting_sign").inputItems(new ItemStack(TFBlocks.SORTING_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(TFBlocks.SORTING_SIGN.get(),3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("sorting_stairs").inputItems(new ItemStack(TFBlocks.SORTING_PLANKS.get(), 6)).outputItems(new ItemStack(TFBlocks.SORTING_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "time_boat", new ItemStack(TFItems.TIME_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(TFBlocks.TIME_PLANKS.get()), 'S', new ItemStack(TFBlocks.TIME_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "time_button", new ItemStack(TFBlocks.TIME_BUTTON.get(), 6), "sP", 'P', TFBlocks.TIME_PLANKS.get());
            VanillaRecipeHelper.addShapedRecipe(provider, "time_chest", new ItemStack(TFBlocks.TIME_CHEST.get()), "FFF","FCF","FFF", 'F', GIModTags.ModTags.TTF_TIME, 'C', GIModTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "time_door", new ItemStack(TFBlocks.TIME_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(TFBlocks.TIME_PLANKS.get()), 'T', new ItemStack(TFBlocks.TIME_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "time_fence", new ItemStack(TFBlocks.TIME_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(TFBlocks.TIME_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "time_fence_gate", new ItemStack(TFBlocks.TIME_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.TIME_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "time_planks", new ItemStack(TFBlocks.TIME_PLANKS.get(), 2), "L", 'L', GIModTags.ModTags.TTF_TIME);
            VanillaRecipeHelper.addShapedRecipe(provider, "time_pressure_plate", new ItemStack(TFBlocks.TIME_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', TFBlocks.TIME_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "time_trapdoor", new ItemStack(TFBlocks.TIME_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(TFBlocks.TIME_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("time_door").inputItems(new ItemStack(TFBlocks.TIME_TRAPDOOR.get())).inputItems(new ItemStack(TFBlocks.TIME_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.TIME_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("time_fence").inputItems(new ItemStack(TFBlocks.TIME_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.TIME_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("time_fence_gate").inputItems(new ItemStack(TFBlocks.TIME_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(TFBlocks.TIME_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("time_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(TFBlocks.TIME_SLAB.get(), 2)).outputItems(new ItemStack(TFBlocks.TIME_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("time_sign").inputItems(new ItemStack(TFBlocks.TIME_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(TFBlocks.TIME_SIGN.get(),3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("time_stairs").inputItems(new ItemStack(TFBlocks.TIME_PLANKS.get(), 6)).outputItems(new ItemStack(TFBlocks.TIME_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "transformation_boat", new ItemStack(TFItems.TRANSFORMATION_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get()), 'S', new ItemStack(TFBlocks.TRANSFORMATION_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "transformation_button", new ItemStack(TFBlocks.TRANSFORMATION_BUTTON.get(), 6), "sP", 'P', TFBlocks.TRANSFORMATION_PLANKS.get());
            VanillaRecipeHelper.addShapedRecipe(provider, "transformation_chest", new ItemStack(TFBlocks.TRANSFORMATION_CHEST.get()), "FFF","FCF","FFF", 'F', GIModTags.ModTags.TTF_TRANSFORMATION, 'C', GIModTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "transformation_door", new ItemStack(TFBlocks.TRANSFORMATION_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get()), 'T', new ItemStack(TFBlocks.TRANSFORMATION_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "transformation_fence", new ItemStack(TFBlocks.TRANSFORMATION_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "transformation_fence_gate", new ItemStack(TFBlocks.TRANSFORMATION_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "transformation_planks", new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get(), 2), "L", 'L', GIModTags.ModTags.TTF_TRANSFORMATION);
            VanillaRecipeHelper.addShapedRecipe(provider, "transformation_pressure_plate", new ItemStack(TFBlocks.TRANSFORMATION_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', TFBlocks.TRANSFORMATION_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "transformation_trapdoor", new ItemStack(TFBlocks.TRANSFORMATION_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(TFBlocks.TRANSFORMATION_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("transformation_door").inputItems(new ItemStack(TFBlocks.TRANSFORMATION_TRAPDOOR.get())).inputItems(new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.TRANSFORMATION_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("transformation_fence").inputItems(new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.TRANSFORMATION_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("transformation_fence_gate").inputItems(new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(TFBlocks.TRANSFORMATION_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("transformation_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(TFBlocks.TRANSFORMATION_SLAB.get(), 2)).outputItems(new ItemStack(TFBlocks.TRANSFORMATION_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("transformation_sign").inputItems(new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(TFBlocks.TRANSFORMATION_SIGN.get(),3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("transformation_stairs").inputItems(new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get(), 6)).outputItems(new ItemStack(TFBlocks.TRANSFORMATION_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);


            VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_boat", new ItemStack(TFItems.TWILIGHT_OAK_BOAT.get()), "PHP", "PkP", "SSS", 'P', new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get()), 'S', new ItemStack(TFBlocks.TWILIGHT_OAK_SLAB.get()), 'H', new ItemStack(Items.WOODEN_SHOVEL));
            VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_button", new ItemStack(TFBlocks.TWILIGHT_OAK_BUTTON.get(), 6), "sP", 'P', TFBlocks.TWILIGHT_OAK_PLANKS.get());
            VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_chest", new ItemStack(TFBlocks.TWILIGHT_OAK_CHEST.get()), "FFF","FCF","FFF", 'F', GIModTags.ModTags.TTF_TWILIGHT_OAK, 'C', GIModTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_door", new ItemStack(TFBlocks.TWILIGHT_OAK_DOOR.get()), "PTd", "PRS", "PPs", 'P', new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get()), 'T', new ItemStack(TFBlocks.TWILIGHT_OAK_TRAPDOOR.get()), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_fence", new ItemStack(TFBlocks.TWILIGHT_OAK_FENCE.get()), "PSP", "PSP", "PSP", 'P', new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_fence_gate", new ItemStack(TFBlocks.TWILIGHT_OAK_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_planks", new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get(), 2), "L", 'L', GIModTags.ModTags.TTF_TWILIGHT_OAK);
            VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_pressure_plate", new ItemStack(TFBlocks.TWILIGHT_OAK_PLATE.get(), 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', TFBlocks.TWILIGHT_OAK_SLAB.get().asItem(), 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_trapdoor", new ItemStack(TFBlocks.TWILIGHT_OAK_TRAPDOOR.get()), "SRS", "RRR", "SRS", 'S', new ItemStack(TFBlocks.TWILIGHT_OAK_SLAB.get()), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("twilight_oak_door").inputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_TRAPDOOR.get())).inputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get(), 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_DOOR.get())).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("twilight_oak_fence").inputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get())).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_FENCE.get())).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("twilight_oak_fence_gate").inputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get(), 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_GATE.get())).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("twilight_oak_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_SLAB.get(), 2)).outputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_PLATE.get(), 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("twilight_oak_sign").inputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get(), 6)).inputItems(new ItemStack(Items.STICK)).outputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_SIGN.get(),3)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("twilight_oak_stairs").inputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get(), 6)).outputItems(new ItemStack(TFBlocks.TWILIGHT_OAK_STAIRS.get())).circuitMeta(7).duration(100).EUt(1).save(provider);
        }
        else {

        }
        VanillaRecipeHelper.addShapedRecipe(provider, "canopy_planks_saw", new ItemStack(TFBlocks.CANOPY_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.TTF_CANOPY);
        VanillaRecipeHelper.addShapedRecipe(provider, "canopy_fence_gate", new ItemStack(TFBlocks.CANOPY_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.CANOPY_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "dark_planks_saw", new ItemStack(TFBlocks.DARK_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.TTF_DARK);
        VanillaRecipeHelper.addShapedRecipe(provider, "dark_fence_gate", new ItemStack(TFBlocks.DARK_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.DARK_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_planks_saw", new ItemStack(TFBlocks.MANGROVE_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.TTF_MANGROVE);
        VanillaRecipeHelper.addShapedRecipe(provider, "mangrove_fence_gate", new ItemStack(TFBlocks.MANGROVE_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.MANGROVE_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "mining_planks_saw", new ItemStack(TFBlocks.MINING_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.TTF_MINING);
        VanillaRecipeHelper.addShapedRecipe(provider, "mining_fence_gate", new ItemStack(TFBlocks.MINING_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.MINING_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "sorting_planks_saw", new ItemStack(TFBlocks.SORTING_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.TTF_SORTING);
        VanillaRecipeHelper.addShapedRecipe(provider, "sorting_fence_gate", new ItemStack(TFBlocks.SORTING_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.SORTING_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "time_planks_saw", new ItemStack(TFBlocks.TIME_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.TTF_TIME);
        VanillaRecipeHelper.addShapedRecipe(provider, "time_fence_gate", new ItemStack(TFBlocks.TIME_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.TIME_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "transformation_planks_saw", new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.TTF_TRANSFORMATION);
        VanillaRecipeHelper.addShapedRecipe(provider, "transformation_fence_gate", new ItemStack(TFBlocks.TRANSFORMATION_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.TRANSFORMATION_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));


        VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_planks_saw", new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get(), nerfed ? 4 : 6), "s", "L", 'L', GIModTags.ModTags.TTF_TWILIGHT_OAK);
        VanillaRecipeHelper.addShapedRecipe(provider, "twilight_oak_fence_gate", new ItemStack(TFBlocks.TWILIGHT_OAK_GATE.get()), "F F", "SPS", "SPS", 'P', new ItemStack(TFBlocks.TWILIGHT_OAK_PLANKS.get()), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
    }
}