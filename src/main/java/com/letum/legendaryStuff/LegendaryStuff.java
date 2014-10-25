package com.letum.legendarystuff;

import com.letum.legendarystuff.handler.ConfigHandler;
import com.letum.legendarystuff.init.ModBlocks;
import com.letum.legendarystuff.init.ModItems;
import com.letum.legendarystuff.init.Recipes;
import com.letum.legendarystuff.proxy.IProxy;
import com.letum.legendarystuff.reference.Reference;
import com.letum.legendarystuff.util.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
    public class LegendaryStuff {
        @Mod.Instance(Reference.MOD_ID)
        public static LegendaryStuff instance;

        @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
        public static IProxy proxy;

        @Mod.EventHandler
        public void preInit(FMLPreInitializationEvent event) {
            ConfigHandler.init(event.getSuggestedConfigurationFile());
            FMLCommonHandler.instance().bus().register(new ConfigHandler());

            ModItems.init();
            ModBlocks.init();

            LogHelper.info("Pre Initialization Complete!");
        }

        @Mod.EventHandler
        public void init(FMLInitializationEvent event) {
            LogHelper.info("Initialization Complete!");

            Recipes.init();
        }

        @Mod.EventHandler
        public void postInit(FMLPostInitializationEvent event) {
            LogHelper.info("Post Initialization Complete!");

            for(String oreName : OreDictionary.getOreNames()){
                LogHelper.info(oreName);
            }
        }
}