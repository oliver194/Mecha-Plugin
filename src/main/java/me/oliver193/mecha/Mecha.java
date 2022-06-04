package me.oliver193.mecha;

import me.oliver193.mecha.Commands.Feed;
import me.oliver193.mecha.Commands.Heal;
import org.bukkit.plugin.java.JavaPlugin;

public class Mecha extends JavaPlugin {
    private static Mecha instance;

    public void onEnable() {
        instance = this;
        getLogger().info("Mecha version " + getDescription().getVersion() + " is loading");
        new Heal();
        new Feed();
    }

    public void onDisable() {
        getLogger().info("Mecha version " + getDescription().getVersion() + " is disabling.");
    }

    public static Mecha getInstance() {
        return instance;
    }
}
