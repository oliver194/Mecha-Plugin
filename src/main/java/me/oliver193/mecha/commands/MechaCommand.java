package me.oliver193.mecha.commands;

import me.oliver193.mecha.Msg;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MechaCommand implements CommandExecutor {
    @Override

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Msg.send(commandSender, "&7------------= &aMecha &7=------------");
        Msg.send(commandSender, "&aServer Version&f: " + Bukkit.getVersion() + " &ais installed.");
        Msg.send(commandSender, "&aAuthor&f: &aoliver193");
        Msg.send(commandSender, "&aVersion&f: &a1.5.0-ALPHA");
        Msg.send(commandSender, "This plugin is open source! view the source code at:");
        Msg.send(commandSender, "https://github.com/oliver194/Mecha-Plugin");
        Msg.send(commandSender, "&4PRE-RELEASE!!! THIS VERSION IS NOT STABLE");
        Msg.send(commandSender, "&4NOT RECOMMENDED FOR PRODUCTION");
        return true;
    }
}
