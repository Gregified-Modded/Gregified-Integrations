package com.therealm18studios.gregifiedintegrations.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ArsNouveauTags {
    public ArsNouveauTags() {
    }

    public static class ModTags {

        /**
         * Ars Nouveau
         */
        public static final TagKey<Block> ARSNOUVEAU_ARCHWOOD = BlockTags.create(new ResourceLocation("forge", "logs/archwood"));
    }
}
