package com.therealm18studios.gregifiedintegrations.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ForgeTags {
    public ForgeTags() {
    }

    public static class ModTags {

        /**
         * Forge
         */
        public static final TagKey<Block> FORGE_WOODEN_CHESTS = BlockTags.create(new ResourceLocation("forge", "chests/wooden"));
    }
}
