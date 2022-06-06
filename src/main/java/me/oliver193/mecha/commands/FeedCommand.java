package me.oliver193.mecha.commands;

import me.oliver193.mecha.Msg;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {
    @Override

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) {
            Msg.send(commandSender, "&cThis command can only be used by players.");
            return true;
        }

        Player player = (Player) commandSender;
        player.setFoodLevel(20);
        Msg.send(commandSender, "&aYou are no longer hungry!");
        return true;
    }
}