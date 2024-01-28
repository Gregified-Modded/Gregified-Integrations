package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.addition;

import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import com.therealm18studios.gregifiedintegrations.data.tags.ForgeTags;
import com.therealm18studios.gregifiedintegrations.data.tags.GregTechCEuTags;
import dan200.computercraft.shared.ModRegistry;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class CCTweakedRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        harderCCTweakedRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipesAdditions.harderCCTweakedAddRecipes) harderCCTweakedRecipes(provider);
    }

    private static void harderCCTweakedRecipes(Consumer<FinishedRecipe> provider){

        boolean nerfed = GIConfigHolder.INSTANCE.recipesAdditions.harderCCTweakedAddRecipes;
        if (nerfed) {
            VanillaRecipeHelper.addShapedRecipe(provider, "cable", new ItemStack(ModRegistry.Items.CABLE.get(), 4), "CCC", "CPC", "CCC", 'P', new UnificationEntry(TagPrefix.wireFine, GTMaterials.RedAlloy), 'C', GTItems.CARBON_FIBER_PLATE);
            VanillaRecipeHelper.addShapedRecipe(provider, "computer_advanced", new ItemStack(ModRegistry.Blocks.COMPUTER_ADVANCED.get()), "PCP", "PMP", "SCS", 'P', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TantalumCarbide), 'C', GregTechCEuTags.ModTags.GTCEU_CIRCUITS_ZPM, 'S', GTItems.TOOL_DATA_ORB.asStack(), 'M', GTItems.COVER_MACHINE_CONTROLLER.asStack());
            VanillaRecipeHelper.addShapedRecipe(provider, "computer_normal", new ItemStack(ModRegistry.Blocks.COMPUTER_NORMAL.get()), "PCP", "PMP", "SCS", 'P', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.BlackSteel), 'C', GregTechCEuTags.ModTags.GTCEU_CIRCUITS_IV, 'S', GTItems.TOOL_DATA_STICK.asStack(), 'M', GTItems.COVER_MACHINE_CONTROLLER.asStack());
            VanillaRecipeHelper.addShapedRecipe(provider, "disk_drive", new ItemStack(ModRegistry.Blocks.DISK_DRIVE.get()), "CCC", "CPC", "CCC", 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.BlackSteel), 'P', GregTechCEuTags.ModTags.GTCEU_CIRCUITS_LUV);
            VanillaRecipeHelper.addShapedRecipe(provider, "monitor_advanced", new ItemStack(ModRegistry.Blocks.MONITOR_ADVANCED.get()), "CCC", "CPC", "CCC", 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TantalumCarbide), 'P', GTItems.COVER_MACHINE_CONTROLLER.asStack());
            VanillaRecipeHelper.addShapedRecipe(provider, "monitor_normal", new ItemStack(ModRegistry.Blocks.MONITOR_NORMAL.get()), "CCC", "CPC", "CCC", 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.BlackSteel), 'P', GTItems.COVER_MACHINE_CONTROLLER.asStack());
            VanillaRecipeHelper.addShapedRecipe(provider, "new_pocket_computer_advanced", new ItemStack(ModRegistry.Items.POCKET_COMPUTER_ADVANCED.get()), "CPC", "CMC", "CSC", 'P', GTItems.TOOL_DATA_ORB.asStack(), 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TantalumCarbide), 'S', GregTechCEuTags.ModTags.GTCEU_CIRCUITS_ZPM, 'M', GTItems.COVER_MACHINE_CONTROLLER.asStack());
            VanillaRecipeHelper.addShapedRecipe(provider, "new_pocket_computer_normal", new ItemStack(ModRegistry.Items.POCKET_COMPUTER_NORMAL.get()), "CPC", "CMC", "CSC", 'P', GTItems.TOOL_DATA_STICK.asStack(), 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.BlackSteel), 'S', GregTechCEuTags.ModTags.GTCEU_CIRCUITS_IV, 'M', GTItems.COVER_MACHINE_CONTROLLER.asStack());
            VanillaRecipeHelper.addShapedRecipe(provider, "printer", new ItemStack(ModRegistry.Blocks.PRINTER.get()), "CMC", "CPC", "CPC", 'M', GTItems.COVER_MACHINE_CONTROLLER.asStack(), 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.BlackSteel), 'P', GregTechCEuTags.ModTags.GTCEU_CIRCUITS_IV);
            VanillaRecipeHelper.addShapedRecipe(provider, "new_speaker", new ItemStack(ModRegistry.Blocks.SPEAKER.get()), "CMC", "CPC", "CPC", 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.BlackSteel), 'M', Blocks.NOTE_BLOCK, 'P', GregTechCEuTags.ModTags.GTCEU_CIRCUITS_IV);
            VanillaRecipeHelper.addShapedRecipe(provider, "new_turtle_advanced", new ItemStack(ModRegistry.Blocks.TURTLE_ADVANCED.get()), "PCP", "TMT", "SCS", 'M', GTItems.COVER_MACHINE_CONTROLLER.asStack(), 'S', GTItems.TOOL_DATA_ORB.asStack(), 'P', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TantalumCarbide), 'C', GregTechCEuTags.ModTags.GTCEU_CIRCUITS_ZPM, 'T', ForgeTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "new_turtle_normal", new ItemStack(ModRegistry.Blocks.TURTLE_NORMAL.get()), "PCP", "TMT", "SCS", 'M', GTItems.COVER_MACHINE_CONTROLLER.asStack(), 'S', GTItems.TOOL_DATA_STICK.asStack(), 'P', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.BlackSteel), 'C', GregTechCEuTags.ModTags.GTCEU_CIRCUITS_IV, 'T', ForgeTags.ModTags.FORGE_WOODEN_CHESTS);
            VanillaRecipeHelper.addShapedRecipe(provider, "wired_modem", new ItemStack(ModRegistry.Blocks.CABLE.get()), "CCC", "CPC", "CCC", 'P', new UnificationEntry(TagPrefix.wireFine, GTMaterials.RedAlloy), 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Tungsten));
            VanillaRecipeHelper.addShapedRecipe(provider, "wireless_modem_advanced", new ItemStack(ModRegistry.Blocks.WIRELESS_MODEM_ADVANCED.get()), "CCC", "CPC", "CCC", 'P', Items.ENDER_EYE, 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TantalumCarbide));
            VanillaRecipeHelper.addShapedRecipe(provider, "wireless_modem_normal", new ItemStack(ModRegistry.Blocks.WIRELESS_MODEM_NORMAL.get()), "CCC", "CPC", "CCC", 'P', Items.ENDER_EYE, 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Tungsten));
        } else {

        }
    }
}