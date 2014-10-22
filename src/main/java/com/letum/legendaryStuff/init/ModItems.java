package com.letum.legendaryStuff.init;

import com.letum.legendaryStuff.item.ItemLS;
import com.letum.legendaryStuff.item.ItemLegPick;
import com.letum.legendaryStuff.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemLS legPick = new ItemLegPick();

    public static void init(){
        GameRegistry.registerItem(legPick, "legendaryPickaxe");
    }
}
