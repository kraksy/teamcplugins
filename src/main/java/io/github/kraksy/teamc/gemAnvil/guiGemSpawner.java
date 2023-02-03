package io.github.kraksy.teamc.gemAnvil;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class guiGemSpawner implements CommandExecutor {

    public int invSize = 27;
    public String guiName = "gemGui";
    public String gemName = "ruby";
    public String gemPlayerName = "2013";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase(guiName)) {

            if (sender instanceof Player) {

                Player player = (Player) sender;
                Inventory gemGui = Bukkit.createInventory(player, invSize, guiName);

                ItemStack gem = new ItemStack(Material.PLAYER_HEAD);
                SkullMeta skullMeta = (SkullMeta) gem.getItemMeta();
                assert skullMeta != null;
                skullMeta.setOwningPlayer(Bukkit.getOfflinePlayer(gemPlayerName));
                skullMeta.setDisplayName(gemName);
                gem.setItemMeta(skullMeta);

                player.openInventory(gemGui);
                gemGui.setItem(1,gem);
            }
        }

        return true;
    }
}

