package io.github.kraksy.teamc.gemAnvil;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class openGuiCommand implements CommandExecutor {

    public int anvilSlot = 13;
    public int invSize = 27;
    public String anvilName = "gem anvil";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("anvil")) {

            if (sender instanceof Player) {

                Player player = (Player) sender;
                Inventory anvilGui = Bukkit.createInventory(player, invSize, anvilName);

                // create anvil and glass panels
                ItemStack item = new ItemStack(Material.ANVIL);
                ItemStack glass = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);

                // rename anvil
                ItemMeta itemmeta = item.getItemMeta();
                assert itemmeta != null;
                itemmeta.setDisplayName(anvilName);
                item.setItemMeta(itemmeta);

                // set glass panels around anvil

                for (int i = 0; i < 12; i++) {

                    anvilGui.setItem(i, glass);

                    for (int x = 15; x < 27; x++) {

                        anvilGui.setItem(x, glass);

                    }
                }

                // set anvil and open inventory

                anvilGui.setItem(anvilSlot,item);
                player.openInventory(anvilGui);

            }
        }

        return true;
    }
}