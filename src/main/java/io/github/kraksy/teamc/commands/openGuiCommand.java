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

public class openGuiCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("anvil")) {

            if (sender instanceof Player) {

                Player player = (Player) sender;
                Inventory anvilGui = Bukkit.createInventory(null, 9, "gem anvil");
                ItemStack item = new ItemStack(Material.ANVIL);

                ItemMeta itemmeta = item.getItemMeta();
                itemmeta.setDisplayName("gem anvil");
                item.setItemMeta(itemmeta);
                anvilGui.addItem(item);


                player.openInventory(anvilGui);

            }
        }

        return true;
    }
}
