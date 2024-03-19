//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.addition;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import com.glodblock.github.appflux.common.AFItemAndBlock;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.lowdragmc.lowdraglib.side.fluid.FluidStack;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import java.util.function.Consumer;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class AppliedFluxRecipeAddition {
    public AppliedFluxRecipeAddition() {
    }

    public static void init(Consumer<FinishedRecipe> provider) {
        harderAppliedFluxRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipesAdditions.a.harderAppliedFluxRecipes) {
            harderAppliedFluxRecipes(provider);
        }

    }

    private static void harderAppliedFluxRecipes(Consumer<FinishedRecipe> provider) {
        boolean nerfed = GIConfigHolder.INSTANCE.recipesAdditions.a.harderAppliedFluxRecipes;
        if (nerfed) {
            VanillaRecipeHelper.addShapedRecipe(provider, "shaped/appflux/network/cell/flux_cell_housing", new ItemStack(AFItemAndBlock.FE_HOUSING), new Object[]{"dVw", "S S", "III", 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Titanium), 'V', AEBlocks.QUARTZ_VIBRANT_GLASS, 'I', AFItemAndBlock.HARDEN_INSULATING_RESIN});
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("assembler/appflux/inscriber/energy_processor", new Object[0]).inputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.ENERGY_PROCESSOR_PRINT)}).inputItems(new ItemStack[]{new ItemStack(AEItems.SILICON_PRINT)}).inputFluids(new FluidStack[]{GTMaterials.Redstone.getFluid(144L)}).outputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.ENERGY_PROCESSOR)}).duration(80).EUt(384L).save(provider);
            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("assembler/appflux/networking/flux_accessor", new Object[0]).inputItems(new ItemStack[]{new ItemStack(AEBlocks.ENERGY_ACCEPTOR)}).inputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.ENERGY_PROCESSOR, 4)}).inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.AnnealedCopper), 4).inputFluids(new FluidStack[]{GTMaterials.Glowstone.getFluid(576L)}).outputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.FLUX_ACCESSOR)}).duration(80).EUt(512L).save(provider);
            GTRecipeTypes.BLAST_RECIPES.recipeBuilder("blast_furnace/appflux/harden_resin", new Object[0]).inputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.INSULATING_RESIN)}).outputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.HARDEN_INSULATING_RESIN)}).blastFurnaceTemp(3599).duration(1200).EUt(2048L).save(provider);
            GTRecipeTypes.CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("circuit_assembler/appflux/network/cells/energy_storage_components_cell_1k_part", new Object[0]).inputItems(new ItemStack[]{new ItemStack(GTItems.PLASTIC_CIRCUIT_BOARD)}).inputItems(new UnificationEntry(TagPrefix.wireFine, GTMaterials.RedAlloy), 8).inputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.REDSTONE_CRYSTAL, 4)}).inputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.ENERGY_PROCESSOR)}).inputFluids(new FluidStack[]{GTMaterials.SolderingAlloy.getFluid(576L)}).outputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.CORE_1k)}).duration(200).EUt(768L).save(provider);
            GTRecipeTypes.CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("circuit_assembler/appflux/network/cells/energy_storage_components_cell_4k_part", new Object[0]).inputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.CORE_1k, 4)}).inputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.ENERGY_PROCESSOR, 2)}).inputItems(new UnificationEntry(TagPrefix.wireFine, GTMaterials.RedAlloy), 8)..inputFluids(new FluidStack[]{GTMaterials.SolderingAlloy.getFluid(576L)}).outputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.CORE_4k)}).duration(200).EUt(768L).save(provider);
            GTRecipeTypes.CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("circuit_assembler/appflux/network/cells/energy_storage_components_cell_16k_part", new Object[0]).inputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.CORE_4k, 4)}).inputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.ENERGY_PROCESSOR, 4)}).inputItems(new UnificationEntry(TagPrefix.wireFine, GTMaterials.RedAlloy), 8)..inputFluids(new FluidStack[]{GTMaterials.SolderingAlloy.getFluid(576L)}).outputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.CORE_16k)}).duration(200).EUt(768L).save(provider);
            GTRecipeTypes.CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("circuit_assembler/appflux/network/cells/energy_storage_components_cell_64k_part", new Object[0]).inputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.CORE_16k, 4)}).inputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.ENERGY_PROCESSOR, 8)}).inputItems(new UnificationEntry(TagPrefix.wireFine, GTMaterials.RedAlloy), 8).inputFluids(new FluidStack[]{GTMaterials.SolderingAlloy.getFluid(576L)}).outputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.CORE_64k)}).duration(200).EUt(768L).save(provider);
            GTRecipeTypes.CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("circuit_assembler/appflux/network/cells/energy_storage_components_cell_256k_part", new Object[0]).inputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.CORE_64k, 4)}).inputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.ENERGY_PROCESSOR, 16)}).inputItems(new UnificationEntry(TagPrefix.wireFine, GTMaterials.RedAlloy), 8)..inputFluids(new FluidStack[]{GTMaterials.SolderingAlloy.getFluid(576L)}).outputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.CORE_256k)}).duration(200).EUt(768L).save(provider);
            GTRecipeTypes.FLUID_SOLIDFICATION_RECIPES.recipeBuilder("fluid_solidfication/appflux/energy_processor_press", new Object[0]).inputFluids(new FluidStack[]{GTMaterials.Redstone.getFluid(2304L)}).inputItems(new ItemStack[]{new ItemStack(AEItems.SILICON_PRESS)}).outputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.ENERGY_PROCESSOR_PRESS)}).duration(200).EUt(768L).save(provider);
            GTRecipeTypes.FORMING_PRESS_RECIPES.recipeBuilder("forming_press/appflux/energy_processor_press", new Object[0]).inputItems(new UnificationEntry(TagPrefix.block, GTMaterials.Titanium)).notConsumable(new ItemStack(AFItemAndBlock.ENERGY_PROCESSOR_PRESS)).outputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.ENERGY_PROCESSOR_PRESS)}).duration(200).EUt(384L).save(provider);
            GTRecipeTypes.FORMING_PRESS_RECIPES.recipeBuilder("forming_press/appflux/energy_processor_print", new Object[0]).inputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.CHARGED_REDSTONE)}).notConsumable(new ItemStack(AFItemAndBlock.ENERGY_PROCESSOR_PRESS)).outputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.ENERGY_PROCESSOR_PRINT)}).duration(200).EUt(384L).save(provider);
            GTRecipeTypes.MIXER_RECIPES.recipeBuilder("mixer/appflux/charged_redstone", new Object[0]).inputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.REDSTONE_CRYSTAL, 4)}).inputItems(new ItemStack[]{new ItemStack(Items.f_42525_, 4)}).inputItems(new UnificationEntry(TagPrefix.dust, GTMaterials.Thorium)).outputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.CHARGED_REDSTONE, 4)}).duration(600).EUt(512L).save(provider);
            GTRecipeTypes.MIXER_RECIPES.recipeBuilder("mixer/appflux/insulating_resin", new Object[0]).inputFluids(new FluidStack[]{GTMaterials.Water.getFluid(1000L)}).inputItems(new UnificationEntry(TagPrefix.dust, GTMaterials.Glowstone)).inputItems(new UnificationEntry(TagPrefix.dust, GTMaterials.Silicon)).inputItems(new ItemStack[]{new ItemStack(Items.f_42499_)}).inputItems(new ItemStack[]{new ItemStack(Items.f_42496_, 2)}).inputItems(new ItemStack[]{new ItemStack(Items.f_42518_)}).outputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.INSULATING_RESIN)}).duration(600).EUt(512L).save(provider);
            GTRecipeTypes.MIXER_RECIPES.recipeBuilder("mixer/appflux/redstone_crystal", new Object[0]).inputFluids(new FluidStack[]{GTMaterials.Redstone.getFluid(576L)}).inputItems(new ItemStack[]{new ItemStack(AEItems.FLUIX_DUST)}).inputItems(new ItemStack[]{new ItemStack(AEItems.SKY_DUST)}).outputItems(new ItemStack[]{new ItemStack(AFItemAndBlock.REDSTONE_CRYSTAL, 4)}).duration(600).EUt(512L).save(provider);
        }

    }
}
