package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.recipes.addition;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.hollingsworth.arsnouveau.setup.registry.BlockRegistry;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import com.therealm18studios.gregifiedintegrations.data.tags.ArsNouveauTags;
import com.therealm18studios.gregifiedintegrations.data.tags.ForgeTags;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.ULV;
import static com.gregtechceu.gtceu.api.GTValues.VA;

public class ArsNouveauRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        harderArsNouveauRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipes.harderArsNouveauRecipes) harderArsNouveauRecipes(provider);
    }

    private static void harderArsNouveauRecipes(Consumer<FinishedRecipe> provider) {

        boolean nerfed = GIConfigHolder.INSTANCE.recipes.harderArsNouveauRecipes;
        if (nerfed) {
            VanillaRecipeHelper.addShapedRecipe(provider, "archwood_button", new ItemStack(BlockRegistry.ARCHWOOD_BUTTON, 6), "sP", 'P', BlockRegistry.ARCHWOOD_PLANK);
            VanillaRecipeHelper.addShapedRecipe(provider, "archwood_chest", new ItemStack(BlockRegistry.ARCHWOOD_CHEST), "FFF", "FCF", "FFF", 'F', ArsNouveauTags.ModTags.ARSNOUVEAU_ARCHWOOD, 'C', ForgeTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "archwood_door", new ItemStack(BlockRegistry.ARCHWOOD_DOOR), "PTd", "PRS", "PPs", 'P', new ItemStack(BlockRegistry.ARCHWOOD_PLANK), 'T', new ItemStack(BlockRegistry.ARCHWOOD_TRAPDOOR), 'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "archwood_fence", new ItemStack(BlockRegistry.ARCHWOOD_FENCE), "PSP", "PSP", "PSP", 'P', new ItemStack(BlockRegistry.ARCHWOOD_PLANK), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
            VanillaRecipeHelper.addShapedRecipe(provider, "archwood_fence_gate", new ItemStack(BlockRegistry.ARCHWOOD_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BlockRegistry.ARCHWOOD_PLANK), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
            VanillaRecipeHelper.addShapedRecipe(provider, "archwood_planks", new ItemStack(BlockRegistry.ARCHWOOD_PLANK, 2), "L", 'L', ArsNouveauTags.ModTags.ARSNOUVEAU_ARCHWOOD);
            VanillaRecipeHelper.addShapedRecipe(provider, "archwood_pressure_plate", new ItemStack(BlockRegistry.ARCHWOOD_PPlate, 2), "SrS", "LCL", "SdS", 'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood), 'L', BlockRegistry.ARCHWOOD_SLABS, 'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));
            VanillaRecipeHelper.addShapedRecipe(provider, "archwood_trapdoor", new ItemStack(BlockRegistry.ARCHWOOD_TRAPDOOR), "SRS", "RRR", "SRS", 'S', new ItemStack(BlockRegistry.ARCHWOOD_SLABS), 'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("archwood_door").inputItems(new ItemStack(BlockRegistry.ARCHWOOD_TRAPDOOR)).inputItems(new ItemStack(BlockRegistry.ARCHWOOD_PLANK, 4)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BlockRegistry.ARCHWOOD_DOOR)).duration(400).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("archwood_fence").inputItems(new ItemStack(BlockRegistry.ARCHWOOD_PLANK)).inputFluids(GTMaterials.Iron.getFluid(GTValues.L / 9)).outputItems(new ItemStack(BlockRegistry.ARCHWOOD_FENCE)).circuitMeta(1).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("archwood_fence_gate").inputItems(new ItemStack(BlockRegistry.ARCHWOOD_PLANK, 2)).inputItems(new ItemStack(Items.STICK, 2)).outputItems(new ItemStack(BlockRegistry.ARCHWOOD_FENCE_GATE)).circuitMeta(2).duration(100).EUt(4).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("archwood_pressure_plate").inputItems(TagPrefix.spring, GTMaterials.Iron).inputItems(new ItemStack(BlockRegistry.ARCHWOOD_SLABS, 2)).outputItems(new ItemStack(BlockRegistry.ARCHWOOD_PPlate, 2)).duration(100).EUt(VA[ULV]).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("archwood_stairs").inputItems(new ItemStack(BlockRegistry.ARCHWOOD_PLANK, 6)).outputItems(new ItemStack(BlockRegistry.ARCHWOOD_STAIRS)).circuitMeta(7).duration(100).EUt(1).save(provider);

        } else {

        }
        VanillaRecipeHelper.addShapedRecipe(provider, "archwood_planks_saw", new ItemStack(BlockRegistry.ARCHWOOD_PLANK, nerfed ? 4 : 6), "s", "L", 'L', ArsNouveauTags.ModTags.ARSNOUVEAU_ARCHWOOD);
        VanillaRecipeHelper.addShapedRecipe(provider, "archwood_fence_gate", new ItemStack(BlockRegistry.ARCHWOOD_FENCE_GATE), "F F", "SPS", "SPS", 'P', new ItemStack(BlockRegistry.ARCHWOOD_PLANK), 'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood), 'F', new ItemStack(Items.FLINT));
    }
}