package io.github.kraksy.teamc.gemAnvil;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class anvilEvents implements Listener , CommandExecutor {

    public int arsenalSlot = 14;
    public int gemSlot = 12;
    public String gemName = "ruby";
    


    @EventHandler
    public void clickGui(InventoryClickEvent event) {

        ItemStack arsenalSpot = event.getView().getItem(arsenalSlot);
        ItemStack gemSpot = event.getView().getItem(gemSlot);

        ItemStack gem = new ItemStack(Material.PLAYER_HEAD);
        ItemStack arsenal = new ItemStack(Material.WOODEN_SWORD);

        Player player = (Player) event.getWhoClicked();
        String inv = event.getView().getTitle();

        if (Objects.requireNonNull(event.getCurrentItem()).getType() == Material.GRAY_STAINED_GLASS_PANE) {
            event.setCancelled(true);
        }
        

        if (inv.equalsIgnoreCase("gemAnvil")){

            assert arsenalSpot != null;
            if (arsenalSpot.equals(arsenal)) {

                player.sendMessage("its working a!");

            }

            assert gemSpot != null;
            if (gemSpot.equals(gem)) {

                player.sendMessage("its working b!");

            }

        }

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }
}
