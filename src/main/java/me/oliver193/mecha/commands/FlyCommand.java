package me.oliver193.mecha.commands;

import me.oliver193.mecha.Msg;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class FlyCommand implements CommandExecutor {

    private final Set<UUID> flyingPlayers = new HashSet<>();
    @Override

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player)) {
            Msg.send(commandSender, "&cThis command can only be used by players.");
            return true;
        }

        Player player = (Player) commandSender;
        // Enable/disable fly mode
        if (flyingPlayers.contains(player.getUniqueId())){
            flyingPlayers.remove(player.getUniqueId());
            player.setAllowFlight(false);
            Msg.send(player, "&cFlight has been disabled.");
        }else if(!flyingPlayers.contains(player.getUniqueId())) {
            flyingPlayers.add(player.getUniqueId());
            player.setAllowFlight(true);
            Msg.send(player, "&aFlight has been enabled.");
        }
        return true;
    }
}
