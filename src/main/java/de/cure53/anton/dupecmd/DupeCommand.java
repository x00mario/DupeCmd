package de.cure53.anton.dupecmd;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class DupeCommand extends JavaPlugin implements CommandExecutor {

	 public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        
		 if (sender instanceof Player) {
			 /**
			  * Hole aktuellen Spieler
			  */
			 Player player = (Player) sender;
			 
			 /**
			  * Hole aktuellen Item-in-Hand
			  */
	         ItemStack handItem = player.getInventory().getItemInMainHand();
	         
	         /**
	          * Dupliziere Item-in-Hand
	          */
	         player.getInventory().addItem(handItem);
	    }
        return true;
    }
}
