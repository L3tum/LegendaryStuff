package com.letum.legendaryStuff.init;

import com.letum.legendaryStuff.block.BlockLS;
import com.letum.legendaryStuff.block.BlockTit;
import com.letum.legendaryStuff.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks{
    public static final BlockLS blockTit = new BlockTit();

    public static void init(){
        GameRegistry.registerBlock(blockTit, "blockTit");
    }
}