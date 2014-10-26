package com.letum.legendarystuff.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
    public static void init() {
        Modinit();
    }

    public static void Modinit() {
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.blockTit), new ItemStack(ModItems.itemTit, 9, 0)));
    }
}
