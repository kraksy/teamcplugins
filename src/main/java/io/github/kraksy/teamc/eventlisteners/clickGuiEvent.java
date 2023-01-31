package io.github.kraksy.teamc.eventlisteners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class clickGuiEvent implements Listener {
    @EventHandler
    public void clickGui(InventoryClickEvent event) {

        Player player = (Player) event.getWhoClicked();

        if (event.getView().getTitle().equalsIgnoreCase("gem anvil")){

            player.sendMessage("gem anvil");
            player.closeInventory();
            event.setCancelled(true);
        }

    }

}
