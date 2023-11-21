package net.earthmc.enderpearlcooldown;

import net.earthmc.enderpearlcooldown.config.Config;
import net.earthmc.enderpearlcooldown.listener.PlayerItemCooldownListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnderPearlCooldown extends JavaPlugin {

    @Override
    public void onEnable() {
        Config.init(getConfig());
        saveConfig();

        getServer().getPluginManager().registerEvents(new PlayerItemCooldownListener(getConfig()), this);
    }
}
