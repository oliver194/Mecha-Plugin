package me.oliver193.mecha.commands;

import me.oliver193.mecha.Msg;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class FlyCommand implements CommandExecutor {

    private ArrayList<Player> list_of_flying_players = new ArrayList<>();
    @Override

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player)) {
            Msg.send(commandSender, "&cThis command can only be used by players.");
            return true;
        }

        Player player = (Player) commandSender;
        // Enable/disable fly mode
        if (list_of_flying_players.contains(player)){
            list_of_flying_players.remove(player);
            player.setAllowFlight(false);
            Msg.send(player, "&cFlight has been disabled.");
        }else if(!list_of_flying_players.contains(player)) {
            list_of_flying_players.add(player);
            player.setAllowFlight(true);
            Msg.send(player, "&aFlight has been enabled.");
        }
        return true;
    }
}
