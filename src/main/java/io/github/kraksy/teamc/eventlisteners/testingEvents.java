package io.github.kraksy.teamc.eventlisteners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class testingEvents implements Listener {

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

    @EventHandler
    public void onClickSugar(PlayerInteractEvent event) {

        Player player = event.getPlayer();

        if(player.getInventory().getItemInMainHand().getType().equals(Material.SUGAR)) {
            if(event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                System.out.println(player.getName() + " has right clicked sugar!");
            }
        }
    }
}
