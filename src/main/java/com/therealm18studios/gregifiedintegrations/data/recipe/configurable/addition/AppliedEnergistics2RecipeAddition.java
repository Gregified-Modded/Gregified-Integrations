package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.addition;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import appeng.core.definitions.AEParts;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import com.therealm18studios.gregifiedintegrations.data.tags.AppliedEnergistics2Tags;
import com.therealm18studios.gregifiedintegrations.data.tags.ForgeTags;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

public class AppliedEnergistics2RecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        harderAE2WTLibRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipesAdditions.a.harderAE2WTLibRecipes) harderAE2WTLibRecipes(provider);
    }

    private static void harderAE2WTLibRecipes(Consumer<FinishedRecipe> provider) {

        boolean nerfed = GIConfigHolder.INSTANCE.recipesAdditions.a.harderAE2WTLibRecipes;
        if (nerfed) {
            VanillaRecipeHelper.addShapedRecipe(provider, "ae2/misc/chests_sky_stone", new ItemStack(AEBlocks.SKY_STONE_CHEST), "FFF", "FCF", "FFF", 'F', AEBlocks.SKY_STONE_BLOCK, 'C', ForgeTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "ae2/misc/chests_smooth_sky_stone", new ItemStack(AEBlocks.SMOOTH_SKY_STONE_BLOCK), "FFF", "FCF", "FFF", 'F', AEBlocks.SMOOTH_SKY_STONE_BLOCK, 'C', ForgeTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/controller", new ItemStack(AEBlocks.CONTROLLER), "DSD", "SES", "DSD", 'D', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Titanium), 'S', AEBlocks.SKY_STONE_BLOCK, 'E', AEBlocks.ENERGY_ACCEPTOR);
            VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/inscribers", new ItemStack(AEBlocks.INSCRIBER), "FPF", "FMF", "FPF", 'F', new UnificationEntry(TagPrefix.plate, GTMaterials.Titanium), 'P', GTItems.ELECTRIC_PISTON_EV, 'M', GTMachines.FORMING_PRESS);
            VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/interface", new ItemStack(AEBlocks.INTERFACE), "DVD", "A F", "DVD", 'D', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Titanium), 'V', AEBlocks.QUARTZ_VIBRANT_GLASS, 'A', AEItems.ANNIHILATION_CORE, 'F', AEItems.FORMATION_CORE);
            VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/spatial_io_port", new ItemStack(AEBlocks.SPATIAL_IO_PORT), "AAA", "BCB", "DED", 'D', new UnificationEntry(TagPrefix.plate, GTMaterials.Titanium), 'A',AEBlocks.QUARTZ_GLASS, 'B', AEParts.GLASS_CABLE, 'C', AEBlocks.IO_PORT, 'E', AEItems.ENGINEERING_PROCESSOR);
            VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/spatial_pylon", new ItemStack(AEBlocks.SPATIAL_PYLON),"GPG", "CFC", "GPG", 'P', new UnificationEntry(TagPrefix.plate, GTMaterials.Titanium), 'A',AEBlocks.QUARTZ_GLASS, 'P', AEParts.GLASS_CABLE, 'C', AEItems.FLUIX_CRYSTAL);
            VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/storage_chest", new ItemStack(AEBlocks.CHEST),"VTV", "G G", "TCT", 'T', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Titanium), 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.AnnealedCopper), 'G', AEParts.GLASS_CABLE, 'V', AEBlocks.QUARTZ_VIBRANT_GLASS, 'T', AEParts.TERMINAL);
            VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/storage_drive", new ItemStack(AEBlocks.DRIVE),"DED", "G G", "DED", 'D', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Titanium), 'E',AEItems.ENGINEERING_PROCESSOR, 'G', AEParts.GLASS_CABLE);
            VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/quantum_ring", new ItemStack(AEBlocks.QUANTUM_RING), "DLD", "PES", "DLD", 'D', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Titanium), 'L', AEItems.LOGIC_PROCESSOR, 'S', AppliedEnergistics2Tags.ModTags.APPLIEDENERGISTICS2_SMART_DENCE, 'P', AEItems.ENGINEERING_PROCESSOR, 'E', AEBlocks.ENERGY_CELL);
            VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/quantum_link", new ItemStack(AEBlocks.QUANTUM_LINK), "VPV", "PFP", "VPV", 'F', GTItems.FIELD_GENERATOR_IV, 'P',AEItems.FLUIX_PEARL, 'V', AEBlocks.QUARTZ_VIBRANT_GLASS);
            VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/wireless_access_point", new ItemStack(AEBlocks.WIRELESS_ACCESS_POINT), "dWw", "SCS", "DGD", 'D', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Titanium), 'G',AEParts.GLASS_CABLE, 'W', AEItems.WIRELESS_RECEIVER, 'C', AEItems.CALCULATION_PROCESSOR, 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Titanium));

//            VanillaRecipeHelper.addShapelessRecipe(provider, "ae2/decorative/quartz_fixture", new ItemStack(AEBlocks.QUARTZ_FIXTURE), "FC", 'F', AEItems.CERTUS_QUARTZ_CRYSTAL_CHARGED, 'C', new UnificationEntry(TagPrefix.bolt, GTMaterials.Iron));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("ae2/networking/wireless_terminal").inputItems(new ItemStack(AEParts.TERMINAL)).inputItems(new ItemStack(AEItems.WIRELESS_RECEIVER)).inputItems(new ItemStack(AEBlocks.DENSE_ENERGY_CELL)).inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Titanium), 4).inputItems(new UnificationEntry(TagPrefix.screw, GTMaterials.Titanium), 8).inputFluids(GTMaterials.SolderingAlloy.getFluid(GTValues.L / 2)).outputItems(new ItemStack(AEItems.WIRELESS_CRAFTING_TERMINAL)).duration(300).EUt(1536).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("ae2/networking/wireless_crafting_terminal").inputItems(new ItemStack(AEParts.CRAFTING_TERMINAL)).inputItems(new ItemStack(AEItems.WIRELESS_RECEIVER)).inputItems(new ItemStack(AEBlocks.DENSE_ENERGY_CELL)).inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Titanium), 4).inputItems(new UnificationEntry(TagPrefix.screw, GTMaterials.Titanium), 8).inputFluids(GTMaterials.SolderingAlloy.getFluid(GTValues.L / 2)).outputItems(new ItemStack(AEItems.WIRELESS_TERMINAL)).duration(300).EUt(1536).save(provider);

            GTRecipeTypes.BLAST_RECIPES.recipeBuilder("ae2/decorative/quartz_glass").inputItems(new UnificationEntry(TagPrefix.dust, GTMaterials.Glass)).inputItems(new ItemStack(AEItems.CERTUS_QUARTZ_DUST)).outputItems(new ItemStack(AEBlocks.QUARTZ_GLASS)).blastFurnaceTemp(1799).duration(100).EUt(128).save(provider);
            GTRecipeTypes.BLAST_RECIPES.recipeBuilder("ae2/blasting/sky_stone_block").inputItems(new ItemStack(AEItems.SKY_DUST)).outputItems(new ItemStack(AEBlocks.SKY_STONE_BLOCK)).blastFurnaceTemp(1799).duration(200).EUt(128).save(provider);

            GTRecipeTypes.CHEMICAL_RECIPES.recipeBuilder("ae2/misc/tiny_tnt").inputItems(new ItemStack(GTItems.GELLED_TOLUENE)).inputItems(new ItemStack(AEItems.CERTUS_QUARTZ_DUST)).inputFluids(GTMaterials.SulfuricAcid.getFluid(GTValues.LV * 50)).outputItems(new ItemStack(AEBlocks.TINY_TNT)).duration(50).EUt(16);

            GTRecipeTypes.FLUID_SOLIDFICATION_RECIPES.recipeBuilder("ae2/decorative/quartz_vibrant_glass").inputFluids(GTMaterials.Glowstone.getFluid(GTValues.LV * 576)).inputItems(new ItemStack(AEBlocks.QUARTZ_GLASS)).outputItems(new ItemStack(AEBlocks.QUARTZ_VIBRANT_GLASS)).duration(180).EUt(96).save(provider);
        } else {

        }
    }
}