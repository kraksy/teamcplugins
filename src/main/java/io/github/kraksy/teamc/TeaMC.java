package io.github.kraksy.teamc;

import io.github.kraksy.teamc.gemAnvil.guiGemSpawner;
import io.github.kraksy.teamc.gemAnvil.openGuiCommand;
import io.github.kraksy.teamc.commands.sendMessageCommand;
import io.github.kraksy.teamc.gemAnvil.anvilEvents;
import io.github.kraksy.teamc.eventlisteners.onPlayerJoinLeaveListener;
import io.github.kraksy.teamc.eventlisteners.testingEvents;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class TeaMC extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents( new onPlayerJoinLeaveListener(), this);
        getServer().getPluginManager().registerEvents( new testingEvents(), this);
        getServer().getPluginManager().registerEvents( new anvilEvents(), this);

        getCommand("duh").setExecutor(new sendMessageCommand());
        getCommand("anvil").setExecutor(new openGuiCommand());
        getCommand("gemGui").setExecutor(new guiGemSpawner());

    }

}
