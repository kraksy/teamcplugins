package io.github.kraksy.teamc.gemAnvil;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class anvilEvents implements Listener {

    public int swordSlot = 14;
    public int gemSlot = 12;

    @EventHandler
    public void clickGui(InventoryClickEvent event) {

        ItemStack arsenal = new ItemStack(Objects.requireNonNull(Material.getMaterial(String.valueOf(Material.WOODEN_SWORD))));
        ItemStack gems = new ItemStack(Objects.requireNonNull(Material.getMaterial(String.valueOf(Material.WOODEN_SWORD))));

        Player player = (Player) event.getWhoClicked();
        String inv = event.getView().getTitle();

        if (event.getCurrentItem().getType() == Material.GRAY_STAINED_GLASS_PANE) {
            event.setCancelled(true);
        }

        if (inv.equalsIgnoreCase("gemAnvil")){

            if (Objects.equals(event.getView().getItem(swordSlot), arsenal)) {

                player.sendMessage("its working !");

            }

            if (Objects.equals(event.getView().getItem(gemSlot), gems)) {

                player.sendMessage("its working !");

            }

        }

    }

}
