package fr.mana.commands.configuration;

import fr.mana.*;
import fr.mana.utils.*;
import org.bukkit.command.*;

public class Status implements CommandExecutor {
    private Main main;
    public Status(Main main) {
        this.main = main;
    }

    PluginConfig pluginConfig = new PluginConfig(main);

    Integer nextStamp = 0;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 1){
            if(args[0].equalsIgnoreCase("start")){
                if(pluginConfig.status().equals(false)){
                    sender.sendMessage(pluginConfig.prefix()+" §aYou have successfully enabled the FTN event ! \n" +
                            "\n" +
                            "§aThe next event is in §7§l"+nextStamp+" §7minutes");
                    main.getConfig().set("findthenumberConfig.enable", true);
                    //--------------------
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(">>>> FIND THE NUMBER <<<<");
                    System.out.println(" ");
                    System.out.println("    >>>> FTN IS NOW ACTIVATED <<<<");
                    System.out.println("    >>>> Author: _Manaa for Minecraft Server PLAY.TERRACRAFT.FR");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    //--------------------
                }
                else{
                    sender.sendMessage(pluginConfig.prefix()+" §aYou have successfully disabled the FTN event ! ");
                    main.getConfig().set("findthenumberConfig.enable", false);
                    //--------------------
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(">>>> FIND THE NUMBER <<<<");
                    System.out.println(" ");
                    System.out.println("    >>>> FTN IS NOW ACTIVATED <<<<");
                    System.out.println("    >>>> Author: _Manaa for Minecraft Server PLAY.TERRACRAFT.FR");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    //--------------------
                }
            }
        }
        return false;
    }
}
