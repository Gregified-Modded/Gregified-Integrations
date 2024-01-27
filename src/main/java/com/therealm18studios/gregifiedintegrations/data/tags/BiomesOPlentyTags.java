package com.therealm18studios.gregifiedintegrations.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BiomesOPlentyTags {
    public BiomesOPlentyTags() {
    }

    public static class ModTags {

        /**
         * Biomes O' Plenty
         */
        public static final TagKey<Block> BOP_DEAD = BlockTags.create(new ResourceLocation("biomesoplenty", "dead_logs"));
        public static final TagKey<Block> BOP_FIR = BlockTags.create(new ResourceLocation("biomesoplenty", "fir_logs"));
        public static final TagKey<Block> BOP_HELLBARK = BlockTags.create(new ResourceLocation("biomesoplenty", "hellbark_logs"));
        public static final TagKey<Block> BOP_JACARANDA = BlockTags.create(new ResourceLocation("biomesoplenty", "jacaranda_logs"));
        public static final TagKey<Block> BOP_MAGIC = BlockTags.create(new ResourceLocation("biomesoplenty", "magic_logs"));
        public static final TagKey<Block> BOP_MAHOGANY = BlockTags.create(new ResourceLocation("biomesoplenty", "mahogany_logs"));
        public static final TagKey<Block> BOP_PALM = BlockTags.create(new ResourceLocation("biomesoplenty", "palm_logs"));
        public static final TagKey<Block> BOP_REDWOOD = BlockTags.create(new ResourceLocation("biomesoplenty", "redwood_logs"));
        public static final TagKey<Block> BOP_UMBRAN = BlockTags.create(new ResourceLocation("biomesoplenty", "umbran_logs"));
        public static final TagKey<Block> BOP_WILLOW = BlockTags.create(new ResourceLocation("biomesoplenty", "willow_logs"));
    }
}
