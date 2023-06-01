package fr.mana.utils;

import com.sun.org.apache.xerces.internal.xs.*;
import fr.mana.*;

import java.util.*;

public class PluginConfig {
    private final Main main;
    public PluginConfig(Main main) {
        this.main = main;
    }

    public void registerConfigs(){
        main.saveDefaultConfig();
    }


    //----------------------
    //
    // PLUGIN CONFIGURATION
    //
    //----------------------


    // Plugin prefix
    public String prefix(){
        return Objects.requireNonNull(main.getConfig().getString("findthenumberConfig.prefix")).replace("&","§");
    }

    // Time between the events in minutes
    public Integer eventsDelay(){
        return (Integer) main.getConfig().getInt("findthenumberConfig.delay");
    }

    // Event enable or not
    public Boolean status(){
        return (Boolean) main.getConfig().getBoolean("findthenumberConfig.enable");
    }



    //----------------------
    //
    // EVENT BROADCASTS
    //
    //----------------------

    // [First broadcast]
    // It is essential to implement a loop to retrieve all broadcast lines when implementing the object
    public StringList firstBrodcast(){
        return (StringList) main.getConfig().getStringList("findthenumberConfig.messages.broadcasts.firstBroadcast");
    }

    // [Second broadcast]
    // It is essential to implement a loop to retrieve all broadcast lines when implementing the object
    public StringList winningBroadcast(){
        return (StringList) main.getConfig().getStringList("findthenumberConfig.messages.broadcasts.winningBroadast");
    }


    //----------------------
    //
    // MESSAGES TO PLAYER
    //
    //----------------------




}
