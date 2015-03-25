package me.raydond123.infocommands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;
import java.util.logging.Logger;

public class InfoCommands extends JavaPlugin implements Listener {

    Logger logger = Logger.getLogger("Minecraft");

    public void onEnable() {

        logger.info("[InfoCommands] This plugin has been enabled!");
        saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(this, this);

    }

    public void onDisable() {

        logger.info("[InfoCommands] This plugin has been disabled!");

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getLabel().equalsIgnoreCase("events")) {

            List<String> message = getConfig().getStringList("events-message");

            for(int i = 0; i <= message.size() - 1; i++) {

                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', message.get(i)));

            }

        } else if (cmd.getLabel().equalsIgnoreCase("sites")) {

            List<String> message = getConfig().getStringList("sites-message");

            for(int i = 0; i <= message.size() - 1; i++) {

                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', message.get(i)));

            }

        }

        return false;

    }

}
