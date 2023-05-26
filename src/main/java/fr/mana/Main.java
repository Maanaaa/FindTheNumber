package fr.mana;

import fr.mana.utils.loading.*;
import fr.mana.utils.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    PluginInitializer pluginInitializer = new PluginInitializer(this);

    @Override
    public void onEnable() {pluginInitializer.register();}

}
