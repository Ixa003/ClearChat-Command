package General.Core.Commands.staff;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearChat implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("clearchat") && (sender.hasPermission("ixaessentials.staff"))) {
    for (int i = 0; i < 100; i++) {
        Bukkit.getServer().broadcastMessage(" ");
    }
    Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "El chat ha sido limpiado por " + p.getName());
    return true;
        }
        return false;
    }
}
