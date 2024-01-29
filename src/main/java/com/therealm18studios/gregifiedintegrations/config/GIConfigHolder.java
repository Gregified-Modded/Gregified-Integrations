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
        public RecipeAddConfigs.ModsAConfig a = new RecipeAddConfigs.ModsAConfig();

        public static class ModsAConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden AE2WTLib recipes.", "Default: true"})
            public boolean harderAE2WTLibRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Botanics recipes.", "Default: true"})
            public boolean harderAppliedBotanicsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Cooking recipes.", "Default: true"})
            public boolean harderAppliedCookingRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Energistics 2 recipes.", "Default: true"})
            public boolean harderAppliedEnergistics2Recipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Mekanistics recipes.", "Default: true"})
            public boolean harderAppliedMekanisticsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Ars Nouveau recipes.", "Default: true"})
            public boolean harderArsNouveauRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Ars Énergistique recipes.", "Default: true"})
            public boolean harderArsÉnergistiqueRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Assembly Lines recipes.", "Default: true"})
            public boolean harderAssemblyLinesRecipes = true; // default true
        }
        @Configurable
        public RecipeAddConfigs.ModsBConfig b = new RecipeAddConfigs.ModsBConfig();

        public static class ModsBConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Ballistix recipes.", "Default: true"})
            public boolean harderBallistixRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Better Archeology recipes.", "Default: true"})
            public boolean harderBetterArcheologyRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Biomes O' Plenty recipes.", "Default: true"})
            public boolean harderBiomesOPlentyRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Blastcraft mod recipes.", "Default: true"})
            public boolean harderBlastcraftModRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Botania recipes.", "Default: true"})
            public boolean harderBotaniaRecipes = true; // default true
        }
        @Configurable
        public RecipeAddConfigs.ModsCConfig c = new RecipeAddConfigs.ModsCConfig();

        public static class ModsCConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden CC Tweaked recipes.", "Default: true"})
            public boolean harderCCTweakedRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden CC:C Bridge recipes.", "Default: true"})
            public boolean harderCCCBridgeRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Chisel and Bits recipes.", "Default: true"})
            public boolean harderChiselAndBitsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Cooking for Blockheads recipes.", "Default: true"})
            public boolean harderCookingForBlockheadsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Create recipes.", "Default: true"})
            public boolean harderCreateRecipes = true; // default true
        }
        @Configurable
        public RecipeAddConfigs.ModsDConfig d = new RecipeAddConfigs.ModsDConfig();

        public static class ModsDConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Domum Omamentum recipes.", "Default: true"})
            public boolean harderDomumOmamentumRecipes = true; // default true
        }
        @Configurable
        public RecipeAddConfigs.ModsEConfig e = new RecipeAddConfigs.ModsEConfig();

        public static class ModsEConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Electrodynamics recipes.", "Default: true"})
            public boolean harderElectrodynamicsRecipes = true; // default true
        }
        @Configurable
        public RecipeAddConfigs.ModsFConfig f = new RecipeAddConfigs.ModsFConfig();

        public static class ModsFConfig{

        }
        @Configurable
        public RecipeAddConfigs.ModsGConfig g = new RecipeAddConfigs.ModsGConfig();

        public static class ModsGConfig{

        }
        @Configurable
        public RecipeAddConfigs.ModsHConfig h = new RecipeAddConfigs.ModsHConfig();

        public static class ModsHConfig{

        }
        @Configurable
        public RecipeAddConfigs.ModsIConfig i = new RecipeAddConfigs.ModsIConfig();

        public static class ModsIConfig{

        }
        @Configurable
        public RecipeAddConfigs.ModsJConfig j = new RecipeAddConfigs.ModsJConfig();

        public static class ModsJConfig{

        }
        @Configurable
        public RecipeAddConfigs.ModsKConfig k = new RecipeAddConfigs.ModsKConfig();

        public static class ModsKConfig{

        }
        @Configurable
        public RecipeAddConfigs.ModsLConfig l = new RecipeAddConfigs.ModsLConfig();

        public static class ModsLConfig{

        }
        @Configurable
        public RecipeAddConfigs.ModsMConfig m = new RecipeAddConfigs.ModsMConfig();

        public static class ModsMConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden ME Requester recipes.", "Default: true"})
            public boolean harderMERequesterRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden MEGA Cells recipes.", "Default: true"})
            public boolean harderMEGACellsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism recipes.", "Default: true"})
            public boolean harderMekanismRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism Additions recipes.", "Default: true"})
            public boolean harderMekanismAdditionsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism Generators recipes.", "Default: true"})
            public boolean harderMekanismGeneratorsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism Tools recipes.", "Default: true"})
            public boolean harderMekanismToolsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism-MoreSolarPanels recipes.", "Default: true"})
            public boolean harderMekanismMoreSolarPanelsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism: Weapons recipes.", "Default: true"})
            public boolean harderMekanismWeaponsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden MineColonies recipes.", "Default: true"})
            public boolean harderMineColoniesRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden MineColonies for ComputerCraft recipes.", "Default: true"})
            public boolean harderMineColoniesForComputerCraftRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Modular Force Fields System recipes.", "Default: true"})
            public boolean harderModularForceFieldsSystemRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden More Red recipes.", "Default: true"})
            public boolean harderMoreRedRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Multi-Piston recipes.", "Default: true"})
            public boolean harderMultiPistonRecipes = true; // default true
        }
        @Configurable
        public RecipeAddConfigs.ModsNConfig n = new RecipeAddConfigs.ModsNConfig();

        public static class ModsNConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Nuclear Science recipes.", "Default: true"})
            public boolean harderNuclearScienceRecipes = true; // default true
        }
        @Configurable
        public RecipeAddConfigs.ModsOConfig o = new RecipeAddConfigs.ModsOConfig();

        public static class ModsOConfig{

        }
        @Configurable
        public RecipeAddConfigs.ModsPConfig p = new RecipeAddConfigs.ModsPConfig();

        public static class ModsPConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Productive Bees recipes.", "Default: true"})
            public boolean harderProductiveBeesRecipes = true; // default true
        }
        @Configurable
        public RecipeAddConfigs.ModsQConfig q = new RecipeAddConfigs.ModsQConfig();

        public static class ModsQConfig{

        }
        @Configurable
        public RecipeAddConfigs.ModsRConfig r = new RecipeAddConfigs.ModsRConfig();

        public static class ModsRConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Rechiseled recipes.", "Default: true"})
            public boolean harderRechiseledRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Rechiseled Create recipes.", "Default: true"})
            public boolean harderRechiseledCreateRecipes = true; // default true
        }
        @Configurable
        public RecipeAddConfigs.ModsSConfig s = new RecipeAddConfigs.ModsSConfig();

        public static class ModsSConfig{

        }
        @Configurable
        public RecipeAddConfigs.ModsTConfig t = new RecipeAddConfigs.ModsTConfig();

        public static class ModsTConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden The Twilight Forest recipes.", "Default: true"})
            public boolean harderTheTwilightForestRecipes = true; // default true
        }
        @Configurable
        public RecipeAddConfigs.ModsUConfig u = new RecipeAddConfigs.ModsUConfig();

        public static class ModsUConfig{

        }
        @Configurable
        public RecipeAddConfigs.ModsVConfig v = new RecipeAddConfigs.ModsVConfig();

        public static class ModsVConfig{

        }
        @Configurable
        public RecipeAddConfigs.ModsWConfig w = new RecipeAddConfigs.ModsWConfig();

        public static class ModsWConfig{

        }
        @Configurable
        public RecipeAddConfigs.ModsXConfig x = new RecipeAddConfigs.ModsXConfig();

        public static class ModsXConfig{

        }
        @Configurable
        public RecipeAddConfigs.ModsYConfig y = new RecipeAddConfigs.ModsYConfig();

        public static class ModsYConfig{

        }
        @Configurable
        public RecipeAddConfigs.ModsZConfig z = new RecipeAddConfigs.ModsZConfig();

        public static class ModsZConfig{

        }
    }
    @Configurable
    public GIConfigHolder.RecipeRemoveConfigs recipesRemoval = new GIConfigHolder.RecipeRemoveConfigs();

    public static class RecipeRemoveConfigs {

        @Configurable
        public RecipeRemoveConfigs.ModsAConfig a = new RecipeRemoveConfigs.ModsAConfig();

        public static class ModsAConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden AE2WTLib recipes.", "Default: true"})
            public boolean harderAE2WTLibRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Botanics recipes.", "Default: true"})
            public boolean harderAppliedBotanicsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Cooking recipes.", "Default: true"})
            public boolean harderAppliedCookingRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Energistics 2 recipes.", "Default: true"})
            public boolean harderAppliedEnergistics2Recipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Mekanistics recipes.", "Default: true"})
            public boolean harderAppliedMekanisticsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Ars Nouveau recipes.", "Default: true"})
            public boolean harderArsNouveauRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Ars Énergistique recipes.", "Default: true"})
            public boolean harderArsÉnergistiqueRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Assembly Lines recipes.", "Default: true"})
            public boolean harderAssemblyLinesRecipes = true; // default true
        }
        @Configurable
        public RecipeRemoveConfigs.ModsBConfig b = new RecipeRemoveConfigs.ModsBConfig();

        public static class ModsBConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Ballistix recipes.", "Default: true"})
            public boolean harderBallistixRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Better Archeology recipes.", "Default: true"})
            public boolean harderBetterArcheologyRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Biomes O' Plenty recipes.", "Default: true"})
            public boolean harderBiomesOPlentyRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Blastcraft mod recipes.", "Default: true"})
            public boolean harderBlastcraftModRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Botania recipes.", "Default: true"})
            public boolean harderBotaniaRecipes = true; // default true
        }
        @Configurable
        public RecipeRemoveConfigs.ModsCConfig c = new RecipeRemoveConfigs.ModsCConfig();

        public static class ModsCConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden CC Tweaked recipes.", "Default: true"})
            public boolean harderCCTweakedRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden CC:C Bridge recipes.", "Default: true"})
            public boolean harderCCCBridgeRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Chisel and Bits recipes.", "Default: true"})
            public boolean harderChiselAndBitsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Cooking for Blockheads recipes.", "Default: true"})
            public boolean harderCookingForBlockheadsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Create recipes.", "Default: true"})
            public boolean harderCreateRecipes = true; // default true
        }
        @Configurable
        public RecipeRemoveConfigs.ModsDConfig d = new RecipeRemoveConfigs.ModsDConfig();

        public static class ModsDConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Domum Omamentum recipes.", "Default: true"})
            public boolean harderDomumOmamentumRecipes = true; // default true
        }
        @Configurable
        public RecipeRemoveConfigs.ModsEConfig e = new RecipeRemoveConfigs.ModsEConfig();

        public static class ModsEConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Electrodynamics recipes.", "Default: true"})
            public boolean harderElectrodynamicsRecipes = true; // default true
        }
        @Configurable
        public RecipeRemoveConfigs.ModsFConfig f = new RecipeRemoveConfigs.ModsFConfig();

        public static class ModsFConfig{

        }
        @Configurable
        public RecipeRemoveConfigs.ModsGConfig g = new RecipeRemoveConfigs.ModsGConfig();

        public static class ModsGConfig{

        }
        @Configurable
        public RecipeRemoveConfigs.ModsHConfig h = new RecipeRemoveConfigs.ModsHConfig();

        public static class ModsHConfig{

        }
        @Configurable
        public RecipeRemoveConfigs.ModsIConfig i = new RecipeRemoveConfigs.ModsIConfig();

        public static class ModsIConfig{

        }
        @Configurable
        public RecipeRemoveConfigs.ModsJConfig j = new RecipeRemoveConfigs.ModsJConfig();

        public static class ModsJConfig{

        }
        @Configurable
        public RecipeRemoveConfigs.ModsKConfig k = new RecipeRemoveConfigs.ModsKConfig();

        public static class ModsKConfig{

        }
        @Configurable
        public RecipeRemoveConfigs.ModsLConfig l = new RecipeRemoveConfigs.ModsLConfig();

        public static class ModsLConfig{

        }
        @Configurable
        public RecipeRemoveConfigs.ModsMConfig m = new RecipeRemoveConfigs.ModsMConfig();

        public static class ModsMConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden ME Requester recipes.", "Default: true"})
            public boolean harderMERequesterRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden MEGA Cells recipes.", "Default: true"})
            public boolean harderMEGACellsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism recipes.", "Default: true"})
            public boolean harderMekanismRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism Additions recipes.", "Default: true"})
            public boolean harderMekanismAdditionsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism Generators recipes.", "Default: true"})
            public boolean harderMekanismGeneratorsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism Tools recipes.", "Default: true"})
            public boolean harderMekanismToolsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism-MoreSolarPanels recipes.", "Default: true"})
            public boolean harderMekanismMoreSolarPanelsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism: Weapons recipes.", "Default: true"})
            public boolean harderMekanismWeaponsRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden MineColonies recipes.", "Default: true"})
            public boolean harderMineColoniesRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden MineColonies for ComputerCraft recipes.", "Default: true"})
            public boolean harderMineColoniesForComputerCraftRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Modular Force Fields System recipes.", "Default: true"})
            public boolean harderModularForceFieldsSystemRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden More Red recipes.", "Default: true"})
            public boolean harderMoreRedRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Multi-Piston recipes.", "Default: true"})
            public boolean harderMultiPistonRecipes = true; // default true
        }
        @Configurable
        public RecipeRemoveConfigs.ModsNConfig n = new RecipeRemoveConfigs.ModsNConfig();

        public static class ModsNConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Nuclear Science recipes.", "Default: true"})
            public boolean harderNuclearScienceRecipes = true; // default true
        }
        @Configurable
        public RecipeRemoveConfigs.ModsOConfig o = new RecipeRemoveConfigs.ModsOConfig();

        public static class ModsOConfig{

        }
        @Configurable
        public RecipeRemoveConfigs.ModsPConfig p = new RecipeRemoveConfigs.ModsPConfig();

        public static class ModsPConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Productive Bees recipes.", "Default: true"})
            public boolean harderProductiveBeesRecipes = true; // default true
        }
        @Configurable
        public RecipeRemoveConfigs.ModsQConfig q = new RecipeRemoveConfigs.ModsQConfig();

        public static class ModsQConfig{

        }
        @Configurable
        public RecipeRemoveConfigs.ModsRConfig r = new RecipeRemoveConfigs.ModsRConfig();

        public static class ModsRConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Rechiseled recipes.", "Default: true"})
            public boolean harderRechiseledRecipes = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Rechiseled Create recipes.", "Default: true"})
            public boolean harderRechiseledCreateRecipes = true; // default true
        }
        @Configurable
        public RecipeRemoveConfigs.ModsSConfig s = new RecipeRemoveConfigs.ModsSConfig();

        public static class ModsSConfig{

        }
        @Configurable
        public RecipeRemoveConfigs.ModsTConfig t = new RecipeRemoveConfigs.ModsTConfig();

        public static class ModsTConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden The Twilight Forest recipes.", "Default: true"})
            public boolean harderTheTwilightForestRecipes = true; // default true
        }
        @Configurable
        public RecipeRemoveConfigs.ModsUConfig u = new RecipeRemoveConfigs.ModsUConfig();

        public static class ModsUConfig{

        }
        @Configurable
        public RecipeRemoveConfigs.ModsVConfig v = new RecipeRemoveConfigs.ModsVConfig();

        public static class ModsVConfig{

        }
        @Configurable
        public RecipeRemoveConfigs.ModsWConfig w = new RecipeRemoveConfigs.ModsWConfig();

        public static class ModsWConfig{

        }
        @Configurable
        public RecipeRemoveConfigs.ModsXConfig x = new RecipeRemoveConfigs.ModsXConfig();

        public static class ModsXConfig{

        }
        @Configurable
        public RecipeRemoveConfigs.ModsYConfig y = new RecipeRemoveConfigs.ModsYConfig();

        public static class ModsYConfig{

        }
        @Configurable
        public RecipeRemoveConfigs.ModsZConfig z = new RecipeRemoveConfigs.ModsZConfig();

        public static class ModsZConfig{

        }
    }
}
