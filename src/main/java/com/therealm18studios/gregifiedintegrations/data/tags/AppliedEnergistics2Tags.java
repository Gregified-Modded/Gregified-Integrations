package com.therealm18studios.gregifiedintegrations.data.tags;

import com.gregtechceu.gtceu.api.data.tag.TagUtil;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class AppliedEnergistics2Tags {
    public AppliedEnergistics2Tags() {
    }

    public static class ModTags {

        /**
         * Applied Energistics 2
         */
        public static final TagKey<Item> APPLIEDENERGISTICS2_SMART_DENCE = TagUtil.createModItemTag("ae2/smart_dense_cable");
        public static final TagKey<Item> APPLIEDENERGISTICS2_GLASS_CABLE = TagUtil.createModItemTag("ae2/glass_cable");
    }
}
