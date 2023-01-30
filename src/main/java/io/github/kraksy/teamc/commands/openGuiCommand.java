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

public class openGuiCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("anvil")) {

            if (sender instanceof Player) {

                Player player = (Player) sender;

                Inventory anvilGui = Bukkit.createInventory(player, 3, ChatColor.DARK_PURPLE + "anvil");
                ItemStack anvil = new ItemStack(Material.ANVIL);
                anvilGui.addItem(anvil);

                player.openInventory(anvilGui);

            }
        }

        return true;
    }
}
