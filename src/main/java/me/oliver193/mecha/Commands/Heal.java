package me.oliver193.mecha.Commands;

import me.oliver193.mecha.CommandBase;
import me.oliver193.mecha.Msg;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal {
    public Heal() {
        (new CommandBase("heal", true) {
            public boolean onCommand(CommandSender sender, String[] arguments) {
                Player player = (Player)sender;
                player.setHealth(20.0D);
                Msg.send((CommandSender)player, "&aYour health is now full!");
                return true;
            }

            public String getUsage() {
                return "/feed";
            }
        }).enableDelay(2);
    }
}
