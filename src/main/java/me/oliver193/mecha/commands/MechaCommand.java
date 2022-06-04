package me.oliver193.mecha.commands;

import me.oliver193.mecha.Msg;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class MechaCommand implements CommandExecutor {
    @Override

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Msg.send(commandSender, "&7------------= &aMecha &7=------------");
        Msg.send(commandSender, "&aVersion: " + Bukkit.getVersion() + " &ais installed.");
        Msg.send(commandSender, "&4PRELEASE!!! THIS VERSION IS NOT STABLE");
        return true;
    }
}
