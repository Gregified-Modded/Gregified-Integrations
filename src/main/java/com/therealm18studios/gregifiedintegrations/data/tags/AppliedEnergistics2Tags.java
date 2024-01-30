package com.therealm18studios.gregifiedintegrations.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class AppliedEnergistics2Tags {
    public AppliedEnergistics2Tags() {
    }

    public static class ModTags {

        /**
         * Applied Energistics 2
         */
        public static final TagKey<Block> APPLIEDENERGISTICS2_SMART_DENCE = BlockTags.create(new ResourceLocation("ae2", "smart_dense_cable"));
    }
}
