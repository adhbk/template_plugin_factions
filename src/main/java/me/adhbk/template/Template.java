package me.adhbk.template;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.massivecraft.factions.FactionsPlugin;


public class Template extends JavaPlugin implements Listener{
	
	
	FactionsPlugin factions;
	
	Material[] landFarmingBlocks = {Material.CARROT,Material.POTATO,Material.CROPS,Material.NETHER_WARTS};
	
	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoked!");
		Bukkit.getPluginManager().registerEvents(this, this);
		try {
			factions = getFactions();
		}catch(Exception e){
		}
		
	}

	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		return false;
	}
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
		
	}
	
	private FactionsPlugin getFactions() {
	    Plugin plugin = getServer().getPluginManager().getPlugin("Factions");

	    // WorldGuard may not be loaded
	    if (plugin == null || !(plugin instanceof FactionsPlugin)) {
	        return null; // Maybe you want throw an exception instead
	    }

	    return (FactionsPlugin) plugin;
	}


}
