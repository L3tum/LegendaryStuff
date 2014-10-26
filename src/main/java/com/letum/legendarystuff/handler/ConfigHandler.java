package com.letum.legendarystuff.handler;

import com.letum.legendarystuff.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static Configuration config;
    public static boolean configValue = true;
    public static boolean generateRuby = true;
    public static boolean generateTit = true;
    public static int minY;
    public static int minYT;
    public static int maxY;
    public static int maxYT;
    public static int veinsize;
    public static int veinsizeT;
    public static int chance;
    public static int chanceT;


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
        configValue = config.getBoolean("configValue", Configuration.CATEGORY_GENERAL, true, "Should this Config be saved?");
        generateRuby = config.getBoolean("generateRubyOre", Reference.WG1, true, "Should Ruby ore be generated?");
        generateTit = config.getBoolean("generateTitOre", Reference.WG2, true, "Should Titanium ore be generated?");
        minY = config.getInt("minYRuby", Reference.WG1, 1, 1, 16, "Minimum height of Ruby ore");
        maxY = config.getInt("maxRuby", Reference.WG1, 16, 2, 64, "Maximum height of Ruby ore");
        minYT = config.getInt("minTit", Reference.WG2, 1, 1, 16, "Minimum height of Titanium ore");
        maxYT = config.getInt("maxTit", Reference.WG2, 16, 2, 64, "Maximum height of Titanium ore");
        veinsize = config.getInt("veinsizeRuby", Reference.WG1, 4, 1, 16, "Veinsize of a generated Ruby ore vein");
        veinsizeT = config.getInt("veinsizeTit", Reference.WG2, 4, 1, 16, "Veinsize of a generated Titanium ore vein");
        chance = config.getInt("chanceRuby", Reference.WG1, 5, 1, 100, "Chance to spawn Ruby ore per chunk");
        chanceT = config.getInt("chanceTit", Reference.WG2, 5, 1, 100, "Chance to spawn Titanium ore per chunk");

        if (config.hasChanged() && configValue)
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
