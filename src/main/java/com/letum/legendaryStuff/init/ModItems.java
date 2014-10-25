package com.letum.legendarystuff.init;

import com.letum.legendarystuff.item.*;
import com.letum.legendarystuff.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemLS itemTit = new ItemTit();
    public static final ItemLS itemRuby = new ItemRuby();
    public static final ItemLS itemLeg = new ItemLeg();

    public static final ItemToolLS legPick = new LegPick();

    public static void init(){
        GameRegistry.registerItem(itemTit, "itemTit");
        GameRegistry.registerItem(itemRuby, "itemRuby");
        GameRegistry.registerItem(itemLeg, "itemLeg");

        GameRegistry.registerItem(legPick, "legPick");
    }
}
