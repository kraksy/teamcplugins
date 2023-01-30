package io.github.kraksy.teamc.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class sendMessageCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("duh")) {

            if (sender instanceof Player) {

                Player player = (Player) sender;

                player.sendMessage("I hate this");


            }else if (sender instanceof ConsoleCommandSender){

                System.out.println("u cant run this command with console");

            }

        }

        return true;
    }
}
