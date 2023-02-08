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

        ItemStack gem = new ItemStack(Material.PLAYER_HEAD);
        ItemStack arsenal = new ItemStack(Material.WOODEN_SWORD);
        ItemStack glass = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);

        Player player = (Player) event.getWhoClicked();
        String inv = event.getView().getTitle();

        if (inv.equalsIgnoreCase("gemAnvil")){

            ItemStack clickItem = event.getCurrentItem();

            if (clickItem.equals(glass)) {

                event.setCancelled(true);

            }

            if (arsenalSpot.equals(arsenal)) {
                player.sendMessage("its working a!");
            }

            if (gemSpot.equals(gem)) {
                player.sendMessage("its working b!");
            }
        }
    }
}
