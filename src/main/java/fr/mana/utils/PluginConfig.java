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

    public void plugin(){

        // Plugin prefix
        String prefix = Objects.requireNonNull(main.getConfig().getString("findthenumberConfig.prefix")).replace("&","§");

        // Time between the events in minutes
        Integer eventsDelay = (Integer) main.getConfig().getInt("findthenumberConfig.delay");
    }

    public void broadcasts(){

        // [First broadcast]
        // It is essential to implement a loop to retrieve all broadcast lines when implementing the object
        StringList firstBroadcast = (StringList) main.getConfig().getStringList("findthenumberConfig.messages.broadcasts.firstBroadcast");

        // [Second broadcast]
        // It is essential to implement a loop to retrieve all broadcast lines when implementing the object
        StringList winningBroadast = (StringList) main.getConfig().getStringList("findthenumberConfig.messages.broadcasts.winningBroadast");

    }

    public void playerMessages(){

    }


}
