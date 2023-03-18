package net.mplugins.tpaplugin.commands;

import net.mplugins.tpaplugin.TpaManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class AcceptCommand implements CommandExecutor {
    private final TpaManager tpaManager;

    public AcceptCommand(TpaManager tpaManager) {
        this.tpaManager = tpaManager;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!(sender instanceof final Player player)) {
            sender.sendMessage("§cOnly players can execute this command!");
            return true;
        }

        tpaManager.acceptRequest(player);
        return true;
    }
}
