package de.cure53.anton.dupecmd;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class DupeCmd extends JavaPlugin implements Listener {

	@Override
    public void onEnable() {
		/**
		 * Verbinde "dupe" Command mit DupeCommand Logik
		 */
        this.getCommand("dupe").setExecutor(new DupeCommand());
    }
}
