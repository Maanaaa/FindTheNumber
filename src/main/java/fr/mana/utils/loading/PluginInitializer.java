package fr.mana.utils.loading;

import fr.mana.*;
import fr.mana.utils.*;

public class PluginInitializer {
    private Main main;
    public PluginInitializer(Main main) {
        this.main = main;
    }

    public void register(){
        //--------------------
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(">>>> FIND THE NUMBER <<<<");
        System.out.println(" ");
        System.out.println("    >>>> Plugin started successfully <<<<");
        System.out.println("    >>>> Author: _Manaa for Minecraft Server PLAY.TERRACRAFT.FR");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        //--------------------
        PluginConfig pluginConfig = new PluginConfig(main);
    }
}
