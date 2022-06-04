package me.oliver193.mecha.Commands;

import me.oliver193.mecha.CommandBase;
import me.oliver193.mecha.Msg;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed {
    public Feed() {
        (new CommandBase("feed", true) {
            public boolean onCommand(CommandSender sender, String[] arguments) {
                Player player = (Player)sender;
                player.setFoodLevel(20);
                Msg.send((CommandSender)player, "&aYour hunger is now full!");
                return true;
            }

            public String getUsage() {
                return "/feed";
            }
        }).enableDelay(2);
    }
}
