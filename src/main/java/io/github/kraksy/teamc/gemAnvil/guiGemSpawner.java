package io.github.kraksy.teamc.gemAnvil;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class guiGemSpawner implements CommandExecutor {

    public int invSize = 27;
    public String anvilName = "gemGui";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase(anvilName)) {

            if (sender instanceof Player) {

                Player player = (Player) sender;
                Inventory anvilGui = Bukkit.createInventory(player, invSize, anvilName);

                ItemStack item = new ItemStack(Material.ANVIL);
                ItemStack glass = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);


                player.openInventory(anvilGui);
            }
        }

        return true;
    }
}
