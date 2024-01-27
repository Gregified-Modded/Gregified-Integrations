package com.therealm18studios.gregifiedintegrations.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class TheTwilightForestTags {
    public TheTwilightForestTags() {
    }

    public static class ModTags {

        /**
         * The Twilight Forest
         */
        public static final TagKey<Block> TTF_CANOPY = BlockTags.create(new ResourceLocation("twilightforest", "canopy_logs"));
        public static final TagKey<Block> TTF_DARK = BlockTags.create(new ResourceLocation("twilightforest", "dark_logs"));
        public static final TagKey<Block> TTF_MANGROVE = BlockTags.create(new ResourceLocation("twilightforest", "mangrove_logs"));
        public static final TagKey<Block> TTF_MINING = BlockTags.create(new ResourceLocation("twilightforest", "mining_logs"));
        public static final TagKey<Block> TTF_SORTING = BlockTags.create(new ResourceLocation("twilightforest", "sorting_logs"));
        public static final TagKey<Block> TTF_TIME = BlockTags.create(new ResourceLocation("twilightforest", "time_logs"));
        public static final TagKey<Block> TTF_TRANSFORMATION = BlockTags.create(new ResourceLocation("twilightforest", "transformation_logs"));
        public static final TagKey<Block> TTF_TWILIGHT_OAK = BlockTags.create(new ResourceLocation("twilightforest", "twilight_oak_logs"));
    }
}
