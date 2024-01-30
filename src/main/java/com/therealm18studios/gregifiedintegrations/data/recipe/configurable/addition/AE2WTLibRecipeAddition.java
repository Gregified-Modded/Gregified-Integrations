package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.addition;

import appeng.core.definitions.AEItems;
import appeng.core.definitions.AEParts;
import appeng.init.InitItems;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import de.mari_023.ae2wtlib.AE2wtlib;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

public class AE2WTLibRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        harderAE2WTLibRecipes(provider);
        if (GIConfigHolder.INSTANCE.recipesAdditions.a.harderAE2WTLibRecipes) harderAE2WTLibRecipes(provider);
    }

    private static void harderAE2WTLibRecipes(Consumer<FinishedRecipe> provider) {

        boolean nerfed = GIConfigHolder.INSTANCE.recipesAdditions.a.harderAE2WTLibRecipes;
        if (nerfed) {
            VanillaRecipeHelper.addShapedRecipe(provider, "ae2wtlib/magnet_card", new ItemStack(AE2wtlib.MAGNET_CARD), "ABA", "CDC", "CCC", 'A', new UnificationEntry(TagPrefix.wireFine, GTMaterials.RedAlloy), 'B', AEParts.ANNIHILATION_PLANE, 'C', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.IronMagnetic), 'D', AEItems.ADVANCED_CARD);
            VanillaRecipeHelper.addShapedRecipe(provider, "ae2wtlib/quantum_bridge_card", new ItemStack(AE2wtlib.QUANTUM_BRIDGE_CARD), "AAA", "ABA", "AAA", 'A', new UnificationEntry(TagPrefix.wireFine, GTMaterials.RedAlloy), 'A', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.IronMagnetic));
            VanillaRecipeHelper.addShapedRecipe(provider, "ae2wtlib/wireless_pattern_encoding_terminal", new ItemStack(AE2wtlib.PATTERN_ENCODING_TERMINAL), "AAA", "ABA", "AAA", 'A', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.IronMagnetic), 'B', AEParts.PATTERN_ENCODING_TERMINAL);
            VanillaRecipeHelper.addShapedRecipe(provider, "ae2wtlib/wireless_pattern_access_terminal", new ItemStack(AE2wtlib.PATTERN_ACCESS_TERMINAL), "AAA", "ABA", "AAA", 'A', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.IronMagnetic), 'B', AEParts.PATTERN_ACCESS_TERMINAL);
        } else {

        }
    }
}