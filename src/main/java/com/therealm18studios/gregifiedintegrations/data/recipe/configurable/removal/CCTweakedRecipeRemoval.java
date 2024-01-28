package com.therealm18studios.gregifiedintegrations.data.recipe.configurable.removal;

import com.therealm18studios.gregifiedintegrations.config.GIConfigHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class CCTweakedRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        if (GIConfigHolder.INSTANCE.recipesRemoval.harderCCTweakedRemoveRecipes) harderCCTweakedRecipes(registry);
    }

    private static void harderCCTweakedRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("computercraft:cable"));
        registry.accept(new ResourceLocation("computercraft:computer_advanced"));
        registry.accept(new ResourceLocation("computercraft:computer_advanced_upgrade"));
        registry.accept(new ResourceLocation("computercraft:computer_command"));
        registry.accept(new ResourceLocation("computercraft:computer_normal"));
        registry.accept(new ResourceLocation("computercraft:disk_drive"));
        registry.accept(new ResourceLocation("computercraft:monitor_advanced"));
        registry.accept(new ResourceLocation("computercraft:monitor_normal"));
        registry.accept(new ResourceLocation("computercraft:pocket_computer_advanced"));
        registry.accept(new ResourceLocation("computercraft:pocket_computer_advanced_upgrade"));
        registry.accept(new ResourceLocation("computercraft:pocket_computer_normal"));
        registry.accept(new ResourceLocation("computercraft:printer"));
        registry.accept(new ResourceLocation("computercraft:speaker"));
        registry.accept(new ResourceLocation("computercraft:turtle_advanced"));
        registry.accept(new ResourceLocation("computercraft:turtle_advanced_upgrade"));
        registry.accept(new ResourceLocation("computercraft:turtle_normal"));
        registry.accept(new ResourceLocation("computercraft:turtle_upgrade"));
        registry.accept(new ResourceLocation("computercraft:wired_modem"));
        registry.accept(new ResourceLocation("computercraft:wireless_modem_advanced"));
        registry.accept(new ResourceLocation("computercraft:wireless_modem_normal"));
    }
}