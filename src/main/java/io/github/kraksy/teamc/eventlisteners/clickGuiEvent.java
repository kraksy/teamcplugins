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

        ItemStack item = new ItemStack(Objects.requireNonNull(Material.getMaterial(String.valueOf(Material.WOODEN_SWORD))));

        Player player = (Player) event.getWhoClicked();
        String inv = event.getView().getTitle();

        if (event.getCurrentItem().getType() == Material.GRAY_STAINED_GLASS_PANE) {
            event.setCancelled(true);
            return;
        }

        if (inv.equalsIgnoreCase("gemAnvil")){

            for (int i = 0; i < 12; i++) {

                event.getView().getItem(i);

                for (int x = 15; x < 27; x++) {

                    event.getView().getItem(x);

                }
            }

            if (Objects.equals(event.getView().getItem(14), item)) {

                player.sendMessage("its working !");

            }


        }

    }

}
