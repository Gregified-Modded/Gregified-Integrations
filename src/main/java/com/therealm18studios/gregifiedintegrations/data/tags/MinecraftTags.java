package com.therealm18studios.gregifiedintegrations.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class MinecraftTags {
    public MinecraftTags() {
    }

    public static class ModTags {

        /**
         * Forge
         */
        public static final TagKey<Block> MINECRAFT_LOGS = BlockTags.create(new ResourceLocation("minecraft", "logs"));
    }
}
