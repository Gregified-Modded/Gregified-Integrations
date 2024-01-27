package com.therealm18studios.gregifiedintegrations.api.recipes;

import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.crafting.Ingredient;

public class ProductiveBeesHiveType {

    private boolean hasTexture;
    private String hexColorCode;
    private String styleOfPlank;
    private Ingredient ingredient;

    public ProductiveBeesHiveType(boolean hasTexture, String hexColorCode, String styleOfPlank, Ingredient ingredient) {
        this.hasTexture = hasTexture;
        this.hexColorCode = hexColorCode;
        this.styleOfPlank = styleOfPlank;
        this.ingredient = ingredient;
    }
}
