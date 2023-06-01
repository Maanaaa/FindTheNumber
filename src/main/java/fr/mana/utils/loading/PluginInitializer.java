package fr.mana.utils.loading;

import fr.mana.*;
import fr.mana.commands.*;
import fr.mana.commands.configuration.*;
import fr.mana.commands.utils.*;
import fr.mana.utils.*;

import java.util.*;

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

        // Register commands
        this.commands();


    }

    public void commands(){
        Objects.requireNonNull(this.main.getCommand("ftn")).setExecutor(new Reload(main));
        Objects.requireNonNull(this.main.getCommand("ftn")).setExecutor(new FTN(main));
        Objects.requireNonNull(this.main.getCommand("ftn")).setExecutor(new Status(main));
    }

}
