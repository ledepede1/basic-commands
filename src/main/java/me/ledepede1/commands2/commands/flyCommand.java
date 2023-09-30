package me.ledepede1.commands2.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class flyCommand implements @Nullable CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;


            if (args.length == 0) {
                if (!p.getAllowFlight()) {
                    p.setFlySpeed(0.1F);
                    p.setAllowFlight(true);
                    p.setFlying(true);
                } else if (p.getAllowFlight()) {
                    p.setFlySpeed(0.1F);
                    p.setAllowFlight(false);
                    p.setFlying(false);
                }
            } else if (args.length > 0) {
                try {
                    float flyspeed = Float.parseFloat(args[0]);
                    if (flyspeed > 1) {
                        p.sendMessage("Needs to be an value from 0.0 to 1.0");
                    } else {
                        p.setAllowFlight(true);
                        p.setFlying(true);
                        p.setFlySpeed(flyspeed);
                        p.sendMessage("Fly speed set to "+flyspeed);
                    }
                } catch (NumberFormatException e){
                    p.sendMessage("You need to type in a number!");
                }
            }

        }

        return true;
    }
}
