package io.github.kraksy.teamc.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;


public class openGuiCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("anvil")) {

            if (sender instanceof Player) {

                Player player = (Player) sender;
                Inventory anvilGui = Bukkit.createInventory(null, 27, "gemAnvil");
                ItemStack item = new ItemStack(Material.ANVIL);
                ItemStack glass = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);

                ItemMeta itemmeta = item.getItemMeta();
                itemmeta.setDisplayName("gem anvil");
                item.setItemMeta(itemmeta);

                for (int i = 0; i < 12; i++) {

                    anvilGui.setItem(i, glass);

                    for (int x = 15; x < 27; x++) {

                        anvilGui.setItem(x, glass);

                    }
                }

                anvilGui.setItem(13,item);

                player.openInventory(anvilGui);

            }
        }

        return true;
    }
}
