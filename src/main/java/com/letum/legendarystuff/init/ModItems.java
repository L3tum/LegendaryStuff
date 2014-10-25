package com.letum.legendarystuff.init;

import com.letum.legendarystuff.item.ItemLS;
import com.letum.legendarystuff.item.ItemTit;
import com.letum.legendarystuff.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemLS itemTit = new ItemTit();

    public static void init(){
        GameRegistry.registerItem(itemTit, "itemTit");
    }
}
