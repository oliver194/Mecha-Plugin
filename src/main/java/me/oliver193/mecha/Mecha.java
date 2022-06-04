package me.oliver193.mecha;

import me.oliver193.mecha.commands.FeedCommand;
import me.oliver193.mecha.commands.HealCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Mecha extends JavaPlugin {

    private static Mecha instance;

    public void onLoad() {
        instance = this;
    }

    public void onEnable() {
        // Enable plugin
        getLogger().info("Mecha is loading.");

        // Load commands
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("feed").setExecutor(new FeedCommand());

    }

    public void onDisable() {
        // Disable plugin
        getLogger().info("Mecha is disabling.");
    }

    public static Mecha getInstance() {
        return instance;
    }

}
