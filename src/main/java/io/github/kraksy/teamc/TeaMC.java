package io.github.kraksy.teamc;

import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class TeaMC extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        System.out.println("its working!");

        getServer().getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){

        System.out.println("somebody joined");
        event.setJoinMessage("damn hello");


    }

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event){

        Player player = event.getPlayer();
        player.sendMessage("fuck off");
        player.setWalkSpeed(1);
        ///player.addPotionEffect((new PotionEffect(PotionEffectType.SLOW, 200, 10)));
        ///player.addPotionEffect((new PotionEffect(PotionEffectType.BLINDNESS, 200, 10)));
        ///player.addPotionEffect((new PotionEffect(PotionEffectType.HUNGER, 200, 10)));

    }

    @EventHandler
    public void onDropItem(PlayerDropItemEvent event) {

        String item = event.getEventName();
        Player player = event.getPlayer();

        player.sendMessage("you dropped >> ", item);

    }
}
