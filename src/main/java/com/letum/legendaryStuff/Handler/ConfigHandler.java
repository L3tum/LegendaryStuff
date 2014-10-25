package com.letum.legendarystuff.handler;

import com.letum.legendarystuff.reference.Reference;
import net.minecraftforge.common.config.Configuration;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigHandler
{
    public static Configuration config;
    public static boolean saveConfig;
    public static int getVeinSize;
    public static int getMinY;
    public static int getMaxY;
    public static int getChancesToSpawn;
    public static boolean generateRubyOre;
    public static boolean generateTitOre;
    public static int getMinYT;
    public static int getMaxYT;
    public static int getChancesToSpawnT;
    public static int getVeinSizeT;

    public static void init(File configFile)
    {
        // Create the configuration object from the given configuration file
        if (config == null)
        {
            config= new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        saveConfig = config.getBoolean("configValue", Configuration.CATEGORY_GENERAL, true, "Should this Configuration be saved?");
        getVeinSize = config.getInt("RubyOreVeinSize", Reference.TOPIC1, 4, 1, 16, "This is the vein size of the Ruby Ore");
        getMinY = config.getInt("RubyMinYGen", Reference.TOPIC1, 1, 1, 16, "This is the minimum height for spawning Ruby Ore");
        getMaxY = config.getInt("RubyMaxYGen", Reference.TOPIC1, 16, 2, 64, "This is the maximum height for spawning Ruby Ore");
        getChancesToSpawn = config.getInt("RubyChancesToSpawn", Reference.TOPIC1, 4, 1, 100, "This is the chance to spawn Ruby Ore per chunk");
        generateRubyOre = config.getBoolean("RubyGeneration", Reference.TOPIC1, true, "Should Ruby Ore be generated?");
        generateTitOre = config.getBoolean("TitaniumGeneration", Reference.TOPIC2, true, "Should Titanium Ore be generated?");
        getMinYT = config.getInt("TitMinYGen", Reference.TOPIC2, 1, 1, 16, "This is the minimum height for spawning Titanium Ore");
        getMaxYT = config.getInt("TitMaxYGen", Reference.TOPIC2, 16, 2, 64, "This is the maximum height for spawning Titanium Ore");
        getVeinSizeT = config.getInt("TitVeinSize", Reference.TOPIC2, 4, 1, 16, "This is the vein size of Titanium Ore");
        getChancesToSpawnT = config.getInt("TitChancesToSpawn", Reference.TOPIC2, 4, 1, 100, "This is the chance to spawn Titanium Ore per chunk");


        if (config.hasChanged()&& saveConfig)
        {
            config.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}
