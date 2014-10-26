package com.letum.legendarystuff.init;

import com.letum.legendarystuff.block.*;
import com.letum.legendarystuff.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks{
    public static final BlockLS blockTit = new BlockTit();

    public static final BlockOreLS oreRuby = new RubyOre();
    public static final BlockOreLS oreTit = new TitOre();

    public static void init(){
        GameRegistry.registerBlock(blockTit, "blockTit");
        GameRegistry.registerBlock(oreRuby, "oreRuby");
        GameRegistry.registerBlock(oreTit, "oreTit");
    }
}