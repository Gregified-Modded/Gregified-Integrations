package com.therealm18studios.gregifiedintegrations.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class GIModTags {
    public GIModTags() {
    }

    public static class ModTags {

        /**
         * Ars Nouveau
         */
        public static final TagKey<Block> ARSNOUVEAU_ARCHWOOD = BlockTags.create(new ResourceLocation("forge", "logs/archwood"));

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

        /**
         * Gregtech Community Edition Unofficial: Modern
         */
        public static final TagKey<Item> GTCEU_CIRCUITS_ZPM = ItemTags.create(new ResourceLocation("gtceu", "circuits/zpm"));
        public static final TagKey<Item> GTCEU_CIRCUITS_LUV = ItemTags.create(new ResourceLocation("gtceu", "circuits/luv"));
        public static final TagKey<Item> GTCEU_CIRCUITS_IV = ItemTags.create(new ResourceLocation("gtceu", "circuits/iv"));

        /**
         * Forge
         */
        public static final TagKey<Block> FORGE_WOODEN_CHESTS = BlockTags.create(new ResourceLocation("forge", "chests/wooden"));

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
