package com.letum.legendarystuff.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
    public static void init() {
        Modinit();
    }

    public static void Modinit() {

        //Blocks
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.blockTit), new ItemStack(ModItems.itemTit, 9, 0)));

        //Items
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.itemLeg), new ItemStack(ModItems.itemTit), new ItemStack(ModItems.itemRuby), new ItemStack(Items.diamond), new ItemStack(Items.emerald)));
        GameRegistry.addRecipe(new ItemStack(ModItems.legPickaxe), "lll", " s ", " s ", 'l', new ItemStack(ModItems.itemLeg), 's', new ItemStack(Items.stick));

        //Smeltings
        GameRegistry.addSmelting(new ItemStack(ModBlocks.oreRuby), new ItemStack(ModItems.itemRuby), 5.0F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.oreTit), new ItemStack(ModItems.itemTit), 5.0F);
    }
}
