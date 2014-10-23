package com.letum.legendarystuff.creativetab;

import com.letum.legendarystuff.init.ModBlocks;
import com.letum.legendarystuff.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CTLS {
    public static final CreativeTabs CTLS = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem(){
            return Item.getItemFromBlock(ModBlocks.blockTit);
        }
    };
}
