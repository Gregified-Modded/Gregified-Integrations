package com.therealm18studios.gregifiedintegrations.config;

import com.therealm18studios.gregifiedintegrations.GI;
import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.Config;
import dev.toma.configuration.config.Configurable;
import dev.toma.configuration.config.format.ConfigFormats;

@Config(id = GI.MOD_ID)
public class GIConfigHolder {
    public static GIConfigHolder INSTANCE;

    public static void init() {
        INSTANCE = Configuration.registerConfig(GIConfigHolder.class, ConfigFormats.yaml()).getConfigInstance();
    }
    @Configurable
    public GIConfigHolder.RecipeAddConfigs recipesAdditions = new GIConfigHolder.RecipeAddConfigs();

    public static class RecipeAddConfigs {
        @Configurable
        @Configurable.Comment({"Whether to harden Ars Nouveau recipes.", "Default: false"})
        public boolean harderArsNouveauAddRecipes = false; // default false
        @Configurable
        @Configurable.Comment({"Whether to harden Biomes O' Plenty recipes.", "Default: false"})
        public boolean harderBiomesOPlentyAddRecipes = false; // default false
        @Configurable
        @Configurable.Comment({"Whether to harden CC Tweaked recipes.", "Default: false"})
        public boolean harderCCTweakedAddRecipes = false; // default false
        @Configurable
        @Configurable.Comment({"Whether to harden Chisel and Bits recipes.", "Default: false"})
        public boolean harderChiselAndBitsAddRecipes = false; // default false
        @Configurable
        @Configurable.Comment({"Whether to harden Productive Bees recipes.", "THIS DOES NOT CURRENTLY WORK!", "YOU HAVE BEEN WARNED!!!", "Default: false"})
        public boolean harderProductiveBeesAddRecipes = false; // default false
        @Configurable
        @Configurable.Comment({"Whether to harden Rechiseled recipes.", "THIS DOES NOT CURRENTLY WORK!", "YOU HAVE BEEN WARNED!!!", "Default: false"})
        public boolean harderRechiseledAddRecipes = false; // default false
        @Configurable
        @Configurable.Comment({"Whether to harden Rechiseled Create recipes.", "THIS DOES NOT CURRENTLY WORK!", "YOU HAVE BEEN WARNED!!!", "Default: false"})
        public boolean harderRechiseledCreateAddRecipes = false; // default false
        @Configurable
        @Configurable.Comment({"Whether to harden The Twilight Forest recipes.", "Default: false"})
        public boolean harderTheTwilightForestAddRecipes = false; // default false
    }
    @Configurable
    public GIConfigHolder.RecipeRemoveConfigs recipesRemoval = new GIConfigHolder.RecipeRemoveConfigs();

    public static class RecipeRemoveConfigs {
        @Configurable
        @Configurable.Comment({"Whether to remove Ars Nouveau recipes.", "Default: false"})
        public boolean harderArsNouveauRemoveRecipes = false; // default false
        @Configurable
        @Configurable.Comment({"Whether to remove Biomes O' Plenty recipes.", "Default: false"})
        public boolean harderBiomesOPlentyRemoveRecipes = false; // default false
        @Configurable
        @Configurable.Comment({"Whether to remove CC Tweaked recipes.", "Default: false"})
        public boolean harderCCTweakedRemoveRecipes = false; // default false
        @Configurable
        @Configurable.Comment({"Whether to remove Chisel and Bits recipes.", "Default: false"})
        public boolean harderChiselAndBitsRemoveRecipes = false; // default false
        @Configurable
        @Configurable.Comment({"Whether to remove Productive Bees recipes.", "Default: false"})
        public boolean harderProductiveBeesRemoveRecipes = false; // default false
        @Configurable
        @Configurable.Comment({"Whether to remove Rechiseled recipes.", "Default: false"})
        public boolean harderRechiseledRemoveRecipes = false; // default false
        @Configurable
        @Configurable.Comment({"Whether to remove Rechiseled Create recipes.", "Default: false"})
        public boolean harderRechiseledCreateRemoveRecipes = false; // default false
        @Configurable
        @Configurable.Comment({"Whether to remove The Twilight Forest recipes.", "Default: false"})
        public boolean harderTheTwilightForestRemoveRecipes = false; // default false
    }
}
