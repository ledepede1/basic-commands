package me.ledepede1.commands2;

import me.ledepede1.commands2.commands.flyCommand;
import me.ledepede1.commands2.commands.godCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Commands2 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("god").setExecutor(new godCommand());
        getCommand("fly").setExecutor(new flyCommand());
    }
}
