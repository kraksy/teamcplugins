package io.github.kraksy.teamc.eventlisteners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class clickGuiEvent implements Listener {
    @EventHandler
    public void clickGui(InventoryClickEvent event) {

        Player player = (Player) event.getWhoClicked();
        String inv = event.getView().getTitle();

        ///(event.getView().getTitle().equalsIgnoreCase("gem anvil"))

        if (inv.equalsIgnoreCase("gemAnvil")){

            event.setCancelled(true);

            ItemStack item = new ItemStack(Objects.requireNonNull(Material.getMaterial(String.valueOf(Material.WOODEN_SWORD))));

            if (Objects.equals(event.getView().getItem(14), item)) {

                player.sendMessage("its working !");

            }


        }

    }

}
