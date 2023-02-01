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

            for (int i = 0; i < 12; i++) {

                event.getView().getItem(i);

                for (int x = 15; x < 27; x++) {

                    event.getView().getItem(x);

                }
            }

            ItemStack item = new ItemStack(Objects.requireNonNull(Material.getMaterial(String.valueOf(Material.WOODEN_SWORD))));
            ItemStack item = new ItemStack(Objects.requireNonNull(Material.getMaterial(String.valueOf(Material.GRAY_STAINED_GLASS_PANE))));

            if (Objects.equals(event.getView().getItem(), item)) {

                player.sendMessage("its working !");

            }

            if (Objects.equals(event.getView().getItem(14), item)) {

                player.sendMessage("its working !");

            }


        }

    }

}
