package fr.mana.commands.utils;

import fr.mana.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;

public class Reload implements CommandExecutor {

    private Main main;

    public Reload(Main main) {
        this.main = main;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(args[0].equalsIgnoreCase("reload")){
            main.reloadConfig();

            // Send message to the executor
            sender.sendMessage("§7----------------" +
                    "\n " +
                    "\n§6Find The Number" +
                    "\n§6By TerraCraft.fr " +
                    "\n§6has been reloaded sucessfully !" +
                    "\n§cSee console details if there is a problem" +
                    "\n "+
                    "\n§7----------------");

            // Send message to the console
            System.out.println("----------------" +
                    "\n " +
                    "\nFind The Number" +
                    "\nBy TerraCraft.fr " +
                    "\nhas been reloaded sucessfully !" +
                    "\nSee console details if there is a problem" +
                    "\n "+
                    "\n----------------");
        }

        return false;
    }
}
