package com.therealm18studios.gregifiedintegrations.api.data.tag;

import com.gregtechceu.gtceu.api.data.tag.TagPrefix;

public class GITagPrefix extends TagPrefix {

    public static final TagPrefix nest;

    public GITagPrefix(String name) {
        super(name);
    }

    public GITagPrefix(String name, boolean invertedName) {
        super(name, invertedName);
    }

    static {
        nest = (new TagPrefix("_nest")).unificationEnabled(true);
    }
}