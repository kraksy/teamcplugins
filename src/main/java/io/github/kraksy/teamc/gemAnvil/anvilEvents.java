package io.github.kraksy.teamc.gemAnvil;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class anvilEvents implements Listener  {

    public int arsenalSlot = 14;
    public int gemSlot = 12;
    public String gemName = "ruby";

    @EventHandler
    public void clickGui(InventoryClickEvent event) {

        ItemStack arsenalSpot = event.getView().getItem(arsenalSlot);
        ItemStack gemSpot = event.getView().getItem(gemSlot);




        Player player = (Player) event.getWhoClicked();
        String inv = event.getView().getTitle();

        if (inv.equalsIgnoreCase("gemAnvil")){

            if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(" ")) {

                event.setCancelled(true);

            } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("ruby")){

                player.sendMessage("ha");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("gem anvil")){

                player.sendMessage("ha");


            }

        }
    }
}
