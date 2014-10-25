package com.letum.legendarystuff.init;

import com.letum.legendarystuff.util.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
    public static void init(){
        initModRecipes();
    }
    public static void initModRecipes(){
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockTit), "ttt", "ttt", "ttt", 't', new ItemStack(ModItems.itemTit, 1, 0));
        LogHelper.info("1st added");
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockRuby), "ttt", "ttt", "ttt", 't', new ItemStack(ModItems.itemRuby));
        LogHelper.info("2nd added");
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemLeg, 1, 0), new ItemStack(ModItems.itemRuby, 1, 0), new ItemStack(ModItems.itemTit, 1, 0), new ItemStack(Items.diamond, 1, 0));
        LogHelper.info("3rd added");
        GameRegistry.addRecipe(new ItemStack(ModItems.legPick), "ttt", " s ", " s ", 't', new ItemStack(ModItems.itemLeg), 's', new ItemStack(Items.stick));
        LogHelper.info("4th added");
        GameRegistry.addSmelting(ModBlocks.oreRuby, new ItemStack(ModItems.itemRuby),5.0F);
        LogHelper.info("5th added");
        GameRegistry.addSmelting(ModBlocks.oreTit, new ItemStack(ModItems.itemTit), 5.0F);
        LogHelper.info("6th added");
    }
}
