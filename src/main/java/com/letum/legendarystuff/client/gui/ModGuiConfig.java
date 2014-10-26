package com.letum.legendarystuff.client.gui;

import com.letum.legendarystuff.handler.ConfigHandler;
import com.letum.legendarystuff.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.ArrayList;
import java.util.List;

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                getConfigElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
    }

    private static List<IConfigElement> getConfigElements() {
        List<IConfigElement> list = new ArrayList<IConfigElement>();
        list.add(new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)));
        list.add(new ConfigElement(ConfigHandler.config.getCategory(Reference.WG1)));
        list.add(new ConfigElement(ConfigHandler.config.getCategory(Reference.WG2)));
        return list;
    }
}
