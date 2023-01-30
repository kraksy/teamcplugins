package io.github.kraksy.teamc;

import io.github.kraksy.teamc.eventlisteners.onPlayerJoinListener;
import io.github.kraksy.teamc.eventlisteners.testingEvents;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class TeaMC extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        System.out.println("its working!");

        getServer().getPluginManager().registerEvents( new onPlayerJoinListener(), this);
        getServer().getPluginManager().registerEvents( new testingEvents(), this);


    }
}
