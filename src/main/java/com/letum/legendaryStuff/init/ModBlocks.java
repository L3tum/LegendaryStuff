package com.letum.legendarystuff.init;

import com.letum.legendarystuff.block.*;
import com.letum.legendarystuff.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks{
    public static final BlockLS blockTit = new BlockTit();
    public static final OreLS oreRuby = new OreRuby();
    public static final BlockLS blockRuby = new BlockRuby();
    public static final OreLS oreTit = new OreTit();

    public static void init(){
        GameRegistry.registerBlock(blockTit, "blockTit");
        GameRegistry.registerBlock(oreRuby, "oreRuby");
        GameRegistry.registerBlock(blockRuby, "blockRuby");
        GameRegistry.registerBlock(oreTit, "oreTit");
    }
}