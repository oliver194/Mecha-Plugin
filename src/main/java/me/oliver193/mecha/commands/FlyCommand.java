package me.oliver193.mecha.commands;

import me.oliver193.mecha.Msg;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


public class FlyCommand implements CommandExecutor {

    public final static Set<UUID> flyingPlayers = new HashSet<>();

    @Override

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) {
            Msg.send(commandSender, "&cThis command can only be used by players.");
            return true;
        }

        Player player = (Player) commandSender;
        // Enable/disable fly mode
        player.setAllowFlight(flyingPlayers.add(player.getUniqueId()));
        if (player.getAllowFlight()) Msg.send(player, "&aYou can now fly!");
        else Msg.send(player, "&cYou can no longer fly!");
        if (!player.getAllowFlight()) {
            flyingPlayers.remove(player.getUniqueId());
        }
        return true;
    }

    @EventHandler
    public void onDisconnect(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        p.setAllowFlight(false);
        flyingPlayers.remove(p.getUniqueId());
    }
}
