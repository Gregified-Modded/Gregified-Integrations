package com.therealm18studios.gregifiedintegrations;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.therealm18studios.gregifiedintegrations.api.registries.GIRegistries;
import com.therealm18studios.gregifiedintegrations.data.recipe.GIRecipes;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

@GTAddon
public class GIGTAddon implements IGTAddon {
    @Override
    public GTRegistrate getRegistrate() {
        return GIRegistries.REGISTRATE;
    }

    @Override
    public void initializeAddon() {

    }

    @Override
    public String addonModId() {
        return GI.MOD_ID;
    }

    @Override
    public void removeRecipes(Consumer<ResourceLocation> provider) {
        GIRecipes.removedInit(provider);
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        GIRecipes.newInit(provider);
    }
}