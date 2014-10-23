package com.letum.legendarystuff.init;

import com.letum.legendarystuff.block.BlockLS;
import com.letum.legendarystuff.block.BlockTit;
import com.letum.legendarystuff.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks{
    public static final BlockLS blockTit = new BlockTit();

    public static void init(){
        GameRegistry.registerBlock(blockTit, "blockTit");
    }
}