package io.github.kraksy.teamc.eventlisteners;

import org.bukkit.ChatColor;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class onPlayerJoinLeaveListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){

        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.DARK_AQUA + player.getDisplayName() + ChatColor.DARK_GRAY + "joined");
        event.setJoinMessage("damn hello");

        int time = player.getStatistic(Statistic.PLAY_ONE_MINUTE);
        int hoursTime = time / 20 / 60 / 60;
        int minTime = time / 20 / 60;
        int secTime = time / 20;
        String timePlayedhours = String.valueOf(hoursTime);
        String timePlayedmin = String.valueOf(minTime);
        String timePlayedsec = String.valueOf(secTime);

        //time in tick
        player.sendMessage("you were playing here for >>", timePlayedhours , "hours", timePlayedmin , "min", timePlayedsec , "sec");

    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event){

        Player player = event.getPlayer();

        event.setQuitMessage(ChatColor.DARK_AQUA + player.getDisplayName() + ChatColor.DARK_GRAY + "leaved");

    }
}
