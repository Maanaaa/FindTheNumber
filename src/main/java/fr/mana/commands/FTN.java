package fr.mana.commands;

import fr.mana.*;
import org.bukkit.command.*;

public class FTN implements CommandExecutor {
    private Main main;
    public FTN(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(args.length == 0){
            sender.sendMessage("§7----------------" +
                    "\n " +
                    "\n§6Find The Number" +
                    "\n§6By TerraCraft.fr " +
                    "\n§e-----------" +
                    "\n  §f/ftn reload : §7Reload configuration file" +
                    "\n  §f/ftn stop : §7Stop the automatic event"+
                    "\n  §7/ftn start : §7Start the automatic event"+
                    "\n  §7/ftn delay <minutes> : §7Time between two events in minutes"+
                    "\n  §7/ftn contact : §7Contact us if you have any problem"+
                    "\n "+
                    "\n§7----------------");
        }

        return false;
    }
}
