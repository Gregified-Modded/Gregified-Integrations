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
        public ModsAConfig a = new ModsAConfig();

        public static class ModsAConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden AE2WTLib recipes.", "Default: false"})
            public boolean harderAE2WTLibRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Botanics recipes.", "Default: false"})
            public boolean harderAppliedBotanicsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Cooking recipes.", "Default: false"})
            public boolean harderAppliedCookingRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Energistics 2 recipes.", "Default: false"})
            public boolean harderAppliedEnergistics2Recipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Mekanistics recipes.", "Default: false"})
            public boolean harderAppliedMekanisticsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Ars Nouveau recipes.", "Default: false"})
            public boolean harderArsNouveauRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Ars Énergistique recipes.", "Default: false"})
            public boolean harderArsÉnergistiqueRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Assembly Lines recipes.", "Default: false"})
            public boolean harderAssemblyLinesRecipes = false; // default false
        }
        @Configurable
        public ModsBConfig b = new ModsBConfig();

        public static class ModsBConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Ballistix recipes.", "Default: false"})
            public boolean harderBallistixRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Better Archeology recipes.", "Default: false"})
            public boolean harderBetterArcheologyRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Biomes O' Plenty recipes.", "Default: false"})
            public boolean harderBiomesOPlentyRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Blastcraft mod recipes.", "Default: false"})
            public boolean harderBlastcraftModRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Botania recipes.", "Default: false"})
            public boolean harderBotaniaRecipes = false; // default false
        }
        @Configurable
        public ModsCConfig c = new ModsCConfig();

        public static class ModsCConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden CC Tweaked recipes.", "Default: false"})
            public boolean harderCCTweakedRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden CC:C Bridge recipes.", "Default: false"})
            public boolean harderCCCBridgeRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Chisel and Bits recipes.", "Default: false"})
            public boolean harderChiselAndBitsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Cooking for Blockheads recipes.", "Default: false"})
            public boolean harderCookingForBlocksheadsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Cooking for Blockheads recipes.", "Default: false"})
            public boolean harderCreateRecipes = false; // default false
        }
        @Configurable
        public ModsDConfig d = new ModsDConfig();

        public static class ModsDConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Domum Omamentum recipes.", "Default: false"})
            public boolean harderCookingForDomumOmamentumRecipes = false; // default false
        }
        @Configurable
        public ModsEConfig e = new ModsEConfig();

        public static class ModsEConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Electrodynamics recipes.", "Default: false"})
            public boolean harderElectrodynamicsRecipes = false; // default false
        }
        @Configurable
        public ModsFConfig f = new ModsFConfig();

        public static class ModsFConfig{

        }
        @Configurable
        public ModsGConfig g = new ModsGConfig();

        public static class ModsGConfig{

        }
        @Configurable
        public ModsHConfig h = new ModsHConfig();

        public static class ModsHConfig{

        }
        @Configurable
        public ModsIConfig i = new ModsIConfig();

        public static class ModsIConfig{

        }
        @Configurable
        public ModsJConfig j = new ModsJConfig();

        public static class ModsJConfig{

        }
        @Configurable
        public ModsKConfig k = new ModsKConfig();

        public static class ModsKConfig{

        }
        @Configurable
        public ModsLConfig l = new ModsLConfig();

        public static class ModsLConfig{

        }
        @Configurable
        public ModsMConfig m = new ModsMConfig();

        public static class ModsMConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden ME Requester recipes.", "Default: false"})
            public boolean harderMERequesterRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden MEGA Cells recipes.", "Default: false"})
            public boolean harderMEGACellsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism recipes.", "Default: false"})
            public boolean harderMekanismRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism Additions recipes.", "Default: false"})
            public boolean harderMekanismAdditionsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism Generators recipes.", "Default: false"})
            public boolean harderMekanismGeneratorsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism Tools recipes.", "Default: false"})
            public boolean harderMekanismToolsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism-MoreSolarPanels recipes.", "Default: false"})
            public boolean harderMekanismMoreSolarPanelsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism: Weapons recipes.", "Default: false"})
            public boolean harderMekanismWeaponsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden MineColonies recipes.", "Default: false"})
            public boolean harderMineColoniesRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden MineColonies for ComputerCraft recipes.", "Default: false"})
            public boolean harderMineColoniesForComputerCraftRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Modular Force Fields System recipes.", "Default: false"})
            public boolean harderModularForceFieldsSystemRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden More Red recipes.", "Default: false"})
            public boolean harderMoreRedRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden More Red x CC:Tweaked Compat recipes.", "Default: false"})
            public boolean harderMoreRedXCCTweakedCompatRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Multi-Piston recipes.", "Default: false"})
            public boolean harderMultiPistonRecipes = false; // default false
        @Configurable
        public ModsNConfig n = new ModsNConfig();

        public static class ModsNConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Nuclear Science recipes.", "Default: false"})
            public boolean harderNuclearScienceRecipes = false; // default false
        }
        }
        @Configurable
        public ModsOConfig o = new ModsOConfig();

        public static class ModsOConfig{

        }
        @Configurable
        public ModsPConfig p = new ModsPConfig();

        public static class ModsPConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Productive Bees recipes.", "Default: false"})
            public boolean harderProductiveBeesRecipes = false; // default false
        }
        @Configurable
        public ModsQConfig q = new ModsQConfig();

        public static class ModsQConfig{

        }
        @Configurable
        public ModsRConfig r = new ModsRConfig();

        public static class ModsRConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Rechiseled recipes.", "Default: false"})
            public boolean harderRechiseledRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Rechiseled Create recipes.", "Default: false"})
            public boolean harderRechiseledCreateRecipes = false; // default false
        }
        @Configurable
        public ModsSConfig s = new ModsSConfig();

        public static class ModsSConfig{

        }
        @Configurable
        public ModsTConfig t = new ModsTConfig();

        public static class ModsTConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden The Twilight Forest recipes.", "Default: false"})
            public boolean harderTheTwilightForestRecipes = false; // default false
        }
        @Configurable
        public ModsUConfig u = new ModsUConfig();

        public static class ModsUConfig{

        }
        @Configurable
        public ModsVConfig v = new ModsVConfig();

        public static class ModsVConfig{

        }
        @Configurable
        public ModsWConfig w = new ModsWConfig();

        public static class ModsWConfig{

        }
        @Configurable
        public ModsXConfig x = new ModsXConfig();

        public static class ModsXConfig{

        }
        @Configurable
        public ModsYConfig y = new ModsYConfig();

        public static class ModsYConfig{

        }
        @Configurable
        public ModsZConfig z = new ModsZConfig();

        public static class ModsZConfig{

        }
    }
    @Configurable
    public GIConfigHolder.RecipeRemoveConfigs recipesRemoval = new GIConfigHolder.RecipeRemoveConfigs();

    public static class RecipeRemoveConfigs {

        @Configurable
        public RecipeAddConfigs.ModsAConfig a = new RecipeAddConfigs.ModsAConfig();

        public static class ModsAConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden AE2WTLib recipes.", "Default: false"})
            public boolean harderAE2WTLibRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Botanics recipes.", "Default: false"})
            public boolean harderAppliedBotanicsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Cooking recipes.", "Default: false"})
            public boolean harderAppliedCookingRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Energistics 2 recipes.", "Default: false"})
            public boolean harderAppliedEnergistics2Recipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Mekanistics recipes.", "Default: false"})
            public boolean harderAppliedMekanisticsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Ars Nouveau recipes.", "Default: false"})
            public boolean harderArsNouveauRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Ars Énergistique recipes.", "Default: false"})
            public boolean harderArsÉnergistiqueRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Assembly Lines recipes.", "Default: false"})
            public boolean harderAssemblyLinesRecipes = false; // default false
        }
        @Configurable
        public RecipeAddConfigs.ModsBConfig b = new RecipeAddConfigs.ModsBConfig();

        public static class ModsBConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Ballistix recipes.", "Default: false"})
            public boolean harderBallistixRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Better Archeology recipes.", "Default: false"})
            public boolean harderBetterArcheologyRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Biomes O' Plenty recipes.", "Default: false"})
            public boolean harderBiomesOPlentyRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Blastcraft mod recipes.", "Default: false"})
            public boolean harderBlastcraftModRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Botania recipes.", "Default: false"})
            public boolean harderBotaniaRecipes = false; // default false
        }
        @Configurable
        public RecipeAddConfigs.ModsCConfig c = new RecipeAddConfigs.ModsCConfig();

        public static class ModsCConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden CC Tweaked recipes.", "Default: false"})
            public boolean harderCCTweakedRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden CC:C Bridge recipes.", "Default: false"})
            public boolean harderCCCBridgeRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Chisel and Bits recipes.", "Default: false"})
            public boolean harderChiselAndBitsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Cooking for Blockheads recipes.", "Default: false"})
            public boolean harderCookingForBlocksheadsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Cooking for Blockheads recipes.", "Default: false"})
            public boolean harderCreateRecipes = false; // default false
        }
        @Configurable
        public RecipeAddConfigs.ModsDConfig d = new RecipeAddConfigs.ModsDConfig();

        public static class ModsDConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Domum Omamentum recipes.", "Default: false"})
            public boolean harderCookingForDomumOmamentumRecipes = false; // default false
        }
        @Configurable
        public RecipeAddConfigs.ModsEConfig e = new RecipeAddConfigs.ModsEConfig();

        public static class ModsEConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Electrodynamics recipes.", "Default: false"})
            public boolean harderElectrodynamicsRecipes = false; // default false
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
            @Configurable.Comment({"Whether to harden ME Requester recipes.", "Default: false"})
            public boolean harderMERequesterRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden MEGA Cells recipes.", "Default: false"})
            public boolean harderMEGACellsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism recipes.", "Default: false"})
            public boolean harderMekanismRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism Additions recipes.", "Default: false"})
            public boolean harderMekanismAdditionsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism Generators recipes.", "Default: false"})
            public boolean harderMekanismGeneratorsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism Tools recipes.", "Default: false"})
            public boolean harderMekanismToolsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism-MoreSolarPanels recipes.", "Default: false"})
            public boolean harderMekanismMoreSolarPanelsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Mekanism: Weapons recipes.", "Default: false"})
            public boolean harderMekanismWeaponsRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden MineColonies recipes.", "Default: false"})
            public boolean harderMineColoniesRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden MineColonies for ComputerCraft recipes.", "Default: false"})
            public boolean harderMineColoniesForComputerCraftRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Modular Force Fields System recipes.", "Default: false"})
            public boolean harderModularForceFieldsSystemRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden More Red recipes.", "Default: false"})
            public boolean harderMoreRedRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden More Red x CC:Tweaked Compat recipes.", "Default: false"})
            public boolean harderMoreRedXCCTweakedCompatRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Multi-Piston recipes.", "Default: false"})
            public boolean harderMultiPistonRecipes = false; // default false
            @Configurable
            public RecipeAddConfigs.ModsMConfig.ModsNConfig n = new RecipeAddConfigs.ModsMConfig.ModsNConfig();

            public static class ModsNConfig{
                @Configurable
                @Configurable.Comment({"Whether to harden Nuclear Science recipes.", "Default: false"})
                public boolean harderNuclearScienceRecipes = false; // default false
            }
        }
        @Configurable
        public RecipeAddConfigs.ModsOConfig o = new RecipeAddConfigs.ModsOConfig();

        public static class ModsOConfig{

        }
        @Configurable
        public RecipeAddConfigs.ModsPConfig p = new RecipeAddConfigs.ModsPConfig();

        public static class ModsPConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Productive Bees recipes.", "Default: false"})
            public boolean harderProductiveBeesRecipes = false; // default false
        }
        @Configurable
        public RecipeAddConfigs.ModsQConfig q = new RecipeAddConfigs.ModsQConfig();

        public static class ModsQConfig{

        }
        @Configurable
        public RecipeAddConfigs.ModsRConfig r = new RecipeAddConfigs.ModsRConfig();

        public static class ModsRConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden Rechiseled recipes.", "Default: false"})
            public boolean harderRechiseledRecipes = false; // default false
            @Configurable
            @Configurable.Comment({"Whether to harden Rechiseled Create recipes.", "Default: false"})
            public boolean harderRechiseledCreateRecipes = false; // default false
        }
        @Configurable
        public RecipeAddConfigs.ModsSConfig s = new RecipeAddConfigs.ModsSConfig();

        public static class ModsSConfig{

        }
        @Configurable
        public RecipeAddConfigs.ModsTConfig t = new RecipeAddConfigs.ModsTConfig();

        public static class ModsTConfig{
            @Configurable
            @Configurable.Comment({"Whether to harden The Twilight Forest recipes.", "Default: false"})
            public boolean harderTheTwilightForestRecipes = false; // default false
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
}
