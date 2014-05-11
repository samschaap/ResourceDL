package nl.sheepcraft.resourcedl;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onDisable() {
        }

	@Override
	public void onEnable() {
        }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("resourcedl")) {
            if(!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.RED + "Only players can use this command!");
            } else {
                if(args == null) {
                    Player player = (Player) sender;
                    player.sendMessage(ChatColor.RED + "Please follow this command by an URL.");
                } else {
                Player player = (Player) sender;
                player.setResourcePack(args[0].toString());
                player.sendMessage(ChatColor.GREEN + "Resourcepack from URL " + args[0].toString() + " downloading. Make sure you have enabled resource pack downloads in your options!");
            }
        }
            return true;
    }
            return true;
    }
        
}
