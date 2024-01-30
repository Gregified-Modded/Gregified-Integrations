package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

//TODO: All
public class MineColoniesRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.m.harderMineColoniesRecipes) harderMineColoniesRecipes(registry);
    }

    private static void harderMineColoniesRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("minecolonies:baked_bread"));
        registry.accept(new ResourceLocation("minecolonies:baked_bread_campfire_cooking"));
        registry.accept(new ResourceLocation("minecolonies:baked_bread_smoking"));
        registry.accept(new ResourceLocation("minecolonies:baked_cake"));
        registry.accept(new ResourceLocation("minecolonies:baked_cake_campfire_cooking"));
        registry.accept(new ResourceLocation("minecolonies:baked_cake_smoking"));
        registry.accept(new ResourceLocation("minecolonies:baked_cookies"));
        registry.accept(new ResourceLocation("minecolonies:baked_cookies_campfire_cooking"));
        registry.accept(new ResourceLocation("minecolonies:baked_cookies_smoking"));
        registry.accept(new ResourceLocation("minecolonies:baked_pumpkin_pie"));
        registry.accept(new ResourceLocation("minecolonies:baked_pumpkin_campfire_cooking"));
        registry.accept(new ResourceLocation("minecolonies:baked_pumpkin_smoking"));
        registry.accept(new ResourceLocation("minecolonies:banner_rally_guards"));
        registry.accept(new ResourceLocation("minecolonies:barrel_block"));
        registry.accept(new ResourceLocation("minecolonies:blockconstructiontape"));
        registry.accept(new ResourceLocation("minecolonies:blockhutalchemist"));
        registry.accept(new ResourceLocation("minecolonies:blockhutarchery"));
        registry.accept(new ResourceLocation("minecolonies:blockhutbaker"));
        registry.accept(new ResourceLocation("minecolonies:blockhutbarracks"));
        registry.accept(new ResourceLocation("minecolonies:blockhutbeekeeper"));
        registry.accept(new ResourceLocation("minecolonies:blockhutblacksmith"));
        registry.accept(new ResourceLocation("minecolonies:blockhutbuilder"));
        registry.accept(new ResourceLocation("minecolonies:blockhutchickenherder"));
        registry.accept(new ResourceLocation("minecolonies:blockhutcitizen"));
        registry.accept(new ResourceLocation("minecolonies:blockhutcombatacademy"));
        registry.accept(new ResourceLocation("minecolonies:blockhutcomposter"));
        registry.accept(new ResourceLocation("minecolonies:blockhutconcretemixer"));
        registry.accept(new ResourceLocation("minecolonies:blockhutcook"));
        registry.accept(new ResourceLocation("minecolonies:blockhutcowboy"));
        registry.accept(new ResourceLocation("minecolonies:blockhutcrusher"));
        registry.accept(new ResourceLocation("minecolonies:blockhutdeliveryman"));
        registry.accept(new ResourceLocation("minecolonies:blockhutdeliverymaniron"));
        registry.accept(new ResourceLocation("minecolonies:blockhutdyer"));
        registry.accept(new ResourceLocation("minecolonies:blockhutenchanter"));
        registry.accept(new ResourceLocation("minecolonies:blockhutfarmer"));
        registry.accept(new ResourceLocation("minecolonies:blockhutfarmerstone"));
        registry.accept(new ResourceLocation("minecolonies:blockhutfield"));
        registry.accept(new ResourceLocation("minecolonies:blockhutfisherman"));
        registry.accept(new ResourceLocation("minecolonies:blockhutfletcher"));
        registry.accept(new ResourceLocation("minecolonies:blockhutflorist"));
        registry.accept(new ResourceLocation("minecolonies:blockhutglassblower"));
        registry.accept(new ResourceLocation("minecolonies:blockhutgraveyard"));
        registry.accept(new ResourceLocation("minecolonies:blockhutguardtower"));
        registry.accept(new ResourceLocation("minecolonies:blockhutguardtower"));
        registry.accept(new ResourceLocation("minecolonies:blockhuthospital"));
        registry.accept(new ResourceLocation("minecolonies:blockhutlibrary"));
        registry.accept(new ResourceLocation("minecolonies:blockhutlumberjack"));
        registry.accept(new ResourceLocation("minecolonies:blockhutlumberjackstone"));
        registry.accept(new ResourceLocation("minecolonies:blockhutmechanic"));
        registry.accept(new ResourceLocation("minecolonies:blockhutminer"));
        registry.accept(new ResourceLocation("minecolonies:blockhutminerstone"));
        registry.accept(new ResourceLocation("minecolonies:blockhutmysticalsite"));
        registry.accept(new ResourceLocation("minecolonies:blockhutnetherworker"));
        registry.accept(new ResourceLocation("minecolonies:blockhutplantation"));
        registry.accept(new ResourceLocation("minecolonies:blockhutplantationfield"));
        registry.accept(new ResourceLocation("minecolonies:blockhutrabbithutchsawmill"));
        registry.accept(new ResourceLocation("minecolonies:blockhutschool"));
        registry.accept(new ResourceLocation("minecolonies:blockhutshephard"));
        registry.accept(new ResourceLocation("minecolonies:blockhutsifter"));
        registry.accept(new ResourceLocation("minecolonies:blockhutsmeltery"));
        registry.accept(new ResourceLocation("minecolonies:blockhutwineherder"));
        registry.accept(new ResourceLocation("minecolonies:blockhuttavern"));
        registry.accept(new ResourceLocation("minecolonies:blockhuttownhall"));
        registry.accept(new ResourceLocation("minecolonies:blockhutuniversity"));
        registry.accept(new ResourceLocation("minecolonies:blockhutwarehouse"));
        registry.accept(new ResourceLocation("minecolonies:blockminecoloniesrack"));
        registry.accept(new ResourceLocation("minecolonies:blockpostbox"));
        registry.accept(new ResourceLocation("minecolonies:blockstash"));
        registry.accept(new ResourceLocation("minecolonies:blockwaypoint"));
        registry.accept(new ResourceLocation("minecolonies:build_goggles"));
        registry.accept(new ResourceLocation("minecolonies:chainmailboots"));
        registry.accept(new ResourceLocation("minecolonies:chainmailchestplate"));
        registry.accept(new ResourceLocation("minecolonies:chainmailhelmet"));
        registry.accept(new ResourceLocation("minecolonies:chainmailleggings"));
        registry.accept(new ResourceLocation("minecolonies:clipboard"));
        registry.accept(new ResourceLocation("minecolonies:colony_banner"));
        registry.accept(new ResourceLocation("minecolonies:compostables"));
        registry.accept(new ResourceLocation("minecolonies:compostables_poor"));
        registry.accept(new ResourceLocation("minecolonies:compostables_rich"));
        registry.accept(new ResourceLocation("minecolonies:composted_dirt"));
        registry.accept(new ResourceLocation("minecolonies:doublefern"));
        registry.accept(new ResourceLocation("minecolonies:doublegrass"));
        registry.accept(new ResourceLocation("minecolonies:iron_nugget_from_scimitar_blasting"));
        registry.accept(new ResourceLocation("minecolonies:iron_nugget_from_scimitar_smelting"));
        registry.accept(new ResourceLocation("minecolonies:mediumquarry"));
        registry.accept(new ResourceLocation("minecolonies:questlog"));
        registry.accept(new ResourceLocation("minecolonies:resoucescroll"));
        registry.accept(new ResourceLocation("minecolonies:shapetool"));
        registry.accept(new ResourceLocation("minecolonies:simplequarry"));
        registry.accept(new ResourceLocation("minecolonies:supplycampdeployer"));
        registry.accept(new ResourceLocation("minecolonies:supplychestdeployer"));
    }
}