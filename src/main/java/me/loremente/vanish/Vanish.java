package me.loremente.vanish;

import org.bukkit.plugin.java.JavaPlugin;

public final class Vanish extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("vanish").setExecutor(new VanishCommand());
    }
}
