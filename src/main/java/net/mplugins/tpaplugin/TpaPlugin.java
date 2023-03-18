package net.mplugins.tpaplugin;

import net.mplugins.tpaplugin.commands.AcceptCommand;
import net.mplugins.tpaplugin.commands.TpaCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class TpaPlugin extends JavaPlugin {
    private TpaManager tpaManager;

    @Override
    public void onLoad() {
        this.tpaManager = new TpaManager();
    }

    @Override
    public void onEnable() {
        getCommand("tpa").setExecutor(new TpaCommand(tpaManager));
        getCommand("accept").setExecutor(new AcceptCommand(tpaManager));
    }
}
