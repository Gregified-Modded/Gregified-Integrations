package com.therealm18studios.gregifiedintegrations.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class GregTechCEuTags {
    public GregTechCEuTags() {
    }

    public static class ModTags {

        /**
         * Gregtech Community Edition Unofficial: Modern
         */
        public static final TagKey<Item> GTCEU_CIRCUITS_ZPM = ItemTags.create(new ResourceLocation("gtceu", "circuits/zpm"));
        public static final TagKey<Item> GTCEU_CIRCUITS_LUV = ItemTags.create(new ResourceLocation("gtceu", "circuits/luv"));
        public static final TagKey<Item> GTCEU_CIRCUITS_LV = ItemTags.create(new ResourceLocation("gtceu", "circuits/lv"));
        public static final TagKey<Item> GTCEU_CIRCUITS_IV = ItemTags.create(new ResourceLocation("gtceu", "circuits/iv"));
    }
}
