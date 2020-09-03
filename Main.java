package General.Core;

import General.Core.Commands.staff.ClearChat;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements CommandExecutor {

    PluginDescriptionFile pdf = getDescription();
    public String ver = pdf.getVersion();

    @Override
    public void onEnable() {

        Bukkit.getConsoleSender().sendMessage(ChatColor.WHITE + "El plugin clearchat ha sido activado correctamente.");


        getCommand("clearchat").setExecutor(new ClearChat());
    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_RED + "El plugin clearchat al ha sido desactivado.");
    }
}