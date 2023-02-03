package io.github.kraksy.teamc.gemAnvil;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class guiGemSpawner implements CommandExecutor {

    public int invSize = 27;
    public String anvilName = "gemGui";
    public String gemName = "";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase(anvilName)) {

            if (sender instanceof Player) {

                Player player = (Player) sender;
                Inventory anvilGui = Bukkit.createInventory(player, invSize, anvilName);

                ItemStack gem = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
                SkullMeta meta = (SkullMeta) gem.getItemMeta();
                meta.setOwner(gemName);
                gem.setItemMeta(meta);

                player.openInventory(anvilGui);
            }
        }

        return true;
    }
}

