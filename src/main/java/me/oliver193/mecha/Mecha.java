package me.oliver193.mecha;

import me.oliver193.mecha.bstats.Metrics;
import me.oliver193.mecha.commands.FeedCommand;
import me.oliver193.mecha.commands.FlyCommand;
import me.oliver193.mecha.commands.HealCommand;
import me.oliver193.mecha.commands.MechaCommand;

import org.bukkit.plugin.java.JavaPlugin;

public class Mecha extends JavaPlugin {

    private static Mecha instance;

    public void onLoad() {
        instance = this;
    }

    public void onEnable() {
        // Enable plugin
        getLogger().info("Enabling");


        //Metrics from bStats
        int pluginId = 15385;
        Metrics metrics = new Metrics(this, pluginId);


        // Load commands
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("mecha").setExecutor(new MechaCommand());

    }

    public void onDisable() {
        // Disable plugin
        getLogger().info("Disabling");
    }

    public static Mecha getInstance() {
        return instance;
    }

}
