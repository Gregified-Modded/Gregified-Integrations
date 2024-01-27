package com.therealm18studios.gregifiedintegrations.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ProductiveBeesModTags {
    public ProductiveBeesModTags() {
    }

    public static class ModTags {

        /**
         * Productive Bees
         */
        public static final TagKey<Block> BLOCK_FLOWER_AGATE = BlockTags.create(new ResourceLocation("productivebees", "flowers/agate"));
        public static final TagKey<Item> ITEM_FLOWER_AGATE = ItemTags.create(new ResourceLocation("productivebees", "flowers/agate"));
    }
}
