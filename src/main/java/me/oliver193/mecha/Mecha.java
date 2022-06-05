package me.oliver193.mecha;

import com.jeff_media.updatechecker.UpdateCheckSource;
import com.jeff_media.updatechecker.UpdateChecker;
import com.jeff_media.updatechecker.UserAgentBuilder;
import me.oliver193.mecha.bstats.Metrics;
import me.oliver193.mecha.commands.FeedCommand;
import me.oliver193.mecha.commands.FlyCommand;
import me.oliver193.mecha.commands.HealCommand;
import me.oliver193.mecha.commands.MechaCommand;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Mecha extends JavaPlugin {
    public String MainConfig;

    private static Mecha instance;

    public void onLoad() {
        instance = this;
    }

    public void onEnable() {
        // Enable plugin
        getLogger().info("Enabling");

        //Load update checker
        //From: https://www.spigotmc.org/threads/spigotupdatechecker-powerful-update-checker-with-only-one-line-of-code.500010/

        new UpdateChecker(this, UpdateCheckSource.CUSTOM_URL, "https://raw.githubusercontent.com/oliver194/Mecha-Plugin/master/src/main/resources/version.txt")
        .setDownloadLink("https://github.com/oliver194/Mecha-Plugin/releases")
        .setNotifyOpsOnJoin(true)
        .setUserAgent(new UserAgentBuilder().addPluginNameAndVersion())
        .setNotifyByPermissionOnJoin("mecha.updatechecker")
        .checkEveryXHours(2) //Check every 2 hours
        .checkNow();




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
