package net.earthmc.enderpearlcooldown.config;

import org.bukkit.configuration.file.FileConfiguration;

public class Config {

    public static void init(FileConfiguration config) {
        config.addDefault("ender_pearl_cooldown_ticks", 240);

        config.options().copyDefaults(true);
    }
}
