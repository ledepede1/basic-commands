package me.ledepede1.commands2.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class godCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;

            if(!p.isInvulnerable() && !p.isInvisible()) {
                p.setInvulnerable(true);
                p.setInvisible(true);
                p.sendMessage(ChatColor.BLUE + "GODMODE:" + ChatColor.WHITE + "On");
            } else {
                p.setInvulnerable(false);
                p.setInvisible(false);
                p.sendMessage(ChatColor.BLUE + "GODMODE:" + ChatColor.WHITE + "Off");
            }

        }

        return true;
    }
}
