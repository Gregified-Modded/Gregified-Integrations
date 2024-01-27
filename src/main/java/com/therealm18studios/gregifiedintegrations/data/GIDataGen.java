package com.therealm18studios.gregifiedintegrations.data;

import com.gregtechceu.gtceu.data.lang.LangHandler;
import com.gregtechceu.gtceu.data.tags.BlockTagLoader;
import com.gregtechceu.gtceu.data.tags.FluidTagLoader;
import com.therealm18studios.gregifiedintegrations.api.registries.GIRegistries;
import com.tterrag.registrate.providers.ProviderType;

public class GIDataGen {
    public static void init() {
        //GCyRRegistries.REGISTRATE.addDataGenerator(ProviderType.ITEM_TAGS, TagsHandler::initItem);
        GIRegistries.REGISTRATE.addDataGenerator(ProviderType.BLOCK_TAGS, BlockTagLoader::init);
//        GIRegistries.REGISTRATE.addDataGenerator(ProviderType.FLUID_TAGS, FluidTagLoader::init);
        GIRegistries.REGISTRATE.addDataGenerator(ProviderType.LANG, LangHandler::init);
    }
}
