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
    public GIConfigHolder.RecipeConfigs recipes = new GIConfigHolder.RecipeConfigs();

    public static class RecipeConfigs {
        @Configurable
        @Configurable.Comment({"Whether to harden Ars Nouveau recipes.", "Default: false"})
        public boolean harderArsNouveauRecipes = false; // default false
        @Configurable
        @Configurable.Comment({"Whether to harden Biomes O' Plenty recipes.", "Default: false"})
        public boolean harderBiomesOPlentyRecipes = false; // default false
        @Configurable
        @Configurable.Comment({"Whether to harden CC Tweaked recipes.", "Default: false"})
        public boolean harderCCTweakedRecipes = false; // default false
        @Configurable
        @Configurable.Comment({"Whether to harden Productive Bees recipes.", "THIS DOES NOT CURRENTLY WORK!", "YOU HAVE BEEN WARNED!!!", "Default: false"})
        public boolean harderProductiveBeesRecipes = false; // default false
        @Configurable
        @Configurable.Comment({"Whether to harden The Twilight Forest recipes.", "Default: false"})
        public boolean harderTheTwilightForestRecipes = false; // default false
    }
}
